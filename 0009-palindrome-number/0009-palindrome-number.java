class Solution {
    public boolean isPalindrome(int x) {
        int dup = x;
        int revNum = 0;
        while(x>0){
            int id = x % 10;
            revNum = revNum * 10 + id;
            x = x/10;
        }
        if(dup ==revNum){
            return true;
        }
        else
            return false;
    }
}