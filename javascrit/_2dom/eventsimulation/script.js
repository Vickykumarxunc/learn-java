const container  = document.querySelector(".container");
let j = 1;

const card = document.querySelector(".card");
card.addEventListener('click' , ()=>{
    const newCard = document.createElement('div');
    newCard.classList.add('card');
    newCard.textContent = j;
    container.append(newCard);
    j++;
})


//? event simulation : 
// hum click event function javascript ke help se bhi kar sakte hai : 
// for(let i = 1; i<=100; i++){
//     card.click();
// }

// for smooth scrolling we use the settimeout : 
const interval_id = setInterval(()=>{
    if(j > 100){
        clearInterval(interval_id);
    }
    card.click();

} , 10);


// now we focus the input element by the help of javascript : :
const input = document.querySelector('input');
// input.focus();

// focus after some time : 
 setInterval(()=>{
    input.focus();
 } , 2000);

 // we can also blue 
 setInterval(()=>{
    input.blur();
 } , 3000);
 
 const form  = document.querySelector("form");

 // isse ye apane aap multiple time apane aap form submit ho jayega : 
//  form.submit();

setInterval(()=>{
    form.submit();
} , 5000);

// reset: 
form.reset();
