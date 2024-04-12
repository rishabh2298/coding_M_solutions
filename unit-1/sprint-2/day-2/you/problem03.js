// Print Prime Numbers from 1 to given limit

limit = 50;
for(let i=1; i<=limit; i++){
  let a=i;
  factor=0;
  for(let j=1; j<=a; j++){
    if(a%j==0){
      factor++;
    }
  }if(factor==2){
    console.log(a,"is primre number under",limit);
  }
}