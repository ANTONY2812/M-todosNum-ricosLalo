package errortruncamiento;

public class ErrorTruncamiento {
    public static void main(String[] args) {
        System.out.println("===== ERROR DE TRUNCAMIENTO =====");

        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }

    public static void ejercicio1() {
        double[] datos = {5.674, 6.234, 5.987, 6.543, 5.876, 6.111, 5.934, 6.275, 6.389, 5.945};
        imprimirErrores("Ejercicio 1", datos);
    }

    public static void ejercicio2() {
        double[] datos = {0.4567, 0.4983, 0.4732, 0.5211, 0.4829, 0.5098, 0.4956, 0.4789, 0.5123, 0.4697};
        imprimirErrores("Ejercicio 2", datos);
    }

    public static void ejercicio3() {
        double[] datos = {125.34, 132.56, 128.78, 134.98, 130.44, 129.87, 126.98, 133.21, 127.65, 131.12};
        imprimirErrores("Ejercicio 3", datos);
    }

    public static void ejercicio4() {
        double[] datos = {1.278, 1.342, 1.295, 1.356, 1.312, 1.329, 1.301, 1.337, 1.322, 1.315};
        imprimirErrores("Ejercicio 4", datos);
    }

    public static void ejercicio5() {
        double[] datos = {3.478, 3.532, 3.498, 3.567, 3.489, 3.523, 3.509, 3.551, 3.512, 3.545};
        imprimirErrores("Ejercicio 5", datos);
    }

    public static void imprimirErrores(String titulo, double[] datos) {
        System.out.println(titulo);
        for (double val : datos) {
            double truncado = ((int)(val * 100)) / 100.0;
            double error = Math.abs(val - truncado);
            System.out.printf("Original: %.4f | Truncado: %.2f | Error: %.4f\n", val, truncado, error);
        }
        System.out.println();
    }
}
