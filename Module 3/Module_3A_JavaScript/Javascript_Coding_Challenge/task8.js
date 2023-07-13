//Return a Boolean if a number is divisible by 10.

const number = parseInt(prompt ('number:'));

let isDivisible = false;

if (number % 10 === 0) {

  isDivisible = true; 
  
}

console.log(isDivisible);
