
#  Tema 1: Error por Cancelación Numérica

---

###  ¿Qué es?

La **cancelación numérica** ocurre al restar dos números muy cercanos, causando pérdida significativa de cifras significativas y, por ende, errores en cálculos posteriores. Este problema es común en ciertos algoritmos y puede desestabilizar resultados si no se previene.

Reescribir expresiones algebraicas o usar formulaciones alternativas es fundamental para evitar este error y diseñar algoritmos numéricos estables y confiables.



---

### 📝 Pseudocódigo

```text
Inicio
  Definir a como real
  Definir b como real
  Definir resultado como real
  a = 1.0000001
  b = 1.0000000
  resultado = a - b
  Imprimir "Resultado esperado: 0.0000001"
  Imprimir "Resultado real: ", resultado
  Imprimir "Error por cancelación: ", abs(0.0000001 - resultado)
Fin
```

---

