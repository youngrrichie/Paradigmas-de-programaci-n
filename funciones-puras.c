
#include <stdio.h>
#include <math.h>

//funciones
float Suma(float a, float b);
float Resta(float a, float b);
float multiplicacion(float a, float b);
float division(float a, float b);
float potencia(float a, float b);
float logaritmoNatural(float a);
float logaritmoBase10(float a);
float seno(float a);
float coseno(float a);
float tangente(float a);

//main
int main(){
    float a, b;
    int Opcion;
    float resultado;

    printf("elija la operación que se va a hacer\n");
    printf("1.suma\n");
    printf("2.resta\n");
    printf("3.multiplicacion\n");
    printf("4.division\n");
    printf("5.potencia\n");
    printf("6.logaritmo natural\n");
    printf("7.logaritmo base 10\n");
    printf("8.seno\n");
    printf("9.coseno\n");
    printf("10.tangente\n");
    printf("ingrese su elección: ");
    scanf("%d", &Opcion);

switch (Opcion)
{
case 1: 
    resultado=Suma(a, b);
    printf("resultado de la suma: %.2f\n", resultado);
    break;
case 2: 
    resultado=Resta(a,b);
    printf("resultado de la resta: %.2f\n", resultado);
    break;
case 3: 
    resultado=multiplicacion(a,b);
    printf("resultado de la division: %.2f\n", resultado);
    break;
case 4: 
    resultado=division(a,b);
    printf("resultado de la division: %.2f\n", resultado);
    break;
case 5: 
    resultado=potencia(a,b);
    printf("resultado de la potencia: %.2f\n", resultado);
    break;
case 6: 
    resultado=logaritmoNatural(a);
    printf("resultado del logaritmo natural: %f\n", resultado);
    break;
case 7: 
    resultado=logaritmoBase10(a);
    printf("resultado del logaritmo base 10: %f\n", resultado);
    break;
case 8: 
    resultado=seno(a);
    printf("resultado del seno: %f\n", resultado);
    break;
case 9: 
    resultado=coseno(a);
    printf("resultado del coseno: %f\n", resultado);
    break;
case 10: 
    resultado=tangente(a);
    printf("resultado de la tangente: %f\n", resultado);
    break;
default:
    printf("opcion invalida\n");
    break;
}
return 0;
}

//definicion de funciones
float Suma(float a, float b){
    return a+b;
}

float Resta(float a, float b){
    return a-b;
}

float multiplicacion(float a, float b){
    return a*b;
}

float division(float a, float b){
    if (b !=0)
        return a/b;
    else{
        printf("la divison por cero no es posible\n");
        return 0;
    }
}

float potencia(float a, float b){
    return pow(a, b);
}

float logaritmoNatural(float a){
    return log(a);
}

float logaritmoBase10(float a){
    return log10(a);
}

float seno(float a){
    return sin(a);
}

float coseno(float a){
    return cos(a);
}

float tangente(float a){
    return tan(a);
}
