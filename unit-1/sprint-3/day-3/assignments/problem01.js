// Problem 1 :
// Given an array find the unique items in the array

let arr=[3,5,4,6,7,4,3,"raju","hari","raju"];

let arr2=[];
let flag=false;

for(let i=0; i<=arr.length-1; i++){
  for(let j=0; j<=arr2.length-1; j++){
    if(arr[i]==arr2[j]){
      flag=true;
      break;
    }
  }
  if(flag==false){
    arr2.push(arr[i]);
  }
  else{
    flag=false;
  }
}
console.log(arr2)