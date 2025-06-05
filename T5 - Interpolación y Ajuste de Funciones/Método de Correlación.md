#   Tema 5: Método de Correlación

## ¿Qué es Método de Correlación?

El método de correlación se utiliza para analizar la relación entre dos variables numéricas, indicando qué tan fuerte y en qué dirección se relacionan. A diferencia de la regresión, que busca predecir una variable con base en otra, la correlación solo mide el grado de asociación entre ambas, sin sugerir una causa directa.

El tipo de correlación más común es la de Pearson, que evalúa si las variables tienden a aumentar o disminuir juntas, o si no existe un patrón claro entre ellas:

Una correlación positiva fuerte indica que ambas variables tienden a aumentar juntas.

Una negativa fuerte significa que mientras una crece, la otra disminuye.

Una correlación cercana a cero sugiere que no hay una relación lineal evidente.

Este método es muy útil en estudios preliminares para identificar posibles vínculos entre variables. Sin embargo, es fundamental recordar que una correlación alta no significa que una variable cause el comportamiento de la otra; simplemente señala que se comportan de forma relacionada.

---

##  Pseudocódigo

```plaintext
Inicio
  Definir x, y vectores de reales [n]
  Inicializar sumX, sumY, sumXY, sumX2, sumY2 = 0

  Para i = 0 hasta n-1
    sumX += x[i]
    sumY += y[i]
    sumXY += x[i] * y[i]
    sumX2 += x[i]^2
    sumY2 += y[i]^2
  Fin Para

  r = (n * sumXY - sumX * sumY) / sqrt((n * sumX2 - sumX^2) * (n * sumY2 - sumY^2))

  Imprimir "Coeficiente de correlación: ", r
Fin
```
