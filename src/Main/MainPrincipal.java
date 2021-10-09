package Main;

import java.awt.BorderLayout;
import GUI.DetectaCara;
import java.awt.Graphics;
import org.opencv.core.Core;
import org.opencv.objdetect.CascadeClassifier;

public class MainPrincipal extends javax.swing.JFrame {

    Paneles.Panel_Conectar conectar = new Paneles.Panel_Conectar();
    //Paneles.Panel_Aprender aprenderPanel = new Paneles.Panel_Aprender();

    Paneles.Panel_Acerca acercaPanel = new Paneles.Panel_Acerca();

    public MainPrincipal() {
        initComponents();
        conectarF();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOperaciones = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnConectar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        controlButton = new javax.swing.JButton();
        controlButton2 = new javax.swing.JButton();
        controlButton3 = new javax.swing.JButton();
        controlButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelOperaciones.setBackground(new java.awt.Color(0, 102, 102));
        panelOperaciones.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panelOperacionesLayout = new javax.swing.GroupLayout(panelOperaciones);
        panelOperaciones.setLayout(panelOperacionesLayout);
        panelOperacionesLayout.setHorizontalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelOperacionesLayout.setVerticalGroup(
            panelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setForeground(new java.awt.Color(0, 153, 153));

        btnConectar.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        btnConectar.setForeground(new java.awt.Color(0, 0, 0));
        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        btnEnviar.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(0, 0, 0));
        btnEnviar.setText("Simulador");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        controlButton.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        controlButton.setForeground(new java.awt.Color(0, 0, 0));
        controlButton.setText("OpenCv");
        controlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlButtonActionPerformed(evt);
            }
        });

        controlButton2.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        controlButton2.setForeground(new java.awt.Color(0, 0, 0));
        controlButton2.setText("Aprender");
        controlButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlButton2ActionPerformed(evt);
            }
        });

        controlButton3.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        controlButton3.setForeground(new java.awt.Color(0, 0, 0));
        controlButton3.setText("Acerca de");
        controlButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlButton3ActionPerformed(evt);
            }
        });

        controlButton4.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        controlButton4.setForeground(new java.awt.Color(0, 0, 0));
        controlButton4.setText("Salir");
        controlButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(controlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(controlButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(controlButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(controlButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controlButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controlButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controlButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        enviar();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        // TODO add your handling code here:
        conectarF();
    }//GEN-LAST:event_btnConectarActionPerformed

    private void controlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlButtonActionPerformed

        // TODO add your handling code here:
        controlOpenCv();
    }//GEN-LAST:event_controlButtonActionPerformed

    private void controlButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlButton2ActionPerformed
        aprenderCuestionario();
    }//GEN-LAST:event_controlButton2ActionPerformed

    private void controlButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlButton3ActionPerformed
        acercaDe();
    }//GEN-LAST:event_controlButton3ActionPerformed

    private void controlButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_controlButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton controlButton;
    private javax.swing.JButton controlButton2;
    private javax.swing.JButton controlButton3;
    private javax.swing.JButton controlButton4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelOperaciones;
    // End of variables declaration//GEN-END:variables

    private void enviar() {
        //conectar. pc = new panelActividad();
        Paneles.Simulador simulador = new Paneles.Simulador();
        simulador.setVisible(true);
        setVisible(false);
        

    }

    private void conectarF() {
        // conectar pc = new panelActividad();
        conectar.setSize(1324, 630);
        conectar.setLocation(0, 0);

        panelOperaciones.removeAll();
        panelOperaciones.add(conectar, BorderLayout.CENTER);
        panelOperaciones.revalidate();
        panelOperaciones.repaint();
    }

    public void controlOpenCv() {
        GUI.DetectaCara cara = new GUI.DetectaCara();
        cara.setVisible(true);
        setVisible(false);

    }

    private void aprenderCuestionario() {
        cuestionario.Opciones cuestionario = new cuestionario.Opciones();
        cuestionario.setVisible(true);
        setVisible(false);
     
    }

    private void acercaDe() {
        acercaPanel.setSize(1324, 632);
        acercaPanel.setLocation(0, 0);

        panelOperaciones.removeAll();
        panelOperaciones.add(acercaPanel, BorderLayout.CENTER);
        panelOperaciones.revalidate();
        panelOperaciones.repaint();
    }

}
