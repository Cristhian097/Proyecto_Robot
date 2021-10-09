package GUI;

import Main.MainPrincipal;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;

import javax.imageio.ImageIO;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;

import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import static org.opencv.objdetect.Objdetect.CASCADE_SCALE_IMAGE;
import org.opencv.videoio.VideoCapture;
//import panamahitek.Arduino.PanamaHitek_Arduino;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @Cristhian
 */
public class DetectaCara extends javax.swing.JFrame {

//RECONOCER CARA
    boolean bandera = false;
    boolean bander = false;
    boolean bandArduino = false;
    short contX, contY, contZ;
    boolean bandTrue = false;
    boolean bandInic = false;
    int numCamara;
    boolean bandAct = false;
    //   PanamaHitek_Arduino  arduino = new PanamaHitek_Arduino();//BIBLIOTECA PARA CONECTAR CON ARDUINO
    String cara_haarcascades = "C:\\Users\\cvill\\Documents\\NetBeansProjects\\MainPrincipal\\haarcascades\\haarcascade_frontalface_alt2.xml";
    CascadeClassifier faceDetector = new CascadeClassifier(cara_haarcascades);

    //Reconocer Hojos
    String ojos_haarcascades = "C:\\Users\\cvill\\Documents\\NetBeansProjects\\MainPrincipal\\haarcascades\\haarcascade_eye_tree_eyeglasses.xml";
    CascadeClassifier ojosDetector = new CascadeClassifier(ojos_haarcascades);

    //Reconocer Naris
    //String ojos_haarcascades = "C:\\opencv\\sources\\data\\haarcascades\\haarcascade_eye_tree_eyeglasses.xml";
    //CascadeClassifier ojosDetector = new CascadeClassifier(ojos_haarcascades);
    public DetectaCara() {

        initComponents();
        setLocationRelativeTo(null);

        //deberia haber una funcion que reconocza el pueto que esta conoectado para mejorar en....   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblancho = new javax.swing.JLabel();
        lblalto = new javax.swing.JLabel();
        lblcara = new javax.swing.JLabel();
        lblcara1 = new javax.swing.JLabel();
        lblx = new javax.swing.JLabel();
        lblcara3 = new javax.swing.JLabel();
        lbly = new javax.swing.JLabel();
        btnMouse = new javax.swing.JButton();
        btnOjo = new javax.swing.JButton();
        btnCara = new javax.swing.JButton();
        panelInicio = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        cmbCamara = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ancho:");

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Alto:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Caras:  ");

        lblancho.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        lblancho.setForeground(new java.awt.Color(204, 204, 204));

        lblalto.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        lblalto.setForeground(new java.awt.Color(204, 204, 204));

        lblcara.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        lblcara.setForeground(new java.awt.Color(204, 204, 204));

        lblcara1.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        lblcara1.setForeground(new java.awt.Color(0, 0, 0));
        lblcara1.setText("Y:");

        lblx.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        lblx.setForeground(new java.awt.Color(204, 204, 204));

        lblcara3.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        lblcara3.setForeground(new java.awt.Color(0, 0, 0));
        lblcara3.setText("X:");

        lbly.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        lbly.setForeground(new java.awt.Color(204, 204, 204));

        btnMouse.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        btnMouse.setText("Mouse");
        btnMouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMouseActionPerformed(evt);
            }
        });

        btnOjo.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        btnOjo.setText("Ojos");
        btnOjo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOjoActionPerformed(evt);
            }
        });

        btnCara.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        btnCara.setText("Cara");
        btnCara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaraActionPerformed(evt);
            }
        });

        panelInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 857, Short.MAX_VALUE)
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jToggleButton1.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jToggleButton1.setText("Atras");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        cmbCamara.setFont(new java.awt.Font("Elephant", 1, 14)); // NOI18N
        cmbCamara.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Camara", "1", "2", "3" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblcara, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblalto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lblancho, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblcara3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblx, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblcara1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbly, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCamara, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOjo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMouse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblcara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblalto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblancho, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblcara3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblx, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcara1)
                            .addComponent(lbly, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cmbCamara, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOjo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCara, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMouse, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addComponent(panelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMouseActionPerformed

        if (bander == false) {
            bandera = true;
            bander = true;

        } else if (bander = true) {
            bandera = false;
            bander = false;
        }
    }//GEN-LAST:event_btnMouseActionPerformed

    private void btnCaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaraActionPerformed
        //Detectar cara
        if (cmbCamara.getSelectedItem().equals("Seleccione Camara")) {
            JOptionPane.showMessageDialog(null, " Debe seleccionar el numero de la camara al cual debe iniciar");

        } else {
            System.out.println("No Entra");
            numCamara = (Integer.parseInt((String) cmbCamara.getSelectedItem()) - 1);

            (new Thread() {
                public void run() {

//___________________________________________________
                    VideoCapture capture = new VideoCapture();//INSTANCIA DE CLASE VIDEO
                    capture.open(numCamara);//SELECIONAR CAMARA INTERNA O EXTERNA PARA CAPTURAR VIDEO

                    MatOfRect rostros = new MatOfRect();
                    MatOfByte mem = new MatOfByte();

                    Mat frame = new Mat();
                    Mat frame_gray = new Mat();

                    Rect[] facesArray;//[][][][][]             
                    Graphics g;

                    BufferedImage buff = null;

                    if (!capture.isOpened()) {
                        System.out.println("NO ESTA ABIERTA LA CAPUTRA");
                    } else {
                        System.out.println("SE ABRIO LA CAPUTRA");
                    }

                    while (capture.read(frame)) {
                        if (frame.empty()) {
                            System.out.println("NO HAY REGISTROS DE IMAGEN");
                            break;
                        } else {
                            try {

                                g = panelInicio.getGraphics();
                                Imgproc.cvtColor(frame, frame_gray, Imgproc.COLOR_BGR2GRAY);//BGR2GRAY
                                Imgproc.equalizeHist(frame_gray, frame_gray);
                                double w = frame.width();
                                double h = frame.height();
                                faceDetector.detectMultiScale(frame_gray, rostros, 5.4, 4, 0 | CASCADE_SCALE_IMAGE, new Size(30, 30), new Size(w, h));
                                facesArray = rostros.toArray();
                                System.out.println("CARAS ENCONTRADAS: " + facesArray.length);//CANTIDAD DE CARAS ENCONTRADAS

                                for (int i = 0; i < facesArray.length; i++) {
                                    /*DET3
                                CTA Y DIBUJA UN ELIPSE A LO QUE CORRESPONDE LA CARA*/
                                    Point center = new Point((facesArray[i].x + facesArray[i].width * 0.5),
                                            (facesArray[i].y + facesArray[i].height * 0.5));
                                    Imgproc.ellipse(frame, center, new Size(facesArray[i].width * 0.5, facesArray[i].height * 0.5), 0, 0, 360,
                                            new Scalar(12, 213), 2, 8, 0);//color/ancho de seleccion 
                                    Mat faceROI = frame_gray.submat(facesArray[i]);
                                    Imgproc.rectangle(frame,
                                            new Point(facesArray[i].x, facesArray[i].y),
                                            new Point(facesArray[i].x + facesArray[i].width, facesArray[i].y + facesArray[i].height),
                                            new Scalar(25, 25, 255), 2, 8, 0);//color recuadro de toda la camara

                                    Imgproc.putText(frame, "Ancho" + faceROI.width() + " Alto: " + faceROI.height(), new Point(facesArray[i].x, facesArray[i].y - 20), 1, 1, new Scalar(255, 255, 255));

                                    Imgproc.putText(frame, "X = " + facesArray[i].x + " Y = " + facesArray[i].y, new Point(facesArray[i].x, facesArray[i].y - 40), 1, 1, new Scalar(255, 255, 255));
                                    //Imgproc.putText(frame, " ", new Point(facesArray[i].x, facesArray[i].y+20), 2, 1, new Scalar(155,32,200));

                                    //moviiento del mouse
                                    if (bandera == true) {
                                        Robot robot = new Robot();
                                        robot.mouseMove(facesArray[i].x, facesArray[i].y);
                                      
                                    }

                                    lblancho.setText(faceROI.width() + "");
                                    lblalto.setText(faceROI.height() + "");
                                    lblcara.setText(facesArray.length + "");

                                    lblx.setText(facesArray[i].x + "");
                                    lbly.setText(facesArray[i].y + "");

                                }
                                Imgcodecs.imencode(".bmp", frame, mem);
                                Image im = ImageIO.read(new ByteArrayInputStream(mem.toArray()));
                                buff = (BufferedImage) im;
                                if (g.drawImage(buff, 0, 0, panelInicio.getWidth(), panelInicio.getHeight(), 0, 0, buff.getWidth(), buff.getHeight(), null)) {
                                }
                            } catch (Exception ex) {
                                Logger.getLogger(DetectaCara.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if (bandAct == true) {
                            System.out.println("Cierra bucle");

                            stop();
                        }
                    }

                }
            }).start();
        }
    }//GEN-LAST:event_btnCaraActionPerformed

    private void btnOjoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOjoActionPerformed
        //numCamara = Integer.parseInt((String) cmbCamara.getSelectedItem());
        //System.out.println(cmbCamara.getSelectedItem());

        if (cmbCamara.getSelectedItem().equals("Seleccione Camara")) {
            JOptionPane.showMessageDialog(null, " Debe seleccionar el numero de la camara al cual debe iniciar");

        } else {
            System.out.println("No Entra");
            numCamara = (Integer.parseInt((String) cmbCamara.getSelectedItem()) - 1);

            (new Thread() {
                public void run() {
                    VideoCapture capture = new VideoCapture();
                    capture.open(numCamara);

                    MatOfRect ojos = new MatOfRect();
                    MatOfByte mem = new MatOfByte();

                    Mat frame = new Mat();
                    Mat frame_gray = new Mat();

                    Rect[] facesArray;//[][][][][]             
                    Graphics g;
                    BufferedImage buff = null;

                    if (!capture.isOpened()) {
                        System.out.println("NO ESTA ABIERTA LA CAPUTRA");
                    } else {
                        System.out.println("SE ABRIO LA CAPUTRA");
                    }

                    while (capture.read(frame)) {
                        if (frame.empty()) {
                            System.out.println("NO HAY REGISTROS DE IMAGEN");
                            break;
                        } else {
                            try {
                                g = panelInicio.getGraphics();
                                Imgproc.cvtColor(frame, frame_gray, Imgproc.COLOR_BGR2GRAY);
                                Imgproc.equalizeHist(frame_gray, frame_gray);
                                double w = frame.width();
                                double h = frame.height();
                                ojosDetector.detectMultiScale(frame_gray, ojos, 5.8, 2, 0 | CASCADE_SCALE_IMAGE, new Size(30, 30), new Size(w, h));
                                facesArray = ojos.toArray();
                                System.out.println("OJOS ENCONTRADOS: " + facesArray.length);//CANTIDAD DE CARAS ENCONTRADAS

                                for (int i = 0; i < facesArray.length; i++) {
                                    /*DETECTA Y DIBUJA UN ELIPSE A LO QUE CORRESPONDE a los ojos*/
                                    Point center = new Point((facesArray[i].x + facesArray[i].width * 0.5),
                                            (facesArray[i].y + facesArray[i].height * 0.5));
                                    Imgproc.ellipse(frame,
                                            center,
                                            new Size(facesArray[i].width * 0.5, facesArray[i].height * 0.5),
                                            0,
                                            0,
                                            360,
                                            new Scalar(12, 213),
                                            2, 8, 0);//color/ancho de seleccion 
                                    Mat faceROI = frame_gray.submat(facesArray[i]);
                                    Imgproc.rectangle(frame,
                                            new Point(facesArray[i].x, facesArray[i].y),
                                            new Point(facesArray[i].x + facesArray[i].width, facesArray[i].y + facesArray[i].height),
                                            new Scalar(25, 25, 255), 2, 8, 0);//color recuadro de toda la camara
                                    Imgproc.putText(frame, "Ancho" + faceROI.width() + " Alto: " + faceROI.height() + " X = " + facesArray[i].x + " Y = " + facesArray[i].y, new Point(facesArray[i].x, facesArray[i].y - 20), 1, 1, new Scalar(255, 255, 255));
                                    //Imgproc.putText(frame, " ", new Point(facesArray[i].x, facesArray[i].y+20), 2, 1, new Scalar(155,32,200));
                                    //        Robot robot = new Robot();
                                    //      robot.mouseMove(facesArray[i].x, facesArray[i].x);
                                    lblancho.setText(faceROI.width() + "");
                                    lblalto.setText(faceROI.height() + "");
                                    lblcara.setText(facesArray.length + "");

                                    lblx.setText(facesArray[i].x + "");
                                    lbly.setText(facesArray[i].y + "");

                                    if (bandera == true) {
                                        Robot robot = new Robot();
                                        robot.mouseMove(facesArray[i].x, facesArray[i].y);
                                        if (facesArray.length == 1) {
                                            robot.mousePress(InputEvent.BUTTON1_MASK);
                                            robot.mouseRelease(InputEvent.BUTTON1_MASK);

                                        }

                                    }
                                }
                                Imgcodecs.imencode(".bmp", frame, mem);
                                Image im = ImageIO.read(new ByteArrayInputStream(mem.toArray()));
                                buff = (BufferedImage) im;
                                if (g.drawImage(buff, 0, 0, panelInicio.getWidth(), panelInicio.getHeight(), 0, 0, buff.getWidth(), buff.getHeight(), null)) {
                                }
                            } catch (Exception ex) {
                                Logger.getLogger(DetectaCara.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                    }

                }
            }).start();
        }
    }//GEN-LAST:event_btnOjoActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        bandAct = true;
        new Main.MainPrincipal().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
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
            java.util.logging.Logger.getLogger(DetectaCara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetectaCara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetectaCara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetectaCara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetectaCara().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCara;
    private javax.swing.JButton btnMouse;
    private javax.swing.JButton btnOjo;
    private javax.swing.JComboBox<String> cmbCamara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblalto;
    private javax.swing.JLabel lblancho;
    private javax.swing.JLabel lblcara;
    private javax.swing.JLabel lblcara1;
    private javax.swing.JLabel lblcara3;
    private javax.swing.JLabel lblx;
    private javax.swing.JLabel lbly;
    private javax.swing.JPanel panelInicio;
    // End of variables declaration//GEN-END:variables
}
