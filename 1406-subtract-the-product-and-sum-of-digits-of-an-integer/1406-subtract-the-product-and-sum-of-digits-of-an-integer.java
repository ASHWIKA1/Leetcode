class Solution {
    public int subtractProductAndSum(int n) {
        int pro=1;
        int sum=0;
        int result=0;

        while(n!=0){
          int  last=n%10;
            pro*=last;
            sum+=last;
           
           int  first=n/10;
            n=first;
        }
        result=pro-sum;
        return result;
    }
}