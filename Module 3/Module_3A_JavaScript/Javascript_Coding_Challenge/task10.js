//Create a function that filters out negative numbers.

function filterNegativeNumb(numbers) {  

    return numbers.filter(x => x >= 0); // Function that filters negative numbers

  } 
  
  const arrayNumber = [-90, -1, 65, 1, 54, -12, -10, 3];
  const filteredArray = filterNegativeNumb(arrayNumber);
  console.log(filteredArray);
