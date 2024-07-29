class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0 ;

        if(n < 3){return 0;}

        for(int i = 0;  i <= n-3; i++){
            for(int j = i+1; j <= n-2; j++){
                for(int k = j+1; k <= n-1; k++){

                    if( rating[i] > rating[j] && rating[j] > rating[k]){
                        count++;
                    }else if(rating[i] < rating[j] && rating[j] < rating[k]){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}