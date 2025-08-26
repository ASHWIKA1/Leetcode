class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n=dimensions.length;
int maxdia=0;
int maxarea=0;
    for(int i=0;i<n;i++){
        
        int l=dimensions[i][0];
        int w=dimensions[i][1];
        int currdiag=l*l+w*w;
        if(maxdia<currdiag ||(currdiag==maxdia && l*w>maxarea)){
            maxdia=currdiag;
            maxarea=l*w;
        }
    }

    return  maxarea;
    }
}