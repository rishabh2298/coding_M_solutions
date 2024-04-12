// Problem: Find the element whose occurance is 1

let  arr=[3,2,7,7,3,4,2,5,6];

let obj={};
for(let i=0; i<arr.length; i++){
  let value=arr[i];
  if(obj[value]==undefined){
    obj[value]=1;
  }
  else{
    obj[value]++;
  }
}

for(let key in obj){
  if(obj[key]==1){
    console.log(key);
  }
}