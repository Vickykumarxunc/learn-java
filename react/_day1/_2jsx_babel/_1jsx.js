
//? this is a react course using the jsx : 
 
 const container = (
    
    <div className = "container" id="container">
        <h1>hello world : </h1>
        <section>
            <p>The library for web  and native user interface </p>
            <img
             src= "https://upload.wikimedia.org/wikipedia/commons/a/a7/React-icon.svg"

             //? one curlibraces for the object (innner) and outer curlibraces for the html ke ander javascript likhna 
             style = {{
                width : 200,
                backgroundColor : 'teal',
                borderRadius : 8,
                padding : 16
             }}

            />
        </section>
        <section>
            <form>
                <div className = "input-group">
                    <label htmlFor ="userName">userName</label>
                    <input id="userName"/>
                </div>
                <div className = "input-group">
                    <label htmlFor = "email">email</label>
                     <input id="email"/>
                </div>
            </form>
        </section>
    </div>
 )

 //? how to use the varaible value in react : 
 let name = "vicky"
 const h2 = <h2>hello my name is {name} <button><strong>submit</strong></button></h2>

console.log(container)
 const root = ReactDOM.createRoot(document.querySelector("#root"))
 root.render(container);
 root.render(h2)

 /// hum babel ki jgh cli npm ka use karege : 
  

  
 
 
