const fs = require('fs');
const path= require('path');
const { clearScreenDown } = require('readline');
/*fs.writeFile(path.join(__dirname,'/training_details','/student.txt')
   ,'Sanjay'
   ,(err)=>{
    if(err) throw err;
    console.log('File written to...');
}
)*/

fs.readFile(path.join(__dirname,'/training_details','/student.txt'),'utf8',(err,data)=>{
    if(err) throw err;
    console.log(data);
}
)