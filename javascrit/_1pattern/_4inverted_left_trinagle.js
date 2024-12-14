
function inverted_left_triangle(n)
{
    for(let i = 0; i<n; i++)
    {
        let str = "";
        for(let j = 0; j<=i; j++)
        {
            str += " ";
        }
        for(let k = n; k>i; k--)
        {
            str += "*";
        }
        console.log(str);
    }
}

inverted_left_triangle(5);