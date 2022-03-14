 
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
 
public class Demo_Collection extends javax.swing.JFrame {
  connection_class con;
  static  int top=1;
    public Demo_Collection(String text) {
        initComponents();
            con=new connection_class();
      
        showData(text); 
      //test();
    }

    private Demo_Collection() {
  initComponents();  }
   
    
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
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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
        delivery_txt.setBounds(120, 40, 270, 20);

        name_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        name_txt.setText("JAsmin AKter Jesika");
        jPanel4.add(name_txt);
        name_txt.setBounds(120, 14, 260, 20);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(10, 140, 390, 80);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Date   :");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(10, 30, 40, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Voucher No  :");
        jPanel5.add(jLabel18);
        jLabel18.setBounds(10, 10, 80, 14);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Cell No :");
        jPanel5.add(jLabel19);
        jLabel19.setBounds(10, 50, 50, 20);

        cel_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cel_txt.setText("01558862259");
        jPanel5.add(cel_txt);
        cel_txt.setBounds(60, 50, 140, 20);

        bill_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bill_txt.setText("001874237");
        jPanel5.add(bill_txt);
        bill_txt.setBounds(90, 0, 110, 30);

        date_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        date_txt.setText("01/22/2021");
        jPanel5.add(date_txt);
        date_txt.setBounds(60, 30, 130, 20);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(400, 140, 200, 80);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        jPanel6.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel8);
        jLabel8.setBounds(160, 180, 420, 30);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText("Balance");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel42);
        jLabel42.setBounds(350, 130, 120, 30);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel43);
        jLabel43.setBounds(470, 130, 110, 30);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Rechived Amount");
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel32);
        jLabel32.setBounds(350, 100, 120, 30);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel33);
        jLabel33.setBounds(470, 100, 110, 30);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("Discount ");
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel35);
        jLabel35.setBounds(350, 70, 120, 30);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel38);
        jLabel38.setBounds(470, 70, 110, 30);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("Previous Amount");
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel39);
        jLabel39.setBounds(350, 40, 120, 30);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel40);
        jLabel40.setBounds(470, 40, 110, 30);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel41);
        jLabel41.setBounds(410, 370, 70, 30);

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel55.setText("Taka (in word)");
        jPanel6.add(jLabel55);
        jLabel55.setBounds(60, 170, 90, 40);

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel46);
        jLabel46.setBounds(270, 370, 70, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("Collection");
        jPanel6.add(jLabel7);
        jLabel7.setBounds(40, 60, 260, 50);

        jPanel3.add(jPanel6);
        jPanel6.setBounds(10, 220, 590, 230);

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Bill_logo.jpg"))); // NOI18N
        jPanel3.add(jLabel36);
        jLabel36.setBounds(10, 10, 100, 100);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(" INVOICE / BILL");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(230, 110, 120, 30);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/location.png"))); // NOI18N
        jLabel26.setText("Head Office :");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel26.setIconTextGap(1);
        jPanel3.add(jLabel26);
        jLabel26.setBounds(360, 540, 180, 20);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Tikatuli, Dhaka");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(380, 590, 190, 20);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(jLabel44);
        jLabel44.setBounds(40, 920, 170, 0);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("01819-909044");
        jPanel3.add(jLabel45);
        jLabel45.setBounds(70, 630, 217, 20);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/web16.png"))); // NOI18N
        jLabel47.setText(" www.rmcchemical.com");
        jLabel47.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel47.setIconTextGap(1);
        jPanel3.add(jLabel47);
        jLabel47.setBounds(380, 630, 200, 30);

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gmail24.png"))); // NOI18N
        jLabel51.setText("info@rmcchemical.com ");
        jLabel51.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel51.setIconTextGap(1);
        jPanel3.add(jLabel51);
        jLabel51.setBounds(380, 610, 200, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("..................................................................");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(390, 480, 200, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("For RMC Office");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(390, 500, 200, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("..................................................................");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(40, 480, 200, 20);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Received  BY");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(40, 500, 200, 20);

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setText("Jhawtola, Cumilla");
        jPanel3.add(jLabel52);
        jLabel52.setBounds(70, 590, 240, 20);

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel53.setText("01712-905949, 01729-483000");
        jPanel3.add(jLabel53);
        jLabel53.setBounds(70, 610, 220, 20);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/location.png"))); // NOI18N
        jLabel34.setText("Feni Office :");
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel34.setIconTextGap(1);
        jPanel3.add(jLabel34);
        jLabel34.setBounds(50, 540, 180, 20);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("1026, Anzir Manzil. Old GP Center Road ");
        jPanel3.add(jLabel37);
        jLabel37.setBounds(70, 570, 240, 20);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel54.setText("Paramount Concord, 9, 9/1 & 9/2");
        jPanel3.add(jLabel54);
        jLabel54.setBounds(380, 570, 190, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RMC ");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(80, 20, 200, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("All Kinds of Construction Chemical & Paints Manufacturer");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(230, 40, 352, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHEMICAL COMPANY LTD.");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(110, 50, 340, 50);

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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 456, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 770, 820);

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
        jPanel1.setBounds(0, 0, 830, 880);

        setSize(new java.awt.Dimension(830, 864));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel13MouseClicked
 
 
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
            java.util.logging.Logger.getLogger(Demo_Collection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Demo_Collection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Demo_Collection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Demo_Collection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Demo_Collection().setVisible(true);
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name_txt;
    // End of variables declaration//GEN-END:variables
}
