// add event listener 
//? difference between onclick and addEventListener
/**
1. //? using the onclick() -
  only one event handler can be assigned at a time . if you assign a second onclick handler , it will overwrite the previous one. 
  work only for click 
  no control
 */
//? addevenlistner()
/*
1. multiple event listener can be attached to the same even on the same element without overwrite each other. 
work for all event type 
can be control by third argument 
 */
const button = document.querySelector("button");

function sayhi(){
    console.log("hay vicky kaishe ho");
}
button.addEventListener("click" , sayhi)
button.addEventListener("click" ,()=>{
    console.log("second hi");
})

 