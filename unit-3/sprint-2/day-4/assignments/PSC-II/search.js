
async function main(){
    let search=document.getElementById("search").value;
    let id= await get_data(search);
    // console.log(id.results)
    append(id.results)
}


async function get_data(search){
    let url=`https://swapi.dev/api/people/?search=${search}`

    let res= await fetch(url);
    let data= await res.json();
    return data
}

function append(data){
    let container = document.querySelector("#container")
    container.innerHTML= null;
    if(search.value==""){
        contanier.innerHTML=null
    }

    data.forEach(function(el){

        let p = document.createElement("p");
        p.innerText = el.name;

        container.append(p)
    })
}


let id;

function debounce(func,delay){
    if(id){
        clearTimeout(id)
    }
    
    id = setTimeout(function(){
        func();
    },delay)    
}