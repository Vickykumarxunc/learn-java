
function left_triangle(n)
{
   for(let i = 0; i<n; i++)
   {
    let str = "";
    //?this loop add for space : 
    for(let j = 0; j<n - i; j++)
    {
        str += " ";
    }
    //? this loop add for star with space : 
    for(let k = 0; k<=i; k++)
    {
        str += "*";
    }
    console.log(str);
   }
}

left_triangle(5);