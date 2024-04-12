// Print the average of even numbers from 1 to 100 (both included)
let i = 1;
let limit = 100;
let sum = 0;
let count = 0;

while(i<=limit){
  if(i%2==0){
    sum = sum + i;
    count++;
  }
  i++;
}console.log("average =",sum/count);