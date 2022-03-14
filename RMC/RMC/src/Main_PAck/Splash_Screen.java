 
package Main_PAck; 

import Auth_test.LogingPage;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Splash_Screen extends javax.swing.JFrame {
   public Splash_Screen() {
        initComponents();
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        jPanel1.add(jProgressBar2);
        jProgressBar2.setBounds(160, 310, 490, 10);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("0");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 340, 80, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel2.setText(".");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 320, 120, 10);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo_back.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 830, 180);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RMC CHEMICAL COMPANY LTD");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 180, 810, 40);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("All Kinds of Construction Chemical & Paints Manufacturer Company");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 220, 820, 30);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Drum_Picture .png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 220, 810, 360);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 830, 530);

        setSize(new java.awt.Dimension(844, 567));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    public static void main(String args[]) { 
       Splash_Screen ff=new Splash_Screen();  
       
       ff.setVisible(true);
         for (int i = -1; i <=99;) {
             i++;
                 try {
                      Thread.sleep(40); 
                      jProgressBar2.setValue(i);
                      jLabel1.setText(""+i+" %");
                 switch (i) {
                     case 30:
                         jLabel2.setText("Loading...");
                         break;
                     case 50:
                         jLabel2.setText("Loading......");
                         break;
                     case 70:
                         jLabel2.setText("Loading........");
                         break;
                     case 90:
                         jLabel2.setText("Success..........");
                         break;
                     default:
                         break;
                 }
                      if(i==100){
       Auth_test.LogingPage f =new LogingPage();
          f.setVisible(true);
               
                ff.setVisible(false);
             }
                 } catch (InterruptedException ex) {
                     Logger.getLogger(Splash_Screen.class.getName()).log(Level.SEVERE, null, ex);
                 }

    }}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JProgressBar jProgressBar2;
    // End of variables declaration//GEN-END:variables
}
