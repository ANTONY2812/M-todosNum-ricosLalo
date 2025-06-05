### 🔙 [← Regresar a T1 - Introducción a los métodos numéricos](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T1%20-%20Introducci%C3%B3n%20a%20los%20m%C3%A9todos%20num%C3%A9ricos)

#  Tema 1: Error de Truncamiento

---

### ¿Qué es?

El error de truncamiento aparece cuando se limita una operación matemática que, en teoría, debería continuar indefinidamente. Esto sucede, por ejemplo, al aproximar funciones mediante series como la de Taylor y se decide cortar la serie después de cierto número de términos. Al omitir los términos restantes, se introduce un error inevitable.

Este tipo de error está directamente relacionado con la cantidad de términos considerados: mientras más términos se usen, más precisa será la aproximación, pero también aumentará el trabajo computacional. Por eso, en muchos casos es necesario buscar un balance entre la exactitud y el rendimiento del cálculo, dependiendo del contexto del problema que se quiere resolver.

---

###  Pseudocódigo

```text
Inicio
  Función funciónReal(x)
    Retornar exp(x)
  Fin Función

  Función aproximacionTaylor(x, n)
    Definir suma como real
    Definir i como entero
    suma = 0
    Para i = 0 hasta n
      suma = suma + (x^i) / factorial(i)
    Fin Para
    Retornar suma
  Fin Función

  Definir x como real
  Definir n como entero
  Definir real como real
  Definir aproximado como real
  x = 1.0
  n = 3
  real = funciónReal(x)
  aproximado = aproximacionTaylor(x, n)
  Imprimir "Valor real: ", real
  Imprimir "Aproximación: ", aproximado
  Imprimir "Error de truncamiento: ", abs(real - aproximado)
Fin
```
---

### 💻 Código base en Java

```java
public class CodigoBaseTruncamiento {
    public static double funcionReal(double x) {
        return Math.exp(x);
    }

    public static double aproximacionTaylor(double x, int n) {
        double suma = 0;
        for (int i = 0; i <= n; i++) {
            double factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            suma += Math.pow(x, i) / factorial;
        }
        return suma;
    }

    public static void main(String[] args) {
        double x = 1.0;
        int n = 3;
        double real = funcionReal(x);
        double aproximado = aproximacionTaylor(x, n);

        System.out.println("Valor real: " + real);
        System.out.println("Aproximación: " + aproximado);
        System.out.println("Error de truncamiento: " + Math.abs(real - aproximado));
    }
}
```

---

### 🛠 Ejemplo funcional en Java

```java
public class ErrorTruncamiento {
    public static double taylorExp(double x, int n) {
        double suma = 1.0;
        double term = 1.0;

        for (int i = 1; i <= n; i++) {
            term *= x / i;
            suma += term;
        }

        return suma;
    }

    public static void main(String[] args) {
        double x = 1.0;
        int n = 3;
        double real = Math.exp(x);
        double aproximado = taylorExp(x, n);

        System.out.printf("Valor real: %.3f%n", real);
        System.out.printf("Aproximación (n=3): %.3f%n", aproximado);
        System.out.printf("Error de truncamiento: %.3f%n", Math.abs(real - aproximado));
    }
}
```

---

### 📋 Caso de prueba:

```text
Valor real: 2.718
Aproximación (n=3): 2.667
Error de truncamiento: 0.051
```
### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
