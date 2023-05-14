const chispum = require("./chispum");

describe("chispum", () => {
    test("Debería imprimir null si se recibe un número que no es múltiplo de 3 o 5.", () => {
        const esperado = null;
        const resultado = chispum.chispum(1);
        expect(esperado).toBe(resultado);
    });

    test("Debería imprimir 'chis' si recibe un múltiplo de 3.", () => {
        const esperado = 'chis';
        const resultado = chispum.chispum(9);
        expect(esperado).toBe(resultado);
    });

    test("Debería imprimir 'pum' si recibe un múltiplo de 5.", () => {
        const esperado = 'pum';
        const resultado = chispum.chispum(10);
        expect(esperado).toBe(resultado);
    });

    test("Debería imprimir 'chispum' si recibe un múltiplo de 3 y de 5.", () => {
        const esperado = 'chispum';
        const resultado = chispum.chispum(15);
        expect(esperado).toBe(resultado);
    });
});

describe("chispum automático", () => {
    test("Debe imprimir el listado con el chispum", () => {
        const esperado = [
            1, 2, 'chis', 4, 'pum', 'chis', 7, 8, 'chis', 'pum', 11, 'chis', 13, 14, 'chispum'
        ];
        const resultado = chispum.chispumAutomatico();
        expect(esperado).toStrictEqual(resultado);
    });
});