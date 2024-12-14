
// mai jaishe hi plus (+) par click karu to ek card add ho jaye : 
const container = document.querySelector(".container");
const card_div = document.createElement("div");
card_div.classList.add("card");

let i = 1; // ye ban gaya agar mai kahi bhi click karu to ek card add ho jaye : 
container.addEventListener('click' , ()=>{

    // container.append(card_div);
    // card_div.textContent = i;

    // const card_div = document.createElement("div");
    // card_div.classList.add("card");
    // container.append(card_div);
    // card_div.textContent = i;
    i++;
})

// ab mai cahta hoo only + pr click karne par hi meri card increase ho : 
let j = 1;
const card = document.querySelector(".card");
card.addEventListener("click" , ()=>{
    const newCard = document.createElement("div");
    newCard.classList.add("card");
    container.append(newCard);
    newCard.textContent = j;
    j++;
     

})

