bool judgeCircle(char* moves) {
    int ucount=0,lcount=0,rcount=0,dcount=0;
int len=strlen(moves);
for(int i=0;i<len;i++){
        if(moves[i]=='U'){
            ucount++;
        }else if(moves[i]=='L'){
            lcount++;
        }
        else if(moves[i]=='D'){
            dcount++;
        }else if(moves[i]=='R'){
            rcount++;
        }
    }
   
    if(ucount==dcount && rcount == lcount){
        return true;
    }else{
        return false;
    }
}