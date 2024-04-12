// Problem 2: Use the above function to print the Primes from 2 to a given limit

function check_prime(num){
    let count=0;
    
    for(let i=0; i<=num; i++){
      if(num%i==0){
        count++;
      }
    }
    if(count==2){
      return true;
    }
    else{
      return false;
    }
  }
  
  
  let limit=23;
  
  for(let i=2; i<=limit; i++){
    let x=check_prime(i);
    if(x==true){
      console.log(i,"is a prime upto",limit);
    }
  }