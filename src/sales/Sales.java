 
package sales;
 
 
import Bill_Show.Demo1111;
import Bill_Show.Demo_Pat;
import Main_PAck.connection_class;  
import Main_PAck.demo;
import Main_PAck.demo_user1;
import Main_PAck.demo_user_F;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import purchase.Product_Purchase;
 

public class Sales extends javax.swing.JFrame {
   connection_class con;
   double lt=0;
   static String des,rename,mobile_number;
    static int vou=0;
    static String h;
    public Sales(String string) {
        initComponents();
        con=new connection_class();
        show_date();
        id_show();
        find_all_product();
        find_all_Emplye();
       date_lab.setVisible(false);
       h=string;
        bank_show();
        show_customer();
        jRadioButton4.setSelected(true);
        
    }

    private Sales() {
   initComponents();
  con=new connection_class();
        show_date();
        id_show();
        find_all_product();
        find_all_Emplye();
       date_lab.setVisible(false);
         jRadioButton4.setSelected(true);
        bank_show();
        show_customer();
    
    }
 void id_show(){
     long a=1601;
       try {
           con.contest();
           String s="SELECT  `bill` FROM `rmc_chemical_ltd`.`sales_account`";
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while(con.rs.next()){
               a=a+1; 
           }
          bill_no_txt.setText("CUM01-"+a);
           
       } catch (SQLException ex) {
           Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
       }
     
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bill_no_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        product_name_combo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        product_price_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        salse_price_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        quantity_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        total_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        product_ID_combo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        employe_combo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        OLD_ammount = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        discount = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        today_amm = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Total_Ammount = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        deu = new javax.swing.JLabel();
        paidd = new javax.swing.JTextField();
        bank_lebel = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        banka_lebel = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        p_quan_id_txt = new javax.swing.JLabel();
        p_quantity_txt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        customer_combo = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        delivery_place = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        bkash_txt = new javax.swing.JTextField();
        Name_txt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        chalan_quantity_txt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        chalan_ltr_text = new javax.swing.JTextField();
        date_lab = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Voucher No  :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 40, 110, 20);

        bill_no_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bill_no_txt.setText("CUM01-1601");
        bill_no_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bill_no_txtFocusLost(evt);
            }
        });
        bill_no_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_no_txtActionPerformed(evt);
            }
        });
        bill_no_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bill_no_txtKeyReleased(evt);
            }
        });
        jPanel1.add(bill_no_txt);
        bill_no_txt.setBounds(30, 60, 170, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Customer Name  :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 40, 100, 20);

        product_name_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product_name_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        product_name_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_name_comboActionPerformed(evt);
            }
        });
        jPanel1.add(product_name_combo);
        product_name_combo.setBounds(30, 110, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Product Name  :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 90, 88, 20);

        product_price_txt.setEditable(false);
        product_price_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(product_price_txt);
        product_price_txt.setBounds(30, 160, 170, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Purchase Price  :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 140, 100, 20);

        salse_price_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        salse_price_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                salse_price_txtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                salse_price_txtKeyReleased(evt);
            }
        });
        jPanel1.add(salse_price_txt);
        salse_price_txt.setBounds(210, 160, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Sales Price  :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(210, 140, 100, 20);

        quantity_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        quantity_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantity_txtKeyReleased(evt);
            }
        });
        jPanel1.add(quantity_txt);
        quantity_txt.setBounds(390, 160, 170, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Quantity (LTR/KG) :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(390, 140, 130, 20);

        total_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(total_txt);
        total_txt.setBounds(570, 160, 170, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Total Price  :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(570, 140, 100, 20);

        product_ID_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product_ID_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        product_ID_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_ID_comboActionPerformed(evt);
            }
        });
        jPanel1.add(product_ID_combo);
        product_ID_combo.setBounds(210, 110, 170, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Product ID  :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(210, 90, 100, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Employe Name  :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(390, 40, 170, 20);

        employe_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        employe_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        employe_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employe_comboActionPerformed(evt);
            }
        });
        jPanel1.add(employe_combo);
        employe_combo.setBounds(390, 60, 170, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Old Ammount :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 500, 160, 20);

        OLD_ammount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OLD_ammount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(OLD_ammount);
        OLD_ammount.setBounds(30, 520, 190, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Today Ammount :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(30, 550, 190, 20);

        discount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        discount.setText("0");
        discount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        discount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                discountMouseClicked(evt);
            }
        });
        discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountActionPerformed(evt);
            }
        });
        discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                discountKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                discountKeyReleased(evt);
            }
        });
        jPanel1.add(discount);
        discount.setBounds(30, 620, 190, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Discount :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 600, 110, 20);

        today_amm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        today_amm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(today_amm);
        today_amm.setBounds(30, 570, 190, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Paid :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(230, 550, 80, 20);

        Total_Ammount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Total_Ammount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(Total_Ammount);
        Total_Ammount.setBounds(230, 520, 180, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Total");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(230, 500, 190, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Due");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(230, 600, 80, 20);

        deu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        deu.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                deuVetoableChange(evt);
            }
        });
        jPanel1.add(deu);
        deu.setBounds(230, 620, 180, 30);

        paidd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paidd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        paidd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paiddMouseClicked(evt);
            }
        });
        paidd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paiddActionPerformed(evt);
            }
        });
        paidd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paiddKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paiddKeyReleased(evt);
            }
        });
        jPanel1.add(paidd);
        paidd.setBounds(230, 570, 180, 30);

        bank_lebel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bank_lebel.setText("Bank Name :");
        jPanel1.add(bank_lebel);
        bank_lebel.setBounds(460, 540, 80, 20);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton1.setText("Cash");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(460, 510, 80, 31);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton2.setText("Check");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(540, 510, 93, 30);

        banka_lebel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        banka_lebel.setText("Check Number :");
        jPanel1.add(banka_lebel);
        banka_lebel.setBounds(460, 590, 190, 20);

        jButton10.setBackground(new java.awt.Color(255, 0, 0));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Ok");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(880, 490, 70, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1100, 150, 90, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Total Product Quantity ID Wise");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(550, 90, 200, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Total Product Quantity");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(400, 90, 140, 20);

        p_quan_id_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        p_quan_id_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(p_quan_id_txt);
        p_quan_id_txt.setBounds(550, 110, 190, 30);

        p_quantity_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        p_quantity_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(p_quantity_txt);
        p_quantity_txt.setBounds(400, 110, 140, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Product ID", "Product Name", "Purchase Price", "Sales Price", "Quantity", "Total Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 192, 1330, 290);

        customer_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_comboActionPerformed(evt);
            }
        });
        jPanel1.add(customer_combo);
        customer_combo.setBounds(210, 60, 170, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Delivery Place");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(570, 40, 190, 20);

        delivery_place.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(delivery_place);
        delivery_place.setBounds(570, 60, 170, 30);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton3.setText("Bkash");
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton3MouseClicked(evt);
            }
        });
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(630, 510, 80, 31);

        bkash_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(bkash_txt);
        bkash_txt.setBounds(460, 610, 270, 30);

        Name_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(Name_txt);
        Name_txt.setBounds(460, 560, 270, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("*Product Sales ");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(10, 0, 300, 40);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Quantity");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(10, 20, 60, 30);

        chalan_quantity_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chalan_quantity_txtActionPerformed(evt);
            }
        });
        jPanel2.add(chalan_quantity_txt);
        chalan_quantity_txt.setBounds(70, 20, 190, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("LTR/Kg");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(10, 50, 60, 30);

        chalan_ltr_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chalan_ltr_textActionPerformed(evt);
            }
        });
        jPanel2.add(chalan_ltr_text);
        chalan_ltr_text.setBounds(70, 50, 190, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(780, 60, 270, 110);

        date_lab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(date_lab);
        date_lab.setBounds(1180, 40, 180, 30);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(1180, 40, 180, 30);

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/house.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel23);
        jLabel23.setBounds(1190, 0, 50, 40);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/printer (1).png"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel24);
        jLabel24.setBounds(1240, 0, 40, 40);

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

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton4.setText("Default Bill");
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(770, 500, 85, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1360, 740);
        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1360, 752));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
  ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
  
 }   
void find_all_Emplye(){
        try {
             
            employe_combo.removeAllItems();
            employe_combo.addItem("Select");
            con.contest();
            String select=" SELECT `name`FROM `rmc_chemical_ltd`.`employe` ORDER BY `name` ASC";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){ 
           employe_combo.addItem(""+con.rs.getString(1));
           
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }

} 
     
    void find_all_product(){
        try {
             
            product_name_combo.removeAllItems();
            product_name_combo.addItem("Select");
            con.contest();
            String select="SELECT  `product_name` FROM `rmc_chemical_ltd`.`purchase` GROUP BY `product_name` ORDER BY `product_name`ASC";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){ 
           product_name_combo.addItem(""+con.rs.getString(1));
           
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }

} 
       void find_product_price(){
        try { 
            
            con.contest();
            String select="SELECT  `stock_id`.`pur_price`,`stock_id`.`sal_price`,`stock_id`.`pur`,`stock_id`.`sales` FROM `stock_id` WHERE `stock_id`.`id`='"+product_ID_combo.getSelectedItem()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            if(con.rs.next()){ 
                    product_price_txt.setText(""+con.rs.getString(1)); 
                    salse_price_txt.setText(""+con.rs.getString(2));
                    double hh=con.rs.getDouble(3)-con.rs.getDouble(4);
                    hh=Math.round(hh*100.0)/100.0;
                    p_quan_id_txt.setText(""+hh);
                    
                    
                    
    
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }

}
       
       void find_product_ID(){
        try {
             
            product_ID_combo.removeAllItems();
            product_ID_combo.addItem("Select");
            con.contest();
            String select="SELECT `stock_id`.`id`,`stock_id`.`pur`,`stock_id`.`sales` FROM `stock_id` WHERE `stock_id`.`product_name`='"+product_name_combo.getSelectedItem()+"' ORDER BY `stock_id`.`id` DESC";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){  
                 double hh=con.rs.getDouble(2)-con.rs.getDouble(3);
                hh=Math.round(hh*100.0)/100.0;
                if (hh>0) {
                product_ID_combo.addItem(""+con.rs.getString(1));
         
                }
   
            }
            
            
            //total quantity
             String select1="SELECT `stock`.`pur`,`stock`.`sales` FROM `stock` WHERE `stock`.`product_name`='"+product_name_combo.getSelectedItem()+"'";
            con.st = con.ct.prepareCall(select1);
            con.rs = con.st.executeQuery(select1);
            if(con.rs.next()){  
                double hh=con.rs.getDouble(1)-con.rs.getDouble(2);
                hh=Math.round(hh*100.0)/100.0;
                p_quantity_txt.setText(""+hh);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    private void product_name_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_name_comboActionPerformed
        //find_product_price();
        
        find_product_ID();
    }//GEN-LAST:event_product_name_comboActionPerformed

    private void salse_price_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salse_price_txtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_salse_price_txtKeyPressed

    private void salse_price_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salse_price_txtKeyReleased
        try{
            if(!quantity_txt.getText().isEmpty()&& !salse_price_txt.getText().isEmpty()){
                double sprice=Double.parseDouble(""+salse_price_txt.getText());
                double quantity=Double.parseDouble(""+quantity_txt.getText());
                sprice=sprice*quantity;
                sprice=Math.round(sprice*100.0)/100.0;
                total_txt.setText(""+sprice);
            }else{
                total_txt.setText("");
            }
        }catch(NumberFormatException n){
            JOptionPane.showMessageDialog(this, "Please Enter the number..\n Do not enter the character..");
        }
    }//GEN-LAST:event_salse_price_txtKeyReleased

    private void quantity_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantity_txtKeyReleased
        try{
            if(!quantity_txt.getText().isEmpty()&& !salse_price_txt.getText().isEmpty()){
                double oq=Double.parseDouble(p_quan_id_txt.getText());
                double pq=Double.parseDouble(quantity_txt.getText());
                if(pq>oq){  JOptionPane.showMessageDialog(this, "learg quantity");
                    quantity_txt.setText("");
                    total_txt.setText("");
              
                }else{
                
                double sprice=Double.parseDouble(""+salse_price_txt.getText());
                double quantity=Double.parseDouble(""+quantity_txt.getText());
                sprice=sprice*quantity;
                sprice=Math.round(sprice*100.0)/100.0;
                total_txt.setText(""+sprice);}

            }else{
                total_txt.setText("");
            }
        }catch(NumberFormatException n){
            if(!quantity_txt.getText().equals(".")){
            JOptionPane.showMessageDialog(this, "Please Enter the number..\n Do not enter the character..");
        }}
    }//GEN-LAST:event_quantity_txtKeyReleased

    private void product_ID_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_ID_comboActionPerformed
         
        find_product_price();
        
        
    }//GEN-LAST:event_product_ID_comboActionPerformed

    private void bill_no_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_no_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bill_no_txtActionPerformed

    private void employe_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employe_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employe_comboActionPerformed

    private void discountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discountMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_discountMouseClicked

    private void discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountActionPerformed

    private void discountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountKeyPressed

    private void discountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountKeyReleased
        if(!discount.getText().isEmpty()&& !today_amm.getText().isEmpty() && !OLD_ammount.getText().isEmpty())
        {
            double dis,today_am,old_am,total;
            dis=Double.parseDouble(discount.getText());
            today_am=Double.parseDouble(today_amm.getText());
            old_am=Double.parseDouble(OLD_ammount.getText());
            total=(old_am+today_am)-(dis);
            total=Math.round(total*100.0)/100.0;
            Total_Ammount.setText(""+total);

        }else if(discount.getText().isEmpty()&& !today_amm.getText().isEmpty() && !OLD_ammount.getText().isEmpty())
        {
            double dis,today_am,old_am,total;
            dis=0;
            today_am=Double.parseDouble(today_amm.getText());
            old_am=Double.parseDouble(OLD_ammount.getText());
            total=(old_am+today_am)-(dis);
            total=Math.round(total*100.0)/100.0;
            Total_Ammount.setText(""+total);

        }
    }//GEN-LAST:event_discountKeyReleased

    private void deuVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_deuVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_deuVetoableChange

    private void paiddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paiddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_paiddMouseClicked

    private void paiddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paiddActionPerformed

    }//GEN-LAST:event_paiddActionPerformed

    private void paiddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paiddKeyPressed

    }//GEN-LAST:event_paiddKeyPressed

    private void paiddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paiddKeyReleased
        if(!bill_no_txt.getText().isEmpty() && !Total_Ammount.getText().isEmpty() && !paidd.getText().isEmpty()){
            double tamm=Double.parseDouble(Total_Ammount.getText());
            double pai=Double.parseDouble(paidd.getText());
            tamm=tamm-pai;
            deu.setText(""+tamm);
        }
    }//GEN-LAST:event_paiddKeyReleased

 
void show_customer(){
       try {
           customer_combo.removeAllItems();
           customer_combo.addItem("Select");
           String s="SELECT `name` FROM `rmc_chemical_ltd`.`customer_info`";
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while (con.rs.next()) {
           customer_combo.addItem(""+con.rs.getString(1));
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
       }


}
void bank_hide(){
banka_lebel.setVisible(false);
bank_lebel.setVisible(false); 

}
void bank_show(){
   
              
               if(jRadioButton1.isSelected()){ 
             
                bank_lebel.setVisible(false);
                banka_lebel.setVisible(false);
                
                Name_txt.setVisible(false);
                bkash_txt.setVisible(false); 
               }else if(jRadioButton2.isSelected()){
                bank_lebel.setText("Bank Name :");
                banka_lebel.setText("Check Number :");
                
                bank_lebel.setVisible(true);
                banka_lebel.setVisible(true);
              
                Name_txt.setVisible(true);
                bkash_txt.setVisible(true); 
               }else if(jRadioButton3.isSelected()){
                bank_lebel.setText("User Name :");
                banka_lebel.setText("Bkash Number :");
                Name_txt.setText("");
                bkash_txt.setText("");
                bank_lebel.setVisible(true);
                banka_lebel.setVisible(true);
              
                Name_txt.setVisible(true);
                bkash_txt.setVisible(true);  
               }else{
             
                bank_lebel.setVisible(false);
                banka_lebel.setVisible(false);
                
                Name_txt.setVisible(false);
                bkash_txt.setVisible(false); 
               }
               
               
      
}  

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked

        bank_hide();

    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        bank_show();
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      if(bill_no_txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Bill No is Empty...");

        } else if(OLD_ammount.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "No data found...");

        }else if(today_amm.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "No data found...");

        }else if(discount.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Discount is empty..");

        }else if(today_amm.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "No data found...");

        } else if(paidd.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Paid Ammount is Empty...");

        } else{

            String status="";
            if(jRadioButton1.isSelected()){
                status="Cash";
            }else if(jRadioButton2.isSelected()){
                status="Check";
            }else if(jRadioButton3.isSelected()){
                status="Bkash";
            }else{
                status="";
            }

            if(status.equals("")){
                JOptionPane.showMessageDialog(this, "Please Select Cash Or Check...");

            }else{
                Sales_account();
               Cash_or_BAnk_ENtry();
               clearDatafor_com();
            }

        }

    }//GEN-LAST:event_jButton10ActionPerformed
int Check_Text(){
    int a=0;
    if(bill_no_txt.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Bill No IS Empty....");
    bill_no_txt.requestFocus(); 
    }else if(customer_combo.getSelectedIndex()<=0){
    JOptionPane.showMessageDialog(this, "Customer Name IS Empty....");
    customer_combo.requestFocus(); 
    }else if(employe_combo.getSelectedIndex()<=0){
    JOptionPane.showMessageDialog(this, "Employe Name IS Empty....");
    employe_combo.requestFocus(); 
    } else if(product_name_combo.getSelectedIndex()<=0){
    JOptionPane.showMessageDialog(this, "Product Name IS Empty....");
    product_name_combo.requestFocus(); 
    }else if(product_ID_combo.getSelectedIndex()<=0){
    JOptionPane.showMessageDialog(this, "Product ID IS Empty....");
    product_ID_combo.requestFocus(); 
    }else if(p_quantity_txt.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Total Product Quantity IS Empty....");
    p_quantity_txt.requestFocus(); 
    }else if(p_quan_id_txt.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Id Wise Total Product Quantity IS Empty....");
    p_quan_id_txt.requestFocus(); 
    }else if(delivery_place.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Delivery Place IS Empty....");
    delivery_place.requestFocus(); 
    }
    
    else if(product_price_txt.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Purchase Price IS Empty....");
    product_price_txt.requestFocus(); 
    }
    else if(salse_price_txt.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Sales Price IS Empty....");
    salse_price_txt.requestFocus(); 
    }
    else if(quantity_txt.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Quantity  IS Empty....");
    quantity_txt.requestFocus(); 
    }
    else if(total_txt.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Total Amount IS Empty....");
    total_txt.requestFocus(); 
    }else if(chalan_ltr_text.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Chalan ltr/kg IS Empty....");
    chalan_ltr_text.requestFocus(); 
    }else if(chalan_quantity_txt.getText().isEmpty()){
    JOptionPane.showMessageDialog(this, "Chalan Quantity IS Empty....");
    chalan_quantity_txt.requestFocus(); 
    }else if (((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Date Is Empty");
            jDateChooser1.requestFocus();
        } else {
        a=1;
        
    }
    
    
    
return a;}

  void clearDatafor_com(){
  if(jRadioButton4.isSelected()){
      
       Bill_Show.Demo1111 ob=new Demo1111(bill_no_txt.getText());
                ob.setVisible(true);}
  else{
       Bill_Show.Demo_Pat ob=new Demo_Pat(bill_no_txt.getText());
                ob.setVisible(true); 
  }
                    vou=1; 
                buttonGroup1.clearSelection();
                bill_no_txt.setEditable(true);
                jDateChooser1.setVisible(true);  
                customer_combo.setEnabled(true);
                employe_combo.setEnabled(true);
              
                customer_combo.setSelectedIndex(0);
                employe_combo.setSelectedIndex(0);
                
                  delivery_place.setEditable(true);
                delivery_place.setText("");
                bill_no_txt.setText("");
                show_date();
                bank_show();
                OLD_ammount.setText("");
               today_amm.setText("");
                discount.setText("0");
                Total_Ammount.setText("");
                paidd.setText("");
                deu.setText("");
                DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
                dt.setRowCount(0);
               id_show();
             //   dispose();
  
  
  
  }
  
 void Cash_or_BAnk_ENtry(){
    try {
               String status="";
               if(jRadioButton1.isSelected()){ 
               status="Cash";
               }else if(jRadioButton2.isSelected()){
                   status="Check"; 
               }else if(jRadioButton3.isSelected()){
                   status="Bkash"; 
               }else{
               status="";
               }
               
     String details="Sales - "+bill_no_txt.getText()+" - "+customer_combo.getSelectedItem(); 
     String ammount=paidd.getText();

     SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd"); 
     String date1 = sd.format(jDateChooser1.getDate());
     
     
     if(status.equals("Cash")){
         
             String ss=" INSERT INTO `rmc_chemical_ltd`.`cash`(`date`,`amount`,`status`,`details`)VALUES ('"+date1+"','"+ammount+"','Credit','"+details+"')";
             con.contest();
             
             int result = con.st.executeUpdate(ss);
             if (result > 0) { 
             
             
             
             }else{
             JOptionPane.showMessageDialog(this, "Something was wrong in Cash");
             
             }
         
     
     }else if(status.equals("Check")){
         
        if(Name_txt.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Bank Name Is Empty....");
         Name_txt.requestFocus();
         }else if(bkash_txt.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Check Number Is Empty");
         bkash_txt.requestFocus();
         }else{
 details="Sales - "+bill_no_txt.getText()+" - "+customer_combo.getSelectedItem()+" - Check - "+Name_txt.getText()+" - "+bkash_txt.getText();
        String ss=" INSERT INTO `rmc_chemical_ltd`.`cash`(`date`,`amount`,`status`,`details`)VALUES ('"+date1+"','"+ammount+"','Credit','"+details+"')";
             con.contest();
             
             int result = con.st.executeUpdate(ss);
             if (result > 0) { 
             
             
             
             }else{
             JOptionPane.showMessageDialog(this, "Something was wrong in Check");
             
             }
         }
     
     }else if(status.equals("Bkash")){
          if(Name_txt.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "User Name Is Empty....");
         Name_txt.requestFocus();
         }else if(bkash_txt.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Bkash Number Is Empty");
         bkash_txt.requestFocus();
         }else{ 
        details="Sales - "+bill_no_txt.getText()+" - "+customer_combo.getSelectedItem()+" - Bkash - "+Name_txt.getText()+" - "+bkash_txt.getText();
        String ss=" INSERT INTO `rmc_chemical_ltd`.`cash`(`date`,`amount`,`status`,`details`)VALUES ('"+date1+"','"+ammount+"','Credit','"+details+"')";
             con.contest();
             
             int result = con.st.executeUpdate(ss);
             if (result > 0) { 
             
             
             
             }else{
             JOptionPane.showMessageDialog(this, "Something was wrong in Bkash");
             
             }
             
       
         }
     }
     
     
     
               
               
       
       
       
    } catch (SQLException ex) {
             Logger.getLogger(Product_Purchase.class.getName()).log(Level.SEVERE, null, ex);
         }   
       
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(Check_Text()==1){
            try {
                String bill=bill_no_txt.getText();
                String customer=customer_combo.getSelectedItem().toString();
                String employe=employe_combo.getSelectedItem().toString();
               
                String id=product_ID_combo.getSelectedItem().toString();
                String product=product_name_combo.getSelectedItem().toString();
                String price=product_price_txt.getText();
                String s_price=salse_price_txt.getText();
                String quantity=quantity_txt.getText();
                String total=total_txt.getText();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date1 = sd.format(jDateChooser1.getDate());
                String  deliver=delivery_place.getText();
                 
                String  chalan_ltr=chalan_ltr_text.getText();
                String  chalan_qty=chalan_quantity_txt.getText();
                String find="SELECT `p_name`,`p_price`,`s_price`,`quantity`,`total`,`date` FROM `rmc_chemical_ltd`.`sales` WHERE `bill`='"+bill+"' AND `customerName`='"+customer+"' AND `p_id`='"+id+"' AND `p_name`='"+product+"' AND `p_price`='"+price+"' AND `s_price`='"+s_price+"' AND`date`='"+date1+"'";
                con.contest();
                con.st = con.ct.prepareCall(find);
                con.rs = con.st.executeQuery(find);
                if(con.rs.next()) {
                    double q=con.rs.getDouble(4)+Double.parseDouble(quantity_txt.getText());
                    double t=con.rs.getDouble(3)*q;
                String qup="UPDATE `rmc_chemical_ltd`.`sales` SET `quantity` = '"+q+"',`total` = '"+t+"' WHERE `bill` = '"+bill+"' AND `customerName`='"+customer+"' AND `p_id`='"+id+"'  AND `p_name` = '"+product+"' AND `p_price`='"+price+"' AND `s_price`='"+s_price+"' AND `date` = '"+date1+"' ";

                    con.ps =con.ct.prepareCall(qup);
                    int mu=con.ps.executeUpdate();
                    if(mu>0){
                        //table e ajker data show and ajker ei bill e total amount
                        Show_Today_Data();
                        //ager due thakle seta show korbe...
                        old_Data();
                        //show_id(); karon eti onno id te update hoye jabe
                       
                        //purchase account e data update er jonno bill and date wise
                        Sales_account(); 
                        clear_in_data();
                    }

                }else{

                    String insert="INSERT INTO `rmc_chemical_ltd`.`sales`(`bill`,`customerName`,`p_name`,`p_id`,`p_price`,`s_price`,`quantity`,`total`,`employe_name`,`ref_des`,`reference_person`,`date`,`delivery_place`,`chalan ltr`,`chalan quantity`)VALUES ('"+bill+"','"+customer+"','"+product+"','"+id+"', '"+price+"','"+s_price+"','"+quantity+"','"+total+"','"+employe+"','"+des+"','"+rename+"','"+date1+"','"+deliver+"','"+chalan_ltr+"','"+chalan_qty+"');";
                    con.contest();

                    int result = con.st.executeUpdate(insert);
                    if (result > 0) {
                        //table e ajker data show and ajker ei bill e total amount
                         Show_Today_Data();
                       // show_id();
                        //ager due thakle seta show korbe...
                        old_Data();
                        //purchase account e data update er jonno bill and date wise
                       Sales_account();
                       clear_in_data();
                    }

                }
            } catch (SQLException ex) {
                Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_jButton1ActionPerformed
void Show_Today_Data(){
       try {
           double total=0;
           String bill=bill_no_txt.getText();
                String customer=customer_combo.getSelectedItem().toString();
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
           String date1 = sd.format(jDateChooser1.getDate());
           String select="SELECT `date`, `p_id`,`p_name`, `p_price`,`s_price`,`quantity`, `total` FROM `rmc_chemical_ltd`.`sales`WHERE `bill`='"+bill+"' AND `date`='"+date1+"' AND `customerName`='"+customer+"'";
           con.contest();
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
            dt.addRow(new Object[]{con.rs.getDate(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getString(6),con.rs.getString(7)});
           total=Double.parseDouble(con.rs.getString(7))+total;
            }
          total=Math.round(total*100.0)/100.0;
         today_amm.setText(""+total);
       } catch (SQLException ex) {
           Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
       }

} 


void old_Data(){
      
       try {
           String bill=bill_no_txt.getText();
                String customer=customer_combo.getSelectedItem().toString();
           SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date1 = sd.format(jDateChooser1.getDate());
        String s=" SELECT  `bill` FROM `rmc_chemical_ltd`.`sales` WHERE `bill` !='"+bill+"' AND `customerName`='"+customer+"' AND `date`<='"+date1+"'";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           if(con.rs.next()){ 
        String oldamou="SELECT SUM(`total_amount`)AS `old_total`, SUM(`paid`) AS `old_paid` FROM `rmc_chemical_ltd`.`sales_account` WHERE `bill` !='"+bill+"'AND `customer`='"+customer+"' AND `date`<='"+date1+"'";
           con.contest();
           con.st = con.ct.prepareCall(oldamou);
           con.rs = con.st.executeQuery(oldamou);
           if(con.rs.next()) {
                        double oldpaidam,old_am,total, dis,today_am;

                        old_am=Double.parseDouble(con.rs.getString(1));
                        oldpaidam=Double.parseDouble(con.rs.getString(2));
 
                            
                        total=old_am-oldpaidam;
                        total=Math.round(total*100.0)/100.0;
                        OLD_ammount.setText(""+total);
                        
                        if(!discount.getText().isEmpty()&& !today_amm.getText().isEmpty() && !OLD_ammount.getText().isEmpty())
                        {
                       
                        dis=Double.parseDouble(discount.getText());
                        today_am=Double.parseDouble(today_amm.getText());
                        old_am=Double.parseDouble(OLD_ammount.getText());
                        total=(old_am+today_am)-(dis);
                        total=Math.round(total*100.0)/100.0;
                        Total_Ammount.setText(""+total);

                        }else if(discount.getText().isEmpty()&& !today_amm.getText().isEmpty() && !OLD_ammount.getText().isEmpty())
                        {
                       
                        dis=0;
                        today_am=Double.parseDouble(today_amm.getText());
                        old_am=Double.parseDouble(OLD_ammount.getText());
                        total=(old_am+today_am)-(dis);
                        total=Math.round(total*100.0)/100.0;
                        Total_Ammount.setText(""+total);

                        }      
            
           }
           
           
       }
           else{
                        OLD_ammount.setText("0");
                        if(!discount.getText().isEmpty()&& !today_amm.getText().isEmpty() && !OLD_ammount.getText().isEmpty())
                        {
                            
                        double dis,today_am,old_am,total; 
                        dis=Double.parseDouble(discount.getText());
                        today_am=Double.parseDouble(today_amm.getText());
                        old_am=Double.parseDouble(OLD_ammount.getText());
                        total=(old_am+today_am)-(dis);
                        total=Math.round(total*100.0)/100.0;
                        Total_Ammount.setText(""+total);

                        }else if(discount.getText().isEmpty()&& !today_amm.getText().isEmpty() && !OLD_ammount.getText().isEmpty())
                        {
                        double dis,today_am,old_am,total; 
                        dis=0;
                        today_am=Double.parseDouble(today_amm.getText());
                        old_am=Double.parseDouble(OLD_ammount.getText());
                        total=(old_am+today_am)-(dis);
                        total=Math.round(total*100.0)/100.0;
                        Total_Ammount.setText(""+total);

                        }      
           }
           
           
           
           
       } catch (SQLException ex) {
           Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }

  void Sales_account(){ 
       try { 
           if(!quantity_txt.getText().isEmpty()){ 
            String ss=quantity_txt.getText();
           lt=lt+Double.parseDouble(ss);
              }
           int count=0;
           String bill=bill_no_txt.getText();
            String delivery=delivery_place.getText();
            String customer=customer_combo.getSelectedItem().toString();
           SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd"); 
           String date1 = sd.format(jDateChooser1.getDate());
           String tamount=today_amm.getText();
   
             String dis;
           if(discount.getText().isEmpty()){
           dis="0";
           }else{
            dis=discount.getText();}
           double ta=Double.parseDouble(tamount)-Double.parseDouble(dis);
           ta=Math.round(ta*100.0)/100.0;
            String paid;
           String final_amount=Total_Ammount.getText();
           if(paidd.getText().isEmpty()){
           paid="0";
           }else{
          paid=paidd.getText();}
           
           String event="No";
               if(jRadioButton1.isSelected()){ 
               event="Cash";
               }else if(jRadioButton2.isSelected()){
                   event="Check"; 
               }else if(jRadioButton2.isSelected()){
                   event="Bkash"; 
               }else{
               event="No";
               }
           String s="SELECT `bill` FROM `rmc_chemical_ltd`.`sales_account` WHERE `bill`='"+bill+"' AND `date`='"+date1+"' AND `customer`='"+customer+"'";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           if (con.rs.next()) {
           String up="UPDATE `rmc_chemical_ltd`.`sales_account` SET `amount` = '"+tamount+"',`dis` = '"+dis+"',`total_amount` = '"+ta+"',`final_amount` = '"+final_amount+"',`paid` = '"+paid+"',`event` = '"+event+"',`total_ltr`='"+lt+"' WHERE   `bill` = '"+bill+"' AND `date` = '"+date1+"' AND `customer`='"+customer+"'";
           con.ps =con.ct.prepareCall(up);
                int mu=con.ps.executeUpdate();
                if(mu>0){
                
                
                
                }else{
                JOptionPane.showMessageDialog(this,"There is a problem here,\n it is not working properly. .\n Contact the developer....");
                }
           }else{
               
           String in=" INSERT INTO `rmc_chemical_ltd`.`sales_account` (`bill`, `customer`,`date`,`amount`,`dis`,`total_amount`,`final_amount`,`paid`,`event`,`delivery_place`,`total_ltr`,`ref_designation`,`con_eng_name`) VALUES ('"+bill+"','"+customer+"','"+date1+"', '"+tamount+"','"+dis+"','"+ta+"','"+final_amount+"','"+paid+"','"+event+"','"+delivery+"','"+lt+"','"+des+"','"+rename+"')";
           
            con.contest();
                 
                int result = con.st.executeUpdate(in);
                if (result > 0) { 
                
                
                }
                else{
                JOptionPane.showMessageDialog(this,"There is a problem here,\n it is not working properly. .\n Contact the developer");}
           }
           
           
           
           
           
           
       } catch (SQLException ex) {
           Logger.getLogger(Product_Purchase.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
  
  void clear_in_data(){
          vou=0; 
          chalan_ltr_text.setText("");
          chalan_quantity_txt.setText("");
                bill_no_txt.setEditable(false);
                jDateChooser1.setVisible(false);
                customer_combo.setEnabled(false);
                employe_combo.setEnabled(false); 
                des="";
                rename="";
                delivery_place.setEditable(false);
                product_name_combo.setSelectedIndex(0);
                product_ID_combo.setSelectedIndex(0);
                p_quantity_txt.setText("");
               p_quan_id_txt.setText("");
                total_txt.setText("");
                product_price_txt.setText("");
                salse_price_txt.setText("");
                quantity_txt.setText("");
}
  
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
        /*id_no.setText(dt.getValueAt(jTable1.getSelectedRow(), 1).toString());
        product_name_combo.setSelectedItem(dt.getValueAt(jTable1.getSelectedRow(), 2).toString());
        product_price_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 3).toString());
        salse_price_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 4).toString());
        quantity_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 5).toString());
        total_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 6).toString());*/
    }//GEN-LAST:event_jTable1MouseClicked

    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseClicked
        bank_show();       // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3MouseClicked

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        bank_show();       // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed
 
    private void bill_no_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bill_no_txtFocusLost
         if(bill_no_txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Pleae ENter Bill No......");  
            bill_no_txt.requestFocus();
        
        }else{
            try {
                String s=" SELECT  `bill` FROM `rmc_chemical_ltd`.`sales_account`  WHERE `bill` ='"+bill_no_txt.getText()+"'";
                con.st = con.ct.prepareCall(s);
                con.rs = con.st.executeQuery(s);
                if(con.rs.next()) { 
                     if(vou==1){
               JOptionPane.showMessageDialog(this,"The same Bill no cannot be added...... ");
               bill_no_txt.setText("");
               bill_no_txt.requestFocus();
                
                     }
                }} catch (SQLException ex) {
                Logger.getLogger(Product_Purchase.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        
        
        
        
        }
    }//GEN-LAST:event_bill_no_txtFocusLost

    private void bill_no_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bill_no_txtKeyReleased
       vou=1;
    }//GEN-LAST:event_bill_no_txtKeyReleased

    private void customer_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_comboActionPerformed

       try {
           String selec="SELECT `phone`,`reference_name_number` FROM `rmc_chemical_ltd`.`customer_info` WHERE `name`= '"+customer_combo.getSelectedItem()+"'";
           con.contest();
           con.st = con.ct.prepareCall(selec);
           con.rs = con.st.executeQuery(selec);
           while(con.rs.next()){
               mobile_number=con.rs.getString(1);
               String all=con.rs.getString(2);
            String[] words=all.split("\\|"); 
         des=words[0];
         rename=words[1];
           }
       } catch (SQLException ex) {
           Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
        
    }//GEN-LAST:event_customer_comboActionPerformed

    private void chalan_quantity_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chalan_quantity_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chalan_quantity_txtActionPerformed

    private void chalan_ltr_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chalan_ltr_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chalan_ltr_textActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
         if (!((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
      DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
        date_lab.setText(""+df.format(jDateChooser1.getDate()));}
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
 if(h.equals("0")){
         demo_user_F ob=new demo_user_F(h);
           ob.setVisible(true);
    dispose();
     }   else{
        
        demo ob=new demo(h);
    ob.setVisible(true);
    dispose();}
    }//GEN-LAST:event_jLabel23MouseClicked

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

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked

        this.setExtendedState(Sales.ICONIFIED);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name_txt;
    private javax.swing.JLabel OLD_ammount;
    private javax.swing.JLabel Total_Ammount;
    private javax.swing.JLabel bank_lebel;
    private javax.swing.JLabel banka_lebel;
    private javax.swing.JTextField bill_no_txt;
    private javax.swing.JTextField bkash_txt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField chalan_ltr_text;
    private javax.swing.JTextField chalan_quantity_txt;
    private javax.swing.JComboBox<String> customer_combo;
    private javax.swing.JLabel date_lab;
    private javax.swing.JTextField delivery_place;
    private javax.swing.JLabel deu;
    private javax.swing.JTextField discount;
    private javax.swing.JComboBox<String> employe_combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel p_quan_id_txt;
    private javax.swing.JLabel p_quantity_txt;
    private javax.swing.JTextField paidd;
    private javax.swing.JComboBox<String> product_ID_combo;
    private javax.swing.JComboBox<String> product_name_combo;
    private javax.swing.JTextField product_price_txt;
    private javax.swing.JTextField quantity_txt;
    private javax.swing.JTextField salse_price_txt;
    private javax.swing.JLabel today_amm;
    private javax.swing.JTextField total_txt;
    // End of variables declaration//GEN-END:variables

}
