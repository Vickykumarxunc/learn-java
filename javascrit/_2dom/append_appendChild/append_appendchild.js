/**
 //? append() ..........
 1. append method is used to add the new element inside the other element .
 2. the Element.append() method insets(add) a set of Node objects or string after the last child of the Element . (kisi bhi document ke last ke add karne ko hi append kahte hai : ) 
 3. the append() method is not scoped into the with statement .
 */

 /**
  //? appendChild()................
  1. the appendChild() method of the node interface adds a node ot the endo of the list of children of a specifc parent node 
  2.appendChild() moves it from its current position to the new position . 
  */

  /**
   //? difference between append and appendChild().............................
   1. append() accepts Node objects and domString . 
      appendChild() accepts only Node object. 

   2. append does not have a return value 
      appendChild return the appended Node object 
   
    3. append allows you to add mulitple items 
       appendChild allows only a single items 
   */
const h1 = document.querySelector("h1");
const container = document.querySelector(".container");
const card = document.querySelector(".card");
console.log(card.textContent);

// add the h1 inside the div 
// append se element apani original position se remove ho jata hai : 
container.append(h1);

// add the h2 inside the div 
const h2 = document.querySelector("h2");
container.append(h2);

// cloneNode() se kisi bhi elemet ko clone kar sakte hai : 
const newcard = card.cloneNode();
console.log(newcard);

// add value inside the new card : 
newcard.textContent = "1";
console.log(newcard.textContent);

//add new card into the main div : 
container.append(newcard);

// now we add the 100 cards inside the main contaier : 
// we use the for loop 
for(let i = 1; i<=100; i++)
{
    // first create a new card : 
    const newcard = card.cloneNode();
    // add the content of the new card 
    newcard.textContent = i;
    // add the newcard inside the contianer or main div : 
    container.append(newcard);
}

// now we use the appendChild();
const h1_value = container.appendChild(h1);
console.log(h1_value);
const h2_value = container.appendChild(h2);
console.log(h2_value);


// difference explanation 
//?1....................
const parent = document.querySelector('div');
const child  = document.createElement('p');

// appending node objects 
parent.append(child); // work fine add at last 
parent.appendChild(child); // work find add at last 

// appending dom string : 
parent.append("hello world"); // work fine add the hello world at last : 
// parent.appendChild("hello world"); // throw an erro : 

//? 2.................................
const append_value = parent.append(child);
console.log(append_value); // give the undefined 
const appendchild_value = parent.appendChild(child);
console.log(appendchild_value); // return the p tag 

//? 3.......................
const parent2 = document.querySelector("div");
const child1 = document.createElement("p");
const child2 = document.createElement("h2");

parent.append(child1 , child2 , "hello world"); // work fine 
parent.appendChild(child , child2 , child1 , "hello world"); // work fine but adds the first element and ignore the rest : 


//? how to add string using the appendChild : 
// 1 first create a text node 
const newTextNode = document.createTextNode("vicky");
parent.appendChild(newTextNode);