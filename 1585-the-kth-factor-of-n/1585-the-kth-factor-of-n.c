int kthFactor(int n, int k) {
    int i=1,count=0;
    int list[n],output=-1;
    while(i<=n){
        if(n%i==0){
            list[count]=i;
            count++;
        }
        i++;
    }
    for(int i=0;i<count;i++){
        if(i==k-1){
            output=list[i];
        }
    }
    return output;
}