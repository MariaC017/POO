package figurasg;

import java.util.Scanner;

public class EjecucionFiguras {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int seguir;

        System.out.println("Ingrese la cantidad de areas a evaluar");
        seguir = lector.nextInt();

        for (int i = 0; i < seguir; i++) {
            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Triángulo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Círculo");
            System.out.print("Opción: ");
            int opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    Trian triangulo = new Trian();
                    triangulo.calcularArea();
                    break;
                case 2:
                    Rec rectangulo = new Rec();
                    rectangulo.calcularArea();
                    break;
                case 3:
                    Cir circulo = new Cir();
                    circulo.calcularArea();
                    break;

                default:
                    System.out.println("Vuelve a intentarlo");
                    break;
            }
        }
    }

}
