//? apply style in javascript :: 
 const h1 = document.querySelector('h1');
 h1.style.color = "red";
 h1.style.backgroundColor = "grey";  
h1.style.borderTopColor = "red";
h1.style.borderBottomColor = "yellow";

// change the color all anchor tag in one time : 
let all_a = document.querySelectorAll('a');
console.log(all_a);
console.log(typeof all_a);

all_a.forEach((color ,  index) =>{
    all_a[index].style.color = "teal";
    all_a[index].style.textDecoration = "none";
})

for(let link of all_a){
    link.style.fontFamily = "cursive";
}

let all_ul = document.querySelectorAll('ul');
console.log(all_ul);
for(let color of all_ul)
{
    color.style.color  = "green";
}

//? we can also change the style of mulitple elment ka in one time : 
//? by using the backtick 
//? cssText hamko ek element par  kitni css  property use hui hai vo provide karta hai : 
for(let link of all_a){
    console.log(link.style.cssText);
}

//? hum cssText se html ko style kar sakte hai same as css : 
for(let link of all_a){
    link.style.cssText = `
    color : red;
    padding : 15px;
    border : 2px solid orange;
    margin-top : 10px;
    border-radius : 20px;
    text-decoration : none;
    background-color : yellow;
    font-size : 400;
    font-weight : bolder;
    `
}

//? hum isse better way me bhi kar sakte hai hum className add kar sakte hai : 
//? className se ek sath ek jaishe sabhi element par class laga sakte hai : 
 for(let ul of all_ul){
    ul.className = "all_ul";
     
 }

 //? classList.add se hum new class ko add kar sakte hai : 
 ///? classList.remove se hum class ko remove bhi kar sakte hai; 
 ///? classList.toggle -> agar class present hai to use remove kar dega agar present nahi hai to use add kar dega : 
 for(let link of all_a){
    link.className = "link_class";
    console.log(link.classList);
    link.classList.add('new_class');
    link.classList.remove("new_class");
    link.classList.toggle("new_class");
 }
 
  