package figurasg;

import java.util.Scanner;

public class Trian extends Figura {
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
            System.out.println("Ingrese la base del triángulo: ");
            base = lector.nextDouble();
            System.out.println("Ingrese la altura del triángulo: ");
            altura = lector.nextDouble();
          
            area = base * altura / 2;
            System.out.println("El area del triángulo es: "+area);
        }


}
