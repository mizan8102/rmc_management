 
package Bill_Show;

import Main_PAck.connection_class;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.SwingConstants.RIGHT;
 
public class Demo111 extends javax.swing.JFrame {
  connection_class con;
  static  int top=1;
    public Demo111() {
        initComponents();
          con=new connection_class();
      //test();
        showData();
        showProd();
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        delivery_txt = new javax.swing.JLabel();
        name_txt = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cel_txt = new javax.swing.JLabel();
        bill_txt = new javax.swing.JLabel();
        date_txt = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        previos_am_text = new javax.swing.JLabel();
        total_am_txt = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(255, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHEMICAL COMPANY LTD.");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(120, 40, 340, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("All Kinds of Construction Chemical & Paints Manufacturer");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(200, 30, 370, 20);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Name of Buyer     :");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 10, 100, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Delivery Place      :");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 40, 110, 20);

        delivery_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delivery_txt.setText("FUlgazi");
        jPanel4.add(delivery_txt);
        delivery_txt.setBounds(120, 40, 270, 20);

        name_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        name_txt.setText("JAsmin AKter Jesika");
        jPanel4.add(name_txt);
        name_txt.setBounds(120, 14, 260, 20);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(10, 140, 390, 110);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Date   :");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(10, 30, 40, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Bill No :");
        jPanel5.add(jLabel18);
        jLabel18.setBounds(10, 10, 40, 14);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Cell No :");
        jPanel5.add(jLabel19);
        jLabel19.setBounds(10, 50, 50, 20);

        cel_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cel_txt.setText("01558862259");
        jPanel5.add(cel_txt);
        cel_txt.setBounds(60, 50, 160, 30);

        bill_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bill_txt.setText("001874237");
        jPanel5.add(bill_txt);
        bill_txt.setBounds(60, 0, 160, 30);

        date_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        date_txt.setText("01/22/2021");
        jPanel5.add(date_txt);
        date_txt.setBounds(60, 30, 130, 20);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(400, 140, 220, 110);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        jPanel6.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(null);
        jPanel6.add(jPanel10);
        jPanel10.setBounds(50, 50, 310, 280);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(null);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        jPanel9.setLayout(null);
        jPanel11.add(jPanel9);
        jPanel9.setBounds(0, 350, 610, 40);

        jPanel6.add(jPanel11);
        jPanel11.setBounds(0, 50, 50, 280);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setLayout(null);
        jPanel6.add(jPanel12);
        jPanel12.setBounds(360, 50, 80, 280);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel13.setLayout(null);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 51, 153));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        jPanel13.add(jLabel29);
        jLabel29.setBounds(490, 0, 120, 50);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 51, 153));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Due Amount");
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        jPanel13.add(jLabel30);
        jLabel30.setBounds(410, 0, 80, 50);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel18.setLayout(null);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText(" Previous ");
        jPanel18.add(jLabel25);
        jLabel25.setBounds(0, 0, 60, 20);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel41.setText(" Amount");
        jPanel18.add(jLabel41);
        jLabel41.setBounds(0, 14, 70, 10);

        jPanel13.add(jPanel18);
        jPanel18.setBounds(0, 370, 70, 30);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.setLayout(null);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText(" Amount");
        jPanel19.add(jLabel39);
        jLabel39.setBounds(0, 16, 70, 14);

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText(" Total");
        jPanel19.add(jLabel40);
        jLabel40.setBounds(0, 0, 50, 20);

        jPanel13.add(jPanel19);
        jPanel19.setBounds(0, 340, 70, 30);

        jPanel6.add(jPanel13);
        jPanel13.setBounds(440, 50, 70, 400);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel14.setLayout(null);

        previos_am_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        previos_am_text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        previos_am_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.add(previos_am_text);
        previos_am_text.setBounds(0, 370, 100, 30);

        total_am_txt.setBackground(new java.awt.Color(255, 255, 255));
        total_am_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        total_am_txt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total_am_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.add(total_am_txt);
        total_am_txt.setBounds(0, 340, 100, 30);

        jPanel6.add(jPanel14);
        jPanel14.setBounds(510, 50, 100, 400);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setLayout(null);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Rechived Amount");
        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.add(jLabel31);
        jLabel31.setBounds(0, 30, 70, 30);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.add(jLabel33);
        jLabel33.setBounds(70, 30, 100, 30);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("Discount ");
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.add(jLabel35);
        jLabel35.setBounds(0, 0, 70, 30);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.add(jLabel38);
        jLabel38.setBounds(70, 0, 100, 30);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText("Balance");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.add(jLabel42);
        jLabel42.setBounds(0, 60, 70, 30);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.add(jLabel43);
        jLabel43.setBounds(70, 60, 100, 30);

        jPanel6.add(jPanel15);
        jPanel15.setBounds(440, 450, 170, 90);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(null);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Total Ltr/Kg");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(jLabel20);
        jLabel20.setBounds(360, 0, 80, 50);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("SL NO");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(jLabel21);
        jLabel21.setBounds(0, 0, 50, 50);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Description Of Product ");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(jLabel22);
        jLabel22.setBounds(50, 0, 310, 50);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Amount in Taka");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(jLabel23);
        jLabel23.setBounds(510, 0, 99, 50);

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Unit Price");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(jLabel24);
        jLabel24.setBounds(440, 0, 70, 50);

        jPanel6.add(jPanel8);
        jPanel8.setBounds(0, 0, 610, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel8);
        jLabel8.setBounds(0, 490, 350, 20);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Taka (in word)");
        jPanel6.add(jLabel32);
        jLabel32.setBounds(0, 460, 130, 20);

        jPanel3.add(jPanel6);
        jPanel6.setBounds(10, 250, 610, 590);

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Lgog (1)_1.png"))); // NOI18N
        jPanel3.add(jLabel36);
        jLabel36.setBounds(10, 0, 110, 100);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CHALLAN/ INVOICE BILL");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(210, 110, 190, 30);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/location.png"))); // NOI18N
        jLabel26.setText("Head Office :");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel26.setIconTextGap(1);
        jPanel3.add(jLabel26);
        jLabel26.setBounds(370, 930, 180, 20);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Tikatuli, Dhaka");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(400, 970, 190, 20);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(jLabel44);
        jLabel44.setBounds(40, 920, 170, 0);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("01819-909044");
        jPanel3.add(jLabel45);
        jLabel45.setBounds(50, 1010, 217, 20);

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/web.png"))); // NOI18N
        jLabel46.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel46.setIconTextGap(1);
        jPanel3.add(jLabel46);
        jLabel46.setBounds(370, 900, 30, 20);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel47.setText("http://rmcchemical.com/");
        jLabel47.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel47.setIconTextGap(1);
        jPanel3.add(jLabel47);
        jLabel47.setBounds(400, 1010, 180, 15);

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gmail.png"))); // NOI18N
        jLabel48.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel48.setIconTextGap(1);
        jPanel3.add(jLabel48);
        jLabel48.setBounds(370, 880, 30, 20);

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setText("info@rmcchemical.com ");
        jLabel51.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel51.setIconTextGap(1);
        jPanel3.add(jLabel51);
        jLabel51.setBounds(400, 990, 160, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("..................................................................");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(390, 880, 200, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("For RMC Office");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(390, 900, 200, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("..................................................................");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(20, 880, 200, 20);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Received  BY");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(20, 900, 200, 20);

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setText("Old GP Center Road,Jautola Cumilla");
        jPanel3.add(jLabel52);
        jLabel52.setBounds(50, 980, 217, 15);

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel53.setText("01712-905949, 01729-483000");
        jPanel3.add(jLabel53);
        jLabel53.setBounds(50, 990, 220, 20);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/location.png"))); // NOI18N
        jLabel34.setText("Cumilla Office :");
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel34.setIconTextGap(1);
        jPanel3.add(jLabel34);
        jLabel34.setBounds(30, 940, 180, 20);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("1026, Anzir Manzil ");
        jPanel3.add(jLabel37);
        jLabel37.setBounds(50, 960, 170, 20);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel54.setText("Paramount Concord, 9, 9/1 & 9/2");
        jPanel3.add(jLabel54);
        jLabel54.setBounds(400, 950, 190, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RMC ");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(110, 10, 110, 40);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1051, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 770, 1300);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("X");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13);
        jLabel13.setBounds(770, 0, 50, 40);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(490, 3, 80, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 830, 1370);

        setSize(new java.awt.Dimension(846, 1417));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel13MouseClicked
void test(String prO,String lT,String uPrice,String amTaka  ){
    
       JLabel product,ltr,unit_price,ammount_taka,sl; 
            product=new JLabel(prO);  
            ltr=new JLabel(lT);  
                unit_price=new JLabel(uPrice);  
                ammount_taka=new JLabel(amTaka); 
                 sl=new JLabel("1");
                 sl.setBounds(1,top, 300,50);  
                product.setBounds(1,top, 300,50);  
                ltr.setBounds(1,top, 300,50);  
                unit_price.setBounds(1,top, 300,50); 
                ammount_taka.setBounds(1,top, 300,50);
               jPanel11.add(sl);  
                 jPanel10.add(product);  
                  jPanel12.add(ltr);
                   jPanel13.add(unit_price); 
                  jPanel14.add(ammount_taka);
                   
                 jPanel10.setLayout(null);  
                 jPanel10.setVisible(true); 
                 
                 jPanel12.setLayout(null);  
                 jPanel12.setVisible(true); 
                 
                 jPanel13.setLayout(null);  
                 jPanel13.setVisible(true);
                 
                 jPanel14.setLayout(null);  
                 jPanel14.setVisible(true);
                 
                 jPanel10.setLayout(null);  
                 jPanel10.setVisible(true);
                 
                 top=top+15;
          
    }

void showProd(){
     String prod,lt,pric,toamm;
     int id=0;
      try {
          String find="SELECT  `p_name`,`s_price`, `quantity`, `total` FROM `rmc_chemical_ltd`.`sales` WHERE `bill`='005'";
          con.contest();
          con.st = con.ct.prepareCall(find);
          con.rs = con.st.executeQuery(find);
          while(con.rs.next()) {
          prod=con.rs.getString(1);
           pric=con.rs.getString(2);
            lt=con.rs.getString(3);
            toamm=con.rs.getString(4);
            
              test(prod, lt, pric, toamm);
          
          }
      } catch (SQLException ex) {
          Logger.getLogger(Demo111.class.getName()).log(Level.SEVERE, null, ex);
      }
    
    
}

void showData(){
    
      try {
          String find="SELECT `bill`,`customer`,`date`,`amount`,`dis`,`total_amount`,`final_amount`,`paid`,`event`,`delivery_place`,`total_ltr` FROM `rmc_chemical_ltd`.`sales_account` WHERE `bill`='005'";
          con.contest();
          con.st = con.ct.prepareCall(find);
          con.rs = con.st.executeQuery(find);
          while(con.rs.next()) {
           bill_txt.setText(""+con.rs.getString(1));
            name_txt.setText(""+con.rs.getString(2));
            date_txt.setText(""+con.rs.getString(3));
             delivery_txt.setText(""+con.rs.getString(10));
              total_am_txt.setText(""+con.rs.getString(4));
             jLabel38.setText(""+con.rs.getString(5));
              jLabel33.setText(""+con.rs.getString(8));
          double pre,du;
              pre = Double.parseDouble(con.rs.getString(7))-Double.parseDouble(con.rs.getString(6));
              du = Double.parseDouble(con.rs.getString(7))-Double.parseDouble(con.rs.getString(8));
               pre=Math.round(pre*100.0)/100.0; 
                 du=Math.round(du*100.0)/100.0; 
               previos_am_text.setText(""+pre);
               jLabel43.setText(""+du);
          
          }
      } catch (SQLException ex) {
          Logger.getLogger(Demo111.class.getName()).log(Level.SEVERE, null, ex);
      }
    
    
}

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PrinterJob job=PrinterJob.getPrinterJob();
        job.setJobName("Print Data");
        job.setPrintable(new Printable() {
            @Override
            public int print(Graphics pg, PageFormat pf, int PageNum){
                //To change body of generated methods, choose Tools | Templates.
                if(PageNum>0){
                    return NO_SUCH_PAGE;}
                Graphics2D g2=(Graphics2D) pg;
                g2.translate(pf.getImageableX(),pf.getImageableX());
                g2.scale(1,0.8);
                jPanel3.print(g2);
                return Printable.PAGE_EXISTS;
            }
        });
        if(job.printDialog()==true){
            JOptionPane.showMessageDialog(this,"Print success..");
            try{
                job.print();
            }catch(PrinterException P){

            }
            dispose();

        }else{JOptionPane.showMessageDialog(this,"Failed...");}
    }//GEN-LAST:event_jButton2ActionPerformed
 
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
            java.util.logging.Logger.getLogger(Demo111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demo111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demo111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demo111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Demo111().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bill_txt;
    private javax.swing.JLabel cel_txt;
    private javax.swing.JLabel date_txt;
    private javax.swing.JLabel delivery_txt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name_txt;
    private javax.swing.JLabel previos_am_text;
    private javax.swing.JLabel total_am_txt;
    // End of variables declaration//GEN-END:variables
}
