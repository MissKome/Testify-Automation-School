//Create a length converter function

function lengthConverter(length, fromUnit, toUnit) {
    
    const lengthConversions = {
      millimeter: {
        centimeter: 0.1,
        meter: 0.001,
        kilometer: 0.000001,
        
      },
      centimeter: {
        millimeter: 10,
        meter: 0.01,
        kilometer: 0.00001,
       
      },
      meter: {
        millimeter: 1000,
        centimeter: 100,
        kilometer: 0.001,
       
      },
      kilometer: {
        millimeter: 1000000,
        centimeter: 100000,
        meter: 1000,
      
      },
    
    };
  
    if (!lengthConversions[fromUnit] || !lengthConversions[fromUnit][toUnit]) { 
      throw new Error('Invalid length units');
    }
  
    const conversion = lengthConversions[fromUnit][toUnit]; //converts
    const convertedLength = length * conversion;   //converted length
    return convertedLength;
  }

  console.log(lengthConverter(500, 'meter', 'centimeter')); 
