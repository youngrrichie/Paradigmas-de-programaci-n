
let arreglo=generarArreglo();
imprimirArreglo(arreglo);

let tiempoInicio, tiempoFin;


// Búsqueda secuencial en el arreglo generado
let elementoBuscado = arreglo[Math.floor(Math.random() * arreglo.length)];
tiempoInicio = Date.now();
let indice = busquedaSecuencial(arreglo, elementoBuscado);
tiempoFin = Date.now();
console.log(`Búsqueda secuencial para el elemento ${elementoBuscado}:`);
if (indice !== -1) {
    console.log(`El elemento ${elementoBuscado} se encuentra en el índice ${indice}.`);
} else {
    console.log(`El elemento ${elementoBuscado} no se encuentra en el arreglo.`);
}
console.log(`Tiempo de búsqueda secuencial: ${tiempoFin - tiempoInicio} milisegundos`);


// Ordenar el arreglo generado
tiempoInicio = Date.now();
let arregloOrdenado = ordenarArreglo(arreglo);
tiempoFin = Date.now();
console.log("\nArreglo ordenado:");
imprimirArreglo(arregloOrdenado);
console.log(`Tiempo de ordenación: ${tiempoFin - tiempoInicio} milisegundos`);


// Búsqueda secuencial en el arreglo ordenado
elementoBuscado = arregloOrdenado[Math.floor(Math.random() * arregloOrdenado.length)];
tiempoInicio = Date.now();
indice = busquedaSecuencial(arregloOrdenado, elementoBuscado);
tiempoFin = Date.now();
console.log(`\nBúsqueda secuencial en el arreglo ordenado para el elemento ${elementoBuscado}:`);
if (indice !== -1) {
    console.log(`El elemento ${elementoBuscado} se encuentra en el índice ${indice}.`);
} else {
    console.log(`El elemento ${elementoBuscado} no se encuentra en el arreglo.`);
}
console.log(`Tiempo de búsqueda secuencial en el arreglo ordenado: ${tiempoFin - tiempoInicio} milisegundos`);


function generarArreglo(){
    let nElementos = Math.floor(Math.random() * 501) + 1000;
    return Array.from({ length: nElementos }, () => Math.floor(Math.random() * 201) - 100);
}


function imprimirArreglo(arreglo){
    console.log(arreglo);
}


// Función de búsqueda secuencial
function busquedaSecuencial(arreglo, elemento) {
    for (let i = 0; i < arreglo.length; i++) {
        if (arreglo[i] === elemento) {
            return i;
        }
    }
    return -1; // Si no se encuentra el elemento
}


// Función para ordenar el arreglo
function ordenarArreglo(arreglo) {
    return arreglo.slice().sort((a, b) => a - b);
}