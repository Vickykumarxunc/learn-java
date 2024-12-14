//? some and every method : 

{
    //? 1. some 
    // the some method is a part of the javascript array prototype 
    // use to test wheater at least one element in an array to satifies a provided condition : 
    // it return a boolean value (true or false )indicate the wheater the condition meets : 
    const array1 = [0 , 1 , 2 , 3, 4 , 5 , 6];
    const retur_value1 = array1.some((el) =>{
        console.log(el);
        return el % 2 === 0;
    })
    console.log(retur_value1);

    const array2 = [1 , 2 ,3 , 4 , 5 , 6 ];
    const return_value2 = array2.some((el) =>{
        console.log(el);
        return el > 14;
    })

    console.log(return_value2);
}


{
    //? 2. every 
    // the every method is a part of javascript array prototype . 
    // use to test wheather all elements of an array satisfy  a provide condition or prediction 
    // it return a boolean value (true or false) indicationg wheather every elements in the arry passes the test : 

    const array1 = [1 , 2 , 3 , 4 , 5 ,6 ];
    const return_value1 = array1.every((el) =>{
         return el % 2 === 0;
    })
    console.log(return_value1);

    const array2 = [0 ,  2 , 4 , 6 , 8];
    const return_value2 = array2.every((el) =>{
        console.log(el);
        return  el % 2 == 0;
    })

    console.log(return_value2);
}