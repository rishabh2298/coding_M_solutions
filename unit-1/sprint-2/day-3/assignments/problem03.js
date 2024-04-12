// Given an array of numbers find the average of all the even numbers.

let arr=[11,12,13,14,15,16,17,18,19,20];

sum=0;
count=0;

for(let i=0; i<=arr.length-1; i++){
  if(arr[i]%2==0){
    sum=sum+arr[i];
    count++;
  }
}
console.log(sum/count);