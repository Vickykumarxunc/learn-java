// input ke upar hum kaishe event laga sakte hai : 
const userInput = document.querySelector('#username');
const paragraph = document.querySelector('p');
userInput.addEventListener('click' , ()=>{
    console.log("input click : ");
});

// add double click : 
 userInput.addEventListener('dblclick' , ()=>{
    console.log("double click ");
 })

 /// add input event : 
 userInput.addEventListener('input' ,  ()=>{
    console.log("input event ");
 })

 // how to access the value of input: 
 // by the pass object : commonly use e : 
 userInput.addEventListener('input' , (event) =>{
    console.log(event);
 })

 // target -> target vo hota hai jiske upar event hota hai :  
 // we can access the value of target : 
 userInput.addEventListener('input', (e)=>{
    console.log(e.target.value);
    paragraph.innerText = e.target.value;
 })

 //? change event :........................
 // change event tab fire hota hai jab mai input par kuch bhi value 
 // written kar kar bahar click karta hoon : 

 userInput.addEventListener('change' , (e)=>{
    console.log(e.target.value);
 }) 

 //? focus event >>>>>>>>>>>>>>>>>>>>...
 // jaishe hi mai input ka ander click karta hoon to use bolte hai focus : 
 const email = document.querySelector("#email");
 email.addEventListener('focus' , ()=>{
     console.log("we are not is focus : ");
 })

 //? blur event ..............................
 // it is the opposite of focus 
 // jab mai input ke bahar click karta hoon to use kehte hai blur event : 
 email.addEventListener("blur" , ()=>{
    console.log('now we are out of the input ');
 })

 //? button 
 const form = document.querySelector('form');
 form.addEventListener('click' , (e)=>{
    console.log(e);
 })