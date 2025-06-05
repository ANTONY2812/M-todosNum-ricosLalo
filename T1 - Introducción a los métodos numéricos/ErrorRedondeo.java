package errorredondeo;

public class ErrorRedondeo {
 public static void main(String[] args) {
        System.out.println("===== ERROR DE REDONDEO =====");

        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }

    public static void ejercicio1() {
        double[] datos = {10.456, 12.789, 9.345, 11.987, 10.245, 12.001, 9.876, 10.999, 11.123, 12.654};
        imprimirErrores("Ejercicio 1", datos);
    }

    public static void ejercicio2() {
        double[] datos = {4.876, 5.432, 4.921, 5.213, 4.765, 5.001, 4.987, 5.134, 5.289, 4.956};
        imprimirErrores("Ejercicio 2", datos);
    }

    public static void ejercicio3() {
        double[] datos = {3.125, 3.256, 3.198, 3.109, 3.212, 3.287, 3.165, 3.290, 3.188, 3.220};
        imprimirErrores("Ejercicio 3", datos);
    }

    public static void ejercicio4() {
        double[] datos = {1.254, 1.329, 1.211, 1.298, 1.276, 1.310, 1.287, 1.265, 1.345, 1.299};
        imprimirErrores("Ejercicio 4", datos);
    }

    public static void ejercicio5() {
        double[] datos = {9.854, 10.112, 9.921, 10.065, 9.876, 10.045, 9.990, 9.978, 10.123, 10.087};
        imprimirErrores("Ejercicio 5", datos);
    }

    public static void imprimirErrores(String titulo, double[] datos) {
        System.out.println(titulo);
        for (double val : datos) {
            double redondeado = Math.round(val * 100.0) / 100.0;
            double error = Math.abs(val - redondeado);
            System.out.printf("Original: %.4f | Redondeado: %.2f | Error: %.4f\n", val, redondeado, error);
        }
        System.out.println();
    }    
}
