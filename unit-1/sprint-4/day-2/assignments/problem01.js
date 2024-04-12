// Problem 1
// Given a square matrix print both the diagonals

let mat = [[2,32,12],
          [4,11,21],
          [6,7,5]];

let row = mat.length;
let col = mat[0].length;

let bag1="" , bag2="";
for(let i=0; i<row; i++){
  for(let j=0; j<col; j++){
    if(i==j){
      bag1=bag1+mat[i][j]+" ";
    }
    if(i+j==row-1){
      bag2+=mat[i][j]+" "
    }
  }
}
console.log("Diagonals from Left to Right", bag1)
console.log("Diagonals from Right to Left", bag2)