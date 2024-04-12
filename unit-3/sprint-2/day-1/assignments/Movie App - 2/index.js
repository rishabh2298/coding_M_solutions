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
      this.rate="Rating :-"+" "+(Math.random() *11).toFixed(2)+"*";
  }

  for(let i=0; i<data.length; i++){
    rating.call(data[i])
  }
  console.log("data :",data)

append_data();

function append_data(){
    let container=document.getElementById("container")

    data.forEach(function(el){
        let box=document.createElement("div");
        box.setAttribute("class","cards")

        let name=document.createElement("h3");
        name.innerText=el.Title

        let image=document.createElement("img")
        image.src=el.Poster;

        let div=document.createElement("div")
        
        let year=document.createElement("h4");
        year.innerText=el.Year;

        let imdb=document.createElement("h4");
        imdb.innerText=el.rate;

        div.append(year,imdb);
        box.append(name,image,div);
        container.append(box)
    })
}