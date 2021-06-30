// let _firstName='John';
// let _lastName='kvl';
// let age=78;
// const _MAX=90;
// _firstName=true;
// _lastName=false;
// console.log(_firstName);
// console.log(age);
// //_MAX=200;
// console.log(_MAX);
// console.log(_lastName);
// let num = 10;

// console.log(num);

// // Increment operator
// num++; // num = num + 1

// console.log(num);

// var num2 = 10;

// console.log(num2);

// // Decrement operator
// num2--; // num2 = num2 - 1

// console.log(num2);


// let num3 = 10;

// console.log(num3);

// console.log(--num3);

// console.log(num3);

// let var1=10;
// let var2=12;

// console.log(var1===var2);

// console.log(var1>var2);

// console.log(var1<var2);

// console.log(var1!=var2);

// console.log(var1>=var2);

// console.log(var1<=var2);

// let var1=90;
// let var2=10;

// let result=(var1 > var2) ? "kvl" : "kvl2";

// console.log(result);

// let n1=70;
// let n2=60;

// if(n1>n2)
// {
//     console.log('number1 is greater than number2');
// }
// else if(n1<n2)
// {
//     console.log('number1 is less than number2');
// }
// else{
//     console.log('wrong selection')
// }

// for (var i = 100; i <= 100; i += 2)
// {
//     console.log("This is position for I: " + i);
// }
 
//  var j = 100;
 
//  while (j <= 100)
//  {
//     console.log("This is position for J: " + j);
//      j += 2;
//  }
 
//  var k = 100;
 
//  do
//  {
//      console.log("This is position for K: " + k);
//      k += 2;
//  } while (k <= 100)

// let var1=0
// switch(var1)
// {
//     case 0:
//         console.log('this is 0');
//         break;
//     case 1:
//         console.log('this is 1');
//         break;
//     case 3:
//          console.log('this is 2');
//          break;   
//     default:
//         console.log('default');
//         break;
// }

function _myFunction()
{
    let a=100;
    let b=200;
    return('addition of a and b is: ',(a+b));
}
 
let result=_myFunction();
console.log(result);
 
function AwesomeFunc()
{
    console.log("Hello");
    console.log("and");
    console.log("Goodbye");
}
 
function Sum(num1, num2)
{
    let result = num1 + num2;
 
    console.log(result);
}
 
function SumReturn(num1, num2)
{
    let result = num1 + num2;
 
    return result;
}
 
AwesomeFunc();
Sum(4, 7);
console.log(SumReturn(5, 9));
 
let epicVar = SumReturn(2, 100);
 
console.log(epicVar);