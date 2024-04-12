let form = document.querySelector("form");
form.addEventListener("submit",my_function)

let data = JSON.parse(localStorage.getItem("stu-data")) || [];

function my_function(event){
    event.preventDefault();
    
    let name = form.name.value;
    let course = form.course.value;
    let unit = form.unit.value;
    let image = form.image.value;
    let batch = form.batch.value; 

    let obj = new constructor(name,course,unit,image,batch)
    data.push(obj);
    localStorage.setItem("stu-data",JSON.stringify(data));
    window.location.reload();
}

function constructor(name,course,unit,image,batch){
    this.name = name;
    this.course = course;
    this.unit = unit;
    this.image = image;
    this.batch = `ft-web ${batch}`;
}


function calculate(){
    let obj2={};
    let navbar = document.querySelector("#navbar")
    for(let i=0; i<data.length; i++){
        if(!obj2[data[i].batch]){
            obj2[data[i].batch] = 1;
        }
        else{
            obj2[data[i].batch]++;
        }
    }
    let arr=[]
    for(let key in obj2){
         arr.push(" | "+"["+key+"]"+" - "+obj2[key]+" ")
    }
    navbar.innerText = arr;
}
calculate();