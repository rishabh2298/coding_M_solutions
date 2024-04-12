// EXTRACT ODD- HOF
// Given an array of numbers extract the numbers which are odd

// Sample Input - [1,2,3] Sample Output - [1,3]

let nums=[11,12,13,14,15]

let result=nums.filter(function(nos){
  if(nos%2==1){
    return nos;
  }
});
console.log(result);cancelIdleCallba