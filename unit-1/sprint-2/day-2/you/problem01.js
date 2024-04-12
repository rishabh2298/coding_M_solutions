// output 123
       // 456
       // 789

       let num=4;

       let count=0;
       for(let i=1; i<=num; i++){
         sum="";
         for(let j=1; j<=num; j++){
           count++;
           sum=sum+count+" ";
         }
         console.log(sum);
       }