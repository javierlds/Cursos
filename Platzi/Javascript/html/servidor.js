const http = require("http");  // despues de declarada no se puede modificar
function sitioWeb(req, res){
    res.writeHead(200, {"Content-type": "text/html"});
    res.end("Mi primer <strong>servidor</strong>");
}
let servidor = http.createServer(sitioWeb);
servidor.listen(6969,"192.168.1.104");
console.log("Servidor corriendo en el puerto 6969");
