// SUM OF CUBES- HOF
// Given an array of numbers find the sum of cubes if the number is divisible by 3 Sample Input - [1, 2, 3, 4, 5, 6] Sample Output - 243 (27+216)

let arr=[1,2,3,4,5,6];

let multiple=arr.filter(function(el){
    return el%3==0; 
})

let cubes= multiple.map(function(el){
  return el**3;
})

let res=cubes.reduce(function(acc,ele){
  return acc+ele
})

console.log(res)