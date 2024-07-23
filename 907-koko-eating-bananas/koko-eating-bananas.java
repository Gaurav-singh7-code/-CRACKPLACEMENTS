class Solution {

    static int[] arr;

    public static boolean helper(long x, long h){
        long a = 0;

        for(int i = 0; i < arr.length; i++){
            a = a + (long)(Math.ceil((double)arr[i]/(double)x));
        }

        if(a<=h)return true;
        else return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        arr = piles;

        long first = 1;
        long last = arr[0];
        long ans = -1;
        for(int n: piles){
            if(last<n){last = n;}
        }

        while(first <= last){
            long mid = ( first + last )/2;
            if(helper(mid, h)){
                ans = mid;
                last = mid-1;
            }else{
                first = mid+1;
            }
        }

        return (int)ans;
    }
}