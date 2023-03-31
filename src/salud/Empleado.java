package salud;

public class Empleado extends Persona {

    // ATRIBUTOS
    private String cargo;
    private double valorHora;
    private double horastrabajadas;
    private String departamento;

    /// metodos contructores
    public Empleado(String tipoDoc, int doc, String nom, String ape, double horast, double valorh, String car,
            String depa) {
        super(tipoDoc, doc, nom, ape);
        this.setCargo(car);
        this.setHorastrabajadas(horast);
        this.setValorHora(valorh);
        this.setDepartamento(depa);

    }

    // atributos getter y setter

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(double horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /// metodos

    public void calcularHonorarios() {
        double producto = 0;
        producto = valorHora * horastrabajadas - 0.966;
        System.out.println("Tus total a pagar es:" + producto);
        System.out.println("tipo documento: " + getTipoDocumento());
        System.out.println("documento: " + getDocumento());
        System.out.println("Nombre: " + getNombre());
        System.out.println("apellido: " + getApellido());
        System.out.println("Cargo : " + getCargo());
        System.out.println("horas trabajadas: " + getHorastrabajadas());
        System.out.println("valor por hora: " + getValorHora());
        System.out.println("total a pagar: " + producto);
    }
}
