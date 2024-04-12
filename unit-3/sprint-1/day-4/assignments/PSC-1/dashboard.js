
let data = JSON.parse(localStorage.getItem("stu-data"));
let trash = JSON.parse(localStorage.getItem("trash")) || [];

display(data)
function display(data){

    data.forEach(function(elem,index){
        let tr = document.createElement("tr");

        let td1 = document.createElement("td")
        td1.innerText = elem.name;

        let td2 = document.createElement("td")
        td2.innerText = elem.course;

        let td3 = document.createElement("td")
        td3.innerText = elem.unit;

        let td4 = document.createElement("td")
        td4.innerText = elem.batch;

        let td5 = document.createElement("img");
        td5.src = elem.image;
        
        let td6 = document.createElement("td");
        td6.innerText = "Remove";
        td6.setAttribute("class","remove")
        td6.addEventListener("click",function(){
            remove_row(elem,index)
            trash.push(elem);
            localStorage.setItem("trash",JSON.stringify(trash))
        })

        tr.append(td1,td2,td3,td4,td5,td6)
        document.querySelector("tbody").append(tr)
    })
}


function remove_row(elem,index){
    console.log(elem)
    data.splice(index,1)
    localStorage.setItem("stu-data",JSON.stringify(data))
    window.location.reload();
}