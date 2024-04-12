// SUM OF ODD- HOF
// Given an array of numbers find the sum of odd elements Sample Input - [1, 2, 3, 4] Sample Output - 4

let arr=[1,2,3,4,5,6,7,8];

let odd=arr.filter(function(el){
  return el%2==1;
})

let result=odd.reduce(function(acc,el){
  return acc+el;
})
console.log(result)