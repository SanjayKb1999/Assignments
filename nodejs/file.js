const fs = require('fs');
const path= require('path');
const { clearScreenDown } = require('readline');
/*fs.writeFile(path.join(__dirname,'/test','/hello.txt')
   ,'My text file contains, this is my first prog.'
   ,(err)=>{
    if(err) throw err;
    console.log('File written to...');
}
)
*/

//read file
fs.readFile(path.join(__dirname,'/test','/hello.txt'),'utf8',(err,data)=>{
    if(err) throw err;
    console.log(data);
}
)