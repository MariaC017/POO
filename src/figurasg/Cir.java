package figurasg;

import java.util.Scanner;

public class Cir extends Figura{
    
private double radio;
private double area;



///metodos getter y setter
public double getArea() {
    return area;
}

public void setArea(double area) {
    this.area = area;
}

public double getRadio() {
    return radio;
}

public void setRadio(double radio) {
    this.radio = radio;
}

public void calcularArea(){

Scanner lector = new Scanner(System.in);
System.out.println("Ingrese el radio del círculo: ");
radio=lector.nextDouble();
area= Math.PI*(radio*radio);
System.out.println("El area del círculo es: "+area);


}

}
    
