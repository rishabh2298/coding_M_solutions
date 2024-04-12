//  Borrow other's skills


let amar = {
    name: "Amar",
    skill: "Singer",
  };

  let akbar = {
    name: "Akbar",
    skill: "Chef",
  };

  let anthony = {
    name: "Anthony",
    skill: "Magician",
  };

  function borrow(borrow_skill) {
    console.log(`${this.name} has borrowed skill of ${borrow_skill}`);
  }

    borrow.call(amar,akbar.skill);
    borrow.call(akbar,anthony.skill);
    borrow.call(anthony,amar.skill);