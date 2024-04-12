document.querySelector("form").addEventListener("submit",my_data)
let arr =JSON.parse(localStorage.getItem("Details")) || [];
make_Table(arr)

function my_data(event){
    event.preventDefault()
    
    let obj={
        queTitle : document.querySelector("#title").value, 
        queLink : document.querySelector("#link").value,
        queDiff : document.querySelector("#difficulty").value,
    }

    arr.push(obj)
    localStorage.setItem("Details",JSON.stringify(arr))

    make_Table(arr);
}

function make_Table(arr){
    document.querySelector("tbody").innerHTML="";
    arr.forEach(function(elem){
        let tr =document.createElement("tr")
        let td1 =document.createElement("td")
        td1.innerText=elem.queTitle;

        let td2 =document.createElement("td")
        td2.innerText=elem.queLink;

        let td3 =document.createElement("td")
        td3.innerText= elem.queDiff;

        let td4 =document.createElement("td")
        if(td3.innerText=="Easy"){
            td4.innerText="No"
        }
        else{
            td4.innerText="Yes"
        }

        let td5 =document.createElement("td")
        td5.innerText= "DELETE"
        td5.style.color="red"
        td5.addEventListener("click",row_remove)

        tr.append(td1,td2,td3,td4,td5)
        document.querySelector("tbody").append(tr)
    })
}

function row_remove(event){
    event.target.parentNode.remove()
}