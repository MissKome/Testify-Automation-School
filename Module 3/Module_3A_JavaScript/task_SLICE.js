//The slice method is an array method we can use to remove any number of elements from an array.

const months = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];

console.log(months.slice(3,9)); //output ['April', 'May', 'June', 'July', 'August', 'September']

console.log(months.slice(1,7)); //output ['Feburary', 'March', 'April', 'May', 'June', 'July]

console.log(months.slice(3, 8 )); //output ['April', 'May', 'June', 'July', 'August']

//console.log(months.slice(7, 12)); //output ['August', 'September', 'October', 'November', 'December']