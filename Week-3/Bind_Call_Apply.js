/**
 We have listed below examples of Bind, call and apply together so that we can put out its differences and it's features
*/


/**
  Returns product of parameter while it is called
 */
function multiply(a , b)
{
    return this.a * this.b;
} 

const bindex = multiply.bind( {a: 10, b: 20 });
console.log(bindex())

console.log(multiply.call({a: 10, b: 20}));
multiply.apply();

let numbers = [2,10,1,1,2,30];
var low = Math.min.apply(null, numbers);
console.log(low);