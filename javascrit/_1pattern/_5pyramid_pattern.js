
function pyramid(n)
{
    for(let i = 1; i<=n; i++)
    {
        let str = "";
        //? first preserve the space : 
        for(let j = 0; j<n - i; j++)
        {
            str += " ";
        }
        //? add the star : 
        for(let k  = 0; k < (2 * i - 1); k++)
        {
            str += "*";
        }
        console.log(str);
    }
}

pyramid(5);
 