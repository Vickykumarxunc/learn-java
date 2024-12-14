//? map filter reduced :::

{

//? 1. map method :
//? (i). map method return the new method :
//? (ii). if we not return anything then map method return the array of undefined value : 
//? aur us new array utni hi undefined value hogi jitni hamare original array me hai : 
//? (iii). map method does not modify the original array :
//? (iv). agar hum call back function me dusra parameter dalte hai to ve hame element ka index number deta hai : 
//? (v). hum call back function me third argument bhi pass kar sakte hai jo hame original array deta hai : 

const array1 = ['vicky' , "ronak" , "kajal"];
console.log(array1);

const return_value1 = array1.map((el)=>{
    console.log(el);


})
console.log(return_value1);

const array2 = ["vicky" , 'rishabh' , 'vivek'];
console.log(array2);

const return_value2 = array2.map((el) =>{
    console.log(el);
    return el.toUpperCase();
})
console.log(return_value2);

const array3 = [1 , 2 , 3 , 4 , 5];
const return_vaue3 = array3.map((el , index) =>{
    console.log(`element is = ${el}   :   index is = ${index}`);
    return el ** 2;
})

console.log(`square of the array element is = ${return_vaue3}`);

const array4 = [1 , 2 , 3 , 4 , 5 ];
const return_value4 = array4.map((el , index , arr) =>{
    console.log(`element = ${el} : index = ${index} : original array = ${arr}`);
})

}

{
    //? 2. filter method : 
    //? (i). filter method bhi ek new array return karta hai:
    //? (ii). lekin ye condition ke according original array me sa element ko select karke new array create karta hai :
    //? (iii). agar codition har element ke liye false ho jati hai to filter method empty array return kar deta hai : 

    const array1 = [1 , 2 , 3 , 4 , 5 , 6];
    console.log(array1);
    const return_value1 = array1.filter((el)=>{
        console.log(el);

    })
    // array 1 ke case me filter ne hame empty array return kar ke diya hai kyoki hamne kuch bhi return hai kiya hai this false condition 
    console.log(return_value1);

    const array2 = [1 , 2 , 3 , 4 , 5 , 6];
    console.log(array2);
    const return_value2 = array2.filter((el)=>{
        console.log(el);
        return el >= 3;
    })
    console.log(return_value2); // return the 3  4 5 6 

    const array3 = ['cat' , 'dog' , 'elephant' , 'camel'];
    console.log(array3);
    const return_value3 = array3.filter((el) =>{
        console.log(el);
        return el.length > 3; // ye vahi value return karega jiske length 3 se jyada ho : 
    })
    console.log(return_value3);

    const array4 = ['january' , 'februry' , 'march' , 'april' , 'may' , 'june' , 'july' , 'august' , 'september' , 'october' , 'november' , 'december'];
    console.log(array4);
    const return_value4 = array4.filter((el)=>{
        return el.length >  5;
        
    })
    console.log(return_value4);

    const array5 = ['january' , 'februry' , 'March' , 'april' , 'may' , 'june' , 'july' , 'august' , 'september' , 'october' , 'november' , 'december'];
    console.log(array5);
    const return_value5 = array5.filter((el) =>{
        return  el.toUpperCase().includes('M');
    })
    console.log(return_value5);

    const array6 = [1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 ];
    console.log(array6);
    const return_value6 = array6.filter((el , index) =>{
        return index % 2 == 1;
    }) 
    console.log(return_value6);

    const array7 = [
        {
            name : "vicky",
            age : 19
        },
        {
            name : "ronak",
            age : 15
        },
        {
            name : "kajal",
            age : 17
        },
        {
            myMother : "suman",
            age : 36
        },
        {
            myfather : "devendra",
            age : 40
        }
    ];

    const return_value7 = array7.filter((student)=>{
        return student.age >= 18;
    })
    console.log(return_value7);

    const return7 = array7.filter((student) =>{
        return student.age >= 18;
    }).map((el)=>{
        return el.name;
    })
    console.log(return7);


    const array8 = [
        {
            name :"employ1",
            id: 1,
            salary : 30000,
        },
        {
            name : 'employ2',
            id : 2,
            salary : 35000
        },
        {
            name : 'employ3',
            id : 3,
            salary : 40000
        },
        {
            name : 'employ4',
            id : 4,
            salary : 50000

        }
    ];

    // mujhe un employ ki detail cahiye jiski salary  30k se jyada ho aur 50k se kam 
    const return_value8 = array8.filter((employ) =>{
        return (employ.salary > 30000 && employ.salary < 50000);
    }) 
    console.log(return_value8);

    //  aur ab sir unka nam cahiye : 
    const return8 = array8.filter((employ) =>{
        return(employ.salary > 30000 && employ.salary < 50000);
    }).map((employ) =>{
        return employ.name; // this is called chaining of array method : 
    })

    console.log(return8);


}

{
    //? 3. reduced method() >>>>>>>>>>
    //? reduced method 2 parameter leta hai one is accumulator (jo initial value hoti hai jo programmer pass karta hai);
    //?  second is current value (ye array ki current value hoti hai : )
    //? by default accumulator ki value array ki first value ka equal hoti hai : agar hum accumulator ki initial value na du : 
    const num = [1 , 1 , 1 , 1 , 1];
    const return_value1 = num.reduce((accumulator , current) =>{
        console.log(accumulator);
         return accumulator + current;
         

    } , 0) // zero is the initial value  jo starting me accumulator ki value hoti hai : 
    console.log(return_value1);

    // accumulator             current             return value 
    //    0                       1                  0 + 1 = 1
    //    1                       1                  1 + 1 = 2
    //    2                       1                  2 + 1 = 3
    //    3                       1                  3 + 1 = 4
    //    4                       1                  4 + 1 = 5
    
    // finally it return the 5 : 




}
