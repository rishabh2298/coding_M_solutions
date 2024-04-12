// Print a box patterns using *
// **********
// *        *
// *        *
// *        *
// *        *
// *        *
// *        *
// *        *
// *        *
// **********

let bag1="";
for(let i=1; i<=10; i++){
  bag1=bag1+"*";
}console.log(bag1)

for(let k=1; k<=8; k++){
  bag2="";
  for(let j=1; j<=10; j++){
    if(j==1||j==10){
      bag2=bag2+"*";
    }else{
      bag2=bag2+" ";
    }
  }console.log(bag2);
}

bag3="";
for(let l=1; l<=10; l++){
  bag3=bag3+"*";
}console.log(bag3);