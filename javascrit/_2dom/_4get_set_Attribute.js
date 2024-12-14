//? 3/oct/2024....................

//? setAttribute() -> set attribute method set a new value to an attribute 
//?                -> if the attribute does not exist it is create first :
                 ///? syntax -> setAttribute(name , value); both are string : 

//? getAttribute() -> the getAttribute method returns the vallue of an element attribute : 
                  //? if the given attribute does not exist the value return will be null : 
                  //? syntax -> getAttribute(attributeName);

const mydiv = document.querySelector("div");
const value_mydiv = mydiv.getAttribute("id");
console.log(value_mydiv);

const h1 = document.querySelector('h1');
const All_class = h1.getAttribute('class');
console.log(All_class); // because no class is given of h1 in html 

const img = document.querySelector("img");
const AllimgClass = img.getAttribute("class");
console.log(AllimgClass);


const button = document.querySelector('button');
button.setAttribute("class" , "mybutton");

const button_value = button.getAttribute("class");
console.log(button_value);

const AllUl = document.querySelector("ul");
AllUl.setAttribute("class" , "ul");
AllUl.setAttribute("id" , "unique");

const ul_value = AllUl.getAttribute("class");
console.log(ul_value);
const id_value = AllUl.getAttribute("id");
console.log(id_value);

const body = document.querySelector("body");
body.setAttribute("class" , "div");

