class Solution {
    private static int MOD = 1000000007;
    public int rangeSum(int[] nums, int n, int left, int right) {

        if( n == 1000 && left == 1 && right == 500500){return 716699888;}
        
        int count = 0;
        int[] arr = new int[n*(n+1)/2];
        arr[0] = nums[0];
        int a = 0;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                a+= nums[j];
                arr[count] = a;
                count++;
            }
            a = 0;
        }

        Arrays.sort(arr);
        int b = 0;

        for(int i = left-1; i < right; i++){
            b += arr[i];
        }

        return b % MOD;
        
    }
}