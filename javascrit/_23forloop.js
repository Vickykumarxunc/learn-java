//? for loop 
//? array and string is iterative 
//? object is not iterative 

let arr1 = [1 , 2 , 3 , 4 , 5 ];
let len = arr1.length;
for(let i = 0; i<len; i++)
{
    console.log(arr1[i]);
}

let arr2 = [1 , 2 , 3 , 4 , 5 , 6];
let sum = 0;
 for(let i = 0; i<arr2.length; i++)
 {
    sum += arr2[i];
 }
 console.log(`the total sum of the array is = ${sum}`);

 let evensum = 0;
 let oddsum = 0;
 for(let i = 1; i<=100; i++)
 {
    if(i % 2 === 0)
    {
        evensum += i;
    }
    else
    {
        oddsum += i;
    }


 }
 console.log(`even sum is ${evensum} \n odd sum is ${oddsum}`);

 
let arr = [1 , 2 , -3 ,  9 , 4 , 5 ];
let max = arr[0];
let min = arr[0];
for(let i = 1; i<arr.length; i++)
{
    if(arr[i]  > max)
    {
        max = arr[i];
    }
    else if(arr[i] < min)
    {
        min = arr[i];
    }

}

console.log(`maximum element is = ${max}\n minimum element is = ${min}`);


for(let i = 0; i<5; i++)
{
    let str = "";
    for(let j = 0; j<=i; j++)
    {
        str += "* ";
    }
    console.log(str);
}