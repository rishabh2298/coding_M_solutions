// Problem 2 : Given a string in lower case convert it to upper case
let str="your knowledge is too good"

let lower="abcdefghijklmnopqrstuvwxyz ";
let upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ ";

let bag="";
for(let i=0; i<=str.length-1; i++){
  for(let j=0; j<=lower.length-1; j++){
    if(str[i]==lower[j]){
      bag=bag+upper[j];
      break;
    }
  }
}
console.log(bag);