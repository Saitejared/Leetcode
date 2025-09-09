class Solution {
    public boolean isPerfectSquare(int num) {
        for(int i = 0 ; i < 100000; i++){
            int n = i * i;
            if(n == num){
                return true;
            }
        }
        return false;
    }
}