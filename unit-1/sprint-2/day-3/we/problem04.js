// print 2nd half of even array && if odd print 2nd half with extra one's

let arr = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15];

let start=arr.length/2;
if(arr.length%2!=0){
  start=(arr.length-1)/2;
}
let end = arr.length-1;

for(let i=start; i<=end; i++){
  console.log(arr[i]);
}
