function chispum(numero) {
    return (numero % 3 === 0 && numero % 5 === 0) ? 'chispum' : 
        numero % 3 === 0 ? 'chis' :
        numero % 5 === 0 ? 'pum' :
        null;
}

function chispumAutomatico() {
    let mensaje;
    let arreglo = [];
    for (i = 1; i <= 15; i++) {
        mensaje = (i % 3 === 0 && i % 5 === 0) ? 'chispum' :
        i % 3 === 0 ? 'chis' :
        i % 5 === 0 ? 'pum' :
        i;
        arreglo.push(mensaje);
        console.log(mensaje);
    }
    return arreglo;
}

chispumAutomatico();

module.exports.chispum = chispum;
module.exports.chispumAutomatico = chispumAutomatico;