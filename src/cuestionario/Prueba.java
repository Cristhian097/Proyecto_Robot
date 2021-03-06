package cuestionario;

import com.sun.corba.se.impl.util.PackagePrefixChecker;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristhian
 */
public class Prueba extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form Prueba
     */
    Thread h1;
    int contadorP;
    String variable;
    String vector[] = new String[40];
    boolean banderaT = false;
    int contCorrectas;
    int contIncorrectas;
    boolean banderaHilo = false;
    boolean bandFinal = true;
    int nivel;
    int segundos;
    String nombre;

    int tiempo = 0;
    int segDato;

    public Prueba(int nivel, int segundos, String nombre) {
        initComponents();

        this.nivel = nivel;
        this.segundos = segundos;
        this.nombre = nombre;
        segDato = segundos;

        lblMinutos.setText((segDato / 60) + "");
        lbltiempo.setText(" " + (segDato % 60));

        btnComenzar.setEnabled(false);
        setLocationRelativeTo(null);
          progres.setValue(0);
        jrbOp1.setText("");
        jrbOp2.setText("");
        jrbOp3.setText("");
        lblPregunta.setText("                              |- INICIARA UNA NUEVA AVENTURA -|");
        

        h1 = new Thread(this);
        h1.start();
        setVisible(true);
    }

    private Prueba() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblCorrecto = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblIcorrecto = new javax.swing.JLabel();
        lbltiempo = new javax.swing.JLabel();
        lblMinutos = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        progres = new rojerusan.componentes.RSProgressBar();
        lblNumPregunta = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        jrbOp3 = new javax.swing.JRadioButton();
        btnAtras = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        btnComenzar = new javax.swing.JButton();
        jrbOp1 = new javax.swing.JRadioButton();
        jrbOp2 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel5.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Tiempo");

        jLabel4.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Porcentaje");

        jLabel6.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Respuestas ");

        jLabel7.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Correctas:");

        lblCorrecto.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        lblCorrecto.setForeground(new java.awt.Color(204, 204, 204));

        jLabel9.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Incorrectas:");

        lblIcorrecto.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        lblIcorrecto.setForeground(new java.awt.Color(204, 204, 204));

        lbltiempo.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        lbltiempo.setForeground(new java.awt.Color(204, 204, 204));

        lblMinutos.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        lblMinutos.setForeground(new java.awt.Color(204, 204, 204));

        jLabel12.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Segundos:");

        jLabel14.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Minutos:");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel8.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Cuestionario de aprendizaje");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        progres.setMaximum(40);

        lblNumPregunta.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        lblNumPregunta.setForeground(new java.awt.Color(204, 204, 204));

        jLabel11.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Preguntas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(lblNumPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblIcorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(92, 92, 92)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbltiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11)
                                .addGap(178, 178, 178)
                                .addComponent(jLabel6)
                                .addGap(157, 157, 157)
                                .addComponent(jLabel5)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(progres, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(153, 153, 153))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(progres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbltiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel14))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(lblCorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(lblNumPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIcorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))))
                        .addGap(33, 33, 33))))
        );

        jLabel1.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione respuesta");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackageImages/uno.jpg"))); // NOI18N

        lblPregunta.setBackground(new java.awt.Color(0, 0, 0));
        lblPregunta.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        lblPregunta.setForeground(new java.awt.Color(0, 0, 0));

        buttonGroup1.add(jrbOp3);
        jrbOp3.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jrbOp3.setForeground(new java.awt.Color(0, 0, 0));
        jrbOp3.setText("jRadioButton3");

        btnAtras.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnIniciar.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnComenzar.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        btnComenzar.setText("Continuar");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbOp1);
        jrbOp1.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jrbOp1.setForeground(new java.awt.Color(0, 0, 0));
        jrbOp1.setText("jRadioButton4");
        jrbOp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOp1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbOp2);
        jrbOp2.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jrbOp2.setForeground(new java.awt.Color(0, 0, 0));
        jrbOp2.setText("jRadioButton5");

        jLabel10.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Proyectando el futuro");

        jLabel2.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel2.setText("A:");

        jLabel15.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel15.setText("B:");

        jLabel16.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        jLabel16.setText("C:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbOp1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnComenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jrbOp3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbOp2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(513, 513, 513))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbOp1)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbOp2)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbOp3)
                    .addComponent(jLabel16))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnComenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 187, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        new Opciones().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed

        //lblPregunta.setText(traerPregunta());
        //     System.out.println(traerPregunta());
        if (jrbOp1.isSelected() || jrbOp2.isSelected() || jrbOp3.isSelected()) {
            traerPregunta();
        } else {
            JOptionPane.showMessageDialog(null, " Debe seleccionar una respuesta");

        }
    }//GEN-LAST:event_btnComenzarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        limpiar();
        btnIniciar.setEnabled(false);
        btnAtras.setEnabled(false);
        btnComenzar.setEnabled(true);
        traerPregunta();
        banderaHilo = true;
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void jrbOp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbOp1ActionPerformed

    public String traerPregunta() {
        String pregunta = "";
        Preguntas preg = new Preguntas();
        int aleatorio2 = 0;
        int aleatorio3 = 0;
        String parametro = "";
        boolean bandera = true;

        int aleatorio1 = (int) (Math.random() * (3 - 0)) + 0;

        while (bandera == true) {

            aleatorio2 = (int) (Math.random() * (39 - 0)) + 0;//31
            aleatorio3 = (int) (Math.random() * (39 - 0)) + 0;

            if (aleatorio2 != aleatorio3 && contadorP != aleatorio2 && contadorP != aleatorio3) {
                break;

            } else {
                System.out.println("Parecidos: " + aleatorio2 + ":" + aleatorio3 + ":" + contadorP);
            }
        }

        if (contadorP < 40) {

            if (contadorP == 39) {
                bandFinal = false;
            } else {
                lblPregunta.setText(preg.recorrer(contadorP) + preg.matrizPalabras(contadorP, 0) + "?");
            }
            if (aleatorio1 == 0) {
                limpiar();
                vector[contadorP] = "A";
                jrbOp1.setText(preg.matrizPalabras(contadorP, 1));
                jrbOp2.setText(preg.matrizPalabras(aleatorio2, 1));
                jrbOp3.setText(preg.matrizPalabras(aleatorio3, 1));

            } else if (aleatorio1 == 1) {
                limpiar();
                vector[contadorP] = "B";
                jrbOp2.setText(preg.matrizPalabras(contadorP, 1));

                jrbOp1.setText(preg.matrizPalabras(aleatorio2, 1));
                jrbOp3.setText(preg.matrizPalabras(aleatorio3, 1));

            } else if (aleatorio1 == 2) {
                limpiar();
                vector[contadorP] = "C";
                jrbOp3.setText(preg.matrizPalabras(contadorP, 1));

                jrbOp1.setText(preg.matrizPalabras(aleatorio3, 1));
                jrbOp2.setText(preg.matrizPalabras(aleatorio2, 1));

            }
            System.out.println(aleatorio2 + " : " + aleatorio3 + " : " + contadorP + ":" + parametro);

            if (banderaT == true) {
                if (jrbOp1.isSelected()) {
                    if (vector[contadorP - 1].equals("A")) {
                        System.err.println("Correcto");
                        contCorrectas++;
                    } else {
                        System.err.println("Incorrecto");
                        contIncorrectas++;
                    }

                } else if (jrbOp2.isSelected()) {
                    if (vector[contadorP - 1].equals("B")) {
                        contCorrectas++;
                        System.err.println("Correcto");
                    } else {
                        contIncorrectas++;
                        System.err.println("Incorrecto");
                    }

                } else if (jrbOp3.isSelected()) {
                    if (vector[contadorP - 1].equals("C")) {
                        contCorrectas++;
                        System.err.println("Correcto");
                    } else {
                        System.err.println("Incorrecto");
                        contIncorrectas++;
                    }

                }
            } else {
                banderaT = true;
            }

            contadorP++;
            lblCorrecto.setText(contCorrectas + "");
            lblIcorrecto.setText(contIncorrectas + "");

            if (bandFinal == true) {

               progres.setValue(contadorP);
                lblNumPregunta.setText("Numero: " + contadorP);
                desellecionar();

            } else {
                limpiar();
                lblNumPregunta.setText("Pregunta numero: " + (contadorP - 1));
                lblPregunta.setText("");
                btnComenzar.setText("Terminar");
            }

        } else {
            limpiar();
            lblPregunta.setText("");
            progres.setValue(0);
            h1.stop();
            validar(contCorrectas);
        }

        return pregunta;
    }

    void limpiar() {
        jrbOp1.setText("");
        jrbOp2.setText("");
        jrbOp3.setText("");
        lblNumPregunta.setText("");
        //lblPregunta.setText("");

    }

    void validar(int correctas) {
        if (correctas <= 10) {
            JOptionPane.showMessageDialog(null, "Hola " + nombre + " la PRUEBA ha termiando\nNivel Bajo, Debes dedicarte m??s Amigo\n\n| La practica hace al maestro |\n\nTiempo " + (segDato / 60) + " :Minutos " + (segDato % 60) + " :Segundos\nPreguntas:" + (contadorP - 1) + "\nCorrectas: " + contCorrectas + "\nIncorrectas: " + contIncorrectas);
        } else if (correctas <= 20) {
            JOptionPane.showMessageDialog(null, "Hola " + nombre + " la PRUEBA ha termiando\nNivel Medio bajo, Debes dedicarte m??s Amigo\n\n| El momento que da m??s miedo es siempre justo antes de empezar |\n\nTiempo " + (segDato / 60) + " :Minutos " + (segDato % 60) + " :Segundos\nPreguntas:" + (contadorP - 1) + "\nCorrectas: " + contCorrectas + "\nIncorrectas: " + contIncorrectas);
        } else if (correctas <= 30) {
            JOptionPane.showMessageDialog(null, "Hola " + nombre + " la PRUEBA ha termiando\n Nivel basico, vas mejorando \n\n| ??Qu?? hubiera pasado si no lo hubiera intentado? |\n\nTiempo:" + (segDato / 60) + " :Minutos " + (segDato % 60) + " :Segundos \nPreguntas:" + (contadorP - 1) + "\nCorrectas: " + contCorrectas + "\nIncorrectas: " + contIncorrectas);
        } else if (correctas <= 39) {
            JOptionPane.showMessageDialog(null, "Hola " + nombre + " la PRUEBA ha termiando\n Nivel alto muy bien felicitaciones \n\n| Nos hemos convertido en el fruto de nuestros pensamientos. |\n\nTiempo " + (segDato / 60) + ":Minutos  " + (segDato % 60) + " :Segundos \nPreguntas:" + (contadorP - 1) + "\nCorrectas: " + contCorrectas + "\nIncorrectas: " + contIncorrectas);
        }
        new Opciones().setVisible(true);
        setVisible(false);
    }

    void desellecionar() {
        buttonGroup1.clearSelection();
    }

    public String almacenarV(String caracter) {

        return variable;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jrbOp1;
    private javax.swing.JRadioButton jrbOp2;
    private javax.swing.JRadioButton jrbOp3;
    private javax.swing.JLabel lblCorrecto;
    private javax.swing.JLabel lblIcorrecto;
    private javax.swing.JLabel lblMinutos;
    private javax.swing.JLabel lblNumPregunta;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lbltiempo;
    private rojerusan.componentes.RSProgressBar progres;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread ct = Thread.currentThread();

        while (ct == h1) {
            if (banderaHilo == true) {
                tiempo++;
                lblMinutos.setText((segDato / 60) + "");
                lbltiempo.setText(" " + (segDato % 60));
                segDato--;

                if (tiempo > segundos) {
                    System.out.println("Tiempo terminado");
                    validar(contCorrectas);
                    break;
                }

            }

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.err.println(e);

            }

        }
    }
}
