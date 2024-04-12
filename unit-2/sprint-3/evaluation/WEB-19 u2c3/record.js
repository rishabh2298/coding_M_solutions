// fill in javascript code here
let formTag=document.querySelector("form")
formTag.addEventListener("submit",my_function)

function my_function(event){
    event.preventDefault();
    let tr=document.createElement("tr")
    let td1=document.createElement("td")
    td1.innerText=formTag.name.value

    let td2=document.createElement("td")
    td2.innerText=formTag.employeeID.value

    let td3=document.createElement("td")
    td3.innerText=formTag.department.value

    let td4=document.createElement("td")
    td4.innerText=formTag.exp.value

    let td5=document.createElement("td")
    td5.innerText=formTag.email.value

    let td6=document.createElement("td")
    td6.innerText=formTag.mbl.value

    let td7=document.createElement("td")
    if(td4.innerText>5){
        td7.innerText="Senior"
    }
    else if(td4.innerText>=2 && td4.innerText<=5){
        td7.innerText="Junior"
    }
    else{
        td7.innerText="Fresher"
    }

    let td8=document.createElement("td")
    td8.innerText="DELETE"
    td8.setAttribute("id","clear")
    td8.addEventListener("click",deleting)

    tr.append(td1,td2,td3,td4,td5,td6,td7,td8)
    document.querySelector("tbody").append(tr)

}


function deleting(event){
    event.target.parentNode.remove()
}

let Table=document.querySelector("table")
Table.setAttribute("border","1px solid black")
Table.setAttribute("cellspacing","0")
