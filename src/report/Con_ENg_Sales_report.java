 
package report;
 
 
import Main_PAck.connection_class; 
import Main_PAck.demo;
import Main_PAck.demo_user1;
 
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger; 
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;   
public class Con_ENg_Sales_report extends javax.swing.JFrame {
      connection_class con;
      DefaultTableModel dt;
      double sala=0,sal_commi=0,worki_expen=0,tar_quantity=0,achiveQuan=0,sal_taka=0;
      double firstw,secondw,thirdw,fourtw,fifthw,total_tk;
      static double yearTotal=0;
    double sala2=0,sal_commi2=0,worki_expen2=0,tar_quantity2=0,achiveQuan2=0,sal_taka2=0;
    static String h;
    public Con_ENg_Sales_report(String string) {
        initComponents();
        con=new connection_class();
        show_date();
        dt = (DefaultTableModel) jTable1.getModel();
         show_em();
         h=string;
    }

    private Con_ENg_Sales_report() {
 initComponents();  }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        employe_combo = new javax.swing.JComboBox<>();
        mobile_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        employe_combo1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        address_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        profession_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(1180, 40, 180, 30);

        employe_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        employe_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "jasmin", " " }));
        employe_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employe_comboActionPerformed(evt);
            }
        });
        jPanel1.add(employe_combo);
        employe_combo.setBounds(30, 110, 250, 30);

        mobile_txt.setEditable(false);
        mobile_txt.setBackground(new java.awt.Color(255, 255, 255));
        mobile_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(mobile_txt);
        mobile_txt.setBounds(580, 110, 250, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Mobile Number");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(580, 90, 210, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText(" Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 90, 210, 20);

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Month", "Week No 1 (1-7)", "Week No 2  (8-14)", "Week No 3 (15-21)", "Week No 4  (22-28)", "Week No 5  (28-31 )", "Total "
            }
        ));
        jTable1.setGridColor(new java.awt.Color(153, 0, 0));
        jTable1.setRowHeight(35);
        jTable1.setRowMargin(2);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(32, 150, 1300, 410);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("*Con/ENg Sales Report");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 0, 260, 40);

        employe_combo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        employe_combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ", "Contructor", "Engineer", " " }));
        employe_combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employe_combo1ActionPerformed(evt);
            }
        });
        jPanel1.add(employe_combo1);
        employe_combo1.setBounds(30, 60, 250, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Designation");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 40, 210, 20);

        address_txt.setEditable(false);
        address_txt.setBackground(new java.awt.Color(255, 255, 255));
        address_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(address_txt);
        address_txt.setBounds(300, 60, 250, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Address");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 40, 210, 20);

        profession_txt.setEditable(false);
        profession_txt.setBackground(new java.awt.Color(255, 255, 255));
        profession_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(profession_txt);
        profession_txt.setBounds(300, 110, 250, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Profession");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 90, 210, 20);

        email_txt.setEditable(false);
        email_txt.setBackground(new java.awt.Color(255, 255, 255));
        email_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(email_txt);
        email_txt.setBounds(580, 60, 250, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Email");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(580, 40, 210, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(570, 560, 740, 50);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/printer (1).png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel24);
        jLabel24.setBounds(1240, 0, 40, 40);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/house.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel23);
        jLabel23.setBounds(1190, 0, 50, 40);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconfinder_1054931_zoom out_minimize_reduce_icon_32px.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel25);
        jLabel25.setBounds(1280, 0, 40, 40);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close (1).png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1320, 0, 40, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 740);
        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1368, 748));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
      public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
  ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
 }
      void show_em(){
     
       try {
           employe_combo.removeAllItems();
           employe_combo.addItem("Select");
             address_txt.setText("");  
                 mobile_txt.setText("");  
                  email_txt.setText("");  
                   profession_txt.setText("");  
           String s=" SELECT `name` FROM `rmc_chemical_ltd`.`contructor_engineeer` WHERE `designation`='"+employe_combo1.getSelectedItem()+"'";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while (con.rs.next()) {
           
           employe_combo.addItem(""+con.rs.getString(1));
           
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Con_ENg_Sales_report.class.getName()).log(Level.SEVERE, null, ex);
       }
 
 }
      void janu(){
        
       try {
           yearTotal=0;
       total_tk=0;firstw=0;secondw=0;thirdw=0;fourtw=0;fifthw=0;
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate()),date2,date3;
           date2=date1+"-01-1";
             date3=date1+"-01-7";
           String firstweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(firstweek);
           con.rs = con.st.executeQuery(firstweek);
           if (con.rs.next()) {
          firstw=con.rs.getDouble(1);
             }       
           
           
            date2=date1+"-01-8";
             date3=date1+"-01-14";
           String secondeweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(secondeweek);
           con.rs = con.st.executeQuery(secondeweek);
           if (con.rs.next()) {
          secondw=con.rs.getDouble(1);
             }  
           
            date2=date1+"-01-15";
             date3=date1+"-01-21";
           String thirdweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(thirdweek);
           con.rs = con.st.executeQuery(thirdweek);
           if (con.rs.next()) {
          thirdw=con.rs.getDouble(1);
             } 
           
            date2=date1+"-01-22";
             date3=date1+"-01-28";
           String fourthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fourthweek);
           con.rs = con.st.executeQuery(fourthweek);
           if (con.rs.next()) {
          fourtw=con.rs.getDouble(1);
             } 
           
           
           
           date2=date1+"-01-28";
             date3=date1+"-01-31";
           String fifthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fifthweek);
           con.rs = con.st.executeQuery(fifthweek);
           if (con.rs.next()) {
          fifthw=con.rs.getDouble(1);
             }
           
           total_tk=firstw+secondw+thirdw+fourtw+fifthw;
            dt.addRow(new Object[]{"January",firstw,secondw,thirdw,fourtw,fifthw,total_tk});
              yearTotal= yearTotal+total_tk;
          yearTotal=Math.round(yearTotal*100.0)/100.0;
          
       } catch (SQLException ex) {
           Logger.getLogger(Con_ENg_Sales_report.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    }
      void feb(){
       try {
       total_tk=0;firstw=0;secondw=0;thirdw=0;fourtw=0;fifthw=0;
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate()),date2,date3;
           date2=date1+"-02-1";
             date3=date1+"-02-7";
           String firstweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(firstweek);
           con.rs = con.st.executeQuery(firstweek);
           if (con.rs.next()) {
          firstw=con.rs.getDouble(1);
             }       
           
           
            date2=date1+"-02-8";
             date3=date1+"-02-14";
           String secondeweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(secondeweek);
           con.rs = con.st.executeQuery(secondeweek);
           if (con.rs.next()) {
          secondw=con.rs.getDouble(1);
             }  
           
            date2=date1+"-02-15";
             date3=date1+"-02-21";
           String thirdweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(thirdweek);
           con.rs = con.st.executeQuery(thirdweek);
           if (con.rs.next()) {
          thirdw=con.rs.getDouble(1);
             } 
           
            date2=date1+"-02-22";
             date3=date1+"-02-28";
           String fourthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fourthweek);
           con.rs = con.st.executeQuery(fourthweek);
           if (con.rs.next()) {
          fourtw=con.rs.getDouble(1);
             } 
           
           
           
           date2=date1+"-02-28";
             date3=date1+"-02-31";
           String fifthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fifthweek);
           con.rs = con.st.executeQuery(fifthweek);
           if (con.rs.next()) {
          fifthw=con.rs.getDouble(1);
             }
           
           total_tk=firstw+secondw+thirdw+fourtw+fifthw;
            dt.addRow(new Object[]{"February",firstw,secondw,thirdw,fourtw,fifthw,total_tk});
            
           yearTotal= yearTotal+total_tk;
          yearTotal=Math.round(yearTotal*100.0)/100.0;
          
       } catch (SQLException ex) {
           Logger.getLogger(Con_ENg_Sales_report.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    }
      void march(){
       try {
       total_tk=0;firstw=0;secondw=0;thirdw=0;fourtw=0;fifthw=0;
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate()),date2,date3;
           date2=date1+"-03-1";
             date3=date1+"-03-7";
           String firstweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(firstweek);
           con.rs = con.st.executeQuery(firstweek);
           if (con.rs.next()) {
          firstw=con.rs.getDouble(1);
             }       
           
           
            date2=date1+"-03-8";
             date3=date1+"-03-14";
           String secondeweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(secondeweek);
           con.rs = con.st.executeQuery(secondeweek);
           if (con.rs.next()) {
          secondw=con.rs.getDouble(1);
             }  
           
            date2=date1+"-03-15";
             date3=date1+"-03-21";
           String thirdweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(thirdweek);
           con.rs = con.st.executeQuery(thirdweek);
           if (con.rs.next()) {
          thirdw=con.rs.getDouble(1);
             } 
           
            date2=date1+"-03-22";
             date3=date1+"-03-28";
           String fourthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fourthweek);
           con.rs = con.st.executeQuery(fourthweek);
           if (con.rs.next()) {
          fourtw=con.rs.getDouble(1);
             } 
           
           
           
           date2=date1+"-03-28";
             date3=date1+"-03-31";
           String fifthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fifthweek);
           con.rs = con.st.executeQuery(fifthweek);
           if (con.rs.next()) {
          fifthw=con.rs.getDouble(1);
             }
           
           total_tk=firstw+secondw+thirdw+fourtw+fifthw;
            dt.addRow(new Object[]{"March",firstw,secondw,thirdw,fourtw,fifthw,total_tk});
            yearTotal= yearTotal+total_tk;
          yearTotal=Math.round(yearTotal*100.0)/100.0;
       } catch (SQLException ex) {
           Logger.getLogger(Con_ENg_Sales_report.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    }
      void april(){
       try {
       total_tk=0;firstw=0;secondw=0;thirdw=0;fourtw=0;fifthw=0;
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate()),date2,date3;
           date2=date1+"-04-1";
             date3=date1+"-04-7";
           String firstweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(firstweek);
           con.rs = con.st.executeQuery(firstweek);
           if (con.rs.next()) {
          firstw=con.rs.getDouble(1);
             }       
           
           
            date2=date1+"-04-8";
             date3=date1+"-04-14";
           String secondeweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(secondeweek);
           con.rs = con.st.executeQuery(secondeweek);
           if (con.rs.next()) {
          secondw=con.rs.getDouble(1);
             }  
           
            date2=date1+"-04-15";
             date3=date1+"-04-21";
           String thirdweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(thirdweek);
           con.rs = con.st.executeQuery(thirdweek);
           if (con.rs.next()) {
          thirdw=con.rs.getDouble(1);
             } 
           
            date2=date1+"-04-22";
             date3=date1+"-04-28";
           String fourthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fourthweek);
           con.rs = con.st.executeQuery(fourthweek);
           if (con.rs.next()) {
          fourtw=con.rs.getDouble(1);
             } 
           
           
           
           date2=date1+"-04-28";
             date3=date1+"-04-31";
           String fifthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fifthweek);
           con.rs = con.st.executeQuery(fifthweek);
           if (con.rs.next()) {
          fifthw=con.rs.getDouble(1);
             }
           
           total_tk=firstw+secondw+thirdw+fourtw+fifthw;
            dt.addRow(new Object[]{"April",firstw,secondw,thirdw,fourtw,fifthw,total_tk});
              yearTotal= yearTotal+total_tk;
          yearTotal=Math.round(yearTotal*100.0)/100.0;
          
       } catch (SQLException ex) {
           Logger.getLogger(Con_ENg_Sales_report.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    }      
      void may(){
       try {
       total_tk=0;firstw=0;secondw=0;thirdw=0;fourtw=0;fifthw=0;
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate()),date2,date3;
           date2=date1+"-05-1";
             date3=date1+"-05-7";
           String firstweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(firstweek);
           con.rs = con.st.executeQuery(firstweek);
           if (con.rs.next()) {
          firstw=con.rs.getDouble(1);
             }       
           
           
            date2=date1+"-05-8";
             date3=date1+"-05-14";
           String secondeweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(secondeweek);
           con.rs = con.st.executeQuery(secondeweek);
           if (con.rs.next()) {
          secondw=con.rs.getDouble(1);
             }  
           
            date2=date1+"-05-15";
             date3=date1+"-05-21";
           String thirdweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(thirdweek);
           con.rs = con.st.executeQuery(thirdweek);
           if (con.rs.next()) {
          thirdw=con.rs.getDouble(1);
             } 
           
            date2=date1+"-05-22";
             date3=date1+"-05-28";
           String fourthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fourthweek);
           con.rs = con.st.executeQuery(fourthweek);
           if (con.rs.next()) {
          fourtw=con.rs.getDouble(1);
             } 
           
           
           
           date2=date1+"-05-28";
             date3=date1+"-05-31";
           String fifthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fifthweek);
           con.rs = con.st.executeQuery(fifthweek);
           if (con.rs.next()) {
          fifthw=con.rs.getDouble(1);
             }
           
           total_tk=firstw+secondw+thirdw+fourtw+fifthw;
            dt.addRow(new Object[]{"May",firstw,secondw,thirdw,fourtw,fifthw,total_tk});
              yearTotal= yearTotal+total_tk;
          yearTotal=Math.round(yearTotal*100.0)/100.0;
          
       } catch (SQLException ex) {
           Logger.getLogger(Con_ENg_Sales_report.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    }
      void june(){
       try {
      total_tk=0;firstw=0;secondw=0;thirdw=0;fourtw=0;fifthw=0;
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate()),date2,date3;
           date2=date1+"-06-1";
             date3=date1+"-06-7";
           String firstweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(firstweek);
           con.rs = con.st.executeQuery(firstweek);
           if (con.rs.next()) {
          firstw=con.rs.getDouble(1);
             }       
           
           
            date2=date1+"-06-8";
             date3=date1+"-06-14";
           String secondeweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(secondeweek);
           con.rs = con.st.executeQuery(secondeweek);
           if (con.rs.next()) {
          secondw=con.rs.getDouble(1);
             }  
           
            date2=date1+"-06-15";
             date3=date1+"-06-21";
           String thirdweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(thirdweek);
           con.rs = con.st.executeQuery(thirdweek);
           if (con.rs.next()) {
          thirdw=con.rs.getDouble(1);
             } 
           
            date2=date1+"-06-22";
             date3=date1+"-06-28";
           String fourthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fourthweek);
           con.rs = con.st.executeQuery(fourthweek);
           if (con.rs.next()) {
          fourtw=con.rs.getDouble(1);
             } 
           
           
           
           date2=date1+"-06-28";
             date3=date1+"-06-31";
           String fifthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fifthweek);
           con.rs = con.st.executeQuery(fifthweek);
           if (con.rs.next()) {
          fifthw=con.rs.getDouble(1);
             }
           
           total_tk=firstw+secondw+thirdw+fourtw+fifthw;
            dt.addRow(new Object[]{"June",firstw,secondw,thirdw,fourtw,fifthw,total_tk});
              yearTotal= yearTotal+total_tk;
          yearTotal=Math.round(yearTotal*100.0)/100.0;
          
       } catch (SQLException ex) {
           Logger.getLogger(Con_ENg_Sales_report.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    }       
      void july(){
       try {
       total_tk=0;firstw=0;secondw=0;thirdw=0;fourtw=0;fifthw=0;
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate()),date2,date3;
           date2=date1+"-07-1";
             date3=date1+"-07-7";
           String firstweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(firstweek);
           con.rs = con.st.executeQuery(firstweek);
           if (con.rs.next()) {
          firstw=con.rs.getDouble(1);
             }       
           
           
            date2=date1+"-07-8";
             date3=date1+"-07-14";
           String secondeweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(secondeweek);
           con.rs = con.st.executeQuery(secondeweek);
           if (con.rs.next()) {
          secondw=con.rs.getDouble(1);
             }  
           
            date2=date1+"-07-15";
             date3=date1+"-07-21";
           String thirdweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(thirdweek);
           con.rs = con.st.executeQuery(thirdweek);
           if (con.rs.next()) {
          thirdw=con.rs.getDouble(1);
             } 
           
            date2=date1+"-07-22";
             date3=date1+"-07-28";
           String fourthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fourthweek);
           con.rs = con.st.executeQuery(fourthweek);
           if (con.rs.next()) {
          fourtw=con.rs.getDouble(1);
             } 
           
           
           
           date2=date1+"-07-28";
             date3=date1+"-07-31";
           String fifthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fifthweek);
           con.rs = con.st.executeQuery(fifthweek);
           if (con.rs.next()) {
          fifthw=con.rs.getDouble(1);
             }
           
           total_tk=firstw+secondw+thirdw+fourtw+fifthw;
            dt.addRow(new Object[]{"July",firstw,secondw,thirdw,fourtw,fifthw,total_tk});
              yearTotal= yearTotal+total_tk;
          yearTotal=Math.round(yearTotal*100.0)/100.0;
          
       } catch (SQLException ex) {
           Logger.getLogger(Con_ENg_Sales_report.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    }
      void august(){
       try {
        total_tk=0;firstw=0;secondw=0;thirdw=0;fourtw=0;fifthw=0;
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate()),date2,date3;
           date2=date1+"-08-1";
             date3=date1+"-08-7";
           String firstweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(firstweek);
           con.rs = con.st.executeQuery(firstweek);
           if (con.rs.next()) {
          firstw=con.rs.getDouble(1);
             }       
           
           
            date2=date1+"-08-8";
             date3=date1+"-08-14";
           String secondeweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(secondeweek);
           con.rs = con.st.executeQuery(secondeweek);
           if (con.rs.next()) {
          secondw=con.rs.getDouble(1);
             }  
           
            date2=date1+"-08-15";
             date3=date1+"-08-21";
           String thirdweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(thirdweek);
           con.rs = con.st.executeQuery(thirdweek);
           if (con.rs.next()) {
          thirdw=con.rs.getDouble(1);
             } 
           
            date2=date1+"-08-22";
             date3=date1+"-08-28";
           String fourthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fourthweek);
           con.rs = con.st.executeQuery(fourthweek);
           if (con.rs.next()) {
          fourtw=con.rs.getDouble(1);
             } 
           
           
           
           date2=date1+"-08-28";
             date3=date1+"-08-31";
           String fifthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fifthweek);
           con.rs = con.st.executeQuery(fifthweek);
           if (con.rs.next()) {
          fifthw=con.rs.getDouble(1);
             }
           
           total_tk=firstw+secondw+thirdw+fourtw+fifthw;
            dt.addRow(new Object[]{"August",firstw,secondw,thirdw,fourtw,fifthw,total_tk});
              yearTotal= yearTotal+total_tk;
          yearTotal=Math.round(yearTotal*100.0)/100.0;
          
       } catch (SQLException ex) {
           Logger.getLogger(Con_ENg_Sales_report.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    }
      void september(){
       try {
     total_tk=0;firstw=0;secondw=0;thirdw=0;fourtw=0;fifthw=0;
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate()),date2,date3;
           date2=date1+"-09-1";
             date3=date1+"-09-7";
           String firstweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(firstweek);
           con.rs = con.st.executeQuery(firstweek);
           if (con.rs.next()) {
          firstw=con.rs.getDouble(1);
             }       
           
           
            date2=date1+"-09-8";
             date3=date1+"-09-14";
           String secondeweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(secondeweek);
           con.rs = con.st.executeQuery(secondeweek);
           if (con.rs.next()) {
          secondw=con.rs.getDouble(1);
             }  
           
            date2=date1+"-09-15";
             date3=date1+"-09-21";
           String thirdweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(thirdweek);
           con.rs = con.st.executeQuery(thirdweek);
           if (con.rs.next()) {
          thirdw=con.rs.getDouble(1);
             } 
           
            date2=date1+"-09-22";
             date3=date1+"-09-28";
           String fourthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fourthweek);
           con.rs = con.st.executeQuery(fourthweek);
           if (con.rs.next()) {
          fourtw=con.rs.getDouble(1);
             } 
           
           
           
           date2=date1+"-09-28";
             date3=date1+"-09-31";
           String fifthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fifthweek);
           con.rs = con.st.executeQuery(fifthweek);
           if (con.rs.next()) {
          fifthw=con.rs.getDouble(1);
             }
           
           total_tk=firstw+secondw+thirdw+fourtw+fifthw;
            dt.addRow(new Object[]{"September",firstw,secondw,thirdw,fourtw,fifthw,total_tk});
            yearTotal= yearTotal+total_tk;
          yearTotal=Math.round(yearTotal*100.0)/100.0;
       } catch (SQLException ex) {
           Logger.getLogger(Con_ENg_Sales_report.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    }
      void october(){
       try {
       total_tk=0;firstw=0;secondw=0;thirdw=0;fourtw=0;fifthw=0; 
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate()),date2,date3;
           date2=date1+"-10-1";
             date3=date1+"-10-7";
           String firstweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(firstweek);
           con.rs = con.st.executeQuery(firstweek);
           if (con.rs.next()) {
          firstw=con.rs.getDouble(1);
             }       
           
           
            date2=date1+"-10-8";
             date3=date1+"-10-14";
           String secondeweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(secondeweek);
           con.rs = con.st.executeQuery(secondeweek);
           if (con.rs.next()) {
          secondw=con.rs.getDouble(1);
             }  
           
            date2=date1+"-10-15";
             date3=date1+"-10-21";
           String thirdweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(thirdweek);
           con.rs = con.st.executeQuery(thirdweek);
           if (con.rs.next()) {
          thirdw=con.rs.getDouble(1);
             } 
           
            date2=date1+"-10-22";
             date3=date1+"-10-28";
           String fourthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fourthweek);
           con.rs = con.st.executeQuery(fourthweek);
           if (con.rs.next()) {
          fourtw=con.rs.getDouble(1);
             } 
           
           
           
           date2=date1+"-10-28";
             date3=date1+"-10-31";
           String fifthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fifthweek);
           con.rs = con.st.executeQuery(fifthweek);
           if (con.rs.next()) {
          fifthw=con.rs.getDouble(1);
             }
           
           total_tk=firstw+secondw+thirdw+fourtw+fifthw;
            dt.addRow(new Object[]{"October",firstw,secondw,thirdw,fourtw,fifthw,total_tk});
            yearTotal= yearTotal+total_tk;
          yearTotal=Math.round(yearTotal*100.0)/100.0;
       } catch (SQLException ex) {
           Logger.getLogger(Con_ENg_Sales_report.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    } 
      void november(){
       try {
       total_tk=0;firstw=0;secondw=0;thirdw=0;fourtw=0;fifthw=0;
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate()),date2,date3;
           date2=date1+"-11-1";
             date3=date1+"-11-7";
           String firstweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(firstweek);
           con.rs = con.st.executeQuery(firstweek);
           if (con.rs.next()) {
          firstw=con.rs.getDouble(1);
             }       
           
           
            date2=date1+"-11-8";
             date3=date1+"-11-14";
           String secondeweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(secondeweek);
           con.rs = con.st.executeQuery(secondeweek);
           if (con.rs.next()) {
          secondw=con.rs.getDouble(1);
             }  
           
            date2=date1+"-11-15";
             date3=date1+"-11-21";
           String thirdweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(thirdweek);
           con.rs = con.st.executeQuery(thirdweek);
           if (con.rs.next()) {
          thirdw=con.rs.getDouble(1);
             } 
           
            date2=date1+"-11-22";
             date3=date1+"-11-28";
           String fourthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fourthweek);
           con.rs = con.st.executeQuery(fourthweek);
           if (con.rs.next()) {
          fourtw=con.rs.getDouble(1);
             } 
           
           
           
           date2=date1+"-11-28";
             date3=date1+"-11-31";
           String fifthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fifthweek);
           con.rs = con.st.executeQuery(fifthweek);
           if (con.rs.next()) {
          fifthw=con.rs.getDouble(1);
             }
           
           total_tk=firstw+secondw+thirdw+fourtw+fifthw;
            dt.addRow(new Object[]{"November",firstw,secondw,thirdw,fourtw,fifthw,total_tk});
            yearTotal= yearTotal+total_tk;
          yearTotal=Math.round(yearTotal*100.0)/100.0;
       } catch (SQLException ex) {
           Logger.getLogger(Con_ENg_Sales_report.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    }
      void december(){
       try {
       sala=0;sal_commi=0;worki_expen=0;tar_quantity=0;achiveQuan=0;sal_taka=0;
         total_tk=0;firstw=0;secondw=0;thirdw=0;fourtw=0;fifthw=0;
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate()),date2,date3;
           date2=date1+"-12-1";
             date3=date1+"-12-7";
           String firstweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(firstweek);
           con.rs = con.st.executeQuery(firstweek);
           if (con.rs.next()) {
          firstw=con.rs.getDouble(1);
             }       
           
           
            date2=date1+"-12-8";
             date3=date1+"-12-14";
           String secondeweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(secondeweek);
           con.rs = con.st.executeQuery(secondeweek);
           if (con.rs.next()) {
          secondw=con.rs.getDouble(1);
             }  
           
            date2=date1+"-12-15";
             date3=date1+"-12-21";
           String thirdweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(thirdweek);
           con.rs = con.st.executeQuery(thirdweek);
           if (con.rs.next()) {
          thirdw=con.rs.getDouble(1);
             } 
           
            date2=date1+"-12-22";
             date3=date1+"-12-28";
           String fourthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fourthweek);
           con.rs = con.st.executeQuery(fourthweek);
           if (con.rs.next()) {
          fourtw=con.rs.getDouble(1);
             } 
           
           
           
           date2=date1+"-12-28";
             date3=date1+"-12-31";
           String fifthweek="SELECT SUM(`amount`)AS`Amount`,SUM(`total_ltr`) AS `total_ltr`,`ref_designation`,`con_eng_name`,`date` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `ref_designation`='"+employe_combo1.getSelectedItem()+"' AND `con_eng_name`='"+employe_combo.getSelectedItem()+"' AND `date`>='"+date2+"' AND `date`<='"+date3+"' GROUP BY `con_eng_name`";
           con.contest();
           con.st = con.ct.prepareCall(fifthweek);
           con.rs = con.st.executeQuery(fifthweek);
           if (con.rs.next()) {
          fifthw=con.rs.getDouble(1);
             }
           
           total_tk=firstw+secondw+thirdw+fourtw+fifthw;
            dt.addRow(new Object[]{"December",firstw,secondw,thirdw,fourtw,fifthw,total_tk});
          yearTotal= yearTotal+total_tk;
          yearTotal=Math.round(yearTotal*100.0)/100.0;
          jLabel8.setText("Yearly Total Amount =  "+yearTotal);
       } catch (SQLException ex) {
           Logger.getLogger(Con_ENg_Sales_report.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    }
    private void employe_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employe_comboActionPerformed
if(employe_combo.getSelectedIndex()>0){

       try {
      
           String ss="SELECT `name`,`address`,`phone`,`email`, `date`,`profession` FROM `rmc_chemical_ltd`.`contructor_engineeer`  WHERE `designation`='"+employe_combo1.getSelectedItem()+"' AND `name`='"+employe_combo.getSelectedItem()+"'";
           con.contest();
           con.st = con.ct.prepareCall(ss);
           con.rs = con.st.executeQuery(ss);
           while (con.rs.next()) { 
               address_txt.setText(""+con.rs.getString(2));  
                 mobile_txt.setText(""+con.rs.getString(3));  
                  email_txt.setText(""+con.rs.getString(4));  
                   profession_txt.setText(""+con.rs.getString(6));  
           } 
           
            } 
         catch (SQLException ex) {
           Logger.getLogger(Con_ENg_Sales_report.class.getName()).log(Level.SEVERE, null, ex);
       }

   if(!((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty())
        
       { con.st=null;
        dt.setRowCount(0);
        janu();
        feb();
        march();
        april();
        may();
        june();
        july();
        august();
        september();
        october();
        november();
        december();}
      

}      
    }//GEN-LAST:event_employe_comboActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
   if (!((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            
              if(employe_combo.getSelectedIndex()>0)
        
       {       
        dt.setRowCount(0);
        janu();
        feb();
        march();
        april();
        may();
        june();
        july();
        august();
        september();
        october();
        november();
        december();}}
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void employe_combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employe_combo1ActionPerformed
        show_em();
    }//GEN-LAST:event_employe_combo1ActionPerformed

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        /*  MessageFormat header=new MessageFormat("Hello");
        MessageFormat footer=new MessageFormat("Hello2");

        try {
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        } catch (PrinterException ex) {

            JOptionPane.showMessageDialog(this,"Failde");

        }
        */
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        demo ob=new demo(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked

        this.setExtendedState(Con_ENg_Sales_report.ICONIFIED);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked
 
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
            java.util.logging.Logger.getLogger(Con_ENg_Sales_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Con_ENg_Sales_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Con_ENg_Sales_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Con_ENg_Sales_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Con_ENg_Sales_report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_txt;
    private javax.swing.JTextField email_txt;
    private javax.swing.JComboBox<String> employe_combo;
    private javax.swing.JComboBox<String> employe_combo1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField mobile_txt;
    private javax.swing.JTextField profession_txt;
    // End of variables declaration//GEN-END:variables

}
