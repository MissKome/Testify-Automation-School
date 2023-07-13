//Return the number of vowels in a string.

function vowelsNumber(string) {
    const vowels = ['a', 'e', 'i', 'o', 'u'];
    let count = 0;
  
    for (let char of string.toLowerCase()) {  //coverts the input string to lowercase characters
      if (vowels.includes(char)) {
        count++;
      }
    }
  
    return count;
  }
  
  console.log(vowelsNumber('Return the number of vowels in a string.'));