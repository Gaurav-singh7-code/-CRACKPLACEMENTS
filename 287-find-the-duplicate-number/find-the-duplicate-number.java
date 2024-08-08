class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs  = new HashSet<>();

        for(int n: nums){
            if(!hs.contains(n)){
                hs.add(n);
            }else{
                return n;
            }
        }

        return -1;
    }
}