### 🔙 [← Regresar a T2 - Métodos de Solución de Ecuaciones](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T2%20-%20M%C3%A9todos%20de%20Soluci%C3%B3n%20de%20Ecuaciones)


#  Tema 2: Método de Newton-Raphson

---

##  ¿Qué es el Método de Newton-Raphson?

El método de Newton-Raphson es una herramienta numérica muy conocida para encontrar el punto donde una función se anula, es decir, su raíz. Parte de un valor inicial y, usando información sobre cómo cambia la función (su pendiente), va ajustando ese valor paso a paso.

Cuando se cumplen ciertas condiciones, el método puede alcanzar la respuesta correcta con mucha rapidez, lo que lo hace muy eficiente. Sin embargo, si no se elige bien el punto de partida o si la función tiene comportamientos extraños, el método puede fallar o desviarse.

Es ampliamente utilizado en ciencia e ingeniería por su velocidad y precisión en situaciones favorables.

---

##  Pseudocódigo

```java
Inicio
  Función f(x) -> Retornar x^3 - x - 2
  Función fPrima(x) -> Retornar 3 * x^2 - 1

  Inicializar: x = 1.5, tolerancia = 0.001, maxIter = 100
  iteracion = 0

  Mientras iteracion < maxIter:
    fx = f(x)
    Mostrar iteración, x, fx
    Si |fx| < tolerancia → Retornar x como raíz
    x = x - fx / fPrima(x)
    iteracion++
Fin
````

---

##  Código base en Java

```java
public class CodigoBaseNewtonRaphson {
    public static double f(double x) {
        return Math.pow(x, 3) - x - 2;
    }

    public static double fPrima(double x) {
        return 3 * Math.pow(x, 2) - 1;
    }

    public static void main(String[] args) {
        double x = 1.5;
        double tolerancia = 0.001;
        int maxIteraciones = 100;

        for (int i = 0; i < maxIteraciones; i++) {
            double fx = f(x);
            System.out.printf("Iteración %d: x = %.3f, f(x) = %.3f%n", i, x, fx);

            if (Math.abs(fx) < tolerancia) {
                System.out.printf("Raíz encontrada: %.3f%n", x);
                return;
            }

            x = x - fx / fPrima(x);
        }

        System.out.println("Máximo de iteraciones alcanzado");
    }
}
```

---

##  Ejemplo funcional

```java
public class NewtonRaphsonMethod {
    public static double f(double x) {
        return x * x * x - x - 2;
    }

    public static double fPrima(double x) {
        return 3 * x * x - 1;
    }

    public static void main(String[] args) {
        double x = 1.5;
        double tolerancia = 0.001;
        int maxIteraciones = 100;

        for (int iteracion = 0; iteracion < maxIteraciones; iteracion++) {
            double fx = f(x);
            System.out.printf("Iteración %d: x = %.3f, f(x) = %.3f%n", iteracion, x, fx);

            if (Math.abs(fx) < tolerancia) {
                System.out.printf("Raíz encontrada: %.3f%n", x);
                return;
            }

            x = x - fx / fPrima(x);
        }

        System.out.println("Máximo de iteraciones alcanzado");
    }
}
```

---

##  Salida esperada

```text
Iteración 0: x = 1.500, f(x) = -0.125
Iteración 1: x = 1.521, f(x) = 0.001
 Raíz encontrada: 1.521
```
### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
