package salud;

public class Principal2 {

    public static void main(String[] args) {

        String valorm;

        Salud2 persona = new Salud2();
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.mayorEdad();
        valorm = persona.calcularImc2();
        System.out.println("Su peso es : " + valorm);

    }
}


