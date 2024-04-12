// DOUBLING NUMBERS- HOF
// Given an array of numbers generate an array containing the double value of the numbers

// Sample Input [1, 2] Sample Output [2, 4]

let arr=[3,4,5,6,7,8,9];

let res=arr.map(function(elem) {
  return elem*2;
})
console.log(res);