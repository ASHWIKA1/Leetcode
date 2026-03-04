char* longestPalindrome(char* s) {
    int len=strlen(s);
    int start=0,maxlen=1;
    for(int i=0;i<len;i++){
        int l=i,r=i;
        while(l>=0 && r<len &&s[l]==s[r]){
            if(r-l+1>maxlen){
                maxlen=r-l+1;
                start=l;
            }
            l--;
            r++;
        }
        l=i,r=i+1;
        while(l>=0 && r<len && s[l]==s[r]){
            if(r-l+1>maxlen){
                maxlen=r-l+1;
                start=l;
            }
            l--;
            r++;
        }
    }


        //memory allocation

        char *res=(char *)malloc ((maxlen+1)*sizeof(char));
        strncpy(res,s+start,maxlen);
        res[maxlen]='\0';
        return res;
    
}