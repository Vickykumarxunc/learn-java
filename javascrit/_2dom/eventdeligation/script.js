//? event deligation 
// event deligation ek tarika hai jisse hum apane code ko optimized kar sakte hai : 

const container  = document.querySelector(".container");
let j = 1;

const card = document.querySelector(".card");
card.addEventListener('click' , ()=>{
    const newCard = document.createElement('div');
    newCard.classList.add('card');
    newCard.textContent = j;
    container.append(newCard);
    j++;
})

// mai cahta hoon ki mai jis bhi card par click karu vo remove ho jaye how to do: 
// jis card ko remove karna hai us par bhi mai remove addcard linstenera laga sakta hoon :
// mai parent par remove element laga sakte hai : 
container.addEventListener('click' , (e) =>{
    console.log(e.target); // target means - > kis element event fire hua hai usko return karke deta hai : 
    if(e.target.classList !== card1){
        e.target.remove();
    }
})  