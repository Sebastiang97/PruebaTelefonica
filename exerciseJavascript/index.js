function calcularAreaTriangulo(base, altura) {

    if (typeof base !== 'number' || typeof altura !== 'number') {
        throw new Error('Base y altura deben ser números.');
    }
    if (base <= 0 || altura <= 0) {
        throw new Error('Base y altura deben ser mayores que cero.');
    }
    return (base * altura) / 2;
}


function calcularAreaCirculo(radio) {

    if (typeof radio !== 'number') {
        throw new Error('El radio debe ser un número.');
    }
    if (radio <= 0) {
        throw new Error('El radio debe ser mayor que cero.');
    }
    return Math.PI * Math.pow(radio, 2);
}
