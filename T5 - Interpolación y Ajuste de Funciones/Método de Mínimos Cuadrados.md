### 🔙 [← Regresar a T5 - Interpolación y Ajuste de Funciones](https://github.com/ANTONY2812/M-todosNum-ricosLalo/tree/main/T5%20-%20Interpolaci%C3%B3n%20y%20Ajuste%20de%20Funciones)

#   Tema 5: Método de Mínimos Cuadrados

---

##  ¿Qué es  Método de Mínimos Cuadrados?

El método de mínimos cuadrados es una técnica matemática esencial para determinar la función que mejor representa un conjunto de datos experimentales, minimizando la suma de los cuadrados de las diferencias entre los valores observados y los predichos por el modelo.

Comúnmente se emplea para ajustar una recta (modelo lineal) a datos dispersos, garantizando un equilibrio óptimo según criterios estadísticos rigurosos. Además, puede extenderse a modelos polinómicos y no lineales con herramientas computacionales modernas.

Más allá de la modelación, este método facilita la comprensión y cuantificación de las relaciones funcionales entre variables.

---


##  Algoritmo (Pseudocódigo)

```plaintext
Inicio
  Definir vectores x, y de tamaño n
  Inicializar sumX, sumY, sumXY, sumX2 a 0
  Para i desde 0 hasta n-1 hacer
    sumX  += x[i]
    sumY  += y[i]
    sumXY += x[i] * y[i]
    sumX2 += x[i] * x[i]
  Fin Para

  Calcular pendiente m = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX^2)
  Calcular ordenada al origen b = (sumY - m * sumX) / n

  Imprimir "Ecuación de la recta: y = m x + b"
Fin
```

### 🔙 [← Regresar al repositorio principal](https://github.com/ANTONY2812/M-todosNum-ricosLalo)
