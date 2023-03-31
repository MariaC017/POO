package salud;

import java.util.Scanner;

public class Persona {

    // atributos
    private String tipoDocumento;
    private int documento;
    private String nombre;
    private String apellido;

    /// metodo constructor
    public Persona(String tipoDoc, int doc, String nom, String ape) {

        this.tipoDocumento = tipoDoc;
        this.documento = doc;
        this.nombre = nom;
        this.apellido = ape;

    }

    /// metodos getter y setter
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void pedirDatos() {
        Scanner lector = new Scanner(System.in);
        System.out.println("digite su tipo de documento");
        tipoDocumento = lector.next();
        System.out.println("digite su documento");
        documento = lector.nextInt();
        System.out.println("digite su nombre");
        nombre = lector.next();
        System.out.println("digite su apellido");
        apellido = lector.next();
        lector.close();

    }

    public void mostrarPersona() {

        System.out.println("Su tipo de documento es: " + tipoDocumento);
        System.out.println("Su  documento es: " + documento);
        System.out.println("Su nombre: " + nombre);
        System.out.println("Su apellido es: " + apellido);

    }

}