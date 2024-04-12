employee = ["Sam", "John", "Mark", "Peter", "Simon"]
department = ["Sales", "Marketting", "Operation", "Finance", "Tech"]
salary  = [40000, 60000, 50000, 60000, 70000]


let data=[];
for(let i=0; i<employee.length; i++){
  let obj={};
  obj["name"]=employee[i];
  obj["salary"]=salary[i];
  obj["department"]=department[i];
  data.push(obj);
}


function getEmployeeNames(data){
  for(let i=0; i<data.length; i++){
    console.log(data[i].name)
  }
}


function getMaxSalaryEmployee(data){
  let money=-Infinity, info;
 
  for(let i=0; i<data.length; i++){
    if(data[i].salary>money){
      money=data[i].salary
      info=data[i];
    }
  }
  console.log(info);
}


console.log(data);

console.log("************************")
getEmployeeNames(data);


console.log("****************************")
getMaxSalaryEmployee(data);