### 🔙 [← Regresar a T2 - Métodos de Solución de Ecuaciones](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T2%20-%20M%C3%A9todos%20de%20Soluci%C3%B3n%20de%20Ecuaciones)


#  Tema 2: Método de Bisección

---

##  ¿En qué consiste?

El método de bisección es una técnica numérica empleada para localizar las raíces de una función cuando no es posible hallar una solución exacta. Este método consiste en dividir repetidamente un intervalo en dos mitades y determinar en cuál de ellas la función cambia de signo, lo que indica que la raíz se encuentra dentro de ese subintervalo. Así, se reduce progresivamente el intervalo hasta aproximar la raíz con la precisión deseada.

---

##  Pseudocódigo

```java
Inicio
  Función f(x) -> Retornar x^3 - x - 2

  Inicializar: a = 1.0, b = 2.0, tolerancia = 0.001, maxIter = 100
  Calcular: fa = f(a), fb = f(b)

  Si fa * fb >= 0 → Error: No hay cambio de signo

  Mientras iteración < maxIter:
    p = (a + b) / 2
    fp = f(p)
    Si |fp| < tolerancia o |b - a| < tolerancia:
        Retornar p como raíz aproximada
    Si fa * fp < 0:
        b = p
    Sino:
        a = p
  FinMientras
Fin
````

### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
