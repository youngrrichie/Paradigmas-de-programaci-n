
import random
import time

def generar_arreglo_aleatorio (tamaño):
    return [random.randint(0,999) for _ in range(tamaño)]

def imprimir_arreglo (arreglo):
    print(" ".join(map(str,arreglo)))

def busqueda_secuencial(arreglo,elemento):
    for i in range(len(arreglo)):
        if arreglo[i]==elemento:
            return i
    return -1

#generar un arreglo de numeros enteros aleatorios
arreglo_aleatorio = generar_arreglo_aleatorio(1000)

#imprimir el contenido del arreglo aleatorio    
print("arreglo aleatorio generado:")
imprimir_arreglo(arreglo_aleatorio)

#busqueda secuencial en el arreglo aleatorio
elemento_a_buscar=50
indice=busqueda_secuencial(arreglo_aleatorio, elemento_a_buscar)
if indice != -1:
    print(f"el elemento {elemento_a_buscar} se encuentra en el indice {indice}")
else:
    print(f"el elemento {elemento_a_buscar} no se encuentra en el arreglo.")

#ordenar el arreglo generado
inicio_ordenamiento = time.time()
arreglo_ordenado = sorted(arreglo_aleatorio)
fin_ordenamiento = time.time()
tiempo_ordenamiento = (fin_ordenamiento - inicio_ordenamiento) * 1000

#convertir a milisegundos
print("arreglo ordenado:")
imprimir_arreglo(arreglo_ordenado)
print(f"tiempo de ordenamiento: {tiempo_ordenamiento:.2f} milisegundos")

#busqueda en el arreglo ordenado
indice=arreglo_ordenado.index(elemento_a_buscar) if elemento_a_buscar in arreglo_ordenado else -1
if indice >= 0:
    print(f"elemento {elemento_a_buscar} se encuentra en el indice {indice}")
else:
    print(f"el elemento {elemento_a_buscar} no se encuentra en el arreglo.")