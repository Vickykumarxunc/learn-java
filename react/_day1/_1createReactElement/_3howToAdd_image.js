

const container = React.createElement(
    'div',
    {
        className : 'container',
        key : 1,
    },
    [
        React.createElement(
            'section',
            {
                className : 'section',
                key : 2
            },
            [
                React.createElement(
                    'p',
                    {
                        className : 'para',
                        children : "how to add image in react with the help of React.createElement()",
                        key : 3,
                    }
                )
            ],
            [
                //? how to add image inside the react : ..................................................
                React.createElement(
                    'img',
                    {
                        className : 'img',
                         key : 4,
                          src: 'https://upload.wikimedia.org/wikipedia/commons/a/a7/React-icon.svg',
                         alt:"vicky",

                         //? how to add style in react  : 
                         style : {
                            width : 200,
                            backgroundColor : 'teal',
                            borderRadius : 8,
                            padding : 16
                         },
                    },
                ),
            ]
            
        ),
        //? create a form in react .....................................
        React.createElement(
            'section',
            {
                className : 'section2',
                key : 3
            },
            [
                React.createElement(
                    'form',
                    {
                        className : 'form',
                        key : 4
                    },
                    [
                        React.createElement(
                            'div',
                            {
                                key : 3,
                                className : 'form_div'
                            },
                            [
                                React.createElement(
                                    'labe',
                                    {
                                        key : 7,
                                        htmlFor : 'userName'
                                    },
                                    "userName"
        
                                ),
                                React.createElement(
                                    'input',
                                    {
                                        key : 2,
                                        type : "text",
                                        id : "userName",
                                         
                                    }
                                )
                            ]

                        ),
                        React.createElement(
                            'div',
                            {
                                key : 4,
                                className : 'form_div'
                            },
                            [
                                React.createElement(
                                    'label',
                                    {
                                        key : 2,
                                        htmlFor : "email"
                                    },
                                    "email"
                                ),
                                React.createElement(
                                    'input',
                                    {
                                        key : 5,
                                        type : "email",
                                        id : "email"

                                    }
                                )
                            ]
                        )
                    ]
                )
            ]
        )

    ]
    
)

const root = ReactDOM.createRoot(document.querySelector("#root"))
root.render(container)