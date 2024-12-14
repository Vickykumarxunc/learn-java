
//? how to select the html element by the javascript ::::::;

//? 1. get element by tag name : 
//? ye hamko sabhi element ko ek array ki form me store karke return karte hai actual me array nahi hota hai : 
const img = document.getElementsByTagName("img");
console.log(img);
console.log(Array.isArray(img)); // false 
console.log(typeof img);

//? 2. get element by class name :
//? it also give the array like object : but not actual array  : 
const para = document.getElementsByClassName("copy_mark");
console.log(para);
console.log(Array.isArray(para));

//? 3. get element by id : 
//? it return the single value : 
//? id of every element is unique : 
const mydiv =  document.getElementById("myDiv");
console.log(mydiv);
console.log(mydiv.textContent);
console.log(mydiv.innerText);

//? 4. using the querySelector : 
//? ye sabhi variety ke element ko select kar sakta hai
//? for class => use (.)
//? for id => use (#)

//? query selector return the only first element of the selector : 

const heading = document.querySelector("#heading");
console.log(heading.textContent);

const li1 = document.querySelector('.li');
console.log(li1);
console.log(li1.textContent);

//? 5. using the querySelectorAll : 
//? ye ek jaishe id or class or element sabhi ko select kar leta hai : 
//? query selector hamko Nodelist return karta hai : 

const li_class = document.querySelectorAll(".li");
console.log(li_class);

const allLi = document.querySelectorAll("li");
console.log(allLi);

const js_image = document.querySelectorAll(".js_image");
console.log(js_image);
 

//? 6 using the attrubute : 
const image = document.querySelectorAll('[alt = javascript]');
console.log(image);

const ul_li = document.querySelector('ul li');
console.log(ul_li);
console.log(ul_li.textContent);

//? we can also change the image : 
const change_image = document.querySelector(".image1");
change_image.src = 'https://th.bing.com/th/id/OIG2.9O4YqGf98tiYzjKDvg7L';

//? we can change the all images url : 
const change_allImage = document.querySelectorAll('img');
console.log(change_allImage);
const images = [
    "https://th.bing.com/th/id/OIG1.wQ7nqzXG6LLji1s3MrOP",
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTE5fPhctwNLodS9VmAniEw_UiLWHgKs0fs1w&s",
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSljHunwtIgPgn5gVs9vyzBZTYGCALheHDYMA&s"
];
// by using the for loop : 
//  for(let i = 0; i<images.length; i++)
//  {
//     change_allImage[i].src = images[i];
//  }

 // by using the foreach method : 
  change_allImage.forEach((image , index) =>{
    image.src = images[index];
  })


  //? hum ek particulare element ke upar bhi query selector ka use kar sakte hai  ;
  //? aba ye particule element ke child ke ander ki select karega : 
  const ul = document.querySelector("ul");
 const ul_child =  ul.querySelector(".li");
 console.log(ul_child);
