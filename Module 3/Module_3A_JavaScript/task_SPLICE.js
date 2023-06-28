//Task 1: //remove jan - march

const months = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];

months.splice(0,3); // Remove [January, February, March]

console.log(months); // output [April, May, June, July, August, September, October, November, December]



// Task 2: month.splice(4,2) -- what will be the returned array?
//                              what will be the modified array?

const month = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'];

console.log( month, month.splice (4,2)); // output : retuned array: ['May', 'Jun']
//                                              modified array: ['Jan', 'Feb', 'Mar', 'Apr', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']