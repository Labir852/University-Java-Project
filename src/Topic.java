
import javax.swing.ComboBoxEditor;
import javax.swing.JFileChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Topic extends javax.swing.JFrame {

  static int milliseconds = 600;
    static int seconds = 59;
    static int minutes = 25; 
    static boolean state = true;
    

//    
    public Topic() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jMenu7.setText("File");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar3.add(jMenu8);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(java.awt.Color.orange);
        jPanel2.setForeground(java.awt.Color.red);
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POMODORO TOPIC ");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(320, 20, 360, 60);

        jButton1.setBackground(new java.awt.Color(204, 51, 0));
        jButton1.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        jButton1.setText("START POMODORO");
        jButton1.setActionCommand("LET\"S GO!!!");
        jButton1.setAutoscrolls(true);
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(80, 410, 410, 80);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UPLOAD.jpg"))); // NOI18N
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(830, 10, 70, 60);

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("OPEN PDF");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(830, 80, 70, 18);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/setting.jpg"))); // NOI18N
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(920, 10, 70, 60);

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SETTINGS");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(920, 80, 70, 20);

        jButton4.setBackground(new java.awt.Color(204, 51, 0));
        jButton4.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        jButton4.setText("GENERATE TOPIC");
        jButton4.setAutoscrolls(true);
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(500, 410, 410, 80);

        jLabel5.setBackground(java.awt.Color.orange);
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(80, 190, 830, 50);

        jLabel6.setBackground(java.awt.Color.orange);
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(80, 260, 830, 50);

        jLabel7.setBackground(java.awt.Color.orange);
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel7);
        jLabel7.setBounds(80, 330, 830, 50);

        jLabel8.setBackground(java.awt.Color.orange);
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jLabel8InputMethodTextChanged(evt);
            }
        });
        jPanel2.add(jLabel8);
        jLabel8.setBounds(80, 120, 830, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        POMODORO_1 object = new POMODORO_1();
        object.setVisible(true);
         milliseconds = 600;
    seconds = 59;
    minutes = 25; 
                                  state = true;
        
        Thread t;
        t = new Thread()
        {
            @Override
            public void run()
            {
                for(;;)
                {
                    if(state==true)
                    {
                        try
                        {
                            Thread.sleep(1);
                            
                            if(milliseconds<0)
                            {
                                milliseconds=600;
                                seconds--;
                            }
                            if(seconds<0)
                            {
                               milliseconds=600;
                                seconds=59;
                                minutes--;
                            }
                            if(minutes==0)
                            {
                                
                                break;
                                
                            }
                            //jLabel9.setText(" : "+milliseconds);
                            milliseconds--;
                            object.jLabel11.setText(""+seconds);
                           object.jLabel10.setText(""+minutes);
                            
                            
                            
                        }
                        catch(InterruptedException e)
                        {
                            
                        }
                    }
                    else
                    {
                        break;
                    }
                }
            }
            
            
        };
        t.start();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String filename = null;
        JFileChooser file = new JFileChooser();
        file.showOpenDialog(null);
        try{
        File f = file.getSelectedFile();
        filename = f.getAbsolutePath();
        filename = filename.replace('\\', '/');
 
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        try
        {
            File pdfFile = new File(filename);
            if(pdfFile.exists())
            {
                if(Desktop.isDesktopSupported())
                {
                    Desktop.getDesktop().open(pdfFile);
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, " can't be opened ");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, " File Doesn't Exist ");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        new Settings().setVisible(true);
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.addActionListener(new Action());
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel8InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jLabel8InputMethodTextChanged
        // TODO add your handling code here:   
        
    }//GEN-LAST:event_jLabel8InputMethodTextChanged

     class Action implements ActionListener{
        

        @Override
        public void actionPerformed (ActionEvent e){
            String[] label1 = {"VECTOR", "DYNAMICS", "THERMODYNAMICS"};
            String[] label2 = {"CIRCLE", "CONICS", "TRIGONOMETRY"};
            String[] label3 = {"SEMI-CONDUCTOR AND ELECTRONICS", "NEUCLEAR MODEL", "REFLECTION"};
            String[] label4 = {"ORGANIC CHEMISTRY", "CHEMICAL BOND", "ELECTRO-CHEMISTRY"};

            int random = (int) (Math.random()*label1.length);
            int random2 = (int) (Math.random()*label2.length);
            int random3 = (int) (Math.random()*label3.length);
            int random4 = (int) (Math.random()*label4.length);
            jLabel8.setText("" +label1[random]);
            jLabel5.setText("" +label2[random2]);
            jLabel6.setText("" +label3[random3]);
            jLabel7.setText("" +label4[random4]);
           
            
            

            
        }
    }
    
   
    
    public static void main(String args[]) 
    {
     
        
        java.awt.EventQueue.invokeLater(() -> {
            new Topic().setVisible(true);
        });

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar3;
    public javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
