
function inverted_right_angle_triangle(n)
{
    for(let i = n; i>0; i--)
    {
        let str = "";
        for(let j = 0; j<i; j++)
        {
            str += "* ";
        }
        console.log(str);
    }
}
inverted_right_angle_triangle(5);