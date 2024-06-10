import math

class HexagonoRegular:
    def __init__(self, lado, color):
        self.__lado = lado
        self.__color = color

    def get_lado(self):
        return self.__lado

    def get_color(self):
        return self.__color

    def get_area(self):
        return self.__area()

    def get_perimetro(self):
        return self.__perimetro()

    def __area(self):
        return (3 * math.sqrt(3) * self.__lado ** 2) / 2

    def __perimetro(self):
        return 6 * self.__lado

class Rombo:
    def __init__(self, diagonal_mayor, diagonal_menor, color):
        self.__diagonal_mayor = diagonal_mayor
        self.__diagonal_menor = diagonal_menor
        self.__color = color

    def get_diagonal_mayor(self):
        return self.__diagonal_mayor

    def get_diagonal_menor(self):
        return self.__diagonal_menor

    def get_color(self):
        return self.__color

    def get_area(self):
        return self.__area()

    def get_perimetro(self):
        return self.__perimetro()

    def __area(self):
        return (self.__diagonal_mayor * self.__diagonal_menor) / 2

    def __perimetro(self):
        return 4 * math.sqrt((self.__diagonal_mayor / 2) ** 2 + (self.__diagonal_menor / 2) ** 2)

class Trapecio:
    def __init__(self, base_mayor, base_menor, altura, color):
        self.__base_mayor = base_mayor
        self.__base_menor = base_menor
        self.__altura = altura
        self.__color = color

    def get_base_mayor(self):
        return self.__base_mayor

    def get_base_menor(self):
        return self.__base_menor

    def get_altura(self):
        return self.__altura

    def get_color(self):
        return self.__color

    def get_area(self):
        return self.__area()

    def get_perimetro(self):
        return self.__perimetro()

    def __area(self):
        return ((self.__base_mayor + self.__base_menor) * self.__altura) / 2

    def __perimetro(self):
        lado_oblicuo = math.sqrt(((self.__base_mayor - self.__base_menor) / 2) ** 2 + self.__altura ** 2)
        return self.__base_mayor + self.__base_menor + 2 * lado_oblicuo

def calcular_hexagono_regular():
    lado = float(input("Ingrese el lado del hexágono regular: "))
    color = input("Ingrese el color del hexágono regular: ")
    hexagono = HexagonoRegular(lado, color)
    print("Área del hexágono regular:", hexagono.get_area())
    print("Perímetro del hexágono regular:", hexagono.get_perimetro())
    print("Color del hexágono regular:", hexagono.get_color())

def calcular_rombo():
    diagonal_mayor = float(input("Ingrese la longitud de la diagonal mayor del rombo: "))
    diagonal_menor = float(input("Ingrese la longitud de la diagonal menor del rombo: "))
    color = input("Ingrese el color del rombo: ")
    rombo = Rombo(diagonal_mayor, diagonal_menor, color)
    print("Área del rombo:", rombo.get_area())
    print("Perímetro del rombo:", rombo.get_perimetro())
    print("Color del rombo:", rombo.get_color())

def calcular_trapecio():
    base_mayor = float(input("Ingrese la longitud de la base mayor del trapecio: "))
    base_menor = float(input("Ingrese la longitud de la base menor del trapecio: "))
    altura = float(input("Ingrese la altura del trapecio: "))
    color = input("Ingrese el color del trapecio: ")
    trapecio = Trapecio(base_mayor, base_menor, altura, color)
    print("Área del trapecio:", trapecio.get_area())
    print("Perímetro del trapecio:", trapecio.get_perimetro())
    print("Color del trapecio:", trapecio.get_color())

def main():
    print("Seleccione la figura geométrica a calcular:")
    print("1. Hexágono Regular")
    print("2. Rombo")
    print("3. Trapecio")
    opcion = int(input())

    if opcion == 1:
        calcular_hexagono_regular()
    elif opcion == 2:
        calcular_rombo()
    elif opcion == 3:
        calcular_trapecio()
    else:
        print("Opción inválida.")

if __name__ == "__main__":
    main()