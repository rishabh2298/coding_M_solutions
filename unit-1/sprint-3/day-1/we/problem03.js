// Problem 3: Use the same function to print Non-Primes from 2 to a given limit

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
  
  
  let limit=30;
  
  for(let i=2; i<=limit; i++){
    let x=check_prime(i);
    if(x==false){
      console.log(i,"is not a prime upto",limit)
    }
  }