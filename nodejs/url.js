const url = require('url');
const myurl= new URL('http://mywebsite.com/hello.html?id=100&status=active');


//serialized url
console.log(myurl);
console.group(myurl.toString());

//Host(root domain)
console.log(myurl.host);

//host name (does not get the port number)
console.log(myurl.hostname);

//pathname
console.log(myurl.pathname);

//serialized query
console.log(myurl.search);

//params object
console.log(myurl.searchParams);

//add params
myurl.searchParams.append('abc','123');
console.log(myurl.searchParams);

//loop the params
myurl.searchParams.forEach((value,name)=>console.log( `${name} : ${value}`));

