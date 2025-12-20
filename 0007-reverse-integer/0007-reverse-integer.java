class Solution {
    public int reverse(int x) {
        int flag=0;
        if(x<0){
 
 flag=1;
        }
       long quo=Math.abs((long)x);
     
        long y=0;
        while(quo>0){
        long last=quo%10;
         y=y*10+last;
         quo=quo/10;

    }
    if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE) {
            return 0;
        }
        if(flag==1){
        return (int)y*-1;
    }
    return (int)y;
    }
}