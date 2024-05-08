/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author keive
 */
public class Tablero {

    private String[][] tablero;
    private PanelTablero_TriquiTraque panelTablero;

    public Tablero() {
    }

    public Tablero(String[][] tablero, PanelTablero_TriquiTraque panelTablero) {
        this.tablero = new String[3][3];
        this.panelTablero = panelTablero;
    }

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    Jugador jugador = new Jugador();
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

    public void finDelJuego(int casilla, String marca, Boolean turno, String nombreJ1, String nombreJ2) {
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

        if (hayGanador(tablero)) {
            String nombreGanador = "";
            if (turno) {
                nombreGanador = nombreJ2;
            } else if (!turno) {
                nombreGanador = nombreJ1;
            }
            JOptionPane.showMessageDialog(null, "¡El jugador " + nombreGanador + " es el ganador!", "Ganador", JOptionPane.WARNING_MESSAGE);
            panelTablero.manejarFinDelJuego(nombreGanador);
        } else if (empate) {
            JOptionPane.showMessageDialog(null, "El juego ha terminado en empate", "Fin el juego", JOptionPane.WARNING_MESSAGE);
        }
    }

    public boolean hayGanador(String[][] tablero) {
        int filas = tablero.length;
        int columnas = tablero[0].length;

        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas - 2; columna++) {
                if (tablero[fila][columna] != null
                        && tablero[fila][columna].equals(tablero[fila][columna + 1])
                        && tablero[fila][columna].equals(tablero[fila][columna + 2])) {
                    return true;
                }
            }
        }
        for (int columna = 0; columna < columnas; columna++) {
            for (int fila = 0; fila < filas - 2; fila++) {
                if (tablero[fila][columna] != null
                        && tablero[fila][columna].equals(tablero[fila + 1][columna])
                        && tablero[fila][columna].equals(tablero[fila + 2][columna])) {
                    return true;
                }
            }
        }

        for (int fila = 0; fila < filas - 2; fila++) {
            for (int columna = 0; columna < columnas - 2; columna++) {
                if (tablero[fila][columna] != null
                        && tablero[fila][columna].equals(tablero[fila + 1][columna + 1])
                        && tablero[fila][columna].equals(tablero[fila + 2][columna + 2])) {
                    return true;
                }
                if (tablero[fila][columna + 2] != null
                        && tablero[fila][columna + 2].equals(tablero[fila + 1][columna + 1])
                        && tablero[fila][columna + 2].equals(tablero[fila + 2][columna])) {
                    return true;
                }
            }
        }

        return false;
    }
}
