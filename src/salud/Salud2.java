package salud;

import java.util.Scanner;

public class Salud2 {

    /// ATRIBUTOS

    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private Double peso;
    private Double estatura;
    private int edad;
    private String sexo;

    /// METODOS
    public void pedirDatos() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Por favor digite su tipo de documento");
        tipoDoc = lector.next();
        System.out.println("Por favor digite su documento");
        documento = lector.nextInt();
        System.out.println("Por favor digite su nombre");
        nombre = lector.next();
        System.out.println("Por favor digite su apellido");
        apellido = lector.next();
        System.out.println("Por favor digite su peso (en kg)");
        peso = lector.nextDouble();
        System.out.println("Por favor digite su estatura(en m)");
        estatura = lector.nextDouble();
        System.out.println("Por favor digite su edad");
        edad = lector.nextInt();
        System.out.println("Por favor digite su sexo (F oM)");
        sexo = lector.next();
        lector.close();
    }

    public void mostrarPersona() {
        System.out.println("Su tipo de documento es:" + tipoDoc);
        System.out.println("Su documento es" + documento);
        System.out.println("Su nombre es:" + nombre);
        System.out.println("Su apellido es:" + apellido);
        System.out.println("Su peso es:" + peso);
        System.out.println("Su estatura es:" + estatura);
        System.out.println("Su edad es:" + edad);
        System.out.println("Su sexo es:" + sexo);

    }

    public void mayorEdad() {
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");

        } else {
            System.out.println("Eres menor de edad");
        }
    }

    public String calcularImc2() {
        double pesoActual;
        pesoActual = peso / (estatura * estatura);
        if (pesoActual < 20) {
            return "PESOBAJO";
        } else if (pesoActual >= 20 && pesoActual == 25) {
            return "PESOIDEAL";
        } else if (pesoActual > 25) {
            return "SOBREPESO";
        }
        return "";

    }
}
