
function inverted_pyramid(n)
{
    for(let i  = n; i>=1; i--)
    {
        let str = "";
        for(let j = n; j>i; j--)
        {
            str += " ";
        }
        for(let k = 0; k < 2  * i -1; k++)
        {
            str += "*";
        }
        console.log(str);
    }
}

inverted_pyramid(5);