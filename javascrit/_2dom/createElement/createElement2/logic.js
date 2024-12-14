
const container = document.querySelector(".container");

for(let i = 1; i<=100; i++)
{
// create a image container : 
const imgContainer = document.createElement('div');

// add class in image container 
imgContainer.classList.add("img_container");

// create a new image tag 
const newImage = document.createElement("img");

// set the src : 
newImage.src = `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${i}.png`;

// create the new paragraph tag : 
const paragraph = document.createElement("p");
paragraph.textContent = i;
 
// append the img and paragaph inside the imgage container : 
imgContainer.append(newImage , paragraph);

// image container append inside the contianer : 
container.append(imgContainer);
}





