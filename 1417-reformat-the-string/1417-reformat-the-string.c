char* reformat(char* s) {
    int len=strlen(s);
    
    char s1[1000];
    char s2[1000];
    int l=0;
    int d=0;
   for(int i=0;i<len;i++){
        if(s[i]>='a' && s[i]<='z'){
        s1[l++]=s[i];
        }
        else if(s[i]>='0' && s[i]<='9'){
                s2[d++]=s[i];
        }


    }
   if(abs(l - d) > 1) {
        return "";
    }

    char* res = malloc(len + 1);   

    int i = 0, j = 0, k = 0;

    
    if(l >= d) {
        while(i < l || j < d) {
            if(i < l) res[k++] = s1[i++];
            if(j < d) res[k++] = s2[j++];
        }
    } else {
        while(i < l || j < d) {
            if(j < d) res[k++] = s2[j++];
            if(i < l) res[k++] = s1[i++];
        }
    }

    res[k] = '\0';
    return res;
}