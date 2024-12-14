// callback hell to flat codde : 

const heading1 = document.querySelector(".heading1");
const heading2 = document.querySelector(".heading2");
const heading3 = document.querySelector(".heading3");
const heading4 = document.querySelector(".heading4");
const heading5 = document.querySelector(".heading5");
const heading6 = document.querySelector(".heading6");
const heading7 = document.querySelector(".heading7");
const heading8 = document.querySelector(".heading8");
const heading9 = document.querySelector(".heading9");
const heading10 = document.querySelector(".heading10");

function changeText(element , text , color , time){

    return new Promise((resolve , reject)=>{

        setTimeout(()=>{
            if(element){
                element.textContent = text;
                element.style.color = color;
                resolve();
            }
            else{
                reject(new error("element not found "));
            }
        } , time);
    })
}

changeText(heading1 , "one" , "red" , 1000)
  .then(()=>{
    return changeText(heading2 , "two" , "purple" , 1000);
  })
  .then(()=>{
    return changeText(heading3 , "three" , "green" , 1000);
  })
  .then(()=>{
    return changeText(heading4 , "four" , "orange" , 1000);
  })
  .then(()=>{
    return changeText(heading5 , "five" , "skyblue" , 1000);
  })
  .then(()=>{
    return changeText(heading6 , "six" , "pink" , 1000);
  })
  .then(()=>{
    return changeText(heading7 , "seven" , "yellow" , 1000);
  })
  .then(()=>{
    return changeText(heading8 , "eight" , "blue" , 1000);
  })
  .then(()=>{
    return changeText(heading9 , "nine" , "indigo" , 1000);
  })
  .then(()=>{
    return changeText(heading10 , "ten" , "purple" , 1000);
  })
  .catch((error)=>{
    console.log(error);
  })