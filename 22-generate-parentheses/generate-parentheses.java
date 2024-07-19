class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        solve("",0,0,n,ans);

        return ans;
    }

    private void solve(String curr, int open, int close, int total, List<String> ans){

        if(open<total){
            solve(curr+"(", open+1, close,total,ans);
        }
        if(open>close){
            solve(curr+")", open, close+1, total, ans);
        }
        if(curr.length() == 2*total){
            ans.add(curr);
        }
    }
}