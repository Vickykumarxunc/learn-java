//? 2/oct/2024..........................
console.log("hello world");
function sayhi(){
    console.log("say hi");
}
sayhi();


//? ek parent ke multiple  child ho sakte hai lekin multiple child ke multiple parent nahi ho sakte : 
//? each and every element ko html is object : 

//? the documnet object model (dom) is the data representation of the object that 
//? comprise the structure and content of a document on the web

//? the document object mdel(dom) is a programming interface for web documents. it represents the page so that program can change the document structure, style , and content
//? the dom represent the document as nodes and objects that way programming languages can interact with the page 

console.log(document.body);
console.log(document.body.children[0]);
console.log(document.children[0]);
console.log(document.children[0].children[0]);
console.log(document.children[0].children[1]);

//? how to modify the html content :
//? by using the innerHtml innerText  
document.body.children[0].innerHTML = "vicky";
document.body.children[0].innerText = "frontent development";

document.body.children[0].innerHTML = '<i>vicky_ronak</i>'
document.body.children[0].innerText = '<strong>vicky_kumar</strong>'

//? the main difference between innerHtml and innerText is that innerHTML
//? return the HTML content of an element including any formatting , 
//? while innerText return the visible text centent of an element 

//? innerHTML se hum html element ko formatting ke sath modify kar sakte hai 
//? while innerText ke sath formatting tag work nahi karte hai vo aishe ke asishe ho print ho jate hai 

document.body.children[0].textContent = "<i>vicky_kumar</i>"
document.body.children[0].textContent = "frontent developer roadmap"

//? in javascript both innerText and textcontent are used to access the text content of an element, but they have key differences :
//? 1. what they return :

//? innertext => it returns the text content as rendered in the browser , taking into account styling and visibiity 
//? textContent => it return the raw content of an element , including text from all child nodes, regardless of their visibility or styling
            //?    it also includes the text from <script></script> and <style></style> elements which innerText does not : 

            // Use innerText when you want to get the text that is actually displayed to the user.
            // Use textContent when you need the raw text content of an element, including hidden elements and scripts.
            // Be cautious when using textContent to set text content if the source of the text is untrusted.

            const div = document.getElementById("myDiv");
            console.log(div.innerText);  // hello world 
            console.log(div.textContent); // hello hidden world 

const img  = document.getElementsByClassName("image1");
console.log(img); 
 
 const para = document.getElementById('para');
 console.log(para);