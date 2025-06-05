### 🔙 [← Regresar a T5 - Interpolación y Ajuste de Funciones](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T5%20-%20Interpolaci%C3%B3n%20y%20Ajuste%20de%20Funciones)

#   Tema 5: Método de Regresión

---

##  ¿Qué es Método de Regresión?

El método de regresión es una técnica estadística para modelar la relación entre una variable dependiente y una o más independientes. A diferencia de la interpolación, no busca pasar por todos los puntos, sino representar la tendencia general, especialmente con datos ruidosos o con errores.

La regresión lineal es la más común, ajustando una línea recta que minimiza el error cuadrático entre valores observados y estimados. Existen también regresiones polinómicas, exponenciales, logarítmicas, etc., según la naturaleza del fenómeno.

Se utiliza en economía, física, ingeniería y ciencias sociales para predecir, analizar y evaluar relaciones entre variables. Es fundamental para el análisis estadístico basado en datos reales.

---


##  Pseudocódigo

```text
Inicio
  Definir x, y como vectores reales [n]
  Inicializar sumX, sumY, sumXY, sumX2 a 0
  Para i = 0 hasta n-1
    sumX  += x[i]
    sumY  += y[i]
    sumXY += x[i] * y[i]
    sumX2 += x[i]^2
  Fin Para

  Calcular pendiente:
    m = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX^2)
  Calcular ordenada al origen:
    b = (sumY - m * sumX) / n

  Imprimir "Ecuación: y = m x + b"
Fin
```

### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
