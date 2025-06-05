### [← Regresar a T1 - Introducción a los Métodos Numéricos](https://github.com/Juan200519287393u83/Metodos_Numericos/blob/main/T1%20-%20Introducci%C3%B3n%20a%20los%20m%C3%A9todos%20num%C3%A9ricos/Introducci%C3%B3n%20a%20los%20m%C3%A9todos%20n%C3%BAmericos.md)

#  Tema 1: Tipos de Errores Numéricos

## Error de Redondeo

---

###  ¿Qué es?

El **error de redondeo** surge por la representación limitada de números reales en sistemas digitales. Dado que las computadoras usan un número finito de bits, muchos valores decimales no se almacenan exactamente, sino redondeados al número más cercano representable.

Aunque un único error de redondeo es pequeño, al acumularse en operaciones repetidas puede impactar la precisión final. Por eso es vital diseñar algoritmos numéricos estables que minimicen esta acumulación.



---

### 📝 Pseudocódigo

```text
Inicio
  Definir a como real
  Definir b como real
  a = 1.0 / 3.0
  b = a * 3.0
  Imprimir "Resultado teórico: 1.0"
  Imprimir "Resultado real: ", b
  Imprimir "Error de redondeo: ", (1.0 - b)
Fin
```

---

### 💻 Código Base en Java

```java
public class CodigoBaseRedondeo {
    public static void main(String[] args) {
        double a = 1.0 / 3.0;
        double b = a * 3.0;

        System.out.println("Resultado teórico: 1.0");
        System.out.println("Resultado real: " + b);
        System.out.println("Error de redondeo: " + (1.0 - b));
    }
}
```

---

### 🛠 Ejemplo Funcional en Java

```java
}public class RedondeoEjemplo {
    public static void main(String[] args) {
        double numeroOriginal = 0.1;
        double suma = numeroOriginal + numeroOriginal + numeroOriginal + numeroOriginal + numeroOriginal 
                    + numeroOriginal + numeroOriginal + numeroOriginal + numeroOriginal + numeroOriginal;

        System.out.println("Suma esperada: 1.0");
        System.out.println("Suma obtenida: " + suma);
        System.out.println("Error por redondeo: " + (1.0 - suma));
    }
}
```

---

### 📋 Caso de prueba

```
Suma esperada: 1.0  
Suma obtenida: 0.9999999999999999  
Error por redondeo: 1.1102230246251565E-16


