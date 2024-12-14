
//? children is a html collection it return the array like object (but not original array) of the html element : 
//? node is an object : 

//? node .............................
//? -> in the dom everything is a node . a node can be an element attribute , text , comment , document or any other type of dom object . 
//?    node are organized in a tree like structure with the document node at the top and all other
//?    nodes branching off from it : each element of html is a node but all node are not elemnt 

//? element ->...................................
//? element are the specific type of node that represent an thml element . elements hava all the properties and method of a node
//? but they can also have additional properties and method that specific to element for ex -> element have a tag name such as "div" or "span" .
//? element also have attribute which can access using the getAttribute() method 
//? element have the child node property which return the nodelist of all the child nodes of a elemnt : 
//? element also have a prentElement propety which return the parent element of the current element. this property is equivalent to the parentNode propety but it only return the element and not other  types of nodes : 
//? element have a tagName property which is only for reading not change : 
const h1 = document.querySelector("h1");
console.log(h1.children);
console.log(typeof h1);
console.log(Array.isArray(h1));

 const body = document.querySelector("body");
 console.log(body.children); // it give the collection of html element which present inside the body tag : 
 console.log(body.childNodes); // it return the node list which hold the all thing text , para , heading every thing new line 
console.log(typeof(body.childNodes));

//? attributes hamko attribute retur karke deta hai ki hamne ek particule element par kitne attribute  diye hai :
//? har ek node ka nodetype alag alag hota hai : 
console.log(body.attributes);
 
//? how to change the some specific element data  : we use the nodeValue
const h1_ = document.querySelector("h1");
console.log(h1_.textContent);
const update = h1_.textContent = "vicky";
console.log(body.childNodes);
const new_value = body.childNodes[2].nodeValue = "ronak";

console.log(h1_.tagName);
console.log(body.tagName);
 
