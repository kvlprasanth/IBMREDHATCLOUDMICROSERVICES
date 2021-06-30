let os = require('os');
let http=require('http');
//var file = require('file');
//console.log(os.userInfo());
//console.log(os.version());
 //console.log(os.homedir());
 const server=http.createServer( function(request,response){
     if(request.url=='/')
     {
        response.write('<b>hello team</b>');
     response.end();
     }
     
     if(request.url==='/customers')
     {
         response.write('<b>i am at customer end</b>');
         response.end();
     }
})
 server.listen(4000,function()
 {
    console.log('server started and listening to port number : 4000');
 });