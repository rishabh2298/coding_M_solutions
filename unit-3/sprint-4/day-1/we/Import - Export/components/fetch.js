
// Pseodo Structure ;

let get_data = async (url) => {
    let res = await fetch(url);
    let data = await res.json();
    return data;
}

let append_data = (data,cont) => {
    data.forEach(({image,title,price}) => {
        
        let img = document.createElement("img");
        img.src = image;
        
        let t = document.createElement("h4");
        t.innerText = title;

        let p = document.createElement("h4");
        p.innerText = price;

        let div = document.createElement("div");

        div.append(img,t,p);
        cont.append(div);
    })
}

export {get_data, append_data} // while Destructure we can export as many components
                               // we want  (# Name Export)