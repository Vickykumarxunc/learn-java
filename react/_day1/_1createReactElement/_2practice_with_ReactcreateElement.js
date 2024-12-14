
const container = React.createElement(
    'div',
    {
        className : 'container',
        key : 1
        
    },
    [
        React.createElement(
            'section',
            {
                className : 'section1',
                key : 2
            },
            [
                React.createElement(
                    'p',
                    {
                        className : 'para1',
                        key : 3
                    },
                    "React is the  library for web and native user interface "
                ),
            ]
        ),
    ]
)

const root = ReactDOM.createRoot(document.querySelector('#root'))
root.render(container)