//  SLide Show 

let box=document.querySelector("#slideshow");

url=["https://m.media-amazon.com/images/M/MV5BMTUyNDMxOTIxOF5BMl5BanBnXkFtZTcwODA1NTcyMQ@@._V1_SX300.jpg",
"https://m.media-amazon.com/images/M/MV5BN2YzMzEzYzUtOTljNC00YjZiLTg1MWYtZTQwNWM0OTMyMDkyXkEyXkFqcGdeQXVyNjQzNDI3NzY@._V1_SX300.jpg",
"https://m.media-amazon.com/images/M/MV5BNDljNDlkZjctNDFlZi00ZjNjLTkxNDQtOTI5MzY1MGIzNGQ4XkEyXkFqcGdeQXVyNDQ2MTMzODA@._V1_SX300.jpg",
"https://m.media-amazon.com/images/M/MV5BMTM3NTA4NDIwMF5BMl5BanBnXkFtZTYwNTc4NDE3._V1_SX300.jpg",
"https://m.media-amazon.com/images/M/MV5BYTdkOTczMGItZmQ0ZC00OTRmLTkyMjAtYmIzZWE3OGUxODI0XkEyXkFqcGdeQXVyMTA0MTM5NjI2._V1_SX300.jpg",
"https://m.media-amazon.com/images/M/MV5BNWE0MzFmMzgtMjBjMC00NzVhLTkyMTQtNzJmM2FhM2Y4YjdiL2ltYWdlXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SX300.jpg",
"https://m.media-amazon.com/images/M/MV5BOWQ5Y2JmNGItNzYxYi00OWNiLWI4MjEtZGE5M2Y2YTU4NGJhXkEyXkFqcGdeQXVyMjI0MDI5Mg@@._V1_SX300.jpg",
"https://m.media-amazon.com/images/M/MV5BMDJhZjA5MWEtOTE5Yy00MWJiLTgwNjQtMDliOWI0NWJmZDZkXkEyXkFqcGdeQXVyMjY1ODY2Ng@@._V1_SX300.jpg",
"https://m.media-amazon.com/images/M/MV5BMzQyNGM0YjItZmEyNS00ODNlLWI3MjgtYmE1MzRjZWJhMGYwL2ltYWdlXkEyXkFqcGdeQXVyMjgyMDM0NDE@._V1_SX300.jpg"]

let i=0
let id=setInterval(function(){
    if(i==url.length){
        i=0;
    }
    let image=document.createElement("img");
    image.src=url[i];

    box.innerHTML=null;
    box.append(image)
    i++;
},3500)


//   Movies Grid Part 

let data = [
    {
      Title: "Weird Science",
      Year: "1985",
      imdbID: "tt0090305",
      Type: "movie",
      Poster:
        "https://m.media-amazon.com/images/M/MV5BMTEwMTU1YjMtMjc0OS00NjZiLTk1MGMtNzhkODI0ZDFjNGI2XkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg",
    },
    {
      Title: "The Science of Sleep",
      Year: "2006",
      imdbID: "tt0354899",
      Type: "movie",
      Poster:
        "https://m.media-amazon.com/images/M/MV5BMTg3NTcxNzY5NV5BMl5BanBnXkFtZTcwODk5NTQzMQ@@._V1_SX300.jpg",
    },
    {
      Title: "Mystery Science Theater 3000",
      Year: "1988–1999",
      imdbID: "tt0094517",
      Type: "series",
      Poster:
        "https://m.media-amazon.com/images/M/MV5BMTc4Nzc0Mzc5M15BMl5BanBnXkFtZTcwMDYzNTYyMQ@@._V1_SX300.jpg",
    },
    {
      Title: "Mystery Science Theater 3000: The Movie",
      Year: "1996",
      imdbID: "tt0117128",
      Type: "movie",
      Poster:
        "https://m.media-amazon.com/images/M/MV5BYzNmN2UzNTAtNmZkMS00MmI3LThhNzEtNjI1YjJlN2JiZjU0XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SX300.jpg",
    },
    {
      Title: "Rocket Science",
      Year: "2007",
      imdbID: "tt0477078",
      Type: "movie",
      Poster:
        "https://m.media-amazon.com/images/M/MV5BMjRmNTIyMDAtMTM2NC00YjFjLWFiMzgtNjgyYmFiMGE3MjYxXkEyXkFqcGdeQXVyNTE1NjY5Mg@@._V1_SX300.jpg",
    },
    {
      Title: "Bill Nye the Science Guy",
      Year: "1993–1998",
      imdbID: "tt0173528",
      Type: "series",
      Poster:
        "https://m.media-amazon.com/images/M/MV5BZTM4MjNkOWItMTI5OC00ZWQ3LTg5YWYtMmY1Y2JiMDYxMzkwXkEyXkFqcGdeQXVyOTMwNTUwNTk@._V1_SX300.jpg",
    },
    {
      Title: "My Science Project",
      Year: "1985",
      imdbID: "tt0089652",
      Type: "movie",
      Poster:
        "https://m.media-amazon.com/images/M/MV5BMmYxZWY5ZTEtNDBiNC00N2FiLWJhNzMtOTcxMDM0YWE4ZjVlXkEyXkFqcGdeQXVyMjY3MjUzNDk@._V1_SX300.jpg",
    },
    {
      Title: "Brainiac: Science Abuse",
      Year: "2003–2008",
      imdbID: "tt0442633",
      Type: "series",
      Poster:
        "https://m.media-amazon.com/images/M/MV5BMTYxODU4MDA2MV5BMl5BanBnXkFtZTcwMTg4NDEzMQ@@._V1_SX300.jpg",
    },
    {
      Title: "Mystery Science Theater 3000",
      Year: "2017–2022",
      imdbID: "tt6782014",
      Type: "series",
      Poster:
        "https://m.media-amazon.com/images/M/MV5BZjc0NGY5NzQtZWU5YS00NzY5LTk2YzMtMmYwZmYzNTAwNTZjXkEyXkFqcGdeQXVyNzUxNzY1NjM@._V1_SX300.jpg",
    },
    {
      Title: "Weird Science",
      Year: "1994–1998",
      imdbID: "tt0108988",
      Type: "series",
      Poster:
        "https://m.media-amazon.com/images/M/MV5BYmE4MDI0ZjgtNTJhYi00MDk1LThlNDUtYTMxMjI0N2RkODI3XkEyXkFqcGdeQXVyNjc3MjQzNTI@._V1_SX300.jpg",
    },
  ]

  localStorage.setItem("movies",JSON.stringify(data))

  function rating(){
    this.rate= (Math.random()*10).toFixed(2)
  }

  for(let i=0; i<data.length; i++){
    rating.call(data[i])
  }
  console.log("data :",data)

append_data();

function append_data(){
    let container=document.getElementById("movies")

    data.forEach(function(el){
        let box2=document.createElement("div");
        box2.setAttribute("class","cards")

        let name=document.createElement("h4");
        name.innerText=el.Title

        let image=document.createElement("img")
        image.src=el.Poster;

        let div=document.createElement("div")
        
        let year=document.createElement("h4");
        year.innerText=el.Year;

        let imdb=document.createElement("h4");
        imdb.innerText=`Rating : *${el.rate}`;

        div.append(year,imdb);
        box2.append(name,image,div);
        container.append(box2)
    })
}



// Button sort section 

let lh=document.getElementById("sort-lh");
lh.addEventListener("click",from_low)

function from_low(){
  data.sort(function(a,b){
    return a.rate-b.rate;
  })
  document.querySelector("#movies").innerHTML=null;
  append_data()
}

let hl=document.getElementById("sort-hl");
hl.addEventListener("click",from_high)

function from_high(){
  data.sort(function(a,b){
    return b.rate - a.rate;
  })
  document.querySelector("#movies").innerHTML=null;
  append_data();
}