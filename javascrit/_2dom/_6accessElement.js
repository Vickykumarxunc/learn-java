// access element : 
//? parent ko hum -> parentElement se access kar sakte hai 
//? child ko hum -> children se access kar sakte hai : 

//? nextSibling propety -> nextSibling property of the node  interface return the node immediately 
                       //? -> or return the null if the specific node is teh last child in the parent element :
                       
//? nextElementSibling -> it read only property returns the element immediately folloing the specified one in its parent children list : or null if the specified element is the last one in the list : 
//?                   -> it return the element or return null is element is not present : 
const body = document.querySelector("body");
const body_parent = body.parentElement;
console.log(body_parent);

const body_child = body.children;
console.log(body_child); // it return the array of the children : 

const li = document.querySelector('li');
const li_parent = li.parentElement;
console.log(li_parent);

const ul = document.querySelector('ul');
const ul_parent = ul.parentElement;
console.log(ul_parent);

const ul_parent_parent = ul_parent.parentElement;
console.log(ul_parent_parent);

const ul_child = ul.children;
console.log(ul_child);

// how to access sibling element 

const para = document.querySelector("#para");
const para_sibling = para.nextSibling;
console.log(para_sibling);
console.log(para_sibling.nextSibling);
console.log(para_sibling.nextSibling.nextSibling);

const all_a = document.querySelector("a");
const a_sibling = all_a.nextElementSibling;
console.log(a_sibling);
const a_sibling2  = all_a.nextElementSibling.nextElementSibling;
console.log(a_sibling2);
const a_sibling3 = a_sibling2.nextElementSibling;
console.log(a_sibling3);

// const a_sibling4 = a_sibling3.nextElementSibling;
// console.log(a_sibling4); // it will provide the null because a ke or sibling hai hi nahi : 


 const body1  = document.querySelector("body");
 const body_sibling1 = body1.nextSibling;
 console.log(body_sibling1);
 console.log(body1);

 const h1 = document.querySelector('h1');
 const h1_next = h1.nextSibling;
 console.log(h1_next);
 const h1_next2 = h1_next.nextSibling;
 console.log(h1_next2);
 const h1_next3 = h1_next2.nextSibling;
 console.log(h1_next3);
 const h1_next4 = h1_next3.nextSibling;
 console.log(h1_next4);


