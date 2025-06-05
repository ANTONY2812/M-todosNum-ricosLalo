#   Tema 5: Interpolación Polinómica

## ¿Qué es Interpolación Polinómica?

La interpolación polinómica consiste en construir un polinomio que pase exactamente por 𝑛+1 puntos conocidos. A diferencia de la interpolación lineal, este método puede representar mejor la curvatura y complejidad de la función subyacente, gracias a polinomios de mayor grado.

Entre los métodos más utilizados para construir este polinomio están las interpolaciones de Newton y Lagrange, que ofrecen diferentes formulaciones pero logran el mismo objetivo: encontrar un polinomio que interpole los datos dados. Aunque el polinomio pasa exactamente por los puntos conocidos, puede presentar oscilaciones no deseadas —conocidas como fenómeno de Runge— cuando se usan polinomios de grado alto o se trabaja en intervalos muy grandes.

La interpolación polinómica es adecuada cuando se cuenta con un número moderado de datos bien distribuidos y se busca un ajuste exacto. Para conjuntos de datos grandes o ruidosos, suelen preferirse métodos como los splines o técnicas de ajuste de curvas (regresión).

---


##  Pseudocódigo (Interpolación de Lagrange)

```plaintext
Inicio
  Definir x como vector de reales [n]
  Definir y como vector de reales [n]
  Definir xp como real
  Definir yp como real = 0
  Definir L como real
  Definir i, j como enteros

  Para i = 0 hasta n-1
    L = 1
    Para j = 0 hasta n-1
      Si j != i
        L = L * (xp - x[j]) / (x[i] - x[j])
      Fin Si
    Fin Para
    yp = yp + y[i] * L
  Fin Para

  Imprimir "Valor interpolado en x = ", xp, ": ", yp
Fin
```

