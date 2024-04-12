// sum of even no.s in Array

let my_details={
    name : "Rishabh Mishra",
    DOB : "22-05-1998",
    degree : "BTech Mech.",
    age : 24,
    location : "Chhattishgarh",
    languages:{
      1 : "JavaScript",
      two : "Css",
      3 : "Html",
      4 : "Python",
      5 : [24,35,46,23,38,34]
    }
  }
  
  let sum=0;
  
  let x=my_details["languages"]["5"];
  for(let i=0; i<=x.length-1; i++){
    if(x[i]%2==0){
      sum=sum+x[i];
    }
  }
  console.log(sum);