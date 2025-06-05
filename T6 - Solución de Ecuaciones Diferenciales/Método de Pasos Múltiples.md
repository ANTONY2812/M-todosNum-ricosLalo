### 🔙 [← Regresar a T6 - Solución de Ecuaciones Diferenciales](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T6%20-%20Soluci%C3%B3n%20de%20Ecuaciones%20Diferenciales)

#   Tema 6: Método de Pasos Múltiples



---

##  Introducción

Los métodos de pasos múltiples son una categoría de algoritmos numéricos diseñados para resolver ecuaciones diferenciales ordinarias (EDO) utilizando no solo el último valor calculado, sino también varios valores anteriores. A diferencia de los métodos de un solo paso —como Euler o Runge-Kutta—, esta técnica aprovecha el historial del sistema para estimar el siguiente punto de la solución con mayor exactitud.

Estos métodos permiten aumentar la precisión sin incrementar el número de evaluaciones de la derivada, lo cual se traduce en una mejor eficiencia computacional, especialmente en simulaciones extensas.

Dos ejemplos representativos de esta familia son:

Adams-Bashforth (explícito): utiliza una combinación de derivadas pasadas para estimar el siguiente valor.

 Adams-Moulton (implícito): realiza una corrección basada también en la derivada futura, lo que mejora la estabilidad del método.

Para iniciar un método de pasos múltiples, se requieren varios valores previos de la solución, los cuales suelen calcularse con un método de un solo paso como Runge-Kutta.

---


##  Pseudocódigo

```text
Inicio
  Función f(x, y)
    Retornar -2 * x * y
  Fin Función

  Definir a, b, h, n, x[], y[]
  a = 0.0
  b = 1.0
  h = 0.2
  n = 5
  y[0] = 1.0

  Para i = 0 hasta n
    x[i] = a + i * h
  Fin Para

  // Primer paso con Euler
  y[1] = y[0] + h * f(x[0], y[0])

  // Método Adams-Bashforth de 2 pasos
  Para i = 1 hasta n-1
    y[i+1] = y[i] + (h / 2) * (3 * f(x[i], y[i]) - f(x[i-1], y[i-1]))
  Fin Para

  Para i = 0 hasta n
    Imprimir "x = ", x[i], ", y = ", y[i]
  Fin Para
Fin
```

### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
