void setZeroes(int** matrix, int matrixSize, int* matrixColSize) {
    int ind1=matrixSize;
    int ind2=matrixColSize[0];
int firstrow=0;
int firstcol=0;

    for(int i=0;i<ind1;i++){
        if(matrix[i][0]==0){
            firstcol=1;
        }
    }
    for(int j=0;j<ind2;j++){
        if(matrix[0][j]==0){
            firstrow=1;
        }
    }

    for(int i=1;i<ind1;i++){
        for(int j=1;j<ind2;j++){
        if(matrix[i][j]==0){
            matrix[i][0]=0;
            matrix[0][j]=0;
        }
        }
    }
      for(int i=1;i<ind1;i++){
        for(int j=1;j<ind2;j++){
        if(matrix[i][0]==0 || matrix[0][j]==0){
            matrix[i][j]=0;
        }
        }
    }
      if(firstcol){
        for(int i = 0; i < ind1; i++){
            matrix[i][0] = 0;
        }
    }

    // update first row
    if(firstrow){
        for(int j = 0; j < ind2; j++){
            matrix[0][j] = 0;
        }
    }
    
}