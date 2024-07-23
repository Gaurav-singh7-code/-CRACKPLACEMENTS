class Solution {
    public int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }

        List<Integer>[] bucket = new List[nums.length+1];

        for(int key: hm.keySet()){
            int freq = hm.get(key);

            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            while(hm.get(key) > 0){
                bucket[freq].add(key);
                hm.put(key,hm.get(key)-1);
            }

        }

        int counter = 1 ;

        for(int i = bucket.length-1; i >= 0; i--){
            if(bucket[i] != null){
                if (bucket[i].size() > 1){
                    counter = 0; break;
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        if(counter == 1){
            for(int i = bucket.length-1; i >= 0; i--){
                if(bucket[i] != null){
                    Collections.sort(bucket[i]);
                    for(int j = bucket[i].size()-1; j >= 0; j--){
                        res.add(bucket[i].get(j));
                    }
                }
            }
        }else{
            for(int i = 0; i < bucket.length; i++){
                if(bucket[i] != null){
                    Collections.sort(bucket[i]);
                    for(int j = bucket[i].size()-1; j >= 0; j--){
                        res.add(bucket[i].get(j));
                    }
                }
            }
        }

        int[] arr = new int[res.size()];
        int i = 0;
        for(int n: res){
            arr[i++] = n;
        }    

        return arr;
    }
}