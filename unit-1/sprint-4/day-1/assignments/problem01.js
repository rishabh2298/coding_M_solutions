let obj={
    name:"Ram",
    age:34,
    hobbies:["Coding", "Reading", "Biking"],
    print:function(){
      console.log("Hello", this.name);
      console.log("Age is", this.age);
      let output=this.hobbies.join("");
      console.log("Hobbies are", output);
    }
  };
  obj.print();