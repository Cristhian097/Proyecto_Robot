/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

import javax.swing.ImageIcon;

/**
 *
 * @author Cristhian
 */
public class NivelPanel2 extends javax.swing.JPanel {

    /**
     * Creates new form Panel1
     */
    public NivelPanel2() {
       
        initComponents();
         ImageIcon icono = new ImageIcon("C:\\Users\\cvill\\Documents\\NetBeansProjects\\DETECTAR_CARA\\DETECTAR_CARA\\src\\newpackageImages\\robotBrazo.png");
        lblHardware.setIcon(icono);
        
       // add(lblHardware);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lblHardware = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Caracteristicas Hardware");

        jButton1.setFont(new java.awt.Font("Elephant", 1, 12)); // NOI18N
        jButton1.setText("Robot");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Elephant", 1, 12)); // NOI18N
        jButton2.setText("Control inalambrico  primario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Elephant", 1, 12)); // NOI18N
        jButton3.setText("Control Secundario");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Elephant", 1, 12)); // NOI18N
        jButton4.setText("Control Terciario");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Elephant", 1, 12)); // NOI18N
        jButton5.setText("Sistema Conjunto");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHardware, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHardware, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ImageIcon icono = new ImageIcon("C:\\Users\\cvill\\Documents\\NetBeansProjects\\DETECTAR_CARA\\DETECTAR_CARA\\src\\newpackageImages\\robotBrazo.png");
        lblHardware.setIcon(icono);
        add(lblHardware);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ImageIcon icono = new ImageIcon("C:\\Users\\cvill\\Documents\\NetBeansProjects\\DETECTAR_CARA\\DETECTAR_CARA\\src\\newpackageImages\\ControlPrimarioInalambrico.PNG");
        lblHardware.setIcon(icono);
        add(lblHardware);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ImageIcon icono = new ImageIcon("C:\\Users\\cvill\\Documents\\NetBeansProjects\\DETECTAR_CARA\\DETECTAR_CARA\\src\\newpackageImages\\ControlSecundarioInalambrico.PNG");
        lblHardware.setIcon(icono);
        add(lblHardware);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ImageIcon icono = new ImageIcon("C:\\Users\\cvill\\Documents\\NetBeansProjects\\DETECTAR_CARA\\DETECTAR_CARA\\src\\newpackageImages\\Control_Principal_Robot.PNG");
        lblHardware.setIcon(icono);
        add(lblHardware);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         ImageIcon icono = new ImageIcon("C:\\Users\\cvill\\Documents\\NetBeansProjects\\DETECTAR_CARA\\DETECTAR_CARA\\src\\newpackageImages\\UbicasionSistemaBrazo.PNG");
        lblHardware.setIcon(icono);
        add(lblHardware);
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblHardware;
    // End of variables declaration//GEN-END:variables
}
