
let get_data = async (query) => {
    const url = `https://www.themealdb.com/api/json/v1/1/search.php?s=${query}`
  let res = await fetch(url);
  let data = await res.json();
  return data.meals;
};

let append_data = (data,cont) => {
    cont.innerHTML = null;

    data.forEach((elem) => {
        let img = document.createElement("img")
        img.src = elem.strMealThumb;

        let food = document.createElement("h4");
        food.innerText = elem.strMeal;

        let div = document.createElement("div");
        div.setAttribute("class","cards")
        div.addEventListener("click",()=>{
            localStorage.setItem("selected_recipe",JSON.stringify(elem))
            window.location.href = "selected_recipe.html"
        })

        div.append(img,food);
        cont.append(div);
    })
}

//  Selected Recipe 

let selected_recipe = (elem,container) =>{
    container.innerHTML = null

    let h1 = document.createElement("h1")
    h1.innerText = elem.strMeal;

    let image = document.createElement("img")
    image.src = elem.strMealThumb

    let name = document.createElement("h2");
    name.innerText="Recipe :-"

    let recipe = document.createElement("h4")
    recipe.innerText =  elem.strInstructions


    container.append(h1,image,name,recipe)
}

// Recipe of Day 

let recipe_of_day = (container)=>{
        let  data={"idMeal":"52970","strMeal":"Tunisian Orange Cake","strDrinkAlternate":null,"strCategory":"Dessert","strArea":"Tunisian","strInstructions":"Preheat oven to 190 C \/ Gas 5. Grease a 23cm round springform tin.\r\nCut off the hard bits from the top and bottom of the orange. Slice the orange and remove all seeds. Puree the orange with its peel in a food processor. Add one third of the sugar and the olive oil and continue to mix until well combined.\r\nSieve together flour and baking powder.\r\nBeat the eggs and the remaining sugar with an electric hand mixer for at least five minutes until very fluffy. Fold in half of the flour mixture, then the orange and the vanilla, then fold in the remaining flour. Mix well but not for too long.\r\nPour cake mixture into prepared tin and smooth out. Bake in preheated oven for 20 minutes. Reduce the oven temperature to 160 C \/ Gas 2 and bake again for 30 minutes Bake until the cake is golden brown and a skewer comes out clean. Cool on a wire cake rack.","strMealThumb":"https:\/\/www.themealdb.com\/images\/media\/meals\/y4jpgq1560459207.jpg","strTags":null,"strYoutube":"https:\/\/www.youtube.com\/watch?v=rCUxg866Ea4","strIngredient1":"Orange","strIngredient2":"Caster Sugar","strIngredient3":"Olive Oil","strIngredient4":"Flour","strIngredient5":"Baking Powder","strIngredient6":"Eggs","strIngredient7":"Vanilla Extract","strIngredient8":"","strIngredient9":"","strIngredient10":"","strIngredient11":"","strIngredient12":"","strIngredient13":"","strIngredient14":"","strIngredient15":"","strIngredient16":"","strIngredient17":"","strIngredient18":"","strIngredient19":"","strIngredient20":"","strMeasure1":"1 large","strMeasure2":"300g","strMeasure3":"75 ml ","strMeasure4":"280g","strMeasure5":"1 tbs","strMeasure6":"4 large","strMeasure7":"2 tsp","strMeasure8":" ","strMeasure9":" ","strMeasure10":" ","strMeasure11":" ","strMeasure12":" ","strMeasure13":" ","strMeasure14":" ","strMeasure15":" ","strMeasure16":" ","strMeasure17":" ","strMeasure18":" ","strMeasure19":" ","strMeasure20":" ","strSource":"http:\/\/allrecipes.co.uk\/recipe\/16067\/tunisian-orange-cake.aspx","strImageSource":null,"strCreativeCommonsConfirmed":null,"dateModified":null}

        let h1 = document.createElement("h1")
        h1.innerText = data.strMeal;
    
        let image = document.createElement("img")
        image.src = data.strMealThumb

        let name = document.createElement("h2");
        name.innerText="Recipe :-"
    
        let recipe = document.createElement("h4")
        recipe.innerText = data.strInstructions
    
    
        container.append(h1,image,name,recipe)
}

//  Random Page 

let random_recipe = async (url)=>{
    let res = await fetch(url);
    let data = await res.json();
    return data.meals;
}

let recipe_content = (data,container) => {

    container.innerHTML = null

    let h1 = document.createElement("h1")
    h1.innerText = data.strMeal;

    let image = document.createElement("img")
    image.src = data.strMealThumb

    let name = document.createElement("h2");
    name.innerText="Recipe :- "

    let recipe = document.createElement("h4")
    recipe.innerText = data.strInstructions

    container.append(h1,image,name,recipe)
}
export { get_data,append_data,selected_recipe,recipe_of_day,random_recipe,recipe_content };
