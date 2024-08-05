class Solution {
    public String kthDistinct(String[] arr, int k) {
        // HashSet<String> hs =  new HashSet<>();

        // for(String s: arr){
        //     if(hs.contains(s)){
        //         hs.remove(s);
        //     }else{
        //         hs.add(s);
        //     }
        // }

        // String[] res = new String[hs.size()];
        // int count = 0;

        // for(int i = 0; i < arr.length; i++){
        //     if(hs.contains(arr[i])){
        //         hs.remove(arr[i]);
        //         res[count] = arr[i];
        //         count++;
        //     }
        // }

        // if(k > res.length){
        //     return "";
        // }
        
        // return res[k-1];


        HashMap<String, Integer> hm = new HashMap<>();

        for(String s: arr){
            hm.put(s, hm.getOrDefault(s,0)+1);
        }

        ArrayList<String> res = new ArrayList<>();     //&& !res.contains(arr[i])

        for(int i = 0; i < arr.length; i++){
            if(hm.get(arr[i]) == 1 ){
                res.add(arr[i]);
            }
        }

        String[] str = new String[res.size()];

        for(int i = 0; i < res.size(); i++){
            str[i] = res.get(i);
        }

        if(k > str.length){
            return "";
        }
        
        return str[k-1];
       
    }
}