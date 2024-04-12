// Print the Calendar date in the below format
// 1-1
// 2-1
// 3-1
// .
// .
// .
// .
// .
// 31-1
// .
// .
// .
// .
// .
// 31-12
for(let i=1; i<=12; i++){      // outer loop
    if(i==2){                      //C-1
      for(let j=1; j<=28; j++){
        console.log("month",i,"date",j);
      }    
    }else if(i==4 || i==6 || i==9 || i==11){   //C-2
      for(let k=1; k<=30; k++){
        console.log("month",i,"date",k);
      }
    }else{
      for(let l=1; l<=31; l++){
        console.log("month",i,"date",l);
      }
    }
  }