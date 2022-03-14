 
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
 

public class Employe_salse_salary_report extends javax.swing.JFrame {
   connection_class con;
      DefaultTableModel dt;
   double sala=0,sal_commi=0,worki_expen=0,tar_quantity=0,achiveQuan=0,sal_taka=0,bon=0;
    double sala2=0,sal_commi2=0,worki_expen2=0,tar_quantity2=0,achiveQuan2=0,sal_taka2=0,bon2;
    static String h;
    public Employe_salse_salary_report(String string) {
        initComponents();
        con=new connection_class();
        show_date();
         dt = (DefaultTableModel) jTable1.getModel();
         show_em();
         h=string;
   
    }

    private Employe_salse_salary_report() {
   initComponents(); }
 
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
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        sales_comm_lbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        expences_lbl = new javax.swing.JLabel();
        target_ltr_lbl = new javax.swing.JLabel();
        achive_lbl = new javax.swing.JLabel();
        sales_am_lbl = new javax.swing.JLabel();
        salary_payment_lbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sales_Bnus = new javax.swing.JLabel();
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
        jDateChooser1.setBounds(1180, 50, 180, 30);

        employe_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        employe_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "jasmin", " " }));
        employe_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employe_comboActionPerformed(evt);
            }
        });
        jPanel1.add(employe_combo);
        employe_combo.setBounds(30, 110, 250, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(290, 110, 250, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Zone");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 90, 210, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Employe Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 90, 210, 20);

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Month", "Salary Payment", "Expences", "Sales Commission", "Bonus", "Target ltr", "Achive ltr", "Sales Amount"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(153, 0, 0));
        jTable1.setRowHeight(35);
        jTable1.setRowMargin(2);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(32, 150, 1300, 410);

        sales_comm_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sales_comm_lbl.setForeground(new java.awt.Color(255, 255, 255));
        sales_comm_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(sales_comm_lbl);
        sales_comm_lbl.setBounds(510, 560, 160, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total     :");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 560, 160, 30);

        expences_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        expences_lbl.setForeground(new java.awt.Color(255, 255, 255));
        expences_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(expences_lbl);
        expences_lbl.setBounds(350, 560, 160, 30);

        target_ltr_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        target_ltr_lbl.setForeground(new java.awt.Color(255, 255, 255));
        target_ltr_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(target_ltr_lbl);
        target_ltr_lbl.setBounds(830, 560, 160, 30);

        achive_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        achive_lbl.setForeground(new java.awt.Color(255, 255, 255));
        achive_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(achive_lbl);
        achive_lbl.setBounds(990, 560, 160, 30);

        sales_am_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sales_am_lbl.setForeground(new java.awt.Color(255, 255, 255));
        sales_am_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(sales_am_lbl);
        sales_am_lbl.setBounds(1150, 560, 180, 30);

        salary_payment_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        salary_payment_lbl.setForeground(new java.awt.Color(255, 255, 255));
        salary_payment_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(salary_payment_lbl);
        salary_payment_lbl.setBounds(190, 560, 160, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("*Employe All Report");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 0, 260, 40);

        sales_Bnus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sales_Bnus.setForeground(new java.awt.Color(255, 255, 255));
        sales_Bnus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(sales_Bnus);
        sales_Bnus.setBounds(670, 560, 160, 30);

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

        setSize(new java.awt.Dimension(1368, 739));
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
           String s=" SELECT `name`, `zone`  FROM `rmc_chemical_ltd`.`employe`";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while (con.rs.next()) {
           
           employe_combo.addItem(""+con.rs.getString(1));
           
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Employe_salse_salary_report.class.getName()).log(Level.SEVERE, null, ex);
       }
 
 }
    
    
    
    void janu(){
       try {
     sala=0;sal_commi=0;worki_expen=0;tar_quantity=0;achiveQuan=0;sal_taka=0;bon=0;
        sala2=0;sal_commi2=0;worki_expen=0;tar_quantity2=0;achiveQuan2=0;sal_taka2=0;bon2=0;
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate());
           date1=date1+"-01";
            
           String emsalary=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`, `emp_salary`.`type`";
           con.contest();
           con.st = con.ct.prepareCall(emsalary);
           con.rs = con.st.executeQuery(emsalary);
           while (con.rs.next()) {
           if(con.rs.getString(3).equals("Salary")){
           sala=sala+Double.parseDouble(con.rs.getString(4));
               
           }else  if(con.rs.getString(3).equals("Sales Commission")){
           
                  sal_commi=sal_commi+Double.parseDouble(con.rs.getString(4));
                  
           } else  if(con.rs.getString(3).equals("Working Expenses")){
         
                  worki_expen=worki_expen+Double.parseDouble(con.rs.getString(4));
                  
           }  else  if(con.rs.getString(3).equals("Bonus")){
         
                  bon=bon+Double.parseDouble(con.rs.getString(4));
                  
           } 
           
           
           }
          
            String target=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`";
           con.contest();
           con.st = con.ct.prepareCall(target);
           con.rs = con.st.executeQuery(target);
          while(con.rs.next()) { 
          tar_quantity=tar_quantity+Double.parseDouble(con.rs.getString(4));
           
           }
           
         
           
             
            String achiv="  SELECT `sal_achive`.`employe_name`,`sal_achive`.`date`,SUM(`sal_achive`.`quantity`)AS `quantity`,SUM(`sal_achive`.`total`)AS `total` FROM `sal_achive` WHERE `sal_achive`.`employe_name`='"+employe_combo.getSelectedItem()+"' AND `sal_achive`.`date`LIKE '"+date1+"%' GROUP BY `sal_achive`.`date`";
           con.contest();
           con.st = con.ct.prepareCall(achiv);
           con.rs = con.st.executeQuery(achiv);
           if(con.rs.next()) {
            achiveQuan=achiveQuan+Double.parseDouble(con.rs.getString(3));
           
            sal_taka=sal_taka+Double.parseDouble(con.rs.getString(4));
           
           
           } 
           sala2=sala2+sala;
           sal_commi2=sal_commi2+sal_commi;
           worki_expen2=worki_expen2+worki_expen;
           tar_quantity2=tar_quantity2+tar_quantity;
            sal_taka2=sal_taka2+sal_taka;
            achiveQuan2=achiveQuan2+achiveQuan;
               bon2=bon2+bon;
          // dt.setRowCount(0);
            dt.addRow(new Object[]{"January",sala,worki_expen,sal_commi,bon,tar_quantity,achiveQuan,sal_taka});
          
           
       } catch (SQLException ex) {
           Logger.getLogger(Employe_salse_salary_report.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
      void feb(){
       try {
       sala=0;sal_commi=0;worki_expen=0;tar_quantity=0;achiveQuan=0;sal_taka=0;bon=0;;
        
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate());
           date1=date1+"-02";
            
           String emsalary=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`, `emp_salary`.`type`";
           con.contest();
           con.st = con.ct.prepareCall(emsalary);
           con.rs = con.st.executeQuery(emsalary);
           while (con.rs.next()) {
           if(con.rs.getString(3).equals("Salary")){
           sala=sala+Double.parseDouble(con.rs.getString(4));
               
           }else  if(con.rs.getString(3).equals("Sales Commission")){
           
                  sal_commi=sal_commi+Double.parseDouble(con.rs.getString(4));
                  
           } else  if(con.rs.getString(3).equals("Working Expenses")){
         
                  worki_expen=worki_expen+Double.parseDouble(con.rs.getString(4));
                  
           } else  if(con.rs.getString(3).equals("Bonus")){
         
                  bon=bon+Double.parseDouble(con.rs.getString(4));
                  
           }  
           
           
           }
           
           
            String target=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`";
           con.contest();
           con.st = con.ct.prepareCall(target);
           con.rs = con.st.executeQuery(target);
          while(con.rs.next()) {
           
           
          tar_quantity=tar_quantity+Double.parseDouble(con.rs.getString(4));
           
           }
           
           
             
            String achiv="  SELECT `sal_achive`.`employe_name`,`sal_achive`.`date`,SUM(`sal_achive`.`quantity`)AS `quantity`,SUM(`sal_achive`.`total`)AS `total` FROM `sal_achive` WHERE `sal_achive`.`employe_name`='"+employe_combo.getSelectedItem()+"' AND `sal_achive`.`date`LIKE '"+date1+"%' GROUP BY `sal_achive`.`date`";
           con.contest();
           con.st = con.ct.prepareCall(achiv);
           con.rs = con.st.executeQuery(achiv);
           if(con.rs.next()) {
            achiveQuan=achiveQuan+Double.parseDouble(con.rs.getString(3));
           
            sal_taka=sal_taka+Double.parseDouble(con.rs.getString(4));
           
           
           }
         sala2=sala2+sala;
           sal_commi2=sal_commi2+sal_commi;
           worki_expen2=worki_expen2+worki_expen;
           tar_quantity2=tar_quantity2+tar_quantity;
            sal_taka2=sal_taka2+sal_taka;
            achiveQuan2=achiveQuan2+achiveQuan;
                bon2=bon2+bon;
          // dt.setRowCount(0);
            dt.addRow(new Object[]{"February",sala,worki_expen,sal_commi,bon,tar_quantity,achiveQuan,sal_taka});
          
           
       } catch (SQLException ex) {
           Logger.getLogger(Employe_salse_salary_report.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    } 
       void march(){
       try {
     sala=0;sal_commi=0;worki_expen=0;tar_quantity=0;achiveQuan=0;sal_taka=0;bon=0;
        
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate());
           date1=date1+"-03";
            
           String emsalary=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`, `emp_salary`.`type`";
           con.contest();
           con.st = con.ct.prepareCall(emsalary);
           con.rs = con.st.executeQuery(emsalary);
           while (con.rs.next()) {
           if(con.rs.getString(3).equals("Salary")){
           sala=sala+Double.parseDouble(con.rs.getString(4));
               
           }else  if(con.rs.getString(3).equals("Sales Commission")){
           
                  sal_commi=sal_commi+Double.parseDouble(con.rs.getString(4));
                  
           } else  if(con.rs.getString(3).equals("Working Expenses")){
         
                  worki_expen=worki_expen+Double.parseDouble(con.rs.getString(4));
                  
           }  else  if(con.rs.getString(3).equals("Bonus")){
         
                  bon=bon+Double.parseDouble(con.rs.getString(4));
                  
           } 
           
           
           }
           
           
            String target=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`";
           con.contest();
           con.st = con.ct.prepareCall(target);
           con.rs = con.st.executeQuery(target);
          while(con.rs.next()) {
           
           
          tar_quantity=tar_quantity+Double.parseDouble(con.rs.getString(4));
           
           }
           
           
             
            String achiv="  SELECT `sal_achive`.`employe_name`,`sal_achive`.`date`,SUM(`sal_achive`.`quantity`)AS `quantity`,SUM(`sal_achive`.`total`)AS `total` FROM `sal_achive` WHERE `sal_achive`.`employe_name`='"+employe_combo.getSelectedItem()+"' AND `sal_achive`.`date`LIKE '"+date1+"%' GROUP BY `sal_achive`.`date`";
           con.contest();
           con.st = con.ct.prepareCall(achiv);
           con.rs = con.st.executeQuery(achiv);
           if(con.rs.next()) {
            achiveQuan=achiveQuan+Double.parseDouble(con.rs.getString(3));
           
            sal_taka=sal_taka+Double.parseDouble(con.rs.getString(4));
           
           
           }
         sala2=sala2+sala;
           sal_commi2=sal_commi2+sal_commi;
           worki_expen2=worki_expen2+worki_expen;
           tar_quantity2=tar_quantity2+tar_quantity;
            sal_taka2=sal_taka2+sal_taka;
            achiveQuan2=achiveQuan2+achiveQuan;    bon2=bon2+bon;
          // dt.setRowCount(0);
            dt.addRow(new Object[]{"March",sala,worki_expen,sal_commi,bon,tar_quantity,achiveQuan,sal_taka});
          
           
       } catch (SQLException ex) {
           Logger.getLogger(Employe_salse_salary_report.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
      void april(){
       try {
       sala=0;sal_commi=0;worki_expen=0;tar_quantity=0;achiveQuan=0;sal_taka=0;bon=0;
        
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate());
           date1=date1+"-04";
            
           String emsalary=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`, `emp_salary`.`type`";
           con.contest();
           con.st = con.ct.prepareCall(emsalary);
           con.rs = con.st.executeQuery(emsalary);
           while (con.rs.next()) {
           if(con.rs.getString(3).equals("Salary")){
           sala=sala+Double.parseDouble(con.rs.getString(4));
               
           }else  if(con.rs.getString(3).equals("Sales Commission")){
           
                  sal_commi=sal_commi+Double.parseDouble(con.rs.getString(4));
                  
           } else  if(con.rs.getString(3).equals("Working Expenses")){
         
                  worki_expen=worki_expen+Double.parseDouble(con.rs.getString(4));
                  
           }  else  if(con.rs.getString(3).equals("Bonus")){
         
                  bon=bon+Double.parseDouble(con.rs.getString(4));
                  
           } 
           
           
           }
           
           
            String target=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`";
           con.contest();
           con.st = con.ct.prepareCall(target);
           con.rs = con.st.executeQuery(target);
          while(con.rs.next()) {
           
           
          tar_quantity=tar_quantity+Double.parseDouble(con.rs.getString(4));
           
           }
           
           
             
            String achiv="  SELECT `sal_achive`.`employe_name`,`sal_achive`.`date`,SUM(`sal_achive`.`quantity`)AS `quantity`,SUM(`sal_achive`.`total`)AS `total` FROM `sal_achive` WHERE `sal_achive`.`employe_name`='"+employe_combo.getSelectedItem()+"' AND `sal_achive`.`date`LIKE '"+date1+"%' GROUP BY `sal_achive`.`date`";
           con.contest();
           con.st = con.ct.prepareCall(achiv);
           con.rs = con.st.executeQuery(achiv);
           if(con.rs.next()) {
            achiveQuan=achiveQuan+Double.parseDouble(con.rs.getString(3));
           
            sal_taka=sal_taka+Double.parseDouble(con.rs.getString(4));
           
           
           }
        
           sala2=sala2+sala;
           sal_commi2=sal_commi2+sal_commi;
           worki_expen2=worki_expen2+worki_expen;
           tar_quantity2=tar_quantity2+tar_quantity;
            sal_taka2=sal_taka2+sal_taka;
            achiveQuan2=achiveQuan2+achiveQuan;    bon2=bon2+bon;
            dt.addRow(new Object[]{"April",sala,worki_expen,sal_commi,bon,tar_quantity,achiveQuan,sal_taka});
          
           
       } catch (SQLException ex) {
           Logger.getLogger(Employe_salse_salary_report.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }   
      void may(){
       try {
     sala=0;sal_commi=0;worki_expen=0;tar_quantity=0;achiveQuan=0;sal_taka=0;bon=0;
        
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate());
           date1=date1+"-05";
            
           String emsalary=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`, `emp_salary`.`type`";
           con.contest();
           con.st = con.ct.prepareCall(emsalary);
           con.rs = con.st.executeQuery(emsalary);
           while (con.rs.next()) {
           if(con.rs.getString(3).equals("Salary")){
           sala=sala+Double.parseDouble(con.rs.getString(4));
               
           }else  if(con.rs.getString(3).equals("Sales Commission")){
           
                  sal_commi=sal_commi+Double.parseDouble(con.rs.getString(4));
                  
           } else  if(con.rs.getString(3).equals("Working Expenses")){
         
                  worki_expen=worki_expen+Double.parseDouble(con.rs.getString(4));
                  
           }  else  if(con.rs.getString(3).equals("Bonus")){
         
                  bon=bon+Double.parseDouble(con.rs.getString(4));
                  
           } 
           
           
           }
           
           
            String target=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`";
           con.contest();
           con.st = con.ct.prepareCall(target);
           con.rs = con.st.executeQuery(target);
          while(con.rs.next()) {
           
           
          tar_quantity=tar_quantity+Double.parseDouble(con.rs.getString(4));
           
           }
           
           
             
            String achiv="  SELECT `sal_achive`.`employe_name`,`sal_achive`.`date`,SUM(`sal_achive`.`quantity`)AS `quantity`,SUM(`sal_achive`.`total`)AS `total` FROM `sal_achive` WHERE `sal_achive`.`employe_name`='"+employe_combo.getSelectedItem()+"' AND `sal_achive`.`date`LIKE '"+date1+"%' GROUP BY `sal_achive`.`date`";
           con.contest();
           con.st = con.ct.prepareCall(achiv);
           con.rs = con.st.executeQuery(achiv);
           if(con.rs.next()) {
            achiveQuan=achiveQuan+Double.parseDouble(con.rs.getString(3));
           
            sal_taka=sal_taka+Double.parseDouble(con.rs.getString(4));
           
           
           }
        
         sala2=sala2+sala;
           sal_commi2=sal_commi2+sal_commi;
           worki_expen2=worki_expen2+worki_expen;
           tar_quantity2=tar_quantity2+tar_quantity;
            sal_taka2=sal_taka2+sal_taka;
            achiveQuan2=achiveQuan2+achiveQuan;
                bon2=bon2+bon;
            dt.addRow(new Object[]{"May",sala,worki_expen,sal_commi,bon,tar_quantity,achiveQuan,sal_taka});
          
           
       } catch (SQLException ex) {
           Logger.getLogger(Employe_salse_salary_report.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
      void june(){
       try {
       sala=0;sal_commi=0;worki_expen=0;tar_quantity=0;achiveQuan=0;sal_taka=0;bon=0;
        
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate());
           date1=date1+"-06";
            
           String emsalary=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`, `emp_salary`.`type`";
           con.contest();
           con.st = con.ct.prepareCall(emsalary);
           con.rs = con.st.executeQuery(emsalary);
           while (con.rs.next()) {
           if(con.rs.getString(3).equals("Salary")){
           sala=sala+Double.parseDouble(con.rs.getString(4));
               
           }else  if(con.rs.getString(3).equals("Sales Commission")){
           
                  sal_commi=sal_commi+Double.parseDouble(con.rs.getString(4));
                  
           } else  if(con.rs.getString(3).equals("Working Expenses")){
         
                  worki_expen=worki_expen+Double.parseDouble(con.rs.getString(4));
                  
           }  else  if(con.rs.getString(3).equals("Bonus")){
         
                  bon=bon+Double.parseDouble(con.rs.getString(4));
                  
           } 
           
           
           }
           
           
            String target=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`";
           con.contest();
           con.st = con.ct.prepareCall(target);
           con.rs = con.st.executeQuery(target);
          while(con.rs.next()) {
           
           
          tar_quantity=tar_quantity+Double.parseDouble(con.rs.getString(4));
           
           }
           
           
             
            String achiv="  SELECT `sal_achive`.`employe_name`,`sal_achive`.`date`,SUM(`sal_achive`.`quantity`)AS `quantity`,SUM(`sal_achive`.`total`)AS `total` FROM `sal_achive` WHERE `sal_achive`.`employe_name`='"+employe_combo.getSelectedItem()+"' AND `sal_achive`.`date`LIKE '"+date1+"%' GROUP BY `sal_achive`.`date`";
           con.contest();
           con.st = con.ct.prepareCall(achiv);
           con.rs = con.st.executeQuery(achiv);
           if(con.rs.next()) {
            achiveQuan=achiveQuan+Double.parseDouble(con.rs.getString(3));
           
            sal_taka=sal_taka+Double.parseDouble(con.rs.getString(4));
           
           
           }
        
         sala2=sala2+sala;
           sal_commi2=sal_commi2+sal_commi;
           worki_expen2=worki_expen2+worki_expen;
           tar_quantity2=tar_quantity2+tar_quantity;
            sal_taka2=sal_taka2+sal_taka;
            achiveQuan2=achiveQuan2+achiveQuan;    bon2=bon2+bon;
            dt.addRow(new Object[]{"June",sala,worki_expen,sal_commi,bon,tar_quantity,achiveQuan,sal_taka});
           
       } catch (SQLException ex) {
           Logger.getLogger(Employe_salse_salary_report.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
         
      void july(){
       try {
     sala=0;sal_commi=0;worki_expen=0;tar_quantity=0;achiveQuan=0;sal_taka=0;bon=0;
        
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate());
           date1=date1+"-07";
            
           String emsalary=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`, `emp_salary`.`type`";
           con.contest();
           con.st = con.ct.prepareCall(emsalary);
           con.rs = con.st.executeQuery(emsalary);
           while (con.rs.next()) {
           if(con.rs.getString(3).equals("Salary")){
           sala=sala+Double.parseDouble(con.rs.getString(4));
               
           }else  if(con.rs.getString(3).equals("Sales Commission")){
           
                  sal_commi=sal_commi+Double.parseDouble(con.rs.getString(4));
                  
           } else  if(con.rs.getString(3).equals("Working Expenses")){
         
                  worki_expen=worki_expen+Double.parseDouble(con.rs.getString(4));
                  
           }  else  if(con.rs.getString(3).equals("Bonus")){
         
                  bon=bon+Double.parseDouble(con.rs.getString(4));
                  
           } 
           
           
           }
           
           
            String target=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`";
           con.contest();
           con.st = con.ct.prepareCall(target);
           con.rs = con.st.executeQuery(target);
          while(con.rs.next()) {
           
           
          tar_quantity=tar_quantity+Double.parseDouble(con.rs.getString(4));
           
           }
           
           
             
            String achiv="  SELECT `sal_achive`.`employe_name`,`sal_achive`.`date`,SUM(`sal_achive`.`quantity`)AS `quantity`,SUM(`sal_achive`.`total`)AS `total` FROM `sal_achive` WHERE `sal_achive`.`employe_name`='"+employe_combo.getSelectedItem()+"' AND `sal_achive`.`date`LIKE '"+date1+"%' GROUP BY `sal_achive`.`date`";
           con.contest();
           con.st = con.ct.prepareCall(achiv);
           con.rs = con.st.executeQuery(achiv);
           if(con.rs.next()) {
            achiveQuan=achiveQuan+Double.parseDouble(con.rs.getString(3));
           
            sal_taka=sal_taka+Double.parseDouble(con.rs.getString(4));
           
           
           }
        
          sala2=sala2+sala;
           sal_commi2=sal_commi2+sal_commi;
           worki_expen2=worki_expen2+worki_expen;
           tar_quantity2=tar_quantity2+tar_quantity;
            sal_taka2=sal_taka2+sal_taka;
            achiveQuan2=achiveQuan2+achiveQuan;    bon2=bon2+bon;
            dt.addRow(new Object[]{"July",sala,worki_expen,sal_commi,bon,tar_quantity,achiveQuan,sal_taka});
          
           
       } catch (SQLException ex) {
           Logger.getLogger(Employe_salse_salary_report.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
      void august(){
       try {
       sala=0;sal_commi=0;worki_expen=0;tar_quantity=0;achiveQuan=0;sal_taka=0;bon=0;
        
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate());
           date1=date1+"-08";
            
           String emsalary=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`, `emp_salary`.`type`";
           con.contest();
           con.st = con.ct.prepareCall(emsalary);
           con.rs = con.st.executeQuery(emsalary);
           while (con.rs.next()) {
           if(con.rs.getString(3).equals("Salary")){
           sala=sala+Double.parseDouble(con.rs.getString(4));
               
           }else  if(con.rs.getString(3).equals("Sales Commission")){
           
                  sal_commi=sal_commi+Double.parseDouble(con.rs.getString(4));
                  
           } else  if(con.rs.getString(3).equals("Working Expenses")){
         
                  worki_expen=worki_expen+Double.parseDouble(con.rs.getString(4));
                  
           }  else  if(con.rs.getString(3).equals("Bonus")){
         
                  bon=bon+Double.parseDouble(con.rs.getString(4));
                  
           } 
           
           
           }
           
           
            String target=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`";
           con.contest();
           con.st = con.ct.prepareCall(target);
           con.rs = con.st.executeQuery(target);
          while(con.rs.next()) {
           
           
          tar_quantity=tar_quantity+Double.parseDouble(con.rs.getString(4));
           
           }
           
           
             
            String achiv="  SELECT `sal_achive`.`employe_name`,`sal_achive`.`date`,SUM(`sal_achive`.`quantity`)AS `quantity`,SUM(`sal_achive`.`total`)AS `total` FROM `sal_achive` WHERE `sal_achive`.`employe_name`='"+employe_combo.getSelectedItem()+"' AND `sal_achive`.`date`LIKE '"+date1+"%' GROUP BY `sal_achive`.`date`";
           con.contest();
           con.st = con.ct.prepareCall(achiv);
           con.rs = con.st.executeQuery(achiv);
           if(con.rs.next()) {
            achiveQuan=achiveQuan+Double.parseDouble(con.rs.getString(3));
           
            sal_taka=sal_taka+Double.parseDouble(con.rs.getString(4));
           
           
           }
        
          sala2=sala2+sala;
           sal_commi2=sal_commi2+sal_commi;
           worki_expen2=worki_expen2+worki_expen;
           tar_quantity2=tar_quantity2+tar_quantity;
            sal_taka2=sal_taka2+sal_taka;
            achiveQuan2=achiveQuan2+achiveQuan;
                bon2=bon2+bon;
            dt.addRow(new Object[]{"August",sala,worki_expen,sal_commi,bon,tar_quantity,achiveQuan,sal_taka});
          
           
       } catch (SQLException ex) {
           Logger.getLogger(Employe_salse_salary_report.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    } 
      
      void september(){
       try {
     sala=0;sal_commi=0;worki_expen=0;tar_quantity=0;achiveQuan=0;sal_taka=0;bon=0;
        
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate());
           date1=date1+"-09";
            
           String emsalary=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`, `emp_salary`.`type`";
           con.contest();
           con.st = con.ct.prepareCall(emsalary);
           con.rs = con.st.executeQuery(emsalary);
           while (con.rs.next()) {
           if(con.rs.getString(3).equals("Salary")){
           sala=sala+Double.parseDouble(con.rs.getString(4));
               
           }else  if(con.rs.getString(3).equals("Sales Commission")){
           
                  sal_commi=sal_commi+Double.parseDouble(con.rs.getString(4));
                  
           } else  if(con.rs.getString(3).equals("Working Expenses")){
         
                  worki_expen=worki_expen+Double.parseDouble(con.rs.getString(4));
                  
           }  else  if(con.rs.getString(3).equals("Bonus")){
         
                  bon=bon+Double.parseDouble(con.rs.getString(4));
                  
           } 
           
           
           }
           
           
            String target=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`";
           con.contest();
           con.st = con.ct.prepareCall(target);
           con.rs = con.st.executeQuery(target);
          while(con.rs.next()) {
           
           
          tar_quantity=tar_quantity+Double.parseDouble(con.rs.getString(4));
           
           }
           
           
             
            String achiv="  SELECT `sal_achive`.`employe_name`,`sal_achive`.`date`,SUM(`sal_achive`.`quantity`)AS `quantity`,SUM(`sal_achive`.`total`)AS `total` FROM `sal_achive` WHERE `sal_achive`.`employe_name`='"+employe_combo.getSelectedItem()+"' AND `sal_achive`.`date`LIKE '"+date1+"%' GROUP BY `sal_achive`.`date`";
           con.contest();
           con.st = con.ct.prepareCall(achiv);
           con.rs = con.st.executeQuery(achiv);
           if(con.rs.next()) {
            achiveQuan=achiveQuan+Double.parseDouble(con.rs.getString(3));
           
            sal_taka=sal_taka+Double.parseDouble(con.rs.getString(4));
           
           
           }
        
          sala2=sala2+sala;
           sal_commi2=sal_commi2+sal_commi;
           worki_expen2=worki_expen2+worki_expen;
           tar_quantity2=tar_quantity2+tar_quantity;
            sal_taka2=sal_taka2+sal_taka;
            achiveQuan2=achiveQuan2+achiveQuan;
                bon2=bon2+bon;
            dt.addRow(new Object[]{"September",sala,worki_expen,sal_commi,bon,tar_quantity,achiveQuan,sal_taka});
          
           
       } catch (SQLException ex) {
           Logger.getLogger(Employe_salse_salary_report.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
      void october(){
       try {
       sala=0;sal_commi=0;worki_expen=0;tar_quantity=0;achiveQuan=0;sal_taka=0;bon=0;
        
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate());
           date1=date1+"-10";
            
           String emsalary=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`, `emp_salary`.`type`";
           con.contest();
           con.st = con.ct.prepareCall(emsalary);
           con.rs = con.st.executeQuery(emsalary);
           while (con.rs.next()) {
           if(con.rs.getString(3).equals("Salary")){
           sala=sala+Double.parseDouble(con.rs.getString(4));
               
           }else  if(con.rs.getString(3).equals("Sales Commission")){
           
                  sal_commi=sal_commi+Double.parseDouble(con.rs.getString(4));
                  
           } else  if(con.rs.getString(3).equals("Working Expenses")){
         
                  worki_expen=worki_expen+Double.parseDouble(con.rs.getString(4));
                  
           }  else  if(con.rs.getString(3).equals("Bonus")){
         
                  bon=bon+Double.parseDouble(con.rs.getString(4));
                  
           } 
           
           
           }
           
           
            String target=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`";
           con.contest();
           con.st = con.ct.prepareCall(target);
           con.rs = con.st.executeQuery(target);
          while(con.rs.next()) {
           
           
          tar_quantity=tar_quantity+Double.parseDouble(con.rs.getString(4));
           
           }
           
           
             
            String achiv="  SELECT `sal_achive`.`employe_name`,`sal_achive`.`date`,SUM(`sal_achive`.`quantity`)AS `quantity`,SUM(`sal_achive`.`total`)AS `total` FROM `sal_achive` WHERE `sal_achive`.`employe_name`='"+employe_combo.getSelectedItem()+"' AND `sal_achive`.`date`LIKE '"+date1+"%' GROUP BY `sal_achive`.`date`";
           con.contest();
           con.st = con.ct.prepareCall(achiv);
           con.rs = con.st.executeQuery(achiv);
           if(con.rs.next()) {
            achiveQuan=achiveQuan+Double.parseDouble(con.rs.getString(3));
           
            sal_taka=sal_taka+Double.parseDouble(con.rs.getString(4));
           
           
           }
        
         sala2=sala2+sala;
           sal_commi2=sal_commi2+sal_commi;
           worki_expen2=worki_expen2+worki_expen;
           tar_quantity2=tar_quantity2+tar_quantity;
            sal_taka2=sal_taka2+sal_taka;
            achiveQuan2=achiveQuan2+achiveQuan;    bon2=bon2+bon;
            dt.addRow(new Object[]{"October",sala,worki_expen,sal_commi,bon,tar_quantity,achiveQuan,sal_taka});
          
           
       } catch (SQLException ex) {
           Logger.getLogger(Employe_salse_salary_report.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
      
      void november(){
       try {
     sala=0;sal_commi=0;worki_expen=0;tar_quantity=0;achiveQuan=0;sal_taka=0;bon=0;
        
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate());
           date1=date1+"-11";
            
           String emsalary=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`, `emp_salary`.`type`";
           con.contest();
           con.st = con.ct.prepareCall(emsalary);
           con.rs = con.st.executeQuery(emsalary);
           while (con.rs.next()) {
           if(con.rs.getString(3).equals("Salary")){
           sala=sala+Double.parseDouble(con.rs.getString(4));
               
           }else  if(con.rs.getString(3).equals("Sales Commission")){
           
                  sal_commi=sal_commi+Double.parseDouble(con.rs.getString(4));
                  
           } else  if(con.rs.getString(3).equals("Working Expenses")){
         
                  worki_expen=worki_expen+Double.parseDouble(con.rs.getString(4));
                  
           }  else  if(con.rs.getString(3).equals("Bonus")){
         
                  bon=bon+Double.parseDouble(con.rs.getString(4));
                  
           } 
           
           
           }
           
           
            String target=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`";
           con.contest();
           con.st = con.ct.prepareCall(target);
           con.rs = con.st.executeQuery(target);
          while(con.rs.next()) {
           
           
          tar_quantity=tar_quantity+Double.parseDouble(con.rs.getString(4));
           
           }
           
           
             
            String achiv="  SELECT `sal_achive`.`employe_name`,`sal_achive`.`date`,SUM(`sal_achive`.`quantity`)AS `quantity`,SUM(`sal_achive`.`total`)AS `total` FROM `sal_achive` WHERE `sal_achive`.`employe_name`='"+employe_combo.getSelectedItem()+"' AND `sal_achive`.`date`LIKE '"+date1+"%' GROUP BY `sal_achive`.`date`";
           con.contest();
           con.st = con.ct.prepareCall(achiv);
           con.rs = con.st.executeQuery(achiv);
           if(con.rs.next()) {
            achiveQuan=achiveQuan+Double.parseDouble(con.rs.getString(3));
           
            sal_taka=sal_taka+Double.parseDouble(con.rs.getString(4));
           
           
           }
        
           sala2=sala2+sala;
           sal_commi2=sal_commi2+sal_commi;
           worki_expen2=worki_expen2+worki_expen;
           tar_quantity2=tar_quantity2+tar_quantity;
            sal_taka2=sal_taka2+sal_taka;
            achiveQuan2=achiveQuan2+achiveQuan;    bon2=bon2+bon;
            dt.addRow(new Object[]{"November",sala,worki_expen,sal_commi,bon,tar_quantity,achiveQuan,sal_taka});
          
           
       } catch (SQLException ex) {
           Logger.getLogger(Employe_salse_salary_report.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
      void december(){
       try {
       sala=0;sal_commi=0;worki_expen=0;tar_quantity=0;achiveQuan=0;sal_taka=0;bon=0;
        
           SimpleDateFormat sd = new SimpleDateFormat("yyyy");
           String date1 = sd.format(jDateChooser1.getDate());
           date1=date1+"-12";
            
           String emsalary=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`, `emp_salary`.`type`";
           con.contest();
           con.st = con.ct.prepareCall(emsalary);
           con.rs = con.st.executeQuery(emsalary);
           while (con.rs.next()) {
           if(con.rs.getString(3).equals("Salary")){
           sala=sala+Double.parseDouble(con.rs.getString(4));
               
           }else  if(con.rs.getString(3).equals("Sales Commission")){
           
                  sal_commi=sal_commi+Double.parseDouble(con.rs.getString(4));
                  
           } else  if(con.rs.getString(3).equals("Working Expenses")){
         
                  worki_expen=worki_expen+Double.parseDouble(con.rs.getString(4));
                  
           }  else  if(con.rs.getString(3).equals("Bonus")){
         
                  bon=bon+Double.parseDouble(con.rs.getString(4));
                  
           } 
           
           
           }
           
           
            String target=" SELECT  `emp_salary`.`name`, `emp_salary`.`datee`,`emp_salary`.`type`,SUM(`emp_salary`.`amount`) AS `amount` FROM `emp_salary` WHERE `emp_salary`.`name`='"+employe_combo.getSelectedItem()+"' AND `emp_salary`.`datee`LIKE'"+date1+"%' GROUP BY `emp_salary`.`datee`";
           con.contest();
           con.st = con.ct.prepareCall(target);
           con.rs = con.st.executeQuery(target);
          while(con.rs.next()) {
           
           
          tar_quantity=tar_quantity+Double.parseDouble(con.rs.getString(4));
           
           }
           
           
             
            String achiv="  SELECT `sal_achive`.`employe_name`,`sal_achive`.`date`,SUM(`sal_achive`.`quantity`)AS `quantity`,SUM(`sal_achive`.`total`)AS `total` FROM `sal_achive` WHERE `sal_achive`.`employe_name`='"+employe_combo.getSelectedItem()+"' AND `sal_achive`.`date`LIKE '"+date1+"%' GROUP BY `sal_achive`.`date`";
           con.contest();
           con.st = con.ct.prepareCall(achiv);
           con.rs = con.st.executeQuery(achiv);
           if(con.rs.next()) {
            achiveQuan=achiveQuan+Double.parseDouble(con.rs.getString(3));
           
            sal_taka=sal_taka+Double.parseDouble(con.rs.getString(4));
           
           
           }
        
          sala2=sala2+sala;
           sal_commi2=sal_commi2+sal_commi;
           worki_expen2=worki_expen2+worki_expen;
           tar_quantity2=tar_quantity2+tar_quantity;
            sal_taka2=sal_taka2+sal_taka;
            achiveQuan2=achiveQuan2+achiveQuan;    bon2=bon2+bon;
            dt.addRow(new Object[]{"December",sala,worki_expen,sal_commi,bon,tar_quantity,achiveQuan,sal_taka});
          
           salary_payment_lbl.setText(""+sala2);
             sales_comm_lbl.setText(""+sal_commi2);
              expences_lbl.setText(""+worki_expen2);
             target_ltr_lbl.setText(""+tar_quantity2);
              sales_am_lbl.setText(""+sal_taka2);
             achive_lbl.setText(""+achiveQuan2);
             sales_Bnus.setText(""+bon2);
             
       } catch (SQLException ex) {
           Logger.getLogger(Employe_salse_salary_report.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
    private void employe_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employe_comboActionPerformed
if(employe_combo.getSelectedIndex()>0){

       try {
      
           String ss=" SELECT  `zone`  FROM `rmc_chemical_ltd`.`employe` where `name`='"+employe_combo.getSelectedItem()+"'";
           con.contest();
           con.st = con.ct.prepareCall(ss);
           con.rs = con.st.executeQuery(ss);
           while (con.rs.next()) {
           
         jTextField1.setText(""+con.rs.getString(1));
           
           
           }
           
           
           
           
          
           
            } 
         catch (SQLException ex) {
           Logger.getLogger(Employe_salse_salary_report.class.getName()).log(Level.SEVERE, null, ex);
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

        this.setExtendedState(Employe_salse_salary_report.ICONIFIED);
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
            java.util.logging.Logger.getLogger(Employe_salse_salary_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employe_salse_salary_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employe_salse_salary_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employe_salse_salary_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Employe_salse_salary_report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel achive_lbl;
    private javax.swing.JComboBox<String> employe_combo;
    private javax.swing.JLabel expences_lbl;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel salary_payment_lbl;
    private javax.swing.JLabel sales_Bnus;
    private javax.swing.JLabel sales_am_lbl;
    private javax.swing.JLabel sales_comm_lbl;
    private javax.swing.JLabel target_ltr_lbl;
    // End of variables declaration//GEN-END:variables

}
