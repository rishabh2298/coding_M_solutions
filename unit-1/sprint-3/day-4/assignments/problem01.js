// - Given a list of user data with name and age, create a list of key-value pairs from the input
// - From the generated data, print the users whose age is more than 30


let name=["Nrupul", "Prateek", "Aman", "Albert", "Yogesh"];
let age=[32, 30, 26, 28, 44];

let data=[];
for(let i=0; i<name.length; i++){
  let obj={};
  obj["name"]=name[i];
  obj["age"]=age[i];
  data.push(obj);
}

for(let j=0; j<data.length; j++){
  if(data[j].age>30){
    console.log(data[j].name);
  }
}