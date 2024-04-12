// count names starting with A

let arr=["Amit","Nrupul","Pulkit","Yogesh","Amar","Varun"];

count=0;
for(let i=0; i<arr.length; i++){
  let str=arr[i];
  if(str[0]==="A"){
    count++;
  }
}
console.log(count);