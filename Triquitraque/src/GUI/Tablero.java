/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

/**
 *
 * @author keiver
 */
public class Tablero {

    private String[][] tablero;
    private PanelTablero_TriquiTraque panelTablero;
    private JLabel[] labelsCasillas;

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

    public void reiniciarJuego() {
        panelTablero.turnoJugador1 = true;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = null;
            }
        }
    }

    public void manejarFinDelJuego(String ganador) {

        if (ganador.equals(panelTablero.jugador1.getNombre())) {
            panelTablero.puntajeJugador1++;
        } else if (ganador.equals(panelTablero.jugador2.getNombre())) {
            panelTablero.puntajeJugador2++;
        }
        panelTablero.actualizarPuntaje();
    }

    public void crearTablero(int filas, int columnas, JPanel panel, Color colorJugador1, Color colorJugador2) {
        labelsCasillas = new JLabel[filas * columnas];
        panel.setLayout(new GridLayout(filas, columnas));

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                JLabel label = new JLabel("");
                label.setName("casilla_" + (i * columnas + j + 1));
                label.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                label.setHorizontalAlignment(SwingConstants.CENTER);
                label.setFont(new Font("Arial", Font.BOLD, 44));
                label.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        JLabel clickedLabel = (JLabel) e.getSource();
                        if (clickedLabel.getText().isEmpty()) {
                            clickedLabel.setText(panelTablero.turnoJugador1 ? "X" : "O");
                            clickedLabel.setForeground(panelTablero.turnoJugador1 ? colorJugador1 : colorJugador2);
                            panelTablero.turnoJugador1 = !panelTablero.turnoJugador1;

                            Timer timer = new Timer(25, new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    String[] parts = clickedLabel.getName().split("_");
                                    int casilla = Integer.parseInt(parts[1]);

                                    switch (filas) {
                                        case 3:
                                            finDelJuego3x3(casilla, clickedLabel.getText(), panelTablero.turnoJugador1, panelTablero.jugador1.getNombre(), panelTablero.jugador2.getNombre());
                                            break;
                                        case 4:
                                            finDelJuego4x4(casilla, clickedLabel.getText(), panelTablero.turnoJugador1, panelTablero.jugador1.getNombre(), panelTablero.jugador2.getNombre());
                                            break;
                                        case 5:
                                            finDelJuego5x5(casilla, clickedLabel.getText(), panelTablero.turnoJugador1, panelTablero.jugador1.getNombre(), panelTablero.jugador2.getNombre());
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            });
                            timer.setRepeats(false);
                            timer.start();
                        }
                    }
                });
                labelsCasillas[i * columnas + j] = label;
                panel.add(label);
            }
        }
    }

    public void limpiarTablero() {
        for (JLabel label : labelsCasillas) {
            label.setText("");
        }
    }

    public void limpiarPanel(JPanel panel) {
        panel.removeAll();
        panel.revalidate();
        panel.repaint();
    }

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

        if (hayGanador3x3(tablero)) {
            String nombreGanador = turno ? nombreJ2 : nombreJ1;
            JOptionPane.showMessageDialog(null, "¡El jugador " + nombreGanador + " es el ganador!", "Ganador", JOptionPane.WARNING_MESSAGE);
            manejarFinDelJuego(nombreGanador);
            Timer timer = new Timer(500, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    limpiarTablero();
                    reiniciarJuego();
                    panelTablero.turnoJugador1 = !turno;

                }
            });
            timer.setRepeats(false);
            timer.start();

            return;
        }

        boolean empate = true;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == null) {
                    empate = false;
                    break;
                }
            }
        }

        if (empate) {
            JOptionPane.showMessageDialog(null, "El juego ha terminado en empate, Se reiniciara el tablero", "Empate", JOptionPane.WARNING_MESSAGE);
            limpiarTablero();
            reiniciarJuego();

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
                tablero[0][0] = marca;
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
            manejarFinDelJuego(nombreGanador);
            Timer timer = new Timer(500, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    limpiarTablero();
                    reiniciarJuego();
                    panelTablero.turnoJugador1 = !turno;

                }
            });
            timer.setRepeats(false);
            timer.start();
        } else if (empate) {
            JOptionPane.showMessageDialog(null, "El juego ha terminado en empate", "Fin el juego", JOptionPane.WARNING_MESSAGE);
            limpiarTablero();
            reiniciarJuego();

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

    public void finDelJuego5x5(int casilla, String marca, Boolean turno, String nombreJ1, String nombreJ2) {
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
                tablero[0][3] = marca;
                break;
            case 5:
                tablero[0][4] = marca;
                break;
            case 6:
                tablero[1][0] = marca;
                break;
            case 7:
                tablero[1][1] = marca;
                break;
            case 8:
                tablero[1][2] = marca;
                break;
            case 9:
                tablero[1][3] = marca;
                break;
            case 10:
                tablero[1][4] = marca;
                break;
            case 11:
                tablero[2][0] = marca;
                break;
            case 12:
                tablero[2][1] = marca;
                break;
            case 13:
                tablero[2][2] = marca;
                break;
            case 14:
                tablero[2][3] = marca;
                break;
            case 15:
                tablero[2][4] = marca;
                break;
            case 16:
                tablero[3][0] = marca;
                break;
            case 17:
                tablero[3][1] = marca;
                break;
            case 18:
                tablero[3][2] = marca;
                break;
            case 19:
                tablero[3][3] = marca;
                break;
            case 20:
                tablero[3][4] = marca;
                break;
            case 21:
                tablero[4][0] = marca;
                break;
            case 22:
                tablero[4][1] = marca;
                break;
            case 23:
                tablero[4][2] = marca;
                break;
            case 24:
                tablero[4][3] = marca;
                break;
            case 25:
                tablero[4][4] = marca;
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
        if (hayGanador5x5(tablero)) {
            String nombreGanador = "";
            if (turno) {
                nombreGanador = nombreJ2;
            } else if (!turno) {
                nombreGanador = nombreJ1;
            }
            JOptionPane.showMessageDialog(null, "¡El jugador " + nombreGanador + " es el ganador!", "Ganador", JOptionPane.WARNING_MESSAGE);
            manejarFinDelJuego(nombreGanador);
            Timer timer = new Timer(500, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    limpiarTablero();
                    reiniciarJuego();
                    panelTablero.turnoJugador1 = !turno;

                }
            });
            timer.setRepeats(false);
            timer.start();
        } else if (empate) {
            JOptionPane.showMessageDialog(null, "El juego ha terminado en empate", "Fin el juego", JOptionPane.WARNING_MESSAGE);
            limpiarTablero();
            reiniciarJuego();
        }
    }

    public boolean hayGanador5x5(String[][] tablero) {

        for (int fila = 0; fila < 5; fila++) {
            if (tablero[fila][0] != null && tablero[fila][0].equals(tablero[fila][1]) && tablero[fila][0].equals(tablero[fila][2]) && tablero[fila][0].equals(tablero[fila][3]) && tablero[fila][0].equals(tablero[fila][4])) {
                return true;
            }
        }
        for (int columna = 0; columna < 5; columna++) {
            if (tablero[0][columna] != null && tablero[0][columna].equals(tablero[1][columna]) && tablero[0][columna].equals(tablero[2][columna]) && tablero[0][columna].equals(tablero[3][columna]) && tablero[0][columna].equals(tablero[4][columna])) {
                return true;
            }
        }
        if (tablero[0][0] != null && tablero[0][0].equals(tablero[1][1]) && tablero[0][0].equals(tablero[2][2]) && tablero[0][0].equals(tablero[3][3]) && tablero[0][0].equals(tablero[4][4])) {
            return true;
        }
        if (tablero[0][4] != null && tablero[0][4].equals(tablero[1][3]) && tablero[0][4].equals(tablero[2][2]) && tablero[0][4].equals(tablero[3][1]) && tablero[0][4].equals(tablero[4][0])) {
            return true;
        }
        return false;
    }

}
