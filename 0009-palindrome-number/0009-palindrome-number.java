class Solution {
    public boolean isPalindrome(int x) {
                if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return false;
        }
        long y=0;
        if(x<0){
            return false;
        }
         
        else{
        long quo=x;
       
            
            while(quo>0){
            long last=quo%10;
             y=y*10+last;
             quo=quo/10;
            }
        }
        if(x==(int)y){
            return true;
            }
            return false;
    }
    
}
