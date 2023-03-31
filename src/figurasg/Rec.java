package figurasg;

import java.util.Scanner;

public class Rec extends Figura {
    ///atributos
    private double area;
    private double base;
    private double altura;


///metodos getter y setter
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calcularArea() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa la base del rectángulo: ");
        base = lector.nextDouble();
        System.out.println("Ingresa la altura del rectángulo: ");
        altura = lector.nextDouble();
     
        area = base * altura;
        System.out.println("El area del rectángulo rectángulo es:" + area);
    }
    
}
