//? compound(combined assignment) operator : 

//? += Addition assignment operator
//? -= substration assignment operator
//? %= reminder assignment operator
//? *= multiply assignment operator 
//? /= division assignement operator 
//? **= exponentiation assignment operator 
//? ++ increment operator
//? -- decrement operator 


let a = 10;
a += 10; //? a = a + 10;
console.log(a);

let b = 20;
b -= 10; //? b = b - 10;
console.log(b);

let c = 3;
c *= 3;  //?  c = c * 3;
console.log(c);

let d = 10;
d /= 2; //? d = d / 2;
console.log(d);

let e = 20;
e %= 3; //? e = e % 3;
console.log(e);

let f = 10;
let a1 = f++;
console.log(a1);
++f;
console.log(f);

let g = 10;
g--;
--g;
console.log(g);

let h = 2;
h **= 3; //? h ** 3;
console.log(h);