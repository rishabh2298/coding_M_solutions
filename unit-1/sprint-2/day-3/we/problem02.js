// Remove last 3 values using loops && update 3rd,4th variable 

let arr=[2,45,64,34,22,64,76,8,55,45];

for(let i=1; i<=3; i++){
  arr.pop();
}

arr[3]="Dev";
arr[4]=55555;
console.log(arr);