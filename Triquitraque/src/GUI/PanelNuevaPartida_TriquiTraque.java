 
package GUI;

import java.awt.Color;



public class PanelNuevaPartida_TriquiTraque extends javax.swing.JFrame {

    private Tablero tablero;
    
    public PanelNuevaPartida_TriquiTraque() {
        init();
    }
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));
        panelFondo.requestFocus();  
        panelFondo.setOpaque(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGrouptamaño = new javax.swing.ButtonGroup();
        panelFondo = new diseño.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rbt5x5 = new javax.swing.JRadioButton();
        rbt3x3 = new javax.swing.JRadioButton();
        rbt4x4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(240, 232, 216));
        panelFondo.setPreferredSize(new java.awt.Dimension(416, 315));
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
        lblCierre.setBounds(430, 0, 30, 32);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Elije el tablero en donde quieres seguir jugando:");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(30, 40, 390, 30);

        buttonGrouptamaño.add(rbt5x5);
        rbt5x5.setForeground(new java.awt.Color(0, 0, 0));
        rbt5x5.setText("5x5");
        panelFondo.add(rbt5x5);
        rbt5x5.setBounds(260, 90, 50, 21);

        buttonGrouptamaño.add(rbt3x3);
        rbt3x3.setForeground(new java.awt.Color(0, 0, 0));
        rbt3x3.setText("3x3");
        panelFondo.add(rbt3x3);
        rbt3x3.setBounds(140, 90, 41, 21);

        buttonGrouptamaño.add(rbt4x4);
        rbt4x4.setForeground(new java.awt.Color(0, 0, 0));
        rbt4x4.setText("4x4");
        panelFondo.add(rbt4x4);
        rbt4x4.setBounds(200, 90, 50, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED);
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_lblCierreMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGrouptamaño;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JRadioButton rbt3x3;
    private javax.swing.JRadioButton rbt4x4;
    private javax.swing.JRadioButton rbt5x5;
    // End of variables declaration//GEN-END:variables
}
