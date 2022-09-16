const path= require('path');


//base file name
console.log(__filename);

//base file naem with just path
console.log(path.basename(__filename));

//directory name
console.log(path.dirname(__filename));

//file extension
console.log(path.extname(__filename));

//concatenate path
console.log(path.join(__dirname,'test','hello.html'));