function diamond(n)
{
    for(let i = 1; i<=n; i++)
    {
        let str = "";
        for(let j = 0; j<n - i; j++)
        {
            str += " ";
        }
        for(let k = 0; k < 2 * i - 1; k++)
        {
            str += "*";
        }
        console.log(str);
    }
    for(let i = n-1; i>=1;  i--)
    {
        let str = "";
        for(let j = n; j>i; j--)
        {
            str += " ";
        }
        for(let k = 0; k < 2 * i - 1; k++)
        {
            str += "*";
        }
        console.log(str);
    }
    
}

diamond(5);

 
 
 