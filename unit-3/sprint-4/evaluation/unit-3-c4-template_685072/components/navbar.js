
let navbar = () => {
    return `<a href="index.html">HOME</a>
    <input id="search_input" type="text" placeholder="Search here..."><br>`
}

let get_search = async (query) => {
    let url = `https://masai-api.herokuapp.com/news?q=${query}`;
    
    let res = await fetch(url);
    let data =await res.json();
    return (data.articles)
}

let sidebar = () => {
    return `<h2 id="in" value="in">India</h2>
    <h2 id="ch" value="ch">China</h2>
    <h2 id="us" value="us">U.S.A.</h2>
    <h2 id="uk" value="uk">U.K.</h2>
    <h2 id="nz" value="nz">Newzeland</h2>`
}

let get_result = async (id) => {
    let url = `https://masai-api.herokuapp.com/news/top-headlines?country=${id}`

    let res = await fetch(url);
    let data = await res.json();
    return(data.articles)
}


let get_append_list = (data,container) => {
    container.innerHTML = null;

    data.forEach(({urlToImage,title})=>{
        let img = document.createElement("img");
        img.src = urlToImage;

        let head = document.createElement("h3")
        head.innerText = title;

        let div = document.createElement("div");
        div.setAttribute("class","news");
        div.append(img,head);

        container.append(div);

    })
}

export {navbar,get_search,sidebar,get_result,get_append_list}