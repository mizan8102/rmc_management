 
package Bill_Show;

import Main_PAck.connection_class; 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger; 
import javax.swing.JOptionPane; 
 
public class Demo_Pat extends javax.swing.JFrame {
  connection_class con;
  static  int top=1;
    public Demo_Pat(String text) {
        initComponents();
            con=new connection_class();
      showProd(text);
        showData(text); 
     
      //test();
        
    }  
    private Demo_Pat() {
   initComponents(); } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
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
        jLabel8 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        product = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        total_amount_l = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        taka_1 = new javax.swing.JLabel();
        taka_2 = new javax.swing.JLabel();
        taka_3 = new javax.swing.JLabel();
        taka_4 = new javax.swing.JLabel();
        taka_5 = new javax.swing.JLabel();
        taka_6 = new javax.swing.JLabel();
        taka_7 = new javax.swing.JLabel();
        taka_8 = new javax.swing.JLabel();
        taka_9 = new javax.swing.JLabel();
        taka_10 = new javax.swing.JLabel();
        taka_11 = new javax.swing.JLabel();
        taka_12 = new javax.swing.JLabel();
        taka_13 = new javax.swing.JLabel();
        taka_14 = new javax.swing.JLabel();
        taka_15 = new javax.swing.JLabel();
        taka_16 = new javax.swing.JLabel();
        taka_17 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        sl_l1 = new javax.swing.JLabel();
        sl_l2 = new javax.swing.JLabel();
        sl_l3 = new javax.swing.JLabel();
        sl_l4 = new javax.swing.JLabel();
        sl_l5 = new javax.swing.JLabel();
        sl_l6 = new javax.swing.JLabel();
        sl_l7 = new javax.swing.JLabel();
        sl_l8 = new javax.swing.JLabel();
        sl_l9 = new javax.swing.JLabel();
        sl_l10 = new javax.swing.JLabel();
        sl_l11 = new javax.swing.JLabel();
        sl_l12 = new javax.swing.JLabel();
        sl_l13 = new javax.swing.JLabel();
        sl_l14 = new javax.swing.JLabel();
        sl_l15 = new javax.swing.JLabel();
        sl_l17 = new javax.swing.JLabel();
        sl_l18 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        product1 = new javax.swing.JLabel();
        product2 = new javax.swing.JLabel();
        product3 = new javax.swing.JLabel();
        product4 = new javax.swing.JLabel();
        product5 = new javax.swing.JLabel();
        product6 = new javax.swing.JLabel();
        product7 = new javax.swing.JLabel();
        product8 = new javax.swing.JLabel();
        product9 = new javax.swing.JLabel();
        product10 = new javax.swing.JLabel();
        product11 = new javax.swing.JLabel();
        product12 = new javax.swing.JLabel();
        product13 = new javax.swing.JLabel();
        product14 = new javax.swing.JLabel();
        product15 = new javax.swing.JLabel();
        product16 = new javax.swing.JLabel();
        product17 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        Chalan1 = new javax.swing.JLabel();
        Chalan2 = new javax.swing.JLabel();
        Chalan3 = new javax.swing.JLabel();
        Chalan4 = new javax.swing.JLabel();
        Chalan5 = new javax.swing.JLabel();
        Chalan6 = new javax.swing.JLabel();
        Chalan7 = new javax.swing.JLabel();
        Chalan8 = new javax.swing.JLabel();
        Chalan9 = new javax.swing.JLabel();
        Chalan10 = new javax.swing.JLabel();
        Chalan11 = new javax.swing.JLabel();
        Chalan12 = new javax.swing.JLabel();
        Chalan13 = new javax.swing.JLabel();
        Chalan14 = new javax.swing.JLabel();
        Chalan15 = new javax.swing.JLabel();
        Chalan16 = new javax.swing.JLabel();
        Chalan17 = new javax.swing.JLabel();
        Chalan18 = new javax.swing.JLabel();
        Chalan19 = new javax.swing.JLabel();
        Chalan20 = new javax.swing.JLabel();
        Chalan21 = new javax.swing.JLabel();
        Chalan22 = new javax.swing.JLabel();
        Chalan23 = new javax.swing.JLabel();
        Chalan24 = new javax.swing.JLabel();
        Chalan25 = new javax.swing.JLabel();
        Chalan26 = new javax.swing.JLabel();
        Chalan27 = new javax.swing.JLabel();
        Chalan28 = new javax.swing.JLabel();
        Chalan29 = new javax.swing.JLabel();
        Chalan30 = new javax.swing.JLabel();
        Chalan31 = new javax.swing.JLabel();
        Chalan32 = new javax.swing.JLabel();
        Chalan33 = new javax.swing.JLabel();
        Chalan34 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        price_1 = new javax.swing.JLabel();
        price_2 = new javax.swing.JLabel();
        price_3 = new javax.swing.JLabel();
        price_4 = new javax.swing.JLabel();
        price_5 = new javax.swing.JLabel();
        price_6 = new javax.swing.JLabel();
        price_7 = new javax.swing.JLabel();
        price_8 = new javax.swing.JLabel();
        price_9 = new javax.swing.JLabel();
        price_10 = new javax.swing.JLabel();
        price_11 = new javax.swing.JLabel();
        price_12 = new javax.swing.JLabel();
        price_13 = new javax.swing.JLabel();
        price_14 = new javax.swing.JLabel();
        price_15 = new javax.swing.JLabel();
        price_16 = new javax.swing.JLabel();
        price_17 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        ltr_1 = new javax.swing.JLabel();
        ltr_2 = new javax.swing.JLabel();
        ltr_3 = new javax.swing.JLabel();
        ltr_4 = new javax.swing.JLabel();
        ltr_5 = new javax.swing.JLabel();
        ltr_6 = new javax.swing.JLabel();
        ltr_7 = new javax.swing.JLabel();
        ltr_8 = new javax.swing.JLabel();
        ltr_9 = new javax.swing.JLabel();
        ltr_10 = new javax.swing.JLabel();
        ltr_11 = new javax.swing.JLabel();
        ltr_12 = new javax.swing.JLabel();
        ltr_13 = new javax.swing.JLabel();
        ltr_14 = new javax.swing.JLabel();
        ltr_15 = new javax.swing.JLabel();
        ltr_16 = new javax.swing.JLabel();
        ltr_17 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Unit_1 = new javax.swing.JLabel();
        Unit_2 = new javax.swing.JLabel();
        Unit_3 = new javax.swing.JLabel();
        Unit_4 = new javax.swing.JLabel();
        Unit_5 = new javax.swing.JLabel();
        Unit_6 = new javax.swing.JLabel();
        Unit_7 = new javax.swing.JLabel();
        Unit_8 = new javax.swing.JLabel();
        Unit_9 = new javax.swing.JLabel();
        Unit_10 = new javax.swing.JLabel();
        Unit_11 = new javax.swing.JLabel();
        Unit_12 = new javax.swing.JLabel();
        Unit_13 = new javax.swing.JLabel();
        Unit_14 = new javax.swing.JLabel();
        Unit_15 = new javax.swing.JLabel();
        Unit_16 = new javax.swing.JLabel();
        Chalan51 = new javax.swing.JLabel();
        Chalan52 = new javax.swing.JLabel();
        Chalan53 = new javax.swing.JLabel();
        Chalan54 = new javax.swing.JLabel();
        Chalan55 = new javax.swing.JLabel();
        Chalan56 = new javax.swing.JLabel();
        Chalan57 = new javax.swing.JLabel();
        Chalan58 = new javax.swing.JLabel();
        Chalan59 = new javax.swing.JLabel();
        Chalan60 = new javax.swing.JLabel();
        Chalan61 = new javax.swing.JLabel();
        Chalan62 = new javax.swing.JLabel();
        Chalan63 = new javax.swing.JLabel();
        Chalan64 = new javax.swing.JLabel();
        Chalan65 = new javax.swing.JLabel();
        Chalan66 = new javax.swing.JLabel();
        Chalan67 = new javax.swing.JLabel();
        Chalan68 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(255, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

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
        delivery_txt.setBounds(120, 40, 250, 20);

        name_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        name_txt.setText("JAsmin AKter Jesika");
        jPanel4.add(name_txt);
        name_txt.setBounds(120, 14, 240, 20);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(30, 140, 370, 80);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Date           :");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(10, 30, 70, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Voucher No  :");
        jPanel5.add(jLabel18);
        jLabel18.setBounds(10, 10, 80, 14);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Cell No       :");
        jPanel5.add(jLabel19);
        jLabel19.setBounds(10, 50, 70, 20);

        cel_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cel_txt.setText("01558862259");
        jPanel5.add(cel_txt);
        cel_txt.setBounds(90, 50, 90, 20);

        bill_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bill_txt.setText("001874237");
        jPanel5.add(bill_txt);
        bill_txt.setBounds(90, 0, 90, 30);

        date_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        date_txt.setText("01/22/2021");
        jPanel5.add(date_txt);
        date_txt.setBounds(90, 30, 80, 20);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(400, 140, 180, 80);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        jPanel6.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel8);
        jLabel8.setBounds(10, 490, 350, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("SL");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel21);
        jLabel21.setBounds(0, 0, 40, 30);

        product.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product.setText("Product ");
        product.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(product);
        product.setBounds(40, 0, 160, 30);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Quantity");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.add(jLabel25);
        jLabel25.setBounds(270, 20, 70, 10);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("LTR");
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel29);
        jLabel29.setBounds(410, 0, 50, 30);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Price");
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel30);
        jLabel30.setBounds(340, 0, 70, 30);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Amount in Taka");
        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel31);
        jLabel31.setBounds(460, 0, 90, 30);

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText("Balance");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel42);
        jLabel42.setBounds(360, 490, 100, 30);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel43);
        jLabel43.setBounds(460, 490, 90, 30);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Rechived Amount");
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel32);
        jLabel32.setBounds(360, 460, 100, 30);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel33);
        jLabel33.setBounds(460, 460, 90, 30);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("Discount ");
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel35);
        jLabel35.setBounds(360, 430, 100, 30);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel38);
        jLabel38.setBounds(460, 430, 90, 30);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("Previous Amount");
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel39);
        jLabel39.setBounds(360, 400, 100, 30);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel40);
        jLabel40.setBounds(460, 400, 90, 30);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel41);
        jLabel41.setBounds(410, 370, 70, 30);

        total_amount_l.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        total_amount_l.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel6.add(total_amount_l);
        total_amount_l.setBounds(480, 370, 70, 30);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(null);

        taka_1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taka_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(taka_1);
        taka_1.setBounds(0, 0, 90, 20);

        taka_2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taka_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(taka_2);
        taka_2.setBounds(0, 20, 90, 20);

        taka_3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taka_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(taka_3);
        taka_3.setBounds(0, 40, 90, 20);

        taka_4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taka_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(taka_4);
        taka_4.setBounds(0, 60, 90, 20);

        taka_5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taka_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(taka_5);
        taka_5.setBounds(0, 80, 90, 20);

        taka_6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taka_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(taka_6);
        taka_6.setBounds(0, 100, 90, 20);

        taka_7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taka_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(taka_7);
        taka_7.setBounds(0, 120, 90, 20);

        taka_8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taka_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(taka_8);
        taka_8.setBounds(0, 140, 90, 20);

        taka_9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taka_9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(taka_9);
        taka_9.setBounds(0, 160, 80, 20);

        taka_10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taka_10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(taka_10);
        taka_10.setBounds(0, 180, 90, 20);

        taka_11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taka_11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(taka_11);
        taka_11.setBounds(0, 200, 90, 20);

        taka_12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taka_12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(taka_12);
        taka_12.setBounds(0, 220, 90, 20);

        taka_13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taka_13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(taka_13);
        taka_13.setBounds(0, 240, 90, 20);

        taka_14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taka_14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(taka_14);
        taka_14.setBounds(0, 260, 90, 20);

        taka_15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taka_15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(taka_15);
        taka_15.setBounds(0, 280, 90, 20);

        taka_16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taka_16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(taka_16);
        taka_16.setBounds(0, 300, 90, 20);

        taka_17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        taka_17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(taka_17);
        taka_17.setBounds(0, 320, 90, 20);

        jPanel6.add(jPanel7);
        jPanel7.setBounds(460, 30, 90, 340);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(null);

        sl_l1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sl_l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(sl_l1);
        sl_l1.setBounds(0, 0, 40, 20);

        sl_l2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sl_l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(sl_l2);
        sl_l2.setBounds(0, 20, 40, 20);

        sl_l3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sl_l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(sl_l3);
        sl_l3.setBounds(0, 40, 40, 20);

        sl_l4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sl_l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(sl_l4);
        sl_l4.setBounds(0, 60, 40, 20);

        sl_l5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sl_l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(sl_l5);
        sl_l5.setBounds(0, 80, 40, 20);

        sl_l6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sl_l6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(sl_l6);
        sl_l6.setBounds(0, 100, 40, 20);

        sl_l7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sl_l7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(sl_l7);
        sl_l7.setBounds(0, 120, 40, 20);

        sl_l8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sl_l8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(sl_l8);
        sl_l8.setBounds(0, 140, 40, 20);

        sl_l9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sl_l9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(sl_l9);
        sl_l9.setBounds(0, 160, 40, 20);

        sl_l10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sl_l10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(sl_l10);
        sl_l10.setBounds(0, 180, 40, 20);

        sl_l11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sl_l11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(sl_l11);
        sl_l11.setBounds(0, 200, 40, 20);

        sl_l12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sl_l12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(sl_l12);
        sl_l12.setBounds(0, 220, 40, 20);

        sl_l13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sl_l13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(sl_l13);
        sl_l13.setBounds(0, 240, 40, 20);

        sl_l14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sl_l14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(sl_l14);
        sl_l14.setBounds(0, 260, 40, 20);

        sl_l15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sl_l15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(sl_l15);
        sl_l15.setBounds(0, 280, 40, 20);

        sl_l17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sl_l17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(sl_l17);
        sl_l17.setBounds(0, 320, 40, 20);

        sl_l18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sl_l18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(sl_l18);
        sl_l18.setBounds(0, 300, 40, 20);

        jPanel6.add(jPanel8);
        jPanel8.setBounds(0, 30, 40, 340);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(null);

        product1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(product1);
        product1.setBounds(0, 0, 160, 20);

        product2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(product2);
        product2.setBounds(0, 20, 160, 20);

        product3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(product3);
        product3.setBounds(0, 40, 160, 20);

        product4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(product4);
        product4.setBounds(0, 60, 160, 20);

        product5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(product5);
        product5.setBounds(0, 80, 160, 20);

        product6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(product6);
        product6.setBounds(0, 100, 160, 20);

        product7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(product7);
        product7.setBounds(0, 120, 160, 20);

        product8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(product8);
        product8.setBounds(0, 140, 160, 20);

        product9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(product9);
        product9.setBounds(0, 160, 160, 20);

        product10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(product10);
        product10.setBounds(0, 180, 160, 20);

        product11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(product11);
        product11.setBounds(0, 200, 160, 20);

        product12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(product12);
        product12.setBounds(0, 220, 160, 20);

        product13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(product13);
        product13.setBounds(0, 240, 160, 20);

        product14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(product14);
        product14.setBounds(0, 260, 160, 20);

        product15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(product15);
        product15.setBounds(0, 280, 160, 20);

        product16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(product16);
        product16.setBounds(0, 300, 160, 20);

        product17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(product17);
        product17.setBounds(0, 320, 160, 20);

        jPanel6.add(jPanel9);
        jPanel9.setBounds(40, 30, 160, 340);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(null);

        Chalan1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan1);
        Chalan1.setBounds(0, 0, 70, 20);

        Chalan2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan2);
        Chalan2.setBounds(0, 20, 70, 20);

        Chalan3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan3);
        Chalan3.setBounds(0, 40, 70, 20);

        Chalan4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan4);
        Chalan4.setBounds(0, 60, 70, 20);

        Chalan5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan5);
        Chalan5.setBounds(0, 80, 70, 20);

        Chalan6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan6);
        Chalan6.setBounds(0, 100, 70, 20);

        Chalan7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan7);
        Chalan7.setBounds(0, 120, 70, 20);

        Chalan8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan8);
        Chalan8.setBounds(0, 140, 70, 20);

        Chalan9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan9);
        Chalan9.setBounds(0, 160, 70, 20);

        Chalan10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan10);
        Chalan10.setBounds(0, 180, 70, 20);

        Chalan11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan11);
        Chalan11.setBounds(0, 200, 70, 20);

        Chalan12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan12);
        Chalan12.setBounds(0, 220, 70, 20);

        Chalan13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan13);
        Chalan13.setBounds(0, 240, 70, 20);

        Chalan14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan14);
        Chalan14.setBounds(0, 260, 70, 20);

        Chalan15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan15);
        Chalan15.setBounds(0, 280, 70, 20);

        Chalan16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan16);
        Chalan16.setBounds(0, 300, 70, 20);

        Chalan17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan17);
        Chalan17.setBounds(0, 320, 70, 20);

        Chalan18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan18);
        Chalan18.setBounds(0, 0, 60, 20);

        Chalan19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan19);
        Chalan19.setBounds(0, 40, 60, 20);

        Chalan20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan20);
        Chalan20.setBounds(0, 20, 60, 20);

        Chalan21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan21);
        Chalan21.setBounds(0, 80, 60, 20);

        Chalan22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan22);
        Chalan22.setBounds(0, 60, 60, 20);

        Chalan23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan23);
        Chalan23.setBounds(0, 100, 60, 20);

        Chalan24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan24);
        Chalan24.setBounds(0, 120, 60, 20);

        Chalan25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan25);
        Chalan25.setBounds(0, 160, 60, 20);

        Chalan26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan26);
        Chalan26.setBounds(0, 140, 60, 20);

        Chalan27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan27);
        Chalan27.setBounds(0, 180, 60, 20);

        Chalan28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan28);
        Chalan28.setBounds(0, 200, 60, 20);

        Chalan29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan29);
        Chalan29.setBounds(0, 220, 60, 20);

        Chalan30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan30);
        Chalan30.setBounds(0, 240, 60, 20);

        Chalan31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan31);
        Chalan31.setBounds(0, 260, 60, 20);

        Chalan32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan32);
        Chalan32.setBounds(0, 280, 60, 20);

        Chalan33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan33);
        Chalan33.setBounds(0, 300, 60, 20);

        Chalan34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(Chalan34);
        Chalan34.setBounds(0, 320, 60, 20);

        jPanel6.add(jPanel10);
        jPanel10.setBounds(270, 30, 70, 340);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(null);

        price_1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(price_1);
        price_1.setBounds(0, 0, 70, 20);

        price_2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(price_2);
        price_2.setBounds(0, 20, 70, 20);

        price_3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(price_3);
        price_3.setBounds(0, 40, 70, 20);

        price_4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(price_4);
        price_4.setBounds(0, 60, 70, 20);

        price_5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(price_5);
        price_5.setBounds(0, 80, 70, 20);

        price_6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(price_6);
        price_6.setBounds(0, 100, 70, 20);

        price_7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(price_7);
        price_7.setBounds(0, 120, 70, 20);

        price_8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(price_8);
        price_8.setBounds(0, 140, 70, 20);

        price_9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price_9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(price_9);
        price_9.setBounds(0, 160, 70, 20);

        price_10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price_10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(price_10);
        price_10.setBounds(0, 180, 70, 20);

        price_11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price_11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(price_11);
        price_11.setBounds(0, 200, 70, 20);

        price_12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price_12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(price_12);
        price_12.setBounds(0, 220, 70, 20);

        price_13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price_13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(price_13);
        price_13.setBounds(0, 240, 70, 20);

        price_14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price_14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(price_14);
        price_14.setBounds(0, 260, 70, 20);

        price_15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price_15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(price_15);
        price_15.setBounds(0, 280, 70, 20);

        price_16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price_16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(price_16);
        price_16.setBounds(0, 300, 70, 20);

        price_17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        price_17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(price_17);
        price_17.setBounds(0, 320, 70, 20);

        jPanel6.add(jPanel11);
        jPanel11.setBounds(340, 30, 70, 340);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setLayout(null);

        ltr_1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ltr_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(ltr_1);
        ltr_1.setBounds(0, 0, 50, 20);

        ltr_2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ltr_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(ltr_2);
        ltr_2.setBounds(0, 20, 50, 20);

        ltr_3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ltr_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(ltr_3);
        ltr_3.setBounds(0, 40, 50, 20);

        ltr_4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ltr_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(ltr_4);
        ltr_4.setBounds(0, 60, 50, 20);

        ltr_5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ltr_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(ltr_5);
        ltr_5.setBounds(0, 80, 50, 20);

        ltr_6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ltr_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(ltr_6);
        ltr_6.setBounds(0, 100, 50, 20);

        ltr_7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ltr_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(ltr_7);
        ltr_7.setBounds(0, 120, 50, 20);

        ltr_8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ltr_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(ltr_8);
        ltr_8.setBounds(0, 140, 50, 20);

        ltr_9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ltr_9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(ltr_9);
        ltr_9.setBounds(0, 160, 50, 20);

        ltr_10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ltr_10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(ltr_10);
        ltr_10.setBounds(0, 180, 50, 20);

        ltr_11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ltr_11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(ltr_11);
        ltr_11.setBounds(0, 200, 50, 20);

        ltr_12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ltr_12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(ltr_12);
        ltr_12.setBounds(0, 220, 50, 20);

        ltr_13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ltr_13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(ltr_13);
        ltr_13.setBounds(0, 240, 50, 20);

        ltr_14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ltr_14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(ltr_14);
        ltr_14.setBounds(0, 260, 50, 20);

        ltr_15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ltr_15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(ltr_15);
        ltr_15.setBounds(0, 280, 50, 20);

        ltr_16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ltr_16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(ltr_16);
        ltr_16.setBounds(0, 300, 50, 20);

        ltr_17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ltr_17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(ltr_17);
        ltr_17.setBounds(0, 320, 50, 20);

        jPanel6.add(jPanel12);
        jPanel12.setBounds(410, 30, 50, 340);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel50.setText("Total");
        jPanel6.add(jLabel50);
        jLabel50.setBounds(100, 370, 100, 30);

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel55.setText("Taka (in word)");
        jPanel6.add(jLabel55);
        jLabel55.setBounds(20, 410, 90, 40);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setLayout(null);

        Unit_1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Unit_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Unit_1);
        Unit_1.setBounds(0, 0, 70, 20);

        Unit_2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Unit_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Unit_2);
        Unit_2.setBounds(0, 20, 70, 20);

        Unit_3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Unit_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Unit_3);
        Unit_3.setBounds(0, 40, 70, 20);

        Unit_4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Unit_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Unit_4);
        Unit_4.setBounds(0, 60, 70, 20);

        Unit_5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Unit_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Unit_5);
        Unit_5.setBounds(0, 80, 70, 20);

        Unit_6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Unit_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Unit_6);
        Unit_6.setBounds(0, 100, 70, 20);

        Unit_7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Unit_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Unit_7);
        Unit_7.setBounds(0, 120, 70, 20);

        Unit_8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Unit_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Unit_8);
        Unit_8.setBounds(0, 140, 70, 20);

        Unit_9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Unit_9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Unit_9);
        Unit_9.setBounds(0, 160, 70, 20);

        Unit_10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Unit_10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Unit_10);
        Unit_10.setBounds(0, 180, 70, 20);

        Unit_11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Unit_11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Unit_11);
        Unit_11.setBounds(0, 200, 70, 20);

        Unit_12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Unit_12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Unit_12);
        Unit_12.setBounds(0, 220, 70, 20);

        Unit_13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Unit_13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Unit_13);
        Unit_13.setBounds(0, 240, 70, 20);

        Unit_14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Unit_14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Unit_14);
        Unit_14.setBounds(0, 260, 70, 20);

        Unit_15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Unit_15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Unit_15);
        Unit_15.setBounds(0, 280, 70, 20);

        Unit_16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Unit_16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Unit_16);
        Unit_16.setBounds(0, 300, 70, 20);

        Chalan51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Chalan51);
        Chalan51.setBounds(0, 320, 70, 20);

        Chalan52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Chalan52);
        Chalan52.setBounds(0, 0, 60, 20);

        Chalan53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Chalan53);
        Chalan53.setBounds(0, 40, 60, 20);

        Chalan54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Chalan54);
        Chalan54.setBounds(0, 20, 60, 20);

        Chalan55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Chalan55);
        Chalan55.setBounds(0, 80, 60, 20);

        Chalan56.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Chalan56);
        Chalan56.setBounds(0, 60, 60, 20);

        Chalan57.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Chalan57);
        Chalan57.setBounds(0, 100, 60, 20);

        Chalan58.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Chalan58);
        Chalan58.setBounds(0, 120, 60, 20);

        Chalan59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Chalan59);
        Chalan59.setBounds(0, 160, 60, 20);

        Chalan60.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Chalan60);
        Chalan60.setBounds(0, 140, 60, 20);

        Chalan61.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Chalan61);
        Chalan61.setBounds(0, 180, 60, 20);

        Chalan62.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Chalan62);
        Chalan62.setBounds(0, 200, 60, 20);

        Chalan63.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Chalan63);
        Chalan63.setBounds(0, 220, 60, 20);

        Chalan64.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Chalan64);
        Chalan64.setBounds(0, 240, 60, 20);

        Chalan65.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Chalan65);
        Chalan65.setBounds(0, 260, 60, 20);

        Chalan66.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Chalan66);
        Chalan66.setBounds(0, 280, 60, 20);

        Chalan67.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Chalan67);
        Chalan67.setBounds(0, 300, 60, 20);

        Chalan68.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Chalan68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(Chalan68);
        Chalan68.setBounds(0, 320, 60, 20);

        jPanel6.add(jPanel13);
        jPanel13.setBounds(200, 30, 70, 340);

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel46);
        jLabel46.setBounds(270, 370, 70, 30);

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Chalan ");
        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel48);
        jLabel48.setBounds(200, 0, 140, 20);

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Kg/ltr");
        jLabel49.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.add(jLabel49);
        jLabel49.setBounds(200, 20, 70, 10);

        jLabel7.setText("____________________________________________________________");
        jPanel6.add(jLabel7);
        jLabel7.setBounds(0, 380, 370, 30);

        jPanel3.add(jPanel6);
        jPanel6.setBounds(30, 220, 550, 520);

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Bill_logo.jpg"))); // NOI18N
        jPanel3.add(jLabel36);
        jLabel36.setBounds(40, 10, 100, 100);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(" INVOICE / BILL");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(210, 110, 190, 30);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(jLabel44);
        jLabel44.setBounds(40, 920, 170, 0);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("..................................................................");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(380, 780, 200, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("For RMC Office");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(380, 800, 200, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("..................................................................");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(30, 780, 200, 20);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Received  BY");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(30, 800, 200, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("All Kinds of Construction Chemical & Paints Manufacturer");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(250, 40, 320, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHEMICAL COMPANY LTD.");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(130, 50, 340, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RMC ");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(100, 20, 200, 40);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/location.png"))); // NOI18N
        jLabel34.setText("Cumilla Office :");
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel34.setIconTextGap(1);
        jPanel3.add(jLabel34);
        jLabel34.setBounds(50, 830, 180, 20);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("1026, Anzir Manzil. Old GP Center Road ");
        jPanel3.add(jLabel37);
        jLabel37.setBounds(70, 860, 240, 20);

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setText("Jhawtola, Cumilla");
        jPanel3.add(jLabel52);
        jLabel52.setBounds(70, 880, 240, 20);

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel53.setText("01712-905949, 01729-483000");
        jPanel3.add(jLabel53);
        jLabel53.setBounds(70, 900, 220, 20);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("01819-909044");
        jPanel3.add(jLabel45);
        jLabel45.setBounds(70, 920, 217, 20);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/location.png"))); // NOI18N
        jLabel26.setText("Head Office :");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel26.setIconTextGap(1);
        jPanel3.add(jLabel26);
        jLabel26.setBounds(360, 830, 180, 20);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel54.setText("Paramount Concord, 9, 9/1 & 9/2");
        jPanel3.add(jLabel54);
        jLabel54.setBounds(380, 860, 190, 20);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Tikatuli, Dhaka");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(380, 880, 190, 20);

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gmail24.png"))); // NOI18N
        jLabel51.setText("info@rmcchemical.com ");
        jLabel51.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel51.setIconTextGap(1);
        jPanel3.add(jLabel51);
        jLabel51.setBounds(380, 900, 200, 20);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/web16.png"))); // NOI18N
        jLabel47.setText(" www.rmcchemical.com");
        jLabel47.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel47.setIconTextGap(1);
        jPanel3.add(jLabel47);
        jLabel47.setBounds(380, 920, 200, 30);

        jPanel14.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel14);
        jPanel14.setBounds(580, 0, 30, 1010);

        jPanel15.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel15);
        jPanel15.setBounds(0, 0, 30, 1010);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 67, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 770, 1080);

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

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 820, 1200);

        setSize(new java.awt.Dimension(818, 1218));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel13MouseClicked
 
void showProd(String bill){
     String prod,lt,pric,toamm,qty,lk;
     double toltr=0,totalqty=0;
     int id=0;
      try {
          String find="SELECT  `p_name`,`s_price`, `quantity`, `total`, `chalan ltr`,`chalan quantity` FROM `rmc_chemical_ltd`.`sales` WHERE `bill`='"+bill+"'";
          con.contest();
          con.st = con.ct.prepareCall(find);
          con.rs = con.st.executeQuery(find);
          while(con.rs.next()) {
           id=id+1;
           prod=con.rs.getString(1);
           pric=con.rs.getString(2);
           lt=con.rs.getString(3);
           toamm=con.rs.getString(4); 
           qty=con.rs.getString(6);
           lk=con.rs.getString(5);
           double t=Double.parseDouble(lt);
           toltr=t+toltr;
           totalqty=totalqty+Double.parseDouble(qty);
           jLabel41.setText(""+toltr);
            jLabel46.setText(""+totalqty);
           if(id==1){
               sl_l1.setText("1");
               product1.setText(""+prod);
                Chalan1.setText(""+qty);
                Unit_1.setText(""+lk);
                 price_1.setText(""+pric);
                  ltr_1.setText(""+lt);
                   taka_1.setText(""+toamm);
                  
           }else if(id==2){
               sl_l2.setText("2");
               product2.setText(""+prod);
                Chalan2.setText(""+qty);
                Unit_2.setText(""+lk);
                 price_2.setText(""+pric);
                  ltr_2.setText(""+lt);
                   taka_2.setText(""+toamm);
           }else if(id==3){
               sl_l3.setText("3");
               product3.setText(""+prod);
                Chalan3.setText(""+qty);
                Unit_3.setText(""+lk);
                 price_3.setText(""+pric);
                  ltr_3.setText(""+lt);
                   taka_3.setText(""+toamm);
           }else if(id==4){
               sl_l4.setText("4");
               product4.setText(""+prod);
                Chalan4.setText(""+qty);
                Unit_4.setText(""+lk);
                 price_4.setText(""+pric);
                  ltr_4.setText(""+lt);
                   taka_4.setText(""+toamm);
           }else if(id==5){
               sl_l5.setText("5");
               product5.setText(""+prod);
                Chalan5.setText(""+qty);
                Unit_5.setText(""+lk);
                 price_5.setText(""+pric);
                  ltr_5.setText(""+lt);
                   taka_5.setText(""+toamm);
           }else if(id==6){
               sl_l6.setText("6");
               product6.setText(""+prod);
                Chalan6.setText(""+qty);
                Unit_6.setText(""+lk);
                 price_6.setText(""+pric);
                  ltr_6.setText(""+lt);
                   taka_6.setText(""+toamm);
           }else if(id==7){
               sl_l7.setText("7");
               product7.setText(""+prod);
                Chalan7.setText(""+qty);
                Unit_7.setText(""+lk);
                 price_7.setText(""+pric);
                  ltr_7.setText(""+lt);
                   taka_7.setText(""+toamm);
           }else if(id==8){
               sl_l8.setText("8");
               product8.setText(""+prod);
                Chalan8.setText(""+qty);
                Unit_8.setText(""+lk);
                 price_8.setText(""+pric);
                  ltr_8.setText(""+lt);
                   taka_8.setText(""+toamm);
           }else if(id==9){
               sl_l10.setText("9");
               product9.setText(""+prod);
                Chalan9.setText(""+qty);
                Unit_9.setText(""+lk);
                 price_9.setText(""+pric);
                  ltr_9.setText(""+lt);
                   taka_9.setText(""+toamm);
           }else if(id==10){
               sl_l10.setText("10");
               product10.setText(""+prod);
                Chalan10.setText(""+qty);
                Unit_10.setText(""+lk);
                 price_10.setText(""+pric);
                  ltr_10.setText(""+lt);
                   taka_10.setText(""+toamm);
           }else if(id==11){
               sl_l11.setText("11");
               product11.setText(""+prod);
                Chalan11.setText(""+qty);
                Unit_11.setText(""+lk);
                 price_11.setText(""+pric);
                  ltr_11.setText(""+lt);
                   taka_11.setText(""+toamm);
           }
           
           
          
          }
      } catch (SQLException ex) {
          Logger.getLogger(Demo111.class.getName()).log(Level.SEVERE, null, ex);
      }
    
    
}

void showData(String bill){
    
      try {
          String find="SELECT `bill`,`customer`,`date`,`amount`,`dis`,`total_amount`,`final_amount`,`paid`,`event`,`delivery_place`,`total_ltr` FROM `rmc_chemical_ltd`.`sales_account` WHERE `bill`='"+bill+"'";
          con.contest();
          con.st = con.ct.prepareCall(find);
          con.rs = con.st.executeQuery(find);
          while(con.rs.next()) {
           bill_txt.setText(""+con.rs.getString(1));
            name_txt.setText(""+con.rs.getString(2));
            date_txt.setText(""+con.rs.getString(3));
             delivery_txt.setText(""+con.rs.getString(10));
            total_amount_l.setText(""+con.rs.getString(4));
             jLabel38.setText(""+con.rs.getString(5));
              jLabel33.setText(""+con.rs.getString(8));
          double pre,du;
              pre = Double.parseDouble(con.rs.getString(7))-Double.parseDouble(con.rs.getString(6));
              du = Double.parseDouble(con.rs.getString(7))-Double.parseDouble(con.rs.getString(8));
               pre=Math.round(pre*100.0)/100.0; 
                 du=Math.round(du*100.0)/100.0; 
            jLabel40.setText(""+pre);
               jLabel43.setText(""+du);
          
          }
          
          
          
           
          String num="SELECT `phone` FROM `rmc_chemical_ltd`.`customer_info` WHERE `name`='"+name_txt.getText()+"'";
          con.contest();
          con.st = con.ct.prepareCall(num);
          con.rs = con.st.executeQuery(num);
   if(con.rs.next()) {
              cel_txt.setText(""+con.rs.getString(1));
            
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
            java.util.logging.Logger.getLogger(Demo_Pat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demo_Pat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demo_Pat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demo_Pat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Demo_Pat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Chalan1;
    private javax.swing.JLabel Chalan10;
    private javax.swing.JLabel Chalan11;
    private javax.swing.JLabel Chalan12;
    private javax.swing.JLabel Chalan13;
    private javax.swing.JLabel Chalan14;
    private javax.swing.JLabel Chalan15;
    private javax.swing.JLabel Chalan16;
    private javax.swing.JLabel Chalan17;
    private javax.swing.JLabel Chalan18;
    private javax.swing.JLabel Chalan19;
    private javax.swing.JLabel Chalan2;
    private javax.swing.JLabel Chalan20;
    private javax.swing.JLabel Chalan21;
    private javax.swing.JLabel Chalan22;
    private javax.swing.JLabel Chalan23;
    private javax.swing.JLabel Chalan24;
    private javax.swing.JLabel Chalan25;
    private javax.swing.JLabel Chalan26;
    private javax.swing.JLabel Chalan27;
    private javax.swing.JLabel Chalan28;
    private javax.swing.JLabel Chalan29;
    private javax.swing.JLabel Chalan3;
    private javax.swing.JLabel Chalan30;
    private javax.swing.JLabel Chalan31;
    private javax.swing.JLabel Chalan32;
    private javax.swing.JLabel Chalan33;
    private javax.swing.JLabel Chalan34;
    private javax.swing.JLabel Chalan4;
    private javax.swing.JLabel Chalan5;
    private javax.swing.JLabel Chalan51;
    private javax.swing.JLabel Chalan52;
    private javax.swing.JLabel Chalan53;
    private javax.swing.JLabel Chalan54;
    private javax.swing.JLabel Chalan55;
    private javax.swing.JLabel Chalan56;
    private javax.swing.JLabel Chalan57;
    private javax.swing.JLabel Chalan58;
    private javax.swing.JLabel Chalan59;
    private javax.swing.JLabel Chalan6;
    private javax.swing.JLabel Chalan60;
    private javax.swing.JLabel Chalan61;
    private javax.swing.JLabel Chalan62;
    private javax.swing.JLabel Chalan63;
    private javax.swing.JLabel Chalan64;
    private javax.swing.JLabel Chalan65;
    private javax.swing.JLabel Chalan66;
    private javax.swing.JLabel Chalan67;
    private javax.swing.JLabel Chalan68;
    private javax.swing.JLabel Chalan7;
    private javax.swing.JLabel Chalan8;
    private javax.swing.JLabel Chalan9;
    private javax.swing.JLabel Unit_1;
    private javax.swing.JLabel Unit_10;
    private javax.swing.JLabel Unit_11;
    private javax.swing.JLabel Unit_12;
    private javax.swing.JLabel Unit_13;
    private javax.swing.JLabel Unit_14;
    private javax.swing.JLabel Unit_15;
    private javax.swing.JLabel Unit_16;
    private javax.swing.JLabel Unit_2;
    private javax.swing.JLabel Unit_3;
    private javax.swing.JLabel Unit_4;
    private javax.swing.JLabel Unit_5;
    private javax.swing.JLabel Unit_6;
    private javax.swing.JLabel Unit_7;
    private javax.swing.JLabel Unit_8;
    private javax.swing.JLabel Unit_9;
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
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ltr_1;
    private javax.swing.JLabel ltr_10;
    private javax.swing.JLabel ltr_11;
    private javax.swing.JLabel ltr_12;
    private javax.swing.JLabel ltr_13;
    private javax.swing.JLabel ltr_14;
    private javax.swing.JLabel ltr_15;
    private javax.swing.JLabel ltr_16;
    private javax.swing.JLabel ltr_17;
    private javax.swing.JLabel ltr_2;
    private javax.swing.JLabel ltr_3;
    private javax.swing.JLabel ltr_4;
    private javax.swing.JLabel ltr_5;
    private javax.swing.JLabel ltr_6;
    private javax.swing.JLabel ltr_7;
    private javax.swing.JLabel ltr_8;
    private javax.swing.JLabel ltr_9;
    private javax.swing.JLabel name_txt;
    private javax.swing.JLabel price_1;
    private javax.swing.JLabel price_10;
    private javax.swing.JLabel price_11;
    private javax.swing.JLabel price_12;
    private javax.swing.JLabel price_13;
    private javax.swing.JLabel price_14;
    private javax.swing.JLabel price_15;
    private javax.swing.JLabel price_16;
    private javax.swing.JLabel price_17;
    private javax.swing.JLabel price_2;
    private javax.swing.JLabel price_3;
    private javax.swing.JLabel price_4;
    private javax.swing.JLabel price_5;
    private javax.swing.JLabel price_6;
    private javax.swing.JLabel price_7;
    private javax.swing.JLabel price_8;
    private javax.swing.JLabel price_9;
    private javax.swing.JLabel product;
    private javax.swing.JLabel product1;
    private javax.swing.JLabel product10;
    private javax.swing.JLabel product11;
    private javax.swing.JLabel product12;
    private javax.swing.JLabel product13;
    private javax.swing.JLabel product14;
    private javax.swing.JLabel product15;
    private javax.swing.JLabel product16;
    private javax.swing.JLabel product17;
    private javax.swing.JLabel product2;
    private javax.swing.JLabel product3;
    private javax.swing.JLabel product4;
    private javax.swing.JLabel product5;
    private javax.swing.JLabel product6;
    private javax.swing.JLabel product7;
    private javax.swing.JLabel product8;
    private javax.swing.JLabel product9;
    private javax.swing.JLabel sl_l1;
    private javax.swing.JLabel sl_l10;
    private javax.swing.JLabel sl_l11;
    private javax.swing.JLabel sl_l12;
    private javax.swing.JLabel sl_l13;
    private javax.swing.JLabel sl_l14;
    private javax.swing.JLabel sl_l15;
    private javax.swing.JLabel sl_l17;
    private javax.swing.JLabel sl_l18;
    private javax.swing.JLabel sl_l2;
    private javax.swing.JLabel sl_l3;
    private javax.swing.JLabel sl_l4;
    private javax.swing.JLabel sl_l5;
    private javax.swing.JLabel sl_l6;
    private javax.swing.JLabel sl_l7;
    private javax.swing.JLabel sl_l8;
    private javax.swing.JLabel sl_l9;
    private javax.swing.JLabel taka_1;
    private javax.swing.JLabel taka_10;
    private javax.swing.JLabel taka_11;
    private javax.swing.JLabel taka_12;
    private javax.swing.JLabel taka_13;
    private javax.swing.JLabel taka_14;
    private javax.swing.JLabel taka_15;
    private javax.swing.JLabel taka_16;
    private javax.swing.JLabel taka_17;
    private javax.swing.JLabel taka_2;
    private javax.swing.JLabel taka_3;
    private javax.swing.JLabel taka_4;
    private javax.swing.JLabel taka_5;
    private javax.swing.JLabel taka_6;
    private javax.swing.JLabel taka_7;
    private javax.swing.JLabel taka_8;
    private javax.swing.JLabel taka_9;
    private javax.swing.JLabel total_amount_l;
    // End of variables declaration//GEN-END:variables
}
