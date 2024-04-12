// All the Code for All Students Page Goes Here
let userData=JSON.parse(localStorage.getItem("admission"))
let userAccepted=JSON.parse(localStorage.getItem("admission-accepted")) || [];
let userRejected=JSON.parse(localStorage.getItem("admission-rejected")) || [];
display_table(userData)

let filter = document.querySelector("#filter")
filter.addEventListener("change",function(elem){
    if(filter.value=="All"){
        display_table(userData)
    }
    if(filter.value=="Web-Development"){
        userData=elem.userCourse
    }
    if(filter.value=="Android-Development"){}
    if(filter.value=="Data-Analitics"){}
})

function display_table(userData){
    document.querySelector("tbody").innerHTML="";

    userData.forEach(function(elem,index){
        let tr=document.createElement("tr")

        let td1=document.createElement("td")
        td1.innerText=elem.userName;

        let td2=document.createElement("td")
        td2.innerText=elem.userEmail

        let td3=document.createElement("td")
        td3.innerText=elem.userCourse;

        let td4=document.createElement("td")
        td4.innerText=elem.userGender;

        let td5=document.createElement("td");
        td5.innerText=elem.userPhone

        let td6=document.createElement("td")
        td6.innerText="Accept";
        td6.addEventListener("click",function(elem,index){
            admission_accepted(elem,index)
        })
        let td7=document.createElement("td")
        td7.innerText="Reject";
        td7.addEventListener("click",function(elem,index){
            admission_rejected(elem,index)
        })

        tr.append(td1,td2,td3,td4,td5,td6,td7)
        document.querySelector("tbody").append(tr)
    })
}

function admission_accepted(elem,index){
    userRejected.push(elem);
    userData.splice(index,1);
    localStorage.setItem("admission",JSON.stringify(userData))
    localStorage.setItem("admissioin-rejected",JSON.stringify(userRejected))
    display_table(userData)
}

function admission_rejected(elem,index){ 
    userAccepted.push(elem);
    userData.splice(index,1);
    localStorage.setItem("admission",JSON.stringify(userData))
    localStorage.setItem("admissioin-accepted",JSON.stringify(userAccepted))
    display_table(userData)
}