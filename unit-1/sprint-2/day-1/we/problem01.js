// sum of multiple of 3 under limit
let start = 1;
let limit = 15;
let sum = 0;

while(start<=limit){
  if(start%3==0){
    console.log("multiple of 3 =",start);
    sum = sum + start;
    start++;
    if(start == limit+1){
    console.log("sum =",sum);
    }
  } start++;
}