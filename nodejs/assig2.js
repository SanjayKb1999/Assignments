const fs = require('fs');
const path= require('path');
fs.readFile((__dirname,'/java/a1.java'),'utf8',(err,data)=>{
    if(err) throw err;
    console.log(data);
}
)