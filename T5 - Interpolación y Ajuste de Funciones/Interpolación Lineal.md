#   Tema 5: Interpolación Lineal

## ¿Que es Interpolación Lineal?

La interpolación lineal es una técnica simple y directa para estimar valores intermedios entre dos puntos conocidos, uniendo estos puntos mediante una línea recta y calculando los valores a lo largo de dicha línea. Este método asume que la función varía de forma lineal entre los puntos, lo que permite realizar cálculos rápidos y sencillos en intervalos pequeños.

Es especialmente útil cuando se dispone de pocos datos y se requiere una estimación rápida y razonablemente precisa. Sin embargo, si la función presenta cambios no lineales, la precisión disminuye y pueden generarse errores significativos.

A pesar de sus limitaciones, la interpolación lineal es ampliamente empleada como punto de partida en análisis numéricos y sirve como base para métodos más complejos, como la interpolación polinómica o por splines.
---


##  Pseudocódigo

```plaintext
Inicio
  Definir x como vector de reales [n]
  Definir y como vector de reales [n]
  Definir xp como real
  Definir yp como real
  Definir i como entero

  x = [0, 1, 2, 3]
  y = [1, 2.718, 7.389, 20.085]
  xp = 1.5
  n = 4

  Para i = 0 hasta n-2
    Si x[i] <= xp Y xp <= x[i+1]
      yp = y[i] + (y[i+1] - y[i]) * (xp - x[i]) / (x[i+1] - x[i])
      Imprimir "Valor interpolado en x = ", xp, ": ", yp
      Retornar
    Fin Si
  Fin Para

  Imprimir "El punto está fuera del rango de interpolación"
Fin
```
