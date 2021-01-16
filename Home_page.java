package system;

import jaco.mp3.player.MP3Player;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Home_page extends javax.swing.JFrame {
    public Home_page() {
        initComponents();
        
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_HORIZ); 
        setResizable(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Guest = new javax.swing.JButton();
        Admin = new javax.swing.JButton();
        register = new javax.swing.JButton();
        Help = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        About_us = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1040, 562));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/Home/Admin-icon2.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(50, 240, 260, 230);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/Home/usericono.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(750, 280, 210, 240);

        Guest.setBackground(new java.awt.Color(51, 102, 255));
        Guest.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Guest.setText("Welcome As Guest");
        Guest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Guest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuestActionPerformed(evt);
            }
        });
        jPanel3.add(Guest);
        Guest.setBounds(440, 300, 210, 50);

        Admin.setBackground(new java.awt.Color(51, 102, 255));
        Admin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Admin.setText("Admin");
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        jPanel3.add(Admin);
        Admin.setBounds(90, 480, 140, 40);

        register.setBackground(new java.awt.Color(51, 102, 255));
        register.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel3.add(register);
        register.setBounds(770, 490, 130, 40);

        Help.setBackground(new java.awt.Color(51, 102, 255));
        Help.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Help.setText("Help");
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });
        jPanel3.add(Help);
        Help.setBounds(490, 500, 120, 40);

        Login.setBackground(new java.awt.Color(51, 102, 255));
        Login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel3.add(Login);
        Login.setBounds(640, 410, 120, 40);

        About_us.setBackground(new java.awt.Color(51, 102, 255));
        About_us.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        About_us.setText("AboutUs");
        About_us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                About_usActionPerformed(evt);
            }
        });
        jPanel3.add(About_us);
        About_us.setBounds(320, 410, 150, 40);

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(510, 410, 80, 31);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Register to get upto 35% discount");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(390, 230, 310, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/Home/Airplane_aeroplane_aircraft_jet_wallpapers__54_-removebg-preview.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(170, 10, 550, 140);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Airline Ticket Reservation System\n");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(260, 170, 700, 50);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1040, 560);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        Help_Page use= new Help_Page();
        use.setVisible(true);
         new MP3Player(new File("C:\\Program Files\\Airline Reservation System\\src\\system\\help\\help.mp3")).play();
    }//GEN-LAST:event_HelpActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
       
      new Loginpage().setVisible(true); 
new MP3Player(new File("C:\\Program Files\\Airline Reservation System\\src\\system\\Home\\loginstart.mp3")).play();
          
        
    }//GEN-LAST:event_LoginActionPerformed
 
    private void About_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_About_usActionPerformed
       aboutUs about =new  aboutUs ();
       about.setVisible(true);
       
       new MP3Player(new File("C:\\Program Files\\Airline Reservation System\\src\\system\\About us\\about-us.mp3")).play();
    }//GEN-LAST:event_About_usActionPerformed

    private void GuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuestActionPerformed
ImageIcon icon =new ImageIcon("");
String a="We recommend you to register if you don't have any account.";
String b="If you Register and then Login you can get upto 35% discount. Please Click ok after sound stops playing. ";
String c="However it is only our recommendation..";
String d="We appreciate your choice. Click Ok to start Booking Flight tickets now.";
String e=a+b; String f=c+d;int m=0;
      
            new MP3Player(new File("C:\\Program Files\\Airline Reservation System\\src\\system\\Guest\\guest1.mp3")).play();
JOptionPane.showMessageDialog(null,e);  
         new MP3Player(new File("C:\\Program Files\\Airline Reservation System\\src\\system\\Guest\\guest2.mp3")).play();
JOptionPane.showMessageDialog(null,f);
 new MP3Player(new File("C:\\Program Files\\Airline Reservation System\\src\\system\\Guest\\guest3.mp3")).play();








        
        Form_fill1 Filling= new  Form_fill1();
     Filling.setVisible(true);
    }//GEN-LAST:event_GuestActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
       Register signup=new    Register();
       signup.setVisible(true);
       new MP3Player(new File("C:\\Program Files\\Airline Reservation System\\src\\system\\Register\\regis2.mp3")).play();
    }//GEN-LAST:event_registerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new MP3Player(new File("C:\\Program Files\\Airline Reservation System\\src\\system\\Home\\Cancel.mp3")).play();   
        String e="If you want help you should click help button but if you wish to";
      String m="close ths window, you should click ok button";
      String r=e+m;
      int y=JOptionPane.showConfirmDialog (null, r,"Do you really wanna exit?",JOptionPane.YES_NO_OPTION);
        
       
         if(y==JOptionPane.YES_OPTION){
            setVisible(false);
         }
         else{setVisible(true);}
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
      
        Admin_page r=new  Admin_page();
       r.setVisible(true);
       new MP3Player(new File("C:\\Program Files\\Airline Reservation System\\src\\system\\Home\\adminstart.mp3")).play();
    }//GEN-LAST:event_AdminActionPerformed
 public static void i(){
 }
    public static void main(String args[]) {
     
        
                new Home_page().setVisible(true);
                
            }
    private Timer timer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About_us;
    public static javax.swing.JButton Admin;
    private javax.swing.JButton Guest;
    private javax.swing.JButton Help;
    private javax.swing.JButton Login;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables
}
