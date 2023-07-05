//a 'books' array with book objects and using a for-loop to log books with a reading status of true to the console:
const books = [

    {
      title: 'The Art of Software Testing',
      description: 'This book provides a practical rather than theoretical discussion of the purpose and nature of software testing.',
      numberOfPages: 192,
      author: 'Glenford J. Myers',
      reading: true,
    },
    {
      title: 'Think and Grow Rich',
      description: ' A personal development and self-improvement book',
      numberOfPages: 238,
      author: 'Napoleon Hill',
      reading: false,
    },
    {
      title: 'Effective Software Testing',
      description: ' Effective Software Testing is a hands-on guide to creating bug-free software',
      numberOfPages: 200,
      author: 'Mauricio Aniche',
      reading: true,
    }

   ]

  for (let i = 0; i < books.length; i++) {
    if (books[i].reading === true) {
        console.log(books[i]);
    }

  }
