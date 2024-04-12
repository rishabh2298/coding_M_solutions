// count names that contain letter (a)

let arr=["Amit","Nrupul","Pulkit","Yogesh","Amar","Varun"];

count=0;
for(let i=0; i<=arr.length-1; i++){
  let str=arr[i];
  for(let j=0; j<=str.length-1; j++){
    if(str[j]=="a" || str[j]=="A"){
      count++;
      break;
    }
  }
}
console.log(count);