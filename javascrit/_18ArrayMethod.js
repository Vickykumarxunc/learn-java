//? some array method : without function : 
//? 1. pop() -> remove the last element from array  and return the removed value : 
//? 2. push() -> add the element at last and return the new lenght of the array : 
//? 3. shift() -> remove the element from the beginning of the array and return the removed value : 
//? 4. unshift() -> add the element at the beginning of the array and return the new length of the array : 
//? 5. concat() -> it concat the two or more array  and other some information and it can not change the original array : 
//? 6. indexOf() -> it give the index of the element : and return the value : aur jo element exist nahi karte uska index -1 deta hai: 
//? 7. includes() -> it tells about element array ke ander present hai ya nahi : return true or false : 
//? 8. reverse() -> it reverse the array , it change the original array : 
//? 9. sort() -> it sort the element according to the ascii value : 
//? 11. slice(start , end) -> it return the some part of the array and not change the original array : it return the new array : 
//? 12. splice(start , kitne element delete karne hai , new element ) -> it retur the some part of the array and it change the original array (delete the element before the start point from the original array ) and return the array : 
//? 13. Array.is_Array(array name) -> it check array or not : 
{
    //? pop() -> it change the original array 
    let arr = [1 , 2 , 3 , 4 , 5];
    console.log(arr);
    let returnvalue = arr.pop();
    console.log(arr);
    
}

{
    //? push() -> it change the original array 
    let arr = [1 , 2 , 3 , 4 , 5];
    console.log(arr);
    let returnvalue = arr.push(10);
    console.log(arr);
    console.log(returnvalue);
}

{
    //? shift() -> it change the original array 
    let arr = [1 , 2 , 3 , 4 , 5 ];
    console.log(arr);
    let returnvalue = arr.shift();
    console.log(arr);
    console.log(returnvalue);
}

{
    //? unshift() -> it change the original array 
    let arr = [1 , 2 , 3 , 4 , 5];
    console.log(arr);
    let returnvalue = arr.unshift(10);
    console.log(returnvalue);
    console.log(arr);
}

//? shift and unshift function sare element ke index ko change kar deta hai :
//? so this less efficient as compared to the push and pop 

{
    //? concat() -> it concat the two or more array in single array  : 
    let arr1 = [ 1 , 2 , 3 , 4 , 5];
    let arr2 = [6 , 7 , 8 , 9 , 10];
    let num1 = ['vicky' , 'ronak' ];
    let arr3 = arr1.concat(arr2 , num1);
    console.log(arr3);

    //? we can also add the some other information or data : 
    arr3 = arr2.concat(arr1 , "vicky"  , "ronak");
    console.log(arr3);
}

{
    //? indexOf()
    let arr = [1 ,2  ,3 , 4 , 5];
    let returnvalue = arr.indexOf(4);
    console.log(returnvalue);

}

{
     //? includes()
     let arr =  [1 , 2 , 3 , 4 , 5];
     let ans = arr.includes(2);
     console.log(ans);
     ans = arr.includes(10);
     console.log(ans);
}

{
    //? reverse() 
    let arr = [1 , 2 , 3 , 4 , 5];
    console.log(arr);
    arr.reverse();
    console.log(arr);
}

{
    //? sort()
    let arr = [1 , 4 , 6 , 9 , 7];
    console.log(arr);
    arr.sort();
    console.log(arr);

    let str = ['cat' , 'dog' , 'cow'  , 'lion' , 'tiger'];
    console.log(str);
    str.sort();
    console.log(str);

}

{
    //?slice(start , end) start point is inclusive and end point is exclusive 
    let arr = [1 , 2 , 3 , 4 , 5 , 6];
    console.log(arr);
    let newarr = arr.slice(2 , 4);
    console.log(newarr);
    newarr = arr.slice(3);
    console.log(newarr);


}

{
    //? splice(start , kitne element ko delete karna hai , new element )
    let arr = [1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10];
    console.log(arr);
    let newarr = arr.splice(3); //? 3rd index se suru karke sare elment ko delete kar do : 
    console.log(newarr);
    console.log(arr);

    newarr = arr.splice(1 , 1); //? 3rd index se suru karo aur do element ko delete kar do : 
    console.log(newarr);

    let arr1 = [1 , 2 , 3 , 4 , 5 , 6 , 7 , 8];
    console.log(arr1);
    let newarr1 = arr1.splice(2 , 2 , "vicky" , "ronak");
    console.log(newarr1);
    console.log(arr1);

}

{
   ///?  is_Array()
    let arr = [1 , 2 , 3 , 4 ];
    console.log(is_Array(arr));

}

