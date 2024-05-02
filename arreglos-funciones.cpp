
#include <iostream>
#include <vector>
#include <cstdlib>
#include <ctime>
#include <algorithm>
#include <chrono>

using namespace std;
using namespace std::chrono;

vector<int> generarArregloAleatorio(int tamaño) {
vector<int> arreglo(tamaño);
srand(time(0)); // Inicializar la semilla para números aleatorios
for (int i = 0; i < tamaño; ++i) {
arreglo[i] = rand() % 1000; // Números aleatorios entre 0 y 999
}
return arreglo;
}
void imprimirArreglo(const vector<int>& arreglo) {
for (int elemento : arreglo) {
cout << elemento << " ";
}
cout << endl;
}
int busquedaSecuencial(const vector<int>& arreglo, int elemento) {
for (int i = 0; i < arreglo.size(); ++i) {
if (arreglo[i] == elemento) {
return i; // Se encontró el elemento, se devuelve su índice
}
}
return -1; // No se encontró el elemento
}
void ordenarArreglo(vector<int>& arreglo) {
sort(arreglo.begin(), arreglo.end());
}
int main() {
int tamaño = 1000;
auto inicioGeneracion = high_resolution_clock::now();
vector<int> arregloAleatorio = generarArregloAleatorio(tamaño);
auto finGeneracion = high_resolution_clock::now();
auto tiempoGeneracion = duration_cast<nanoseconds>(finGeneracion -
inicioGeneracion).count();
cout << "Arreglo aleatorio generado:" << endl;
imprimirArreglo(arregloAleatorio);
int elementoABuscar = 50; // Ejemplo: buscamos el número 50
auto inicioBusqueda = high_resolution_clock::now();
int indice = busquedaSecuencial(arregloAleatorio, elementoABuscar);
auto finBusqueda = high_resolution_clock::now();
auto tiempoBusqueda = duration_cast<nanoseconds>(finBusqueda -
inicioBusqueda).count();
if (indice != -1) {
cout << "El elemento " << elementoABuscar << " se encuentra en el índice " << indice
<< endl;
} else {
cout << "El elemento " << elementoABuscar << " no se encuentra en el arreglo." <<
endl;
}
auto inicioOrdenamiento = high_resolution_clock::now();
ordenarArreglo(arregloAleatorio);
auto finOrdenamiento = high_resolution_clock::now();
auto tiempoOrdenamiento = duration_cast<nanoseconds>(finOrdenamiento -
inicioOrdenamiento).count();
cout << "Arreglo ordenado:" << endl;
imprimirArreglo(arregloAleatorio);
auto inicioBusquedaOrdenada = high_resolution_clock::now();
indice = busquedaSecuencial(arregloAleatorio, elementoABuscar);
auto finBusquedaOrdenada = high_resolution_clock::now();
auto tiempoBusquedaOrdenada = duration_cast<nanoseconds>(finBusquedaOrdenada -
inicioBusquedaOrdenada).count();
if (indice != -1) {
cout << "El elemento " << elementoABuscar << " se encuentra en el índice " << indice
<< endl;
} else {
cout << "El elemento " << elementoABuscar << " no se encuentra en el arreglo." <<
endl;
}
cout << "Tiempo de generación: " << tiempoGeneracion << " nanosegundos" << endl;
cout << "Tiempo de búsqueda inicial: " << tiempoBusqueda << " nanosegundos" << endl;
cout << "Tiempo de ordenamiento: " << tiempoOrdenamiento << " nanosegundos" <<
endl;
cout << "Tiempo de búsqueda en arreglo ordenado: " << tiempoBusquedaOrdenada << "nanosegundos" << endl;
return 0;
}