// Problem 3 : Given an array of string count the overall total number of characters

let arr=["Harry","Shivam","Raju","Pappu","Dev"];

count=0;
for(let i=0; i<=arr.length-1; i++){
  let str=arr[i];
  for(let j=0; j<=str.length-1; j++){
    count++;
  }
}
console.log("Total number of characters are",count);