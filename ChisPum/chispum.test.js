const chispum = require("./chispum");

describe("chispum", () => {
    test("Debería imprimir 1 si se recibe 1.", () => {
        const esperado = 1;
        const resultado = chispum(1);
        expect(esperado).toBe(resultado);
    })
});