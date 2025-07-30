class Solution {
    public int countDigits(int num) {
        int c=0;
        if(num<9){
            c= 1;
        }else{
            int org=num;
        while(num!=0){
           int  val=num%10;

            if(org%val==0){
                c++;
            }
            num=num/10;
        }
        }
        
        return c;
        
    }
}