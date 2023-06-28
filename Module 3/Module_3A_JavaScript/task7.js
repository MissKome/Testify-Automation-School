//A Javascript program that prints the name of the triangle based on the length of the sides in relation to one another.

const side1 = 14
const side2 = 14
const side3 = 14

if (side1 === side2 && side2 === side3) {

    console.log('Equilateral triangle')

} else if (side1 === side2 || side1 === side3 || side2 === side3) {

    console.log('Isosceles triangle')

} else {

    console.log ('Scalene triangle')
}