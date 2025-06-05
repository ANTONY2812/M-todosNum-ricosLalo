### 🔙 [← Regresar a T2 - Métodos de Solución de Ecuaciones](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T2%20-%20M%C3%A9todos%20de%20Soluci%C3%B3n%20de%20Ecuaciones)
Tema 3 – Métodos de Solución de Sistemas de Ecuaciones Lineales

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

