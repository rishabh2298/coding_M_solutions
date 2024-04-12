// - Given an object of student grades and their marks in the mentioned below format, print the highest scored student for each grade along with the total

let data=[
	{
		grade: "V",
		students: [
			{name: "Nrupul", marks: [10, 20, 30]},
			{name: "Prateek", marks: [20, 30, 40]}
		]
	},
	{
		grade: "VI",
		students: [
			{name: "Aman", marks: [10, 20, 30]},
			{name: "Albert", marks: [20, 30, 40]}
		]
	},
	{
		grade: "VII",
		students: [
			{name: "Yogesh", marks: [10, 20, 30]},
			{name: "Sandhya", marks: [20, 30, 40]}
		]
	}
]

  
for(let i=0; i<data.length; i++){
  let total=0;
  
  for(let k=0; k<data[i]["students"].length; k++){
    let sum=0;
    let nam;
    for(let m=0; m<data[i].students[k].marks.length;m++){
      sum=sum+data[i].students[k].marks[m];
    }
    if(sum>total){
      total=sum;
      nam=data[i].student[k].name
    }
  }
  for(let key in data[i]){
    console.log(data[i].grade+"-"+nam+"-"+total);
    break;
  }
}
	