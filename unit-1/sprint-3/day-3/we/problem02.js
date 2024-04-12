// calling , updating, adding , delete

let my_details={
    name : "Rishabh Mishra",
    DOB : "22-05-1998",
    degree : "BTech Mech.",
    age : 24,
    location : "Chhattishgarh",
    masters : false
  }
  
  // give only value
  console.log(my_details["DOB"]);      // bracket notation
  console.log(my_details.location);    // dot notation
  console.log();
  
  // updating
  my_details["age"]=35;
  my_details.location= "India";
  console.log(my_details);
  console.log();
  
  // adding
  my_details["studying"]="No";
  my_details.pass_year=[2014,2016,2020];  //array under object
  console.log(my_details);
  console.log();
  
  // delete
  delete my_details["name"];
  delete my_details.DOB;
  console.log(my_details);