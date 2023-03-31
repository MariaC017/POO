package salud;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Salud salud1 = new Salud();

        salud1.pedirDatos();
        salud1.mostrarPersona();
        salud1.calcularImc();
        salud1.mayorEdad();

        lector.close();

    }

}
