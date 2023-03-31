function chispum(numero) {
    // agregar console.log con numero de retorno
    return numero % 3 === 0 ? 'chis' :
        numero % 5 === 0 ? 'pum' :
        (numero % 3 === 0 && numero % 5 === 0) ? 'chispum' : 
        null;
}

module.exports = chispum;