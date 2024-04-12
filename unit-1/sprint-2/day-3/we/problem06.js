// maximum in the array

let arr=[23,22,31,45,3,4,25];

let copy=0;
for(let i=0; i<=arr.length-1; i++){
  if(arr[i]>copy){
    copy=arr[i];
  }
}
console.log(copy,"is greatest amoung all");