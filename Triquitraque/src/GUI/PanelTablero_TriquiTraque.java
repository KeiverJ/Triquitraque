package GUI;

import java.awt.Color;

/**
 *
 * @author keiver
 */
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

    boolean turnoJugador1 = true;

    public PanelTablero_TriquiTraque(Jugador jugador1, Jugador jugador2, int tamañoTablero, String colorSeleccionadoJ1, String colorSeleccionadoJ2) {
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

        Color colorJ1 = jugador1.configurarColorJugador(colorSeleccionadoJ1);
        Color colorJ2 = jugador2.configurarColorJugador(colorSeleccionadoJ2);

        init(tamañoTablero, colorJ1, colorJ2);
    }

    private void init(int tamañoTablero, Color colorJ1, Color colorJ2) {
        switch (tamañoTablero) {
            case 3:
                jTabbedPane1.setSelectedIndex(0);
                tablero3x3.crearTablero(3, 3, jPanel4, colorJ1, colorJ2);
                break;
            case 4:
                jTabbedPane1.setSelectedIndex(1);
                tablero4x4.crearTablero(4, 4, jPanel7, colorJ1, colorJ2);
                break;
            case 5:
                jTabbedPane1.setSelectedIndex(2);
                tablero5x5.crearTablero(5, 5, jPanel8, colorJ1, colorJ2);
                break;
            default:
                break;
        }
    }

    public void actualizarPuntaje() {
        lblPuntajeJ1.setText(Integer.toString(puntajeJugador1));
        lblPuntajeJ2.setText(Integer.toString(puntajeJugador2));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new diseño.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNombreJ1 = new javax.swing.JLabel();
        lblPuntajeJ1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblPuntajeJ2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNombreJ2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3x3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel4x4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5x5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        panelBoton = new javax.swing.JPanel();
        lblNuevaPartida = new javax.swing.JLabel();
        panelBoton1 = new javax.swing.JPanel();
        lblTerminarPartida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(240, 232, 216));
        panelFondo.setPreferredSize(new java.awt.Dimension(400, 500));
        panelFondo.setLayout(null);

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
        panelFondo.add(lblCierre);
        lblCierre.setBounds(360, 10, 16, 32);

        jPanel2.setBackground(new java.awt.Color(240, 232, 216));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/iconopersona.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 40, 60));

        lblNombreJ1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblNombreJ1.setForeground(new java.awt.Color(124, 195, 236));
        lblNombreJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJ1.setText("NAME");
        jPanel2.add(lblNombreJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, 40));

        lblPuntajeJ1.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        lblPuntajeJ1.setForeground(new java.awt.Color(245, 209, 153));
        lblPuntajeJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJ1.setText("0");
        jPanel2.add(lblPuntajeJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 60, 60));

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(245, 209, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("-");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 20, 60));

        lblPuntajeJ2.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        lblPuntajeJ2.setForeground(new java.awt.Color(245, 209, 153));
        lblPuntajeJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJ2.setText("0");
        jPanel2.add(lblPuntajeJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 60, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/iconopersona.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 40, 60));

        lblNombreJ2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lblNombreJ2.setForeground(new java.awt.Color(255, 170, 92));
        lblNombreJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJ2.setText("NAME");
        jPanel2.add(lblNombreJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 100, 40));

        panelFondo.add(jPanel2);
        jPanel2.setBounds(10, 30, 370, 140);

        jTabbedPane1.setBackground(new java.awt.Color(240, 232, 216));

        jPanel3x3.setBackground(new java.awt.Color(240, 232, 216));

        jPanel4.setBackground(new java.awt.Color(162, 213, 242));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setPreferredSize(new java.awt.Dimension(220, 220));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3x3Layout = new javax.swing.GroupLayout(jPanel3x3);
        jPanel3x3.setLayout(jPanel3x3Layout);
        jPanel3x3Layout.setHorizontalGroup(
            jPanel3x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3x3Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel3x3Layout.setVerticalGroup(
            jPanel3x3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3x3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", jPanel3x3);

        jPanel4x4.setBackground(new java.awt.Color(240, 232, 216));

        jPanel7.setBackground(new java.awt.Color(162, 213, 242));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setPreferredSize(new java.awt.Dimension(220, 220));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4x4Layout = new javax.swing.GroupLayout(jPanel4x4);
        jPanel4x4.setLayout(jPanel4x4Layout);
        jPanel4x4Layout.setHorizontalGroup(
            jPanel4x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4x4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel4x4Layout.setVerticalGroup(
            jPanel4x4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4x4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", jPanel4x4);

        jPanel5x5.setBackground(new java.awt.Color(240, 232, 216));

        jPanel8.setBackground(new java.awt.Color(162, 213, 242));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setPreferredSize(new java.awt.Dimension(220, 220));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5x5Layout = new javax.swing.GroupLayout(jPanel5x5);
        jPanel5x5.setLayout(jPanel5x5Layout);
        jPanel5x5Layout.setHorizontalGroup(
            jPanel5x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5x5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel5x5Layout.setVerticalGroup(
            jPanel5x5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5x5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("", jPanel5x5);

        panelFondo.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 130, 370, 380);

        panelBoton.setBackground(new java.awt.Color(140, 211, 179));

        lblNuevaPartida.setBackground(new java.awt.Color(255, 255, 255));
        lblNuevaPartida.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        lblNuevaPartida.setForeground(new java.awt.Color(0, 0, 0));
        lblNuevaPartida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNuevaPartida.setText("Nueva partida");
        lblNuevaPartida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNuevaPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNuevaPartidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNuevaPartidaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNuevaPartidaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonLayout = new javax.swing.GroupLayout(panelBoton);
        panelBoton.setLayout(panelBotonLayout);
        panelBotonLayout.setHorizontalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblNuevaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonLayout.setVerticalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblNuevaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelBoton);
        panelBoton.setBounds(20, 530, 160, 50);

        panelBoton1.setBackground(new java.awt.Color(216, 195, 165));

        lblTerminarPartida.setBackground(new java.awt.Color(255, 255, 255));
        lblTerminarPartida.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        lblTerminarPartida.setForeground(new java.awt.Color(0, 0, 0));
        lblTerminarPartida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTerminarPartida.setText("Terminar partida");
        lblTerminarPartida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTerminarPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTerminarPartidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTerminarPartidaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblTerminarPartidaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBoton1Layout = new javax.swing.GroupLayout(panelBoton1);
        panelBoton1.setLayout(panelBoton1Layout);
        panelBoton1Layout.setHorizontalGroup(
            panelBoton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoton1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTerminarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBoton1Layout.setVerticalGroup(
            panelBoton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBoton1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTerminarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondo.add(panelBoton1);
        panelBoton1.setBounds(210, 530, 160, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
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
        lblCierre.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_lblCierreMouseExited

    private void lblNuevaPartidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevaPartidaMouseEntered
        panelBoton.setBackground(new Color(183, 221, 200));
    }//GEN-LAST:event_lblNuevaPartidaMouseEntered

    private void lblNuevaPartidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevaPartidaMouseExited
        panelBoton.setBackground(new Color(140, 211, 179));
    }//GEN-LAST:event_lblNuevaPartidaMouseExited

    private void lblNuevaPartidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevaPartidaMousePressed
        PanelNuevaPartida_TriquiTraque resultado = new PanelNuevaPartida_TriquiTraque();
        resultado.setVisible(true);
    }//GEN-LAST:event_lblNuevaPartidaMousePressed

    private void lblTerminarPartidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTerminarPartidaMouseEntered
        panelBoton1.setBackground(new Color(204, 183, 153));
    }//GEN-LAST:event_lblTerminarPartidaMouseEntered

    private void lblTerminarPartidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTerminarPartidaMouseExited
        panelBoton1.setBackground(new Color(216, 195, 165));
    }//GEN-LAST:event_lblTerminarPartidaMouseExited

    private void lblTerminarPartidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTerminarPartidaMousePressed
        this.dispose();
        PanelMain_Triquitraque panelMain = new PanelMain_Triquitraque();
        panelMain.setVisible(true);
        tablero3x3.limpiarTablero();

    }//GEN-LAST:event_lblTerminarPartidaMousePressed

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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblNombreJ1;
    private javax.swing.JLabel lblNombreJ2;
    private javax.swing.JLabel lblNuevaPartida;
    private javax.swing.JLabel lblPuntajeJ1;
    private javax.swing.JLabel lblPuntajeJ2;
    private javax.swing.JLabel lblTerminarPartida;
    private javax.swing.JPanel panelBoton;
    private javax.swing.JPanel panelBoton1;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
