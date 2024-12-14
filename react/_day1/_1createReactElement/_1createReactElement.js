
//* create a react element : 
//  const h1 = React.createElement('h1' , {className : "main_heading"} , "hello world")
//  const root = ReactDOM.createRoot(document.querySelector("#root"))
//  root.render(h1)


 //* method 2 create a creact element : 
//   const h1 = {
//     $$typeof : Symbol.for('react.element'),
//     type : 'h1',
//     key : null,
//     ref : null,
//     props : {
//         className : "main_heading",
//         children : 'hello world',
//     },
//   }

//   const root = ReactDOM.createRoot(document.querySelector("#root"))
//   root.render(h1);


//* method 3 directly pass the object into the render : 
// const h1 = React.createElement('h1' , {className : 'main_heading'} , "hello world")
// const root = ReactDOM.createRoot(document.querySelector("#root"))

//  root.render({
//     $$typeof : Symbol.for('react.element'),
//     type : 'h1',
//     ref : null,
//     props : {
//         className : "main_heading",
//         children : "hello world"
//     },
//  })

//* add multiple children into the div and inside the h1  :
const h1 = React.createElement('h1' , {className : "main_heading"} , "hello world")
const root  = ReactDOM.createRoot(document.querySelector(".common"))

root.render({
    $$typeof : Symbol.for('react.element'),
    type : 'h1',
    ref : null,
    key : null,
    props : {
        children : [
            {
                $$typeof: Symbol.for('react.element'),
                type : 'strong',
                ref : null,
                key : null,
                props : {
                    children : "hello world", 
                }
            },
            {
                $$typeof : Symbol.for('react.element'),
                type : 'span',
                ref : null,
                key : null,
                props : {
                    children : {
                        $$typeof : Symbol.for('react.element'),
                        type : 'em',
                        ref : null,
                        key : null, 
                        props : {
                            children : "  vicky kumar "
                        }
                    }
                }
            },
            {
                $$typeof : Symbol.for('react.element'),
                type : 'button',
                ref : null ,
                key : null,
                props : {
                    children : "submit"
                }
            }
        ]
    }
})






 
