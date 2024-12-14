// call back hell // pryramid of doom : 
const heading1 = document.querySelector(".heading1");
const heading2 = document.querySelector('.heading2');
const heading3 = document.querySelector('.heading3');
const heading4 = document.querySelector(".heading4");
const heading5 = document.querySelector(".heading5");
const heading6 = document.querySelector(".heading6");
const heading7 = document.querySelector(".heading7");
const heading8 = document.querySelector(".heading8");


// setTimeout(()=>{
//     heading1.textContent = 'heading1';
//     heading1.style.color = "orange";

//     setTimeout(()=>{
//         heading2.textContent = "heading2";
//         heading2.style.color = "green";

//         setTimeout(()=>{
//             heading3.textContent = "heading3";
//             heading3.style.color = "grey";

//             setTimeout(()=>{
//                 heading4.textContent = "heading4";
//                 heading4.style.color = 'orange';

//                 setTimeout(()=>{
//                     heading5.textContent = "heading5";
//                     heading5.style.color = "grey";

//                     setTimeout(()=>{
//                         heading6.textContent = "heading6";
//                         heading6.style.color = "green";

//                         setTimeout(() => {
//                             heading7.textContent = "heading7";
//                             heading7.style.color = "grey";

//                             setTimeout(()=>{
//                                 heading8.textContent = "heading8";
//                                 heading8.style.color = "green";
//                             } , 1000);
//                         }, 1000);
//                     } , 1000);
//                 } , 1000);
//             } , 1000);
//         } , 1000);
//     } , 1000)
// } , 1000);


// ab ye hi kaam mai function ka use karke karuga : 
function changeText(element , text , color , time , onSuccess , onFailure){
    setTimeout(()=>{
        if(element){
            element.textContent = text;
            element.style.color = color;
        }
        if(onSuccess){
            onSuccess();
        }
        else{
            if(onFailure){
                onFailure();
            }
        }
  
    } , time);
}

changeText(heading1 , "one" , "red" , 1000 , ()=>{
    changeText(heading2 , "two" , "yellow" , 1000 , ()=>{
        changeText(heading3 , "three" , "orange" , 1000 , ()=>{
            changeText(heading4 , "four" , "blue" , 1000 , ()=>{
                changeText(heading5 , "five" , "pink" , 1000 ,()=>{
                     changeText(heading6 , "six" , "cyan" , 1000 , ()=>{
                        changeText(heading7 , "seven" , "purple" , 1000 , ()=>{
                            changeText(heading8 , "eight" , "red" , 1000 , ()=>{
                            } , ()=>console.log("heading 8 does not exist : "))
                        } , ()=>console.log("heading 7 does not exist : "))
                     } , ()=>console.log("heading 6 does not exist : "))
                } , ()=>console.log("heading 5 does not exist : "))
            } , ()=>console.log("heading 4 does not exist : "))
        } , ()=>console.log("heading 3 does not exist : "))
    } , ()=>console.log("heading 2 does not exist : "))
} , ()=>console.log("heading 1 does not exist "))

