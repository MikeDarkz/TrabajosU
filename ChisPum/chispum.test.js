const chispum = require("./chispum");

describe("chispum", () => {
    test("Debería imprimir 1 si se recibe 1.", () => {
        const esperado = 1;
        const resultado = chispum(1);
        expect(esperado).toBe(resultado);
    });

    test("Debería imprimir 'chis' si recibe un múltiplo de 3.", () => {
        const esperado = "chis";
        const resultado = chispum(9);
        expect(esperado).toBe(resultado);
    });

    test("Debería imprimir 'pum' si recibe un múltiplo de 5.", () => {
        const esperado = "chis";
        const resultado = chispum(10);
        expect(esperado).toBe(resultado);
    });

    test("Debería imprimir 'chispum' si recibe un múltiplo de 3 y de 5.", () => {
        const esperado = "chis";
        const resultado = chispum(15);
        expect(esperado).toBe(resultado);
    });
});