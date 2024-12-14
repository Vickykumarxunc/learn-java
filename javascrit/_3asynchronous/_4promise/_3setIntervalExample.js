const body = document.body;
const button = document.querySelector(".button");

const id = setInterval(()=>{
    
    const red = Math.floor(Math.random() * 255);
    const green = Math.floor(Math.random() * 255);
    const blue = Math.floor(Math.random() * 255);
     

    const rgb = `rgb(${red} , ${green} , ${blue})`;
    body.style.background = rgb;
    button.textContent = rgb;
} , 1000)

button.addEventListener('click' , ()=>{
    clearInterval(id);
})


