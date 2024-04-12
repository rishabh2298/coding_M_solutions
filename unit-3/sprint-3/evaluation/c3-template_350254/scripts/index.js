//  Keyboard enter button 

document.querySelector("#query").addEventListener("keypress",(event)=>{
    if(event.key === "Enter"){
        document.querySelector("#query").click();
    }
})


//  Navbar Section

let query;
let main = async () => {
    query = document.querySelector("#query").value;
    let data = await get_data(query)
    console.log(data.hotels)
    append_data(data.hotels);
}

let get_data = async (query) => {
    const url = ` https://masai-mock-api.herokuapp.com/hotels/search?city=${query}`

    let res = await fetch(url);
    let data = await res.json();
    return (data)
}

let append_data = (data) => {
    let container = document.querySelector("#hotels_list")
    container.innerHTML = null;

    data.forEach((elem,index) =>{
        let cards = document.createElement("div");
        cards.setAttribute("id","hotel")

        let title = document.createElement("h4");
        title.innerText = elem.Title;

        let image = document.createElement("img");
        image.src = elem.Images.one;

        let price = document.createElement("p")
        price.innerText = `Price Per Room Rs: ${elem.Price} /-`;

        let ac = document.createElement("p")
        ac.innerText = `AC : ${elem.Ac}`

        let rating = document.createElement("p");
        rating.innerText = `Rating : ${elem.Rating}`

        let button = document.createElement("button");
        button.innerText = "Book Now"
        button.addEventListener("click","check_booking")

        cards.append(title,image,price,ac,rating,button)
        container.append(cards);
    })
}

let users = JSON.parse(localStorage.getItem("users"))

let check_booking = () =>{

}
//  Sorting Section 

let sort_from_low = async () => {
    let data = await get_data(query)
    let arr=data.hotels

    arr.sort((a,b) =>{
        return a.Price-b.Price;
    })
    append_data(arr)
}

let sort_from_high = async () => {
    let data = await get_data(query)
    let arr=data.hotels

    arr.sort((a,b) =>{
        return b.Price-a.Price;
    })
    append_data(arr)
}

// Filter Section 

let Only_ac = async () => {
    let data = await get_data(query);
    let arr = data.hotels;

    let result = arr.filter((elem) => {
        if(elem.Ac == true){
            return elem;
        }
    })
    append_data(result);
}


let Only_nonac = async () => {
    let data = await get_data(query);
    let arr = data.hotels;

    let result = arr.filter((elem) => {
        if(elem.Ac == false){
            return elem;
        }
    })
    append_data(result);
}