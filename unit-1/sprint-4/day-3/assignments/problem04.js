// PRODUCT OF NUMBERS- HOF
// Given an array of numbers print the product of all numbers

// Sample Input - [2,3,4] Sample Output - 24

let arr=[3,4,5,1,2];

let res=arr.reduce(function(acc,ele){
  return acc*ele
})
console.log(res)