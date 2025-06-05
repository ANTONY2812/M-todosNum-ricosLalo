### 🔙 [← Regresar a T2 - Métodos de Solución de Ecuaciones](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T2%20-%20M%C3%A9todos%20de%20Soluci%C3%B3n%20de%20Ecuaciones)


#  Tema 2: Método de la Secante


---

##  ¿Qué es el Método de la Secante?

El método de la secante es una técnica numérica utilizada para aproximar raíces de funciones sin requerir derivadas. A diferencia del método de Newton-Raphson, que necesita conocer la derivada de la función, este método solo utiliza los valores de la función en dos puntos distintos.

El procedimiento consiste en tomar dos estimaciones iniciales y construir una línea recta (llamada secante) que une los puntos correspondientes. Luego, se calcula dónde esta línea cruza el eje horizontal, obteniendo así una nueva aproximación de la raíz. Este proceso se repite sucesivamente hasta lograr una buena aproximación.

Es útil cuando la derivada es difícil de obtener o desconocida, y aunque puede no ser tan estable como otros métodos, ofrece una buena eficiencia en muchos casos prácticos.

```




##  Pseudocódigo

```text
Inicio
  Función f(x) → x^3 - x - 2

  Inicializar: x0 = 1.0, x1 = 2.0, tolerancia = 0.001, maxIter = 100
  iteracion = 0

  Mientras iteracion < maxIter:
    fx0 = f(x0)
    fx1 = f(x1)
    x2 = x1 - (fx1 * (x1 - x0)) / (fx1 - fx0)
    Mostrar iteración, x2, f(x2)

    Si |f(x2)| < tolerancia → Retornar x2 como raíz

    x0 = x1
    x1 = x2
    iteracion++
  Fin Mientras

  Mostrar: "Máximo de iteraciones alcanzado"
Fin
````

---

##  Código base en Java

```java
public class CodigoBaseSecante {
    public static double f(double x) {
        return Math.pow(x, 3) - x - 2;
    }

    public static void main(String[] args) {
        double x0 = 1.0;
        double x1 = 2.0;
        double tolerancia = 0.001;
        int maxIteraciones = 100;
        int iteracion = 0;

        while (iteracion < maxIteraciones) {
            double fx0 = f(x0);
            double fx1 = f(x1);
            double x2 = x1 - (fx1 * (x1 - x0)) / (fx1 - fx0);
            System.out.println("Iteración " + iteracion + ": x = " + x2 + ", f(x) = " + f(x2));

            if (Math.abs(f(x2)) < tolerancia) {
                System.out.println("Raíz encontrada: " + x2);
                return;
            }

            x0 = x1;
            x1 = x2;
            iteracion++;
        }

        System.out.println("Máximo de iteraciones alcanzado");
    }
}
```

---

##  Ejemplo funcional en Java

```java
public class SecantMethod {
    public static double f(double x) {
        return x * x * x - x - 2;
    }

    public static void main(String[] args) {
        double x0 = 1.0;
        double x1 = 2.0;
        double tolerancia = 0.001;
        int maxIteraciones = 100;

        for (int iteracion = 0; iteracion < maxIteraciones; iteracion++) {
            double fx0 = f(x0);
            double fx1 = f(x1);
            double x2 = x1 - (fx1 * (x1 - x0)) / (fx1 - fx0);
            System.out.printf("Iteración %d: x = %.3f, f(x) = %.3f%n", iteracion, x2, f(x2));

            if (Math.abs(f(x2)) < tolerancia) {
                System.out.printf("Raíz encontrada: %.3f%n", x2);
                return;
            }

            x0 = x1;
            x1 = x2;
        }

        System.out.println("Máximo de iteraciones alcanzado");
    }
}
```

---

## Caso de prueba

```text
Iteración 0: x = 1.556, f(x) = 0.214
Iteración 1: x = 1.518, f(x) = 0.002
 Raíz encontrada: 1.518
```

---

### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
