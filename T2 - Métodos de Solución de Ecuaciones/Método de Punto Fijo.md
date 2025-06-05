### 🔙 [← Regresar a T2 - Métodos de Solución de Ecuaciones](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T2%20-%20M%C3%A9todos%20de%20Soluci%C3%B3n%20de%20Ecuaciones)


#  Tema 2: Método de Punto Fijo


---

##  ¿Qué es el Método de Punto Fijo?

El método de punto fijo es una técnica numérica utilizada para encontrar soluciones aproximadas de ecuaciones. Su enfoque consiste en transformar la ecuación original en una nueva forma que permite calcular sucesivamente valores, esperando que cada nuevo valor se acerque más a la solución real.

La idea principal es comenzar con una estimación inicial y, mediante una función iterativa, generar nuevos valores a partir del anterior. Si el proceso cumple ciertas condiciones, los valores convergen hacia una solución estable conocida como punto fijo.

Este método es sencillo de aplicar y útil en muchos contextos, aunque su éxito depende de que la función utilizada cumpla ciertos criterios de convergencia. En caso contrario, puede no acercarse a la solución deseada.

```


##  Pseudocódigo

```java
Inicio
  Función f(x) → Retornar x³ - x - 2
  Función g(x) → Retornar (x + 2)^(1/3)

  Inicializar: x = 1.5, tolerancia = 0.001, maxIter = 100
  iteracion = 0

  Mientras iteracion < maxIter:
    xNuevo = g(x)
    Mostrar iteración, xNuevo, f(xNuevo)

    Si |xNuevo - x| < tolerancia → Retornar xNuevo como raíz

    x = xNuevo
    iteracion++
Fin
````

---

##  Código base en Java

```java
public class CodigoBasePuntoFijo {
    public static double f(double x) {
        return Math.pow(x, 3) - x - 2;
    }

    public static double g(double x) {
        return Math.pow(x + 2, 1.0 / 3.0);
    }

    public static void main(String[] args) {
        double x = 1.5;
        double tolerancia = 0.001;
        int maxIteraciones = 100;
        int iteracion = 0;

        while (iteracion < maxIteraciones) {
            double xNuevo = g(x);
            System.out.println("Iteración " + iteracion + ": x = " + xNuevo + ", f(x) = " + f(xNuevo));

            if (Math.abs(xNuevo - x) < tolerancia) {
                System.out.println("Raíz encontrada: " + xNuevo);
                return;
            }

            x = xNuevo;
            iteracion++;
        }

        System.out.println("Máximo de iteraciones alcanzado");
    }
}
```

---

##  Ejemplo funcional en Java

```java
public class FixedPointMethod {
    public static double f(double x) {
        return x * x * x - x - 2;
    }

    public static double g(double x) {
        return Math.pow(x + 2, 1.0 / 3.0);
    }

    public static void main(String[] args) {
        double x = 1.5;
        double tolerancia = 0.001;
        int maxIteraciones = 100;

        for (int iteracion = 0; iteracion < maxIteraciones; iteracion++) {
            double xNuevo = g(x);
            System.out.printf("Iteración %d: x = %.3f, f(x) = %.3f%n", iteracion, xNuevo, f(xNuevo));

            if (Math.abs(xNuevo - x) < tolerancia) {
                System.out.printf("Raíz encontrada: %.3f%n", xNuevo);
                return;
            }

            x = xNuevo;
        }

        System.out.println("Máximo de iteraciones alcanzado");
    }
}
```

---

##  Caso de prueba

```text
Iteración 0: x = 1.442, f(x) = 0.150
Iteración 1: x = 1.567, f(x) = 0.321
Iteración 2: x = 1.484, f(x) = 0.075
Iteración 3: x = 1.533, f(x) = 0.069
Iteración 4: x = 1.506, f(x) = 0.029
Iteración 5: x = 1.522, f(x) = 0.016
Iteración 6: x = 1.514, f(x) = 0.006
Iteración 7: x = 1.518, f(x) = 0.003
Iteración 8: x = 1.520, f(x) = 0.001
 Raíz encontrada: 1.520
```

---

### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
