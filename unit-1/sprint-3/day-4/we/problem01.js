//Problem: Find the sum of elements whose occurance is 2

let arr=[7,2,7,7,3,3,4,2];

let obj={};
for(let i=0; i<arr.length; i++){
  let ele=arr[i];
  if(obj[ele]==undefined){
    obj[ele]=1;
  }
  else{
    obj[ele]++;
  }
}

let sum=0;
for(let l in obj){
  if(obj[l]==2){
    sum=sum+Number(l);
  }
}