

#   Tema 6: Método de un paso



## Introducción

Los métodos de un solo paso son técnicas numéricas utilizadas para resolver ecuaciones diferenciales ordinarias (EDO), en las que el siguiente valor de la solución se calcula únicamente a partir del punto actual, sin necesidad de conservar resultados anteriores. Esta simplicidad en la lógica los hace ideales para introducirse en el análisis numérico.

Algunos de los métodos más representativos dentro de esta categoría son:

🔹 Euler, el más simple y directo, aunque con precisión limitada.

🔹 Heun, una versión mejorada también conocida como Runge-Kutta de segundo orden.

🔹 Runge-Kutta de orden 4, uno de los más utilizados por su balance entre precisión y eficiencia.

Cada uno de estos métodos ofrece distintos niveles de aproximación y estabilidad. Aunque pueden requerir pasos pequeños para mantener la precisión, su facilidad de implementación y buen rendimiento en muchos problemas los hacen una herramienta esencial en el estudio de EDOs.

---


##  Pseudocódigo – Método de Heun

```text
Inicio
  Función f(x, y)
    Retornar -2 * x * y
  Fin Función

  Definir a, b, h como reales
  Definir n como entero
  Definir x[n+1], y[n+1] como vectores reales
  Definir i como entero
  Definir k1, k2 como reales

  a = 0.0
  b = 1.0
  h = 0.2
  n = 5
  y[0] = 1.0

  Para i = 0 hasta n
    x[i] = a + i * h
  Fin Para

  Para i = 0 hasta n-1
    k1 = f(x[i], y[i])
    k2 = f(x[i] + h, y[i] + h * k1)
    y[i+1] = y[i] + (h / 2) * (k1 + k2)
  Fin Para

  Para i = 0 hasta n
    Imprimir "x = ", x[i], ", y = ", y[i]
  Fin Para
Fin
```



