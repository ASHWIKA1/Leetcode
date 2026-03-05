char* addBinary(char* a, char* b) {
int len=0;
int l1=strlen(a);
int l2=strlen(b);
len=l2;
if(l1>l2){
    len=l1;
}
int k=len;
char* result=(char* )malloc(len+2);
 result[len+1]='\0';
 int carry=0;
 int i=l1-1;
 int j=l2-1;
   while(i>=0 ||j>=0 || carry){
    int sum=carry;
    if(i>=0){
        sum+=a[i--]-'0';

    }
    if(j>=0){
        sum+=b[j--]-'0';
    }
    result[k--]=(sum%2)+'0';
    carry=sum/2;

   }
 
   char* res=strdup(result+k+1);
free(result);
return res;
 
}