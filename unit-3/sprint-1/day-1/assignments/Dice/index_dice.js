//    DICE

let m1 = document.querySelector("#member1");
let m2 = document.querySelector("#member2");
let m3 = document.querySelector("#member3");
let winner=document.querySelector("#winner");

document.querySelector("#roll").addEventListener("click", function () {
  m1.innerHTML = Math.floor(Math.random() * 7);
  m2.innerHTML = Math.floor(Math.random() * 7);
  m3.innerHTML = Math.floor(Math.random() * 7);

  if (m1.innerText == m2.innerText) {
    m1.style.backgroundColor = "blue";
    m1.style.color = "white";
    m2.style.backgroundColor = "blue";
    m2.style.color = "white";
  } else if (m1.innerText == m3.innerText) {
    m1.style.backgroundColor = "blue";
    m1.style.color = "white";
    m3.style.backgroundColor = "blue";
    m3.style.color = "white";
  } else if (m2.innerText == m3.innerText) {
    m2.style.backgroundColor = "blue";
    m2.style.color = "white";
    m3.style.backgroundColor = "blue";
    m3.style.color = "white";
  } else if (m1.innerText == m2.innerText && m1.innerText == m3.innerText && m2.innerText==m3.innerText) {
    m1.style.backgroundColor = "blue";
    m1.style.color = "white";
    m2.style.backgroundColor = "blue";
    m2.style.color = "white";
    m3.style.backgroundColor = "blue";
    m3.style.color = "white";
  }

                // Display Winner

  else if(m1.innerText>m2.innerText && m1.innerText>m3.innerText && m2.innerText>m3.innerText){
      m1.style.backgroundColor="green";
      m1.style.color="white"
      m2.style.backgroundColor="yellow"
      m2.style.color="black"
      m3.style.backgroundColor="red"
      m3.style.color="white"
      winner.innerText="Member-1";
  }
  else if(m1.innerText>m2.innerText && m1.innerText>m3.innerText && m3.innerText>m2.innerText){
    m1.style.backgroundColor="green";
    m1.style.color="white"
    m3.style.backgroundColor="yellow"
    m3.style.color="black"
    m2.style.backgroundColor="red"
    m2.style.color="white"
    winner.innerText="Member-1";
}
else if(m1.innerText>m2.innerText && m1.innerText>m3.innerText && m2.innerText==m3.innerText){
    m1.style.backgroundColor="green";
    m1.style.color="white"
    m2.style.backgroundColor="blue"
    m2.style.color="white"
    m3.style.backgroundColor="blue"
    m3.style.color="white"
    winner.innerText="Member-1";
}
else if(m2.innerText>m1.innerText && m2.innerText>m3.innerText && m1.innerText>m3.innerText){
    m2.style.backgroundColor="green";
    m2.style.color="white"
    m1.style.backgroundColor="yellow"
    m1.style.color="black"
    m3.style.backgroundColor="red"
    m3.style.color="white"
    winner.innerText="Member-2";
}
else if(m2.innerText>m1.innerText && m2.innerText>m3.innerText && m3.innerText>m1.innerText){
    m2.style.backgroundColor="green";
    m2.style.color="white"
    m3.style.backgroundColor="yellow"
    m3.style.color="black"
    m1.style.backgroundColor="red"
    m1.style.color="white"
    winner.innerText="Member-2";
}
else if(m2.innerText>m1.innerText && m2.innerText>m3.innerText && m1.innerText==m3.innerText){
    m2.style.backgroundColor="green";
    m2.style.color="white"
    m1.style.backgroundColor="blue"
    m1.style.color="white"
    m3.style.backgroundColor="blue"
    m3.style.color="white"
    winner.innerText="Member-2";
}
else if(m3.innerText>m1.innerText && m3.innerText>m2.innerText && m1.innerText>m2.innerText){
    m3.style.backgroundColor="green";
    m3.style.color="white"
    m1.style.backgroundColor="yellow"
    m1.style.color="black"
    m2.style.backgroundColor="red"
    m2.style.color="white"
    winner.innerText="Member-3";
}
else if(m3.innerText>m1.innerText && m3.innerText>m2.innerText && m2.innerText>m1.innerText){
    m3.style.backgroundColor="green";
    m3.style.color="white"
    m2.style.backgroundColor="yellow"
    m2.style.color="black"
    m1.style.backgroundColor="red"
    m1.style.color="white"
    winner.innerText="Member-3";
}
else if(m3.innerText>m1.innerText && m3.innerText>m2.innerText && m1.innerText==m2.innerText){
    m3.style.backgroundColor="green";
    m3.style.color="white"
    m2.style.backgroundColor="blue"
    m2.style.color="white"
    m1.style.backgroundColor="blue"
    m1.style.color="white"
    winner.innerText="Member-3";
}
});
