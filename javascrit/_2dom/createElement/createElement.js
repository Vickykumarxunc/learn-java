//? createElement() = > it is used to create a element : 
/* 

 */
const h1 = document.querySelector("h1");
const container = document.querySelector(".container");
const image = document.querySelector("img");
 
// add the 100 image : using the first image : 
 for(let i = 2; i<=100; i++)
 {
    const newImg = image.cloneNode();
    newImg.src = `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${i}.png`;
    container.append(newImg);
 }

 // how to create a elemnt : 
 const p = document.createElement("p"); // it create the paragraph tag : 
 console.log(p);
const img = document.createElement("img");
console.log(img);
img.src = `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png`;

for(let i = 200; i<= 300; i++)
{
    const newimg = document.createElement('img');
    newimg.src = `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${i}.png`;

    container.append(newimg);
}

// add the p tag in container 
container.append(p);
p.textContent = "we can create the new element by using the createElement ";
container.append(img);

const body = document.querySelector("body");
const h2 = document.createElement("h2");
h2.textContent = "createElement";
container.append(h2);

// we can also add the class on new create element 
h2.classList = "heading2";

// we can also add the id on the new create elemnt : 
h2.id = "heading_id";


// add the number on each image : . method 1................
const figure = document.createElement("figure");
const image2 = document.createElement("img");
image2.src = `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png`;

for(let i = 1; i<=100; i++)
{
    const new_img = document.createElement("img");
    const figcaption = document.createElement("figcaption");
    new_img.src = `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${i}.png`
    figure.append(new_img);
    figcaption.textContent = `${i}`;
    figure.append(figcaption);
    
    body.append(figure);
}

// add the number on each image: method2 ...............................

// choose parent container : 
const container2 = document.querySelector(".container2");
const childcontainer = document.querySelector(".img_container");

for(let i = 1; i<=100; i++)
{
    const newImg = document.createElement("img");
    newImg.src = `"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png`;
}
