/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author jeeva
 */
public class Delete_flight extends javax.swing.JFrame {

    /**
     * Creates new form Delete_flight
     */
    public Delete_flight() {
        initComponents();
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         setExtendedState(JFrame.MAXIMIZED_HORIZ); 
        setResizable(false);
         code.setVisible(false);
        
    }
    
    
     public class progresso implements ActionListener{
       public void actionPerformed(ActionEvent evt){
         int n=jo.getValue();
       if(n<100)
         {
             n++;
             oi.setText(Integer.toString(n)+"%");
             jo.setValue(n);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
         }
         
         else{
             timer.stop();
   
           oi.setVisible(false);
           jo.setVisible(false);
           generate.setVisible(false);
           
           code.setVisible(true);
           setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           
       }
         }
       }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        code = new javax.swing.JLabel();
        oi = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jo = new javax.swing.JProgressBar();
        generate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        mio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(730, 415));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Delete flight");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 330, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText(" Generating Deleting Code");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 60, 330, 60);

        code.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        code.setForeground(new java.awt.Color(0, 0, 255));
        code.setText("Delete Code: Jeevan8847");
        jPanel1.add(code);
        code.setBounds(0, 120, 330, 110);

        oi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        oi.setText("100%");
        jPanel1.add(oi);
        oi.setBounds(100, 120, 130, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/Admin/aero.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 230, 330, 190);
        jPanel1.add(jo);
        jo.setBounds(-4, 150, 340, 40);

        generate.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        generate.setText("Generate");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });
        jPanel1.add(generate);
        generate.setBounds(70, 200, 160, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 330, 420);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Enter The Delete Code");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 210, 210, 50);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Delete flight");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(20, 300, 140, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Flight Number");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 150, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Flight Name");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 80, 108, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Company Name");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 20, 142, 22);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/Admin/delete.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(240, 300, 70, 70);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jTextField1);
        jTextField1.setBounds(190, 20, 190, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(jTextField2);
        jTextField2.setBounds(190, 80, 190, 30);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField3);
        jTextField3.setBounds(190, 150, 190, 30);

        mio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(mio);
        mio.setBounds(240, 220, 140, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(330, 0, 420, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String loa= mio.getText();
        if(loa.contains("Jeehkkvan8847")){
        String flightname=jTextField1.getText();
        String companyName=jTextField2.getText();
        String flightNumber=jTextField3.getText();
     
      
        }                 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
timer = new Timer(50,new Delete_flight.progresso());
  
        timer.start();     }//GEN-LAST:event_generateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
                new Delete_flight().setVisible(true);
            
    }
private Timer timer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel code;
    private javax.swing.JButton generate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JProgressBar jo;
    public static javax.swing.JTextField mio;
    private javax.swing.JLabel oi;
    // End of variables declaration//GEN-END:variables
}
