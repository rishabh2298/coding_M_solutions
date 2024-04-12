// switch key for ATM\
let $opt = "balance";

switch($opt){
  case "deposite" : console.log("amt is deposited");
    break;
  case "withdrawl" : console.log("enter withdrawl amt");
    break;
  case "change pin" : console.log("enter new pin");
    break;
  case "balance" : console.log("your balance is");
    break;
    default : console.log("Invalid Input");
}