/**
 * @param {number[][]} mat
 * @return {number}
 */
var diagonalSum = function(mat) {
    let sum=0
    let principleDiagonal=0;
    let secondaryDiagonal=0;
    for(let i=0;i<mat.length;i++){
        for(let j=0;j<mat.length;j++){
            if(i==j){
                principleDiagonal +=mat[i][j];
            }
            else if(i+j==mat.length-1){
                secondaryDiagonal +=mat[i][j];
            }
        }
    
    }
    sum=principleDiagonal+secondaryDiagonal;
    return sum
};