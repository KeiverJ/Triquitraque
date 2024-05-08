/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author keiver
 */
public class Tablero {

    private String[][] tablero;

    private PanelTablero_TriquiTraque panelTablero;

    public Tablero() {
    }

    public Tablero(String[][] tablero, PanelTablero_TriquiTraque panelTablero) {
        this.tablero = tablero;
        this.panelTablero = panelTablero;
    }

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    Jugador jugador1 = new Jugador("", "X", Color.BLACK);
    Jugador jugador2 = new Jugador("", "O", Color.BLACK);

    public String colocarFicha(boolean turnoJugador) {
        String marca;
        if (turnoJugador) {
            marca = jugador1.getMarca();
        } else {
            marca = jugador2.getMarca();
        }
        return marca;
    }

    public void finDelJuego3x3(int casilla, String marca, Boolean turno, String nombreJ1, String nombreJ2) {
        boolean empate = true;
        switch (casilla) {
            case 1:
                tablero[0][0] = marca;
                break;
            case 2:
                tablero[0][1] = marca;
                break;
            case 3:
                tablero[0][2] = marca;
                break;
            case 4:
                tablero[1][0] = marca;
                break;
            case 5:
                tablero[1][1] = marca;
                break;
            case 6:
                tablero[1][2] = marca;
                break;
            case 7:
                tablero[2][0] = marca;
                break;
            case 8:
                tablero[2][1] = marca;
                break;
            case 9:
                tablero[2][2] = marca;
                break;
            default:
                System.out.println("Casilla inválida");
                break;
        }
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == null) {
                    empate = false;
                }
            }
        }
        if (hayGanador3x3(tablero)) {
            String nombreGanador = "";
            if (turno) {
                nombreGanador = nombreJ2;
            } else if (!turno) {
                nombreGanador = nombreJ1;
            }
            JOptionPane.showMessageDialog(null, "¡El jugador " + nombreGanador + " es el ganador!", "Ganador", JOptionPane.WARNING_MESSAGE);
        } else if (empate) {
            JOptionPane.showMessageDialog(null, "El juego ha terminado en empate", "Fin el juego", JOptionPane.WARNING_MESSAGE);
        }
    }

    public boolean hayGanador3x3(String[][] tablero) {
        for (int fila = 0; fila < 3; fila++) {
            if (tablero[fila][0] != null && tablero[fila][0].equals(tablero[fila][1]) && tablero[fila][0].equals(tablero[fila][2])) {
                return true;
            }
        }
        for (int columna = 0; columna < 3; columna++) {
            if (tablero[0][columna] != null && tablero[0][columna].equals(tablero[1][columna]) && tablero[0][columna].equals(tablero[2][columna])) {
                return true;
            }
        }
        if (tablero[0][0] != null && tablero[0][0].equals(tablero[1][1]) && tablero[0][0].equals(tablero[2][2])) {
            return true;
        }
        if (tablero[0][2] != null && tablero[0][2].equals(tablero[1][1]) && tablero[0][2].equals(tablero[2][0])) {
            return true;
        }
        return false;
    }

    public void finDelJuego4x4(int casilla, String marca, Boolean turno, String nombreJ1, String nombreJ2) {
        boolean empate = true;
        switch (casilla) {
            case 1:
  
                break;
            case 2:
                tablero[0][1] = marca;
                break;
            case 3:
                tablero[0][2] = marca;
                break;
            case 4:
                tablero[0][3] = marca;
                break;
            case 5:
                tablero[1][0] = marca;
                break;
            case 6:
                tablero[1][1] = marca;
                break;
            case 7:
                tablero[1][2] = marca;
                break;
            case 8:
                tablero[1][3] = marca;
                break;
            case 9:
                tablero[2][0] = marca;
                break;
            case 10:
                tablero[2][1] = marca;
                break;
            case 11:
                tablero[2][2] = marca;
                break;
            case 12:
                tablero[2][3] = marca;
                break;
            case 13:
                tablero[3][0] = marca;
                break;
            case 14:
                tablero[3][1] = marca;
                break;
            case 15:
                tablero[3][2] = marca;
                break;
            case 16:
                tablero[3][3] = marca;
                break;
            default:
                System.out.println("Casilla inválida");
                break;
        }
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == null) {
                    empate = false;
                }
            }
        }
        if (hayGanador4x4(tablero)) {
            String nombreGanador = "";
            if (turno) {
                nombreGanador = nombreJ2;
            } else if (!turno) {
                nombreGanador = nombreJ1;
            }
            JOptionPane.showMessageDialog(null, "¡El jugador " + nombreGanador + " es el ganador!", "Ganador", JOptionPane.WARNING_MESSAGE);
        } else if (empate) {
            JOptionPane.showMessageDialog(null, "El juego ha terminado en empate", "Fin el juego", JOptionPane.WARNING_MESSAGE);
        }
    }

    public boolean hayGanador4x4(String[][] tablero) {
        for (int fila = 0; fila < 3; fila++) {
            if (tablero[fila][0] != null && tablero[fila][0].equals(tablero[fila][1]) && tablero[fila][0].equals(tablero[fila][2]) && tablero[fila][0].equals(tablero[fila][3])) {
                return true;
            }
        }
        for (int columna = 0; columna < 3; columna++) {
            if (tablero[0][columna] != null && tablero[0][columna].equals(tablero[1][columna]) && tablero[0][columna].equals(tablero[2][columna]) && tablero[0][columna].equals(tablero[3][columna])) {
                return true;
            }
        }
        if (tablero[0][0] != null && tablero[0][0].equals(tablero[1][1]) && tablero[0][0].equals(tablero[2][2]) && tablero[0][0].equals(tablero[3][3])) {
            return true;
        }
        if (tablero[0][3] != null && tablero[0][3].equals(tablero[1][2]) && tablero[0][3].equals(tablero[2][1]) && tablero[0][3].equals(tablero[3][0])) {
            return true;
        }
        return false;
    }


}
