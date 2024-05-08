package GUI;

import java.awt.Color;
import GUI.Jugador;

public class PanelTablero_TriquiTraque extends javax.swing.JFrame {

    Jugador jugador1 = new Jugador("", "X", Color.BLACK);
    Jugador jugador2 = new Jugador("", "O", Color.BLACK);
    int puntajeJugador1 = 0;
    int puntajeJugador2 = 0;

    String[][] matriz3x3 = new String[3][3];
    String[][] matriz4x4 = new String[4][4];
    String[][] matriz5x5 = new String[5][5];

    Tablero tablero3x3 = new Tablero(matriz3x3, this);
    Tablero tablero4x4 = new Tablero(matriz4x4, this);
    Tablero tablero5x5 = new Tablero(matriz5x5, this);
    int casilla = 0;
    boolean turnoJugador1 = true;

    public PanelTablero_TriquiTraque(Jugador jugador1, Jugador jugador2, int tamañoTablero) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        panelFondo.setOpaque(false);
        setBackground(new Color(0, 0, 0, 0));

        lblNombreJ1.setText(jugador1.getNombre());
        lblNombreJ2.setText(jugador2.getNombre());

        init(tamañoTablero);
    }

    public void init(int tamañoTablero) {
        switch (tamañoTablero) {
            case 3:
                jTabbedPane1.setSelectedIndex(0);
                break;
            case 4:
                jTabbedPane1.setSelectedIndex(1);
                break;
            case 5:
                jTabbedPane1.setSelectedIndex(2);
                break;
            default:
                break;
        }
    }

    private void actualizarPuntaje() {
        lblPuntajeJ1.setText(Integer.toString(puntajeJugador1));
        lblPuntajeJ2.setText(Integer.toString(puntajeJugador2));
    }

    void manejarFinDelJuego(String ganador) {
        if (ganador.equals(jugador1.getNombre())) {
            puntajeJugador1++;
        } else if (ganador.equals(jugador2.getNombre())) {
            puntajeJugador2++;
        }
        actualizarPuntaje();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new diseño.PanelRedondeado();
        lblNombreJ2 = new javax.swing.JLabel();
        lblPuntajeJ2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblPuntajeJ1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNombreJ1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCierre = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3x3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jl1 = new javax.swing.JLabel();
        jl2 = new javax.swing.JLabel();
        jl3 = new javax.swing.JLabel();
        jl4 = new javax.swing.JLabel();
        jl5 = new javax.swing.JLabel();
        jl6 = new javax.swing.JLabel();
        jl7 = new javax.swing.JLabel();
        jl8 = new javax.swing.JLabel();
        jl9 = new javax.swing.JLabel();
        jPanel4x4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jl10 = new javax.swing.JLabel();
        jl11 = new javax.swing.JLabel();
        jl12 = new javax.swing.JLabel();
        jl13 = new javax.swing.JLabel();
        jl14 = new javax.swing.JLabel();
        jl15 = new javax.swing.JLabel();
        jl16 = new javax.swing.JLabel();
        jl17 = new javax.swing.JLabel();
        jl18 = new javax.swing.JLabel();
        jl19 = new javax.swing.JLabel();
        jl20 = new javax.swing.JLabel();
        jl21 = new javax.swing.JLabel();
        jl22 = new javax.swing.JLabel();
        jl23 = new javax.swing.JLabel();
        jl24 = new javax.swing.JLabel();
        jl25 = new javax.swing.JLabel();
        jPanel5x5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(240, 232, 216));
        panelFondo.setPreferredSize(new java.awt.Dimension(400, 500));
        panelFondo.setLayout(null);

        lblNombreJ2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblNombreJ2.setForeground(new java.awt.Color(255, 170, 92));
        lblNombreJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJ2.setText("NAME");
        panelFondo.add(lblNombreJ2);
        lblNombreJ2.setBounds(270, 100, 100, 40);

        lblPuntajeJ2.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        lblPuntajeJ2.setForeground(new java.awt.Color(245, 209, 153));
        lblPuntajeJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJ2.setText("0");
        panelFondo.add(lblPuntajeJ2);
        lblPuntajeJ2.setBounds(230, 50, 60, 60);

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(245, 209, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("-");
        panelFondo.add(jLabel8);
        jLabel8.setBounds(210, 50, 20, 60);

        lblPuntajeJ1.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        lblPuntajeJ1.setForeground(new java.awt.Color(245, 209, 153));
        lblPuntajeJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJ1.setText("0");
        panelFondo.add(lblPuntajeJ1);
        lblPuntajeJ1.setBounds(150, 50, 60, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/iconopersona.png"))); // NOI18N
        panelFondo.add(jLabel1);
        jLabel1.setBounds(300, 50, 50, 60);

        lblNombreJ1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblNombreJ1.setForeground(new java.awt.Color(124, 195, 236));
        lblNombreJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJ1.setText("NAME");
        panelFondo.add(lblNombreJ1);
        lblNombreJ1.setBounds(70, 100, 100, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/iconopersona.png"))); // NOI18N
        panelFondo.add(jLabel2);
        jLabel2.setBounds(110, 50, 40, 60);

        jPanel2.setBackground(new java.awt.Color(240, 232, 216));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCierre.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(0, 0, 0));
        lblCierre.setText("X");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });
        jPanel2.add(lblCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 30, -1));

        panelFondo.add(jPanel2);
        jPanel2.setBounds(10, 20, 410, 180);

        jTabbedPane1.setBackground(new java.awt.Color(240, 232, 216));

        jPanel3x3.setBackground(new java.awt.Color(240, 232, 216));

        jPanel4.setBackground(new java.awt.Color(51, 0, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setPreferredSize(new java.awt.Dimension(220, 220));

        jl1.setBackground(new java.awt.Color(255, 255, 255));
        jl1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl1.setForeground(new java.awt.Color(51, 51, 51));
        jl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl1.setMaximumSize(new java.awt.Dimension(55, 55));
        jl1.setMinimumSize(new java.awt.Dimension(55, 55));
        jl1.setOpaque(true);
        jl1.setPreferredSize(new java.awt.Dimension(55, 55));
        jl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl1MousePressed(evt);
            }
        });

        jl2.setBackground(new java.awt.Color(255, 255, 255));
        jl2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl2.setForeground(new java.awt.Color(51, 51, 51));
        jl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl2.setMaximumSize(new java.awt.Dimension(55, 55));
        jl2.setMinimumSize(new java.awt.Dimension(55, 55));
        jl2.setOpaque(true);
        jl2.setPreferredSize(new java.awt.Dimension(55, 55));
        jl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl2MousePressed(evt);
            }
        });

        jl3.setBackground(new java.awt.Color(255, 255, 255));
        jl3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl3.setForeground(new java.awt.Color(51, 51, 51));
        jl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl3.setMaximumSize(new java.awt.Dimension(55, 55));
        jl3.setMinimumSize(new java.awt.Dimension(55, 55));
        jl3.setOpaque(true);
        jl3.setPreferredSize(new java.awt.Dimension(55, 55));
        jl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl3MousePressed(evt);
            }
        });

        jl4.setBackground(new java.awt.Color(255, 255, 255));
        jl4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl4.setForeground(new java.awt.Color(51, 51, 51));
        jl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl4.setMaximumSize(new java.awt.Dimension(55, 55));
        jl4.setMinimumSize(new java.awt.Dimension(55, 55));
        jl4.setOpaque(true);
        jl4.setPreferredSize(new java.awt.Dimension(55, 55));
        jl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl4MousePressed(evt);
            }
        });

        jl5.setBackground(new java.awt.Color(255, 255, 255));
        jl5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl5.setForeground(new java.awt.Color(51, 51, 51));
        jl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl5.setMaximumSize(new java.awt.Dimension(55, 55));
        jl5.setMinimumSize(new java.awt.Dimension(55, 55));
        jl5.setOpaque(true);
        jl5.setPreferredSize(new java.awt.Dimension(55, 55));
        jl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl5MousePressed(evt);
            }
        });

        jl6.setBackground(new java.awt.Color(255, 255, 255));
        jl6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl6.setForeground(new java.awt.Color(51, 51, 51));
        jl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl6.setMaximumSize(new java.awt.Dimension(55, 55));
        jl6.setMinimumSize(new java.awt.Dimension(55, 55));
        jl6.setOpaque(true);
        jl6.setPreferredSize(new java.awt.Dimension(55, 55));
        jl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl6MousePressed(evt);
            }
        });

        jl7.setBackground(new java.awt.Color(255, 255, 255));
        jl7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl7.setForeground(new java.awt.Color(51, 51, 51));
        jl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl7.setMaximumSize(new java.awt.Dimension(55, 55));
        jl7.setMinimumSize(new java.awt.Dimension(55, 55));
        jl7.setOpaque(true);
        jl7.setPreferredSize(new java.awt.Dimension(55, 55));
        jl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl7MousePressed(evt);
            }
        });

        jl8.setBackground(new java.awt.Color(255, 255, 255));
        jl8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl8.setForeground(new java.awt.Color(51, 51, 51));
        jl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl8.setMaximumSize(new java.awt.Dimension(55, 55));
        jl8.setMinimumSize(new java.awt.Dimension(55, 55));
        jl8.setOpaque(true);
        jl8.setPreferredSize(new java.awt.Dimension(55, 55));
        jl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl8MousePressed(evt);
            }
        });

        jl9.setBackground(new java.awt.Color(255, 255, 255));
        jl9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl9.setForeground(new java.awt.Color(51, 51, 51));
        jl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl9.setMaximumSize(new java.awt.Dimension(55, 55));
        jl9.setMinimumSize(new java.awt.Dimension(55, 55));
        jl9.setOpaque(true);
        jl9.setPreferredSize(new java.awt.Dimension(55, 55));
        jl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jl7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel3x3Layout = new javax.swing.GroupLayout(jPanel3x3);
        jPanel3x3.setLayout(jPanel3x3Layout);
        jPanel3x3Layout.setHorizontalGroup(
            jPanel3x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(jPanel3x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3x3Layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(105, Short.MAX_VALUE)))
        );
        jPanel3x3Layout.setVerticalGroup(
            jPanel3x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
            .addGroup(jPanel3x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3x3Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(97, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("", jPanel3x3);

        jPanel4x4.setBackground(new java.awt.Color(240, 232, 216));

        jPanel7.setBackground(new java.awt.Color(51, 0, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setPreferredSize(new java.awt.Dimension(220, 220));

        jl10.setBackground(new java.awt.Color(255, 255, 255));
        jl10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl10.setForeground(new java.awt.Color(0, 0, 0));
        jl10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl10.setMaximumSize(new java.awt.Dimension(55, 55));
        jl10.setMinimumSize(new java.awt.Dimension(55, 55));
        jl10.setOpaque(true);
        jl10.setPreferredSize(new java.awt.Dimension(55, 55));
        jl10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl10MousePressed(evt);
            }
        });

        jl11.setBackground(new java.awt.Color(255, 255, 255));
        jl11.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl11.setForeground(new java.awt.Color(0, 0, 0));
        jl11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl11.setMaximumSize(new java.awt.Dimension(55, 55));
        jl11.setMinimumSize(new java.awt.Dimension(55, 55));
        jl11.setOpaque(true);
        jl11.setPreferredSize(new java.awt.Dimension(55, 55));
        jl11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl11MousePressed(evt);
            }
        });

        jl12.setBackground(new java.awt.Color(255, 255, 255));
        jl12.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl12.setForeground(new java.awt.Color(0, 0, 0));
        jl12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl12.setMaximumSize(new java.awt.Dimension(55, 55));
        jl12.setMinimumSize(new java.awt.Dimension(55, 55));
        jl12.setOpaque(true);
        jl12.setPreferredSize(new java.awt.Dimension(55, 55));
        jl12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl12MousePressed(evt);
            }
        });

        jl13.setBackground(new java.awt.Color(255, 255, 255));
        jl13.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl13.setForeground(new java.awt.Color(0, 0, 0));
        jl13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl13.setMaximumSize(new java.awt.Dimension(55, 55));
        jl13.setMinimumSize(new java.awt.Dimension(55, 55));
        jl13.setOpaque(true);
        jl13.setPreferredSize(new java.awt.Dimension(55, 55));
        jl13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl13MousePressed(evt);
            }
        });

        jl14.setBackground(new java.awt.Color(255, 255, 255));
        jl14.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl14.setForeground(new java.awt.Color(0, 0, 0));
        jl14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl14.setMaximumSize(new java.awt.Dimension(55, 55));
        jl14.setMinimumSize(new java.awt.Dimension(55, 55));
        jl14.setOpaque(true);
        jl14.setPreferredSize(new java.awt.Dimension(55, 55));
        jl14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl14MousePressed(evt);
            }
        });

        jl15.setBackground(new java.awt.Color(255, 255, 255));
        jl15.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl15.setForeground(new java.awt.Color(0, 0, 0));
        jl15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl15.setMaximumSize(new java.awt.Dimension(55, 55));
        jl15.setMinimumSize(new java.awt.Dimension(55, 55));
        jl15.setOpaque(true);
        jl15.setPreferredSize(new java.awt.Dimension(55, 55));
        jl15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl15MousePressed(evt);
            }
        });

        jl16.setBackground(new java.awt.Color(255, 255, 255));
        jl16.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl16.setForeground(new java.awt.Color(0, 0, 0));
        jl16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl16.setMaximumSize(new java.awt.Dimension(55, 55));
        jl16.setMinimumSize(new java.awt.Dimension(55, 55));
        jl16.setOpaque(true);
        jl16.setPreferredSize(new java.awt.Dimension(55, 55));
        jl16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl16MousePressed(evt);
            }
        });

        jl17.setBackground(new java.awt.Color(255, 255, 255));
        jl17.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl17.setForeground(new java.awt.Color(0, 0, 0));
        jl17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl17.setMaximumSize(new java.awt.Dimension(55, 55));
        jl17.setMinimumSize(new java.awt.Dimension(55, 55));
        jl17.setOpaque(true);
        jl17.setPreferredSize(new java.awt.Dimension(55, 55));
        jl17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl17MousePressed(evt);
            }
        });

        jl18.setBackground(new java.awt.Color(255, 255, 255));
        jl18.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl18.setForeground(new java.awt.Color(0, 0, 0));
        jl18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl18.setMaximumSize(new java.awt.Dimension(55, 55));
        jl18.setMinimumSize(new java.awt.Dimension(55, 55));
        jl18.setOpaque(true);
        jl18.setPreferredSize(new java.awt.Dimension(55, 55));
        jl18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl18MousePressed(evt);
            }
        });

        jl19.setBackground(new java.awt.Color(255, 255, 255));
        jl19.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl19.setForeground(new java.awt.Color(0, 0, 0));
        jl19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl19.setMaximumSize(new java.awt.Dimension(55, 55));
        jl19.setMinimumSize(new java.awt.Dimension(55, 55));
        jl19.setOpaque(true);
        jl19.setPreferredSize(new java.awt.Dimension(55, 55));
        jl19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl19MousePressed(evt);
            }
        });

        jl20.setBackground(new java.awt.Color(255, 255, 255));
        jl20.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl20.setForeground(new java.awt.Color(0, 0, 0));
        jl20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl20.setMaximumSize(new java.awt.Dimension(55, 55));
        jl20.setMinimumSize(new java.awt.Dimension(55, 55));
        jl20.setOpaque(true);
        jl20.setPreferredSize(new java.awt.Dimension(55, 55));
        jl20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl20MousePressed(evt);
            }
        });

        jl21.setBackground(new java.awt.Color(255, 255, 255));
        jl21.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl21.setForeground(new java.awt.Color(0, 0, 0));
        jl21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl21.setMaximumSize(new java.awt.Dimension(55, 55));
        jl21.setMinimumSize(new java.awt.Dimension(55, 55));
        jl21.setOpaque(true);
        jl21.setPreferredSize(new java.awt.Dimension(55, 55));
        jl21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl21MousePressed(evt);
            }
        });

        jl22.setBackground(new java.awt.Color(255, 255, 255));
        jl22.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl22.setForeground(new java.awt.Color(0, 0, 0));
        jl22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl22.setMaximumSize(new java.awt.Dimension(55, 55));
        jl22.setMinimumSize(new java.awt.Dimension(55, 55));
        jl22.setOpaque(true);
        jl22.setPreferredSize(new java.awt.Dimension(55, 55));
        jl22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl22MousePressed(evt);
            }
        });

        jl23.setBackground(new java.awt.Color(255, 255, 255));
        jl23.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl23.setForeground(new java.awt.Color(0, 0, 0));
        jl23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl23.setMaximumSize(new java.awt.Dimension(55, 55));
        jl23.setMinimumSize(new java.awt.Dimension(55, 55));
        jl23.setOpaque(true);
        jl23.setPreferredSize(new java.awt.Dimension(55, 55));
        jl23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl23MousePressed(evt);
            }
        });

        jl24.setBackground(new java.awt.Color(255, 255, 255));
        jl24.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl24.setForeground(new java.awt.Color(0, 0, 0));
        jl24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl24.setMaximumSize(new java.awt.Dimension(55, 55));
        jl24.setMinimumSize(new java.awt.Dimension(55, 55));
        jl24.setOpaque(true);
        jl24.setPreferredSize(new java.awt.Dimension(55, 55));
        jl24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl24MousePressed(evt);
            }
        });

        jl25.setBackground(new java.awt.Color(255, 255, 255));
        jl25.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jl25.setForeground(new java.awt.Color(0, 0, 0));
        jl25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl25.setMaximumSize(new java.awt.Dimension(55, 55));
        jl25.setMinimumSize(new java.awt.Dimension(55, 55));
        jl25.setOpaque(true);
        jl25.setPreferredSize(new java.awt.Dimension(55, 55));
        jl25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl25MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jl10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jl13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jl16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jl19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jl24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jl10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jl20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jl13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jl25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4x4Layout = new javax.swing.GroupLayout(jPanel4x4);
        jPanel4x4.setLayout(jPanel4x4Layout);
        jPanel4x4Layout.setHorizontalGroup(
            jPanel4x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(jPanel4x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4x4Layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(76, Short.MAX_VALUE)))
        );
        jPanel4x4Layout.setVerticalGroup(
            jPanel4x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
            .addGroup(jPanel4x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4x4Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(44, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("", jPanel4x4);

        jPanel5x5.setBackground(new java.awt.Color(240, 232, 216));

        javax.swing.GroupLayout jPanel5x5Layout = new javax.swing.GroupLayout(jPanel5x5);
        jPanel5x5.setLayout(jPanel5x5Layout);
        jPanel5x5Layout.setHorizontalGroup(
            jPanel5x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel5x5Layout.setVerticalGroup(
            jPanel5x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("", jPanel5x5);

        panelFondo.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 190, 410, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED);
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(240, 192, 255));
    }//GEN-LAST:event_lblCierreMouseExited

    private void jl1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl1MousePressed
        boolean uno = true;

        if (jl1.getText().isEmpty()) {
            if (turnoJugador1) {
                jl1.setText(tablero3x3.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl1);
                turnoJugador1 = false;
            } else {
                jl1.setText(tablero3x3.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl1);
                turnoJugador1 = true;
            }
        }

        casilla = 1;
        String marca = jl1.getText();

        tablero3x3.finDelJuego3x3(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());
    }//GEN-LAST:event_jl1MousePressed

    private void jl2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl2MousePressed

        if (jl2.getText().isEmpty()) {

            if (turnoJugador1) {

                jl2.setText(tablero3x3.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl2);
                turnoJugador1 = false;

            } else {

                jl2.setText(tablero3x3.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl2);
                turnoJugador1 = true;

            }

        }

        casilla = 2;
        String marca = jl2.getText();

        tablero3x3.finDelJuego3x3(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());

    }//GEN-LAST:event_jl2MousePressed

    private void jl3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl3MousePressed

        if (jl3.getText().isEmpty()) {

            if (turnoJugador1) {

                jl3.setText(tablero3x3.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl3);
                turnoJugador1 = false;

            } else {

                jl3.setText(tablero3x3.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ1.getText(), lblNombreJ1, jl3);
                turnoJugador1 = true;

            }

        }

        casilla = 3;
        String marca = jl3.getText();

        tablero3x3.finDelJuego3x3(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());

    }//GEN-LAST:event_jl3MousePressed

    private void jl4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl4MousePressed

        boolean cuatro = true;

        if (jl4.getText().isEmpty()) {

            if (turnoJugador1) {

                jl4.setText(tablero3x3.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl4);
                turnoJugador1 = false;

            } else {

                jl4.setText(tablero3x3.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl4);
                turnoJugador1 = true;

            }

        }

        casilla = 4;
        String marca = jl4.getText();

        tablero3x3.finDelJuego3x3(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());

    }//GEN-LAST:event_jl4MousePressed

    private void jl5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl5MousePressed

        if (jl5.getText().isEmpty()) {

            if (turnoJugador1) {

                jl5.setText(tablero3x3.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl5);
                turnoJugador1 = false;

            } else {

                jl5.setText(tablero3x3.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl5);
                turnoJugador1 = true;

            }

        }

        casilla = 5;
        String marca = jl5.getText();

        tablero3x3.finDelJuego3x3(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());

    }//GEN-LAST:event_jl5MousePressed

    private void jl6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl6MousePressed

        if (jl6.getText().isEmpty()) {

            if (turnoJugador1) {

                jl6.setText(tablero3x3.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ2, jl6);
                turnoJugador1 = false;

            } else {

                jl6.setText(tablero3x3.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl6);
                turnoJugador1 = true;

            }

        }

        casilla = 6;
        String marca = jl6.getText();

        tablero3x3.finDelJuego3x3(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());

    }//GEN-LAST:event_jl6MousePressed

    private void jl7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl7MousePressed

        if (jl7.getText().isEmpty()) {

            if (turnoJugador1) {

                jl7.setText(tablero3x3.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ2, jl7);
                turnoJugador1 = false;

            } else {

                jl7.setText(tablero3x3.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl7);
                turnoJugador1 = true;

            }

        }

        casilla = 7;
        String marca = jl7.getText();

        tablero3x3.finDelJuego3x3(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());

    }//GEN-LAST:event_jl7MousePressed

    private void jl8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl8MousePressed

        if (jl8.getText().isEmpty()) {

            if (turnoJugador1) {

                jl8.setText(tablero3x3.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ2, jl8);
                turnoJugador1 = false;

            } else {

                jl8.setText(tablero3x3.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl8);
                turnoJugador1 = true;

            }

        }

        casilla = 8;
        String marca = jl8.getText();

        tablero3x3.finDelJuego3x3(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());

    }//GEN-LAST:event_jl8MousePressed

    private void jl9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl9MousePressed

        if (jl9.getText().isEmpty()) {

            if (turnoJugador1) {

                jl9.setText(tablero3x3.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl9);
                turnoJugador1 = false;

            } else {

                jl9.setText(tablero3x3.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl9);
                turnoJugador1 = true;

            }

        }

        casilla = 9;
        String marca = jl9.getText();

        tablero3x3.finDelJuego3x3(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());

    }//GEN-LAST:event_jl9MousePressed

    private void jl10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl10MousePressed

        if (jl10.getText().isEmpty()) {

            if (turnoJugador1) {

                jl10.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl10);
                turnoJugador1 = false;

            } else {

                jl10.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl10);
                turnoJugador1 = true;

            }

        }

        casilla = 1;
        String marca = jl10.getText();
        tablero4x4.finDelJuego4x4(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());


    }//GEN-LAST:event_jl10MousePressed

    private void jl11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl11MousePressed

        if (jl11.getText().isEmpty()) {

            if (turnoJugador1) {

                jl11.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl11);
                turnoJugador1 = false;

            } else {

                jl11.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl11);
                turnoJugador1 = true;

            }

        }

        casilla = 2;
        String marca = jl11.getText();
        tablero4x4.finDelJuego4x4(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());
    }//GEN-LAST:event_jl11MousePressed

    private void jl12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl12MousePressed

        if (jl12.getText().isEmpty()) {

            if (turnoJugador1) {

                jl12.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl12);
                turnoJugador1 = false;

            } else {

                jl12.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl12);
                turnoJugador1 = true;

            }

        }

        casilla = 3;
        String marca = jl12.getText();
        tablero4x4.finDelJuego4x4(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());
    }//GEN-LAST:event_jl12MousePressed

    private void jl13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl13MousePressed

        if (jl13.getText().isEmpty()) {

            if (turnoJugador1) {

                jl13.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl12);
                turnoJugador1 = false;

            } else {

                jl13.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl12);
                turnoJugador1 = true;

            }

        }

        casilla = 4;
        String marca = jl13.getText();
        tablero4x4.finDelJuego4x4(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());

    }//GEN-LAST:event_jl13MousePressed

    private void jl15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl15MousePressed

        if (jl15.getText().isEmpty()) {

            if (turnoJugador1) {

                jl15.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl12);
                turnoJugador1 = false;

            } else {

                jl15.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl12);
                turnoJugador1 = true;

            }

        }
        casilla = 6;
        String marca = jl15.getText();
        tablero4x4.finDelJuego4x4(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());
    }//GEN-LAST:event_jl15MousePressed

    private void jl16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl16MousePressed

        if (jl16.getText().isEmpty()) {

            if (turnoJugador1) {

                jl16.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl12);
                turnoJugador1 = false;

            } else {

                jl16.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl12);
                turnoJugador1 = true;

            }

        }

        casilla = 7;
        String marca = jl16.getText();
        tablero4x4.finDelJuego4x4(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());
    }//GEN-LAST:event_jl16MousePressed

    private void jl17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl17MousePressed

        if (jl17.getText().isEmpty()) {

            if (turnoJugador1) {

                jl17.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl12);
                turnoJugador1 = false;

            } else {

                jl17.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl12);
                turnoJugador1 = true;

            }

        }

        casilla = 8;
        String marca = jl17.getText();
        tablero4x4.finDelJuego4x4(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());
    }//GEN-LAST:event_jl17MousePressed

    private void jl18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl18MousePressed

        if (jl18.getText().isEmpty()) {

            if (turnoJugador1) {

                jl18.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl12);
                turnoJugador1 = false;

            } else {

                jl18.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl12);
                turnoJugador1 = true;

            }
        }

        casilla = 9;
        String marca = jl18.getText();
        tablero4x4.finDelJuego4x4(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());
    }//GEN-LAST:event_jl18MousePressed

    private void jl19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl19MousePressed

        if (jl19.getText().isEmpty()) {

            if (turnoJugador1) {

                jl19.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl12);
                turnoJugador1 = false;

            } else {

                jl19.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl12);
                turnoJugador1 = true;

            }

        }

        casilla = 10;
        String marca = jl19.getText();
        tablero4x4.finDelJuego4x4(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());
    }//GEN-LAST:event_jl19MousePressed

    private void jl20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl20MousePressed
        if (jl20.getText().isEmpty()) {

            if (turnoJugador1) {

                jl20.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl12);
                turnoJugador1 = false;

            } else {

                jl20.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl12);
                turnoJugador1 = true;

            }

        }

        casilla = 11;
        String marca = jl20.getText();
        tablero4x4.finDelJuego4x4(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());
    }//GEN-LAST:event_jl20MousePressed

    private void jl21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl21MousePressed
        if (jl21.getText().isEmpty()) {

            if (turnoJugador1) {

                jl21.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl12);
                turnoJugador1 = false;

            } else {

                jl21.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl12);
                turnoJugador1 = true;

            }

        }

        casilla = 12;
        String marca = jl21.getText();
        tablero4x4.finDelJuego4x4(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());
    }//GEN-LAST:event_jl21MousePressed

    private void jl22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl22MousePressed
        if (jl22.getText().isEmpty()) {

            if (turnoJugador1) {

                jl22.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl12);
                turnoJugador1 = false;

            } else {

                jl22.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl12);
                turnoJugador1 = true;

            }

        }

        casilla = 13;
        String marca = jl12.getText();
        tablero4x4.finDelJuego4x4(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());
    }//GEN-LAST:event_jl22MousePressed

    private void jl23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl23MousePressed
        if (jl23.getText().isEmpty()) {

            if (turnoJugador1) {

                jl23.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl12);
                turnoJugador1 = false;

            } else {

                jl23.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl12);
                turnoJugador1 = true;

            }

        }

        casilla = 14;
        String marca = jl23.getText();
        tablero4x4.finDelJuego4x4(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());
    }//GEN-LAST:event_jl23MousePressed

    private void jl24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl24MousePressed
        if (jl24.getText().isEmpty()) {

            if (turnoJugador1) {

                jl24.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl12);
                turnoJugador1 = false;

            } else {

                jl24.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl12);
                turnoJugador1 = true;

            }

        }

        casilla = 15;
        String marca = jl24.getText();
        tablero4x4.finDelJuego4x4(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());
    }//GEN-LAST:event_jl24MousePressed

    private void jl25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl25MousePressed
        if (jl25.getText().isEmpty()) {

            if (turnoJugador1) {

                jl25.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl12);
                turnoJugador1 = false;

            } else {

                jl25.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl12);
                turnoJugador1 = true;

            }

        }

        casilla = 16;
        String marca = jl25.getText();
        tablero4x4.finDelJuego4x4(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());
    }//GEN-LAST:event_jl25MousePressed

    private void jl14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl14MousePressed

        if (jl14.getText().isEmpty()) {

            if (turnoJugador1) {

                jl14.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador1.configurarJugador(jugador1, lblNombreJ1.getText(), lblNombreJ1, jl12);
                turnoJugador1 = false;

            } else {

                jl14.setText(tablero4x4.colocarFicha(turnoJugador1));
                jugador2.configurarJugador(jugador2, lblNombreJ2.getText(), lblNombreJ2, jl12);
                turnoJugador1 = true;

            }
        }

        casilla = 13;
        String marca = jl14.getText();
        tablero4x4.finDelJuego4x4(casilla, marca, turnoJugador1, jugador1.getNombre(), jugador2.getNombre());
    }//GEN-LAST:event_jl14MousePressed

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3x3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel4x4;
    private javax.swing.JPanel jPanel5x5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl10;
    private javax.swing.JLabel jl11;
    private javax.swing.JLabel jl12;
    private javax.swing.JLabel jl13;
    private javax.swing.JLabel jl14;
    private javax.swing.JLabel jl15;
    private javax.swing.JLabel jl16;
    private javax.swing.JLabel jl17;
    private javax.swing.JLabel jl18;
    private javax.swing.JLabel jl19;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel jl20;
    private javax.swing.JLabel jl21;
    private javax.swing.JLabel jl22;
    private javax.swing.JLabel jl23;
    private javax.swing.JLabel jl24;
    private javax.swing.JLabel jl25;
    private javax.swing.JLabel jl3;
    private javax.swing.JLabel jl4;
    private javax.swing.JLabel jl5;
    private javax.swing.JLabel jl6;
    private javax.swing.JLabel jl7;
    private javax.swing.JLabel jl8;
    private javax.swing.JLabel jl9;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblNombreJ1;
    private javax.swing.JLabel lblNombreJ2;
    private javax.swing.JLabel lblPuntajeJ1;
    private javax.swing.JLabel lblPuntajeJ2;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
