// Create an object with the following functionality

// Ability to add student details and 3 subject marks
// Methods to find the student with the least and highest total

let details={
    data : [],
    addstudent : function(nam,mat,eng,hin){
      let obj={};
      obj.name=nam;
      obj.math=mat;
      obj["english"]=eng;
      obj.hindi=hin;
      this.data.push(obj);
    },
    least_marks : function(){
      let marks=Infinity;
      let low_performer;
      
      for(let i=0; i<this.data.length; i++){
        total=this.data[i].math+this.data[i].english+this.data[i].hindi
        if(total < marks){
          marks= total;
          low_performer=this.data[i].name
        }
      }
      console.log("Low Performer",low_performer+"="+marks);
    },
    highest_marks : function(){
      let marks=-Infinity;
      let high_performer;
      for(let j=0; j<this.data.length; j++){
        total=this.data[j].math+this.data[j].english +this.data[j].hindi;
        if(total>marks){
          marks=total;
          high_performer=this.data[j].name;
        }
      }
      console.log("High Performer",high_performer,"=",marks)
    }
  }
  
  details.addstudent("Rishabh",80,84,86);
  details.addstudent("Hari",90,65,76);
  details.addstudent("Ajay",90,54,77);
  details.addstudent("Omprakash",88,77,44);
  
  console.log(details.data)
  
  details.least_marks();
  details.highest_marks();