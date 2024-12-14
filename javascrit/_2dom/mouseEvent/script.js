const container = document.querySelector(".container");

let j = 1;
const card = document.querySelector(".card")

//? mouse click : 
// card.addEventListener("click" , ()=>{
//     const newCard = document.createElement("div");
//     newCard.classList.add("card");
//     container.append(newCard);
//     newCard.textContent = j;
//     j++;
     

// })

//? mouse down :
// mouse down mouse ko element se chod ne se phle hi fire ho jata hai :
// jabki click event tab fire hota hai jab mai element par se mouse ko hata leta hoon : 
// card.addEventListener("mousedown" , ()=>{
//     const newCard = document.createElement("div");
//     newCard.classList.add("card");
//     container.append(newCard);
//     newCard.textContent = j;
//     j++;
     

// })

//? mouse up :
// jaishe hi hum mouse ko presee karke chodege tab ye fire hoga : 
// card.addEventListener("mouseup" , ()=>{
//     const newCard = document.createElement("div");
//     newCard.classList.add("card");
//     container.append(newCard);
//     newCard.textContent = j;
//     j++;
     

// })

//? mouse enter :
// jab hamara mouse particular element ke ander enter karta hai : 
// tabbhi mouse enter fire hota hai : 
// mouse enter me click karne ki jarurat nahi hoti hai : 
// card.addEventListener("mouseenter" , ()=>{
//     const newCard = document.createElement("div");
//     newCard.classList.add("card");
//     container.append(newCard);
//     newCard.textContent = j;
//     j++;
     

// })

//? mouse leave event : 
// ye tab fire hoga jab mera mouse particular element se bahar jayega tab mouse leavel event fire hoga : 
// card.addEventListener("mouseleave" , ()=>{
//     const newCard = document.createElement("div");
//     newCard.classList.add("card");
//     container.append(newCard);
//     newCard.textContent = j;
//     j++;
    
// })

//? mouse move event : ....................
// ye event tab tak fire hoga jab tak mera mouse ek particular element par move karta rahega : 
// card.addEventListener("mousemove" , ()=>{
//     const newCard = document.createElement("div");
//     newCard.classList.add("card");
//     container.append(newCard);
//     newCard.textContent = j;
//     j++;
     

// })

//? mouse out event :.......................
// jaishe hi mai element se bahar aauga tab mouse out fire hoga : 
// card.addEventListener("mouseout" , ()=>{
//     const newCard = document.createElement("div");
//     newCard.classList.add("card");
//     container.append(newCard);
//     newCard.textContent = j;
//     j++;
     

// })

//? mouse over : 
// its like as a mouseenter 
// but mouse over event child ke ander enter hone par bhi fire hota hai;
// agar parent ke ander child hai to mouse over event child ke liye bhi fire hota hai;  
// card.addEventListener("mouseover" , ()=>{
//     const newCard = document.createElement("div");
//     newCard.classList.add("card");
//     container.append(newCard);
//     newCard.textContent = j;
//     j++;
     

// })

//? wheel event : it is a mouse event 
// wheel event tab fire hota hai jab hum ek particular element par scroll karte hai : 
card.addEventListener("wheel" , ()=>{
    const newCard = document.createElement("div");
    newCard.classList.add("card");
    container.append(newCard);
    newCard.textContent = j;
    j++;
    
})

//? touchEvent 
// jaishe hi mai ek particular element par touch karuga tab touch event run hoga: 
card.addEventListener("touchstart" , ()=>{
    const newCard = document.createElement("div");
    newCard.classList.add("card");
    container.append(newCard);
    newCard.textContent = j;
    j++;
    
})

//? touch end event : 
// ye tab fire hoga jab me ek particulare element ko touch karke chod duga : 
card.addEventListener("touchend" , ()=>{
    const newCard = document.createElement("div");
    newCard.classList.add("card");
    container.append(newCard);
    newCard.textContent = j;
    j++;
     

})

//? touch move: same as a mouse move : 
card.addEventListener("touchmove" , ()=>{
    const newCard = document.createElement("div");
    newCard.classList.add("card");
    container.append(newCard);
    newCard.textContent = j;
    j++;
     

})

//? pointer move work for both touch and mouse : 
card.addEventListener("pointermove" , ()=>{
    const newCard = document.createElement("div");
    newCard.classList.add("card");
    container.append(newCard);
    newCard.textContent = j;
    j++;
     

})