//? remove() 
/*
1. remove method ko hum directly kisi bhi element par laga sakte hai jise hame delete karna hai : 
 */
//? removechild() 
/**
1. removechild() method use only with parent : 
 */
const container = document.querySelector(".container");

for(let i = 2; i<=100; i++)
{
    const img_container = document.createElement("div");
    img_container.classList.add("img_container");

    const newImage = document.createElement("img");
    newImage.src = `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${i}.png`;

    const para = document.createElement("p");
    para.textContent = i;

    img_container.append(newImage , para);
    container.append(img_container);


}

//? how to delete element fromt the html 
/* 
first select the element -> copy + jspath  */
const myimg = document.querySelector("body > div > div:nth-child(43)");
myimg.remove(); // 43th image are remove : from the html permantely : 

//? using the removeChild() 
 const  myimg2 = document.querySelector("body > div > div:nth-child(33)");

 // select the parent of image : 
 const myimgParent = myimg2.parentElement;
 console.log(myimgParent);

 // apply the removechild on the parent 
 myimgParent.removeChild(myimg2);

 //? agar hame kuch element remove karna hai to uske varaible ko bhi remove karna hoga 
 //? us element ke varaiable ko hame null set karna hoga lekin ye const ke case me varaible ki value ko change nahi kar sakte . 
 //? but hum variable ko let declare karke aur usko remove karke fir us variable ko value ko null set kar dege tab ek element completely remove hoga : 
