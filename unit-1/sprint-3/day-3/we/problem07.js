// Experiment of making object from Array
// using (in) of object loop

let arr=[1,2,3,4,1,3,2,4,4,1];

let d={};

for(let i=0; i<=arr.length-1; i++){
  let el=arr[i];
  if(el in d){
    d[el]++
  }
  else{
    d[el]=1
  }
}
console.log(d)