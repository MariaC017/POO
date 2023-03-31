package juego;

import java.util.Scanner;
import java.util.Random;

public class JuegoPPaT {
    // ATRIBUTOS
    private int numJuegos;
    private int numJuegosGanados;
    private int numJuegosEmpatados;
    private int numJuegosPerdidos;
    private String nombreJugador;
  private int jugadajugador;

    // metodos constructores
  

    // METODOS DE ACCESO
    public int getNumJuegos() {
        return numJuegos;
    }
    public void setNumJuegos(int numJuegos) {
        this.numJuegos = numJuegos;
    }
    public int getNumJuegosGanados() {
        return numJuegosGanados;
    }
    public void setNumJuegosGanados(int numJuegosGanados) {
        this.numJuegosGanados = numJuegosGanados;
    }
    public int getNumJuegosEmpatados() {
        return numJuegosEmpatados;
    }
    public void setNumJuegosEmpatados(int numJuegosEmpatados) {
        this.numJuegosEmpatados = numJuegosEmpatados;
    }
    public int getNumJuegosPerdidos() {
        return numJuegosPerdidos;
    }
    public void setNumJuegosPerdidos(int numJuegosPerdidos) {
        this.numJuegosPerdidos = numJuegosPerdidos;
    }
    public String getNombreJugador() {
        return nombreJugador;
    }
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
    public int getjugadajugador() {
        return jugadajugador;
    }
    public void setjugadajugador(int jugadajugador) {
        this.jugadajugador = jugadajugador;
    }



    
    // metodos

    public void iniciar() {
        System.out.println("Estas en el juego de juego Piedra, Papel o Tijera");
        System.out.println("El jugador: " + nombreJugador);
        System.out.println("Digita la cantidad de número de juegos: " + numJuegos);
    }

    public void jugar() {
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i <= numJuegos; i++) {
            System.out.println("Juego #" + i);
            System.out.print("Elige tu jugada (1: Piedra, 2: Papel, 3: Tijera): ");
            this.setjugadajugador(lector.nextInt());

        

            // para determinar el ganador del juego
            //String resultadoJuego;//
           
      }
    }
      public void finalizar(){
        Random numaleatorio = new Random();
        int numero = numaleatorio.nextInt(3 + 1);
        if (jugadajugador == numero) {
            System.out.println ( "El juego quedo en empate");
            numJuegosEmpatados++;
        } else if ((jugadajugador == 1 && numero == 3) ||
                   (jugadajugador == 2 && numero == 1) ||
                   (jugadajugador == 3 && numero == 2)) {
                    System.out.println ( "Haz ganado!");
            numJuegosGanados++;
        } else {
            System.out.println ( "Haz perdido");
            numJuegosPerdidos++;
        }
        
      }

    public int getJugadajugador() {
        return jugadajugador;
    }

    public void setJugadajugador(int jugadajugador) {
        this.jugadajugador = jugadajugador;
    }

}

