/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import jaco.mp3.player.MP3Player;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author jeeva
 */
public class Admin_page extends javax.swing.JFrame {

    /**
     
     */static int r;
 
    public Admin_page() {
        initComponents();
       
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        l1.setVisible(false);l2.setVisible(false);l3.setVisible(false);
        l4.setVisible(false);pass.setVisible(false);Go.setVisible(false);
        after.setVisible(false);before.setVisible(true);
        
              }

    private void m() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
      public class progresso implements ActionListener{
       public void actionPerformed(ActionEvent evt){
         int n=j.getValue();
       if(n<100)
         {
             n++;
             o.setText(Integer.toString(n)+"%");
             j.setValue(n);
        
        
         }
      
         
         else{
             timer.stop();
             l1.setVisible(true);l2.setVisible(true);l3.setVisible(true);
             l4.setVisible(true);pass.setVisible(true);Go.setVisible(true);
             j.setVisible(false);
             o.setVisible(false);
             after.setVisible(true);
             before.setVisible(false);
         }
       }
       
               
                       
   }
    
    

  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        Go = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        j = new javax.swing.JProgressBar();
        o = new javax.swing.JLabel();
        load = new javax.swing.JButton();
        after = new javax.swing.JLabel();
        before = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(539, 382));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/Admin/admin.jpg"))); // NOI18N
        l1.setText("jLabel1");
        jPanel1.add(l1);
        l1.setBounds(0, 0, 220, 196);

        l2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(51, 0, 153));
        l2.setText("Resitricted Page");
        jPanel1.add(l2);
        l2.setBounds(0, 200, 226, 70);

        l3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(51, 0, 153));
        l3.setText("Only for Adminstrator");
        jPanel1.add(l3);
        l3.setBounds(0, 270, 226, 40);

        l4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l4.setForeground(new java.awt.Color(51, 0, 153));
        l4.setText("Enter the Password, Please!");
        jPanel1.add(l4);
        l4.setBounds(230, 40, 270, 70);

        Go.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Go.setForeground(new java.awt.Color(102, 51, 255));
        Go.setText("Go");
        Go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoActionPerformed(evt);
            }
        });
        jPanel1.add(Go);
        Go.setBounds(310, 250, 120, 40);
        jPanel1.add(pass);
        pass.setBounds(260, 160, 210, 50);

        j.setBackground(new java.awt.Color(255, 204, 255));
        j.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        j.setForeground(new java.awt.Color(51, 255, 0));
        j.setString("Loading ..Please wait...");
        j.setStringPainted(true);
        jPanel1.add(j);
        j.setBounds(0, 350, 540, 30);

        o.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        o.setText("0");
        jPanel1.add(o);
        o.setBounds(220, 320, 70, 30);

        load.setBackground(new java.awt.Color(255, 255, 255));
        load.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        load.setForeground(new java.awt.Color(51, 0, 153));
        load.setText("Load");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });
        jPanel1.add(load);
        load.setBounds(310, 250, 110, 40);

        after.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        after.setForeground(new java.awt.Color(51, 0, 153));
        after.setText("Loaded....Please Enter Password");
        jPanel1.add(after);
        after.setBounds(0, 320, 540, 60);

        before.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        before.setForeground(new java.awt.Color(51, 0, 153));
        before.setText("Strike Load button. to start loading");
        jPanel1.add(before);
        before.setBounds(160, 10, 360, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 540, 380);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(50, 320, 10, 40);
        getContentPane().add(jPanel4);
        jPanel4.setBounds(40, 330, 50, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoActionPerformed
        String f="This Page is not for Customers but only for Adminstrator.Please Click OK to close this. ";
        String iu=pass.getText();

        if(iu.contains("Speed=100%"))
        {
              
               new MP3Player(new File("C:\\Program Files\\Airline Reservation System\\src\\system\\Admin\\Pa.mp3")).play();
            this.dispose();
                 new Admin_Setup_page().setVisible(true);
            

        }

        else{
               new MP3Player(new File("C:\\Program Files\\Airline Reservation System\\src\\system\\Admin\\admin1.mp3")).play();
            JOptionPane.showMessageDialog(this,f,"Loading Error",JOptionPane.WARNING_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_GoActionPerformed
private void mi()
{
    
}
    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
       timer=new Timer(50,new progresso());
        timer.start(); 
              
     
    }//GEN-LAST:event_loadActionPerformed
 
      
    public static void main(String args[]) {
       
              Admin_page h= new Admin_page();
               
              h. setVisible(true); 
              
              
            
             
    }
            

    
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               

private Timer timer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Go;
    private javax.swing.JLabel after;
    private javax.swing.JLabel before;
    private javax.swing.JProgressBar j;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JLabel l1;
    public static javax.swing.JLabel l2;
    public static javax.swing.JLabel l3;
    public static javax.swing.JLabel l4;
    private javax.swing.JButton load;
    private javax.swing.JLabel o;
    public static javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables

}