//'books' object with 'toggleReadingStatus' method

const books = {
    title: 'The Art of Software Testing',
    description: 'This book provides a practical rather than theoretical discussion of the purpose and nature of software testing.',
    numberOfPages: 192,
    author: 'Glenford J. Myers',
    reading: false,
    toggleReadingStatus: function(){
         if (this.reading === true) {
            this.reading = 'Currently reading'
        } else {
            this.reading = 'Not currently reading'  
        }
    }
}

books.toggleReadingStatus();   // toggle reading status
console.log(books);