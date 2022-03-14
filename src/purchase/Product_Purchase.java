 package purchase;
 
 
import Main_PAck.connection_class; 
import Main_PAck.demo;
import Main_PAck.demo_user1;
import cash.Bank_Data; 
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator; 
import sales.Sales; 

public final class Product_Purchase extends javax.swing.JFrame {
   connection_class con;
   int id=0;
   static double ltr;
   static int vou=1;
    static String h;
   
    public Product_Purchase(String string) {
        initComponents();
        con=new connection_class();
        h=string;
        show_date();
        show_id();
        find_all_product();
        Bank_Name_Show();
        bank_show();
        show_Supplier();//
       AutoCompleteDecorator.decorate(product_name_combo);
    }

    private Product_Purchase() {
  initComponents(); }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bill_no = new javax.swing.JTextField();
        id_no = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        product_price_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        salse_price_txt = new javax.swing.JTextField();
        quantity_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        total_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        OLD_ammount = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        today_amm = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Total_Ammount = new javax.swing.JLabel();
        paidd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        deu = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        product_name_combo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        discount = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        bank_combo = new javax.swing.JComboBox<>();
        account_combo = new javax.swing.JComboBox<>();
        bank_lebel = new javax.swing.JLabel();
        banka_lebel = new javax.swing.JLabel();
        Delivery_place_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        Name_txt = new javax.swing.JTextField();
        bkash_txt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        company_combo = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        date_lab = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Voucher No  :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 40, 80, 20);

        bill_no.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bill_no.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bill_noFocusLost(evt);
            }
        });
        bill_no.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                bill_noMouseWheelMoved(evt);
            }
        });
        bill_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_noActionPerformed(evt);
            }
        });
        bill_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bill_noKeyReleased(evt);
            }
        });
        jPanel1.add(bill_no);
        bill_no.setBounds(230, 60, 150, 30);

        id_no.setEditable(false);
        id_no.setBackground(new java.awt.Color(255, 255, 255));
        id_no.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(id_no);
        id_no.setBounds(390, 60, 150, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("ID :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(390, 40, 20, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Product Name  :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 100, 120, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Purchase Price  :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(360, 100, 100, 20);

        product_price_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(product_price_txt);
        product_price_txt.setBounds(360, 120, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Sales Price  :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(540, 100, 100, 20);

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
        salse_price_txt.setBounds(540, 120, 170, 30);

        quantity_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        quantity_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantity_txtKeyReleased(evt);
            }
        });
        jPanel1.add(quantity_txt);
        quantity_txt.setBounds(720, 120, 170, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Quantity (LTR/KG) :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(720, 100, 130, 20);

        total_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(total_txt);
        total_txt.setBounds(900, 120, 170, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Total Price  :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(900, 100, 100, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "ID", "Product Name", "Purchase Price", "Sales Price", "Quantity", "Total Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 162, 1330, 320);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1110, 120, 90, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Today Ammount :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(30, 530, 190, 20);

        OLD_ammount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OLD_ammount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(OLD_ammount);
        OLD_ammount.setBounds(30, 500, 190, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Old Ammount :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 480, 160, 20);

        today_amm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        today_amm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(today_amm);
        today_amm.setBounds(30, 550, 190, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Total");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(230, 480, 190, 20);

        Total_Ammount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Total_Ammount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(Total_Ammount);
        Total_Ammount.setBounds(230, 500, 180, 30);

        paidd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paidd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
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
        paidd.setBounds(230, 550, 180, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Paid :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(230, 530, 80, 20);

        deu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        deu.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                deuVetoableChange(evt);
            }
        });
        jPanel1.add(deu);
        deu.setBounds(230, 600, 180, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Due");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(230, 580, 80, 20);

        jButton10.setBackground(new java.awt.Color(0, 204, 51));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Ok");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(760, 580, 70, 40);

        product_name_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        product_name_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        product_name_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_name_comboActionPerformed(evt);
            }
        });
        jPanel1.add(product_name_combo);
        product_name_combo.setBounds(30, 120, 320, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Discount :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 580, 110, 20);

        discount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        discount.setText("0");
        discount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
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
        discount.setBounds(30, 600, 190, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton1.setText("Cash");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(430, 490, 80, 31);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton2.setText("Check");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(520, 490, 93, 30);

        bank_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bank_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bank_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bank_comboActionPerformed(evt);
            }
        });
        jPanel1.add(bank_combo);
        bank_combo.setBounds(440, 540, 270, 30);

        account_combo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        account_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        account_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_comboActionPerformed(evt);
            }
        });
        jPanel1.add(account_combo);
        account_combo.setBounds(440, 590, 270, 30);

        bank_lebel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bank_lebel.setText("Account Number :");
        jPanel1.add(bank_lebel);
        bank_lebel.setBounds(440, 570, 270, 20);

        banka_lebel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        banka_lebel.setText("Bank Name :");
        jPanel1.add(banka_lebel);
        banka_lebel.setBounds(440, 520, 230, 20);

        Delivery_place_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(Delivery_place_txt);
        Delivery_place_txt.setBounds(550, 60, 340, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Delivery Palce   :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(550, 40, 100, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("*Product Purchase");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 0, 280, 40);

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
        jRadioButton3.setBounds(620, 490, 80, 31);

        Name_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(Name_txt);
        Name_txt.setBounds(440, 540, 270, 30);

        bkash_txt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(bkash_txt);
        bkash_txt.setBounds(440, 590, 270, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Company  Name  :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 40, 100, 20);

        company_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                company_comboActionPerformed(evt);
            }
        });
        jPanel1.add(company_combo);
        company_combo.setBounds(30, 60, 190, 30);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(1180, 50, 180, 30);

        date_lab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        date_lab.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(date_lab);
        date_lab.setBounds(1180, 50, 180, 30);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/house.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14);
        jLabel14.setBounds(1190, 0, 50, 40);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/printer (1).png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel18);
        jLabel18.setBounds(1240, 0, 40, 40);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconfinder_1054931_zoom out_minimize_reduce_icon_32px.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel19);
        jLabel19.setBounds(1280, 0, 40, 40);

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close (1).png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20);
        jLabel20.setBounds(1320, 0, 40, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 740);
        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1368, 744));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
  void show_Supplier(){
       try {
           company_combo.removeAllItems();
           company_combo.addItem("Select");
           String s="SELECT `name` FROM `rmc_chemical_ltd`.`Suplier_information`";
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           while (con.rs.next()) {
           company_combo.addItem(""+con.rs.getString(1));
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
       }


}  
void bank_show(){
   
              
               if(jRadioButton1.isSelected()){ 
             
                bank_lebel.setVisible(false);
                banka_lebel.setVisible(false);
                bank_combo.setVisible(false);
                account_combo.setVisible(false);
                Name_txt.setVisible(false);
                bkash_txt.setVisible(false); 
               }else if(jRadioButton2.isSelected()){
                banka_lebel.setText("Bank Name :");
                bank_lebel.setText("Account Number :");
                bank_lebel.setVisible(true);
                banka_lebel.setVisible(true);
                bank_combo.setVisible(true);
                account_combo.setVisible(true);
                Name_txt.setVisible(false);
                bkash_txt.setVisible(false); 
               }else if(jRadioButton3.isSelected()){
                banka_lebel.setText("User Name :");
                bank_lebel.setText("Bkash Number :");
                bank_lebel.setVisible(true);
                banka_lebel.setVisible(true);
                bank_combo.setVisible(false);
                account_combo.setVisible(false);
                Name_txt.setVisible(true);
                bkash_txt.setVisible(true);  
               }else{
             
                bank_lebel.setVisible(false);
                banka_lebel.setVisible(false);
                bank_combo.setVisible(false);
                account_combo.setVisible(false);
                Name_txt.setVisible(false);
                bkash_txt.setVisible(false); 
               }
               
               
      
}    
public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
  ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
   
 }
 
 
 
void show_id(){
       try {
           id=0;
           
           String select_id="SELECT `id` FROM `purchase`";
           con.contest(); 
           con.st = con.ct.prepareCall(select_id);
           con.rs = con.st.executeQuery(select_id);
           while(con.rs.next()) {
           id=con.rs.getInt(1);
           
           } 
           id=id+1;
           id_no.setText(""+id);
           
           
       } catch (SQLException ex) {
           Logger.getLogger(Product_Purchase.class.getName()).log(Level.SEVERE, null, ex);
       }
    }/***
void Check_bill(){
       try {
             String bill=bill_no.getText();
            String price=product_price_txt.getText();
                String s_price=salse_price_txt.getText();
                String quantity=quantity_txt.getText();
                String total=total_txt.getText();
  
                
  
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date1 = sd.format(jDateChooser1.getDate());
           String select_id=" SELECT `bill` FROM `purchase_account` WHERE `bill`='"+bill_no.getText()+"' AND `date`='"+date1+"'";
           con.contest(); 
           con.st = con.ct.prepareCall(select_id);
           con.rs = con.st.executeQuery(select_id);
           if(con.rs.next()){
            
           }else{
           String insert="INSERT INTO `rmc_chemical_ltd`.`purchase_account`(`sl`,`bill`,`date`,`amount`,`dis`,`total_amount`,`final_amount`,`paid`,`event`,`delivery_place`) VALUES ('sl','bill','date','amount','dis','total_amount','final_amount','paid','event')";
           con.contest();
            
           int result = con.st.executeUpdate(insert);
           if (result > 0) {
            
            
            
            }
           }
            
           
           
       } catch (SQLException ex) {
           Logger.getLogger(Product_Purchase.class.getName()).log(Level.SEVERE, null, ex);
       }
    }*/
    
int  Check_Text(){
        int i=0;
    if(bill_no.getText().isEmpty()){
    JOptionPane.showMessageDialog(bill_no, "Bill No Is Empty...!!!");
    bill_no.requestFocus();
    }else if(id_no.getText().isEmpty()){
    JOptionPane.showMessageDialog(id_no, "Id No Is Empty...!!!");
    bill_no.requestFocus();
    }else if(Delivery_place_txt.getText().isEmpty()){
    JOptionPane.showMessageDialog(id_no, "Delivery Place Is Empty...!!!");
    Delivery_place_txt.requestFocus();
    }else if(company_combo.getSelectedIndex()<=0){
    JOptionPane.showMessageDialog(id_no, "Company Name Is Empty...!!!");
    Delivery_place_txt.requestFocus();
    }else if(product_name_combo.getSelectedIndex()<=0){
    JOptionPane.showMessageDialog(product_name_combo, "Product Name Is Empty...!!!");
    product_name_combo.requestFocus();
    }else if(product_price_txt.getText().isEmpty()){
    JOptionPane.showMessageDialog(product_price_txt, "Product Price Is Empty...!!!");
    product_price_txt.requestFocus();
    }else if(salse_price_txt.getText().isEmpty()){
    JOptionPane.showMessageDialog(salse_price_txt, "Product Sales Price Is Empty...!!!");
    salse_price_txt.requestFocus();
    }else if(quantity_txt.getText().isEmpty()){
    JOptionPane.showMessageDialog(quantity_txt, "Quantity (ltr/kg) Is Empty...!!!");
    quantity_txt.requestFocus();
    }else if(total_txt.getText().isEmpty()){
    JOptionPane.showMessageDialog(total_txt, "Total Price Is Empty...!!!");
    total_txt.requestFocus();
    }else{
    i=1;
    }
    
    return i;}
  
void Clear_All(){ 
    bill_no.setEditable(false);
    jDateChooser1.setVisible(false);
  // ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setVisible(false); 
    product_name_combo.setSelectedIndex(0);
    product_price_txt.setText("");
    salse_price_txt.setText("");
    quantity_txt.setText("");
  
    
    total_txt.setText("");
    show_id();
    show_date();
    DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
    dt.setRowCount(0);
   
     }
 
void Show_Today_Data(){
       try {
           double total=0;
           
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
           String date1 = sd.format(jDateChooser1.getDate());
           String select="SELECT `date`,`id`,`product_name`, `pur_price`,`sal_price`,`quantity`, `total` FROM `rmc_chemical_ltd`.`purchase` WHERE `bill`='"+bill_no.getText()+"'AND `Company_Name`='"+company_combo.getSelectedItem()+"' AND `date`='"+date1+"'";
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
           Logger.getLogger(Product_Purchase.class.getName()).log(Level.SEVERE, null, ex);
       }

} 

void Show_old_Ammount(){
       try {
           DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
           dt.setRowCount(0);
           SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
           String date1 = sd.format(jDateChooser1.getDate());
           String select="SELECT `date`,`id`,`product_name`, `pur_price`,`sal_price`,`quantity`, `total` FROM `rmc_chemical_ltd`.`purchase` WHERE `bill`='"+bill_no.getText()+"' AND `date`='"+date1+"'";
           con.contest();
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
               dt.addRow(new Object[]{con.rs.getDate(1),con.rs.getString(2),con.rs.getString(3),con.rs.getString(4),con.rs.getString(5),con.rs.getString(6),con.rs.getString(7)});
               //    total=Integer.parseInt(con.rs.getString(7))+total;
           }
           // total=Math.round(total*100.0)/100.0;
           // today_amm.setText(""+total);
       } catch (SQLException ex) {
           Logger.getLogger(Product_Purchase.class.getName()).log(Level.SEVERE, null, ex);
       }
}
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(Check_Text()==1){
            try {
                String bill=bill_no.getText();
                String id=id_no.getText();
                   String delivery_place=Delivery_place_txt.getText();
                     String company=company_combo.getSelectedItem().toString();
               
                String product=product_name_combo.getSelectedItem().toString();
                String price=product_price_txt.getText();
                String s_price=salse_price_txt.getText();
                String quantity=quantity_txt.getText();
                String total=total_txt.getText();
                SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date1 = sd.format(jDateChooser1.getDate());
                
                String find="SELECT `product_name`,`pur_price`,`sal_price`,`quantity`,`total`,`date` FROM `rmc_chemical_ltd`.`purchase` WHERE `bill`='"+bill+"'AND `Company_Name`='"+company_combo.getSelectedItem()+"' AND `product_name`='"+product+"' AND `pur_price`='"+price+"' AND `sal_price`='"+s_price+"' AND`date`='"+date1+"'";
                con.contest();
           con.st = con.ct.prepareCall(find);
           con.rs = con.st.executeQuery(find);
           if(con.rs.next()) {
            double q=con.rs.getDouble(4)+Double.parseDouble(quantity_txt.getText()); 
            double t=con.rs.getDouble(3)*q;
              String qup="UPDATE `rmc_chemical_ltd`.`purchase` SET `quantity` = '"+q+"',`total` = '"+t+"' WHERE `bill` = '"+bill+"' AND `Company_Name`='"+company_combo.getSelectedItem()+"'  AND `product_name` = '"+product+"' AND `date` = '"+date1+"' ";
               con.ps =con.ct.prepareCall(qup);
                int mu=con.ps.executeUpdate();
                if(mu>0){
                    //table e ajker data show and ajker ei bill e total amount
                Show_Today_Data();
                //ager due thakle seta show korbe...
                old_Data();
                //show_id(); karon eti onno id te update hoye jabe
          
                //purchase account e data update er jonno bill and date wise
                    purchase_account();
                    clear_in_data();
                }      
           
           
           }else{
                 
                String insert="INSERT INTO `rmc_chemical_ltd`.`purchase` (`bill`, `id`,`product_name`,`pur_price`,`sal_price`,`quantity`,`total`,`date`, `delivery_place`,`Company_Name`)VALUES ('"+bill+"','"+id+"','"+product+"','"+price+"','"+s_price+"','"+quantity+"','"+total+"','"+date1+"','"+delivery_place+"','"+company+"')";
                con.contest(); 
                int result = con.st.executeUpdate(insert);
                if (result > 0) { 
                //table e ajker data show and ajker ei bill e total amount
                Show_Today_Data(); 
                show_id();
                 //ager due thakle seta show korbe...
                old_Data(); 
                  //purchase account e data update er jonno bill and date wise
                    purchase_account();
                clear_in_data(); 
                }
           
           
           
           }
            } catch (SQLException ex) {
                Logger.getLogger(Product_Purchase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    void old_Data(){
       try {
              SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
                String date1 = sd.format(jDateChooser1.getDate());
        String s=" SELECT  `bill`FROM `rmc_chemical_ltd`.`purchase_account` WHERE `bill` !='"+bill_no.getText()+"'AND `Company_Name`='"+company_combo.getSelectedItem()+"' AND  `date`<='"+date1+"'";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           if(con.rs.next()){ 
        String oldamou="SELECT SUM(`total_amount`)AS `old_total`, SUM(`paid`) AS `old_paid` FROM `rmc_chemical_ltd`.`purchase_account`WHERE `bill` !='"+bill_no.getText()+"' AND `Company_Name`='"+company_combo.getSelectedItem()+"' AND  `date`<='"+date1+"'";
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
           Logger.getLogger(Product_Purchase.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
    
    void purchase_account(){
       try {
          
           if(!quantity_txt.getText().isEmpty()){
           String l=quantity_txt.getText(); 
            
           ltr=ltr+Double.parseDouble(l);
           ltr=Math.round(ltr*100.0)/100.0;}
         //  JOptionPane.showMessageDialog(this, ltr);
           int count=0;
           String bill=bill_no.getText();
                   String delivery=Delivery_place_txt.getText();
                   String company=company_combo.getSelectedItem().toString();
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
               }else if(jRadioButton3.isSelected()){
                   event="Bkash"; 
               }else{
               event="No";
               }
           String s="SELECT `bill` FROM `rmc_chemical_ltd`.`purchase_account` WHERE `bill`='"+bill+"' AND `Company_Name`='"+company_combo.getSelectedItem()+"' AND `date`='"+date1+"'";
           con.contest();
           con.st = con.ct.prepareCall(s);
           con.rs = con.st.executeQuery(s);
           if (con.rs.next()) {
           String up="UPDATE `rmc_chemical_ltd`.`purchase_account` SET `amount` = '"+tamount+"',`dis` = '"+dis+"',`total_amount` = '"+ta+"',`final_amount` = '"+final_amount+"',`paid` = '"+paid+"',`event` = '"+event+"',`total_ltr`='"+ltr+"' WHERE   `bill` = '"+bill+"' AND `Company_Name`='"+company_combo.getSelectedItem()+"'AND `date` = '"+date1+"'";
           con.ps =con.ct.prepareCall(up);
                int mu=con.ps.executeUpdate();
                if(mu>0){
                
                
                
                }else{
                JOptionPane.showMessageDialog(id_no,"There is a problem here,\n it is not working properly. .\n Contact the developer....");
                }
           }else{
               
           String in="INSERT INTO `rmc_chemical_ltd`.`purchase_account`(`bill`,`date`, `amount`,`dis`,`total_amount`,`final_amount`,`paid`,`event`, `delivery_place`,`total_ltr`,`Company_Name`) VALUES ('"+bill+"','"+date1+"','"+tamount+"','"+dis+"','"+ta+"', '"+final_amount+"','"+paid+"','"+event+"','"+delivery+"','"+ltr+"','"+company+"')";
           
            con.contest();
                 
                int result = con.st.executeUpdate(in);
                if (result > 0) { 
                
                
                }
                else{
                JOptionPane.showMessageDialog(id_no,"There is a problem here,\n it is not working properly. .\n Contact the developer");}
           }
           
           
           
           
           
           
       } catch (SQLException ex) {
           Logger.getLogger(Product_Purchase.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
    
    void clear_in_data(){ 
        vou=0;
     company_combo.setEnabled(false); 
                bill_no.setEditable(false);
                jDateChooser1.setVisible(false);
                Delivery_place_txt.setEditable(false);
                product_name_combo.setSelectedIndex(0);
                total_txt.setText("");
                product_price_txt.setText("");
                salse_price_txt.setText("");
                quantity_txt.setText("");
}
    void find_all_product(){
        try {
             
            product_name_combo.removeAllItems();
            product_name_combo.addItem("Select");
            con.contest();
            String select="SELECT  `p_name` FROM `rmc_chemical_ltd`.`pro_information`";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            while(con.rs.next()){ 
           product_name_combo.addItem(""+con.rs.getString(1));
           
            }
        } catch (SQLException ex) {
            Logger.getLogger(Product_Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }

} 

    void find_product_price(){
        try {
             
            
            con.contest();
            String select="SELECT   `p_price`,`s_price` FROM `rmc_chemical_ltd`.`pro_information` WHERE `p_name`='"+product_name_combo.getSelectedItem()+"'";
            con.st = con.ct.prepareCall(select);
            con.rs = con.st.executeQuery(select);
            if(con.rs.next()){ 
       product_price_txt.setText(""+con.rs.getString(1)); 
       salse_price_txt.setText(""+con.rs.getString(2));
    
            }
        } catch (SQLException ex) {
            Logger.getLogger(Product_Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }

}

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
/*        DefaultTableModel dt=(DefaultTableModel) jTable1.getModel();
        id_no.setText(dt.getValueAt(jTable1.getSelectedRow(), 1).toString());
        product_name_combo.setSelectedItem(dt.getValueAt(jTable1.getSelectedRow(), 2).toString());
        product_price_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 3).toString());
        salse_price_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 4).toString());
        quantity_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 5).toString()); 
        total_txt.setText(dt.getValueAt(jTable1.getSelectedRow(), 6).toString());*/
    }//GEN-LAST:event_jTable1MouseClicked

    private void paiddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paiddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_paiddMouseClicked

    private void paiddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paiddActionPerformed
       
    }//GEN-LAST:event_paiddActionPerformed

    private void paiddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paiddKeyPressed

        

    }//GEN-LAST:event_paiddKeyPressed

    private void deuVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_deuVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_deuVetoableChange

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       if(bill_no.getText().isEmpty()){
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
                  purchase_account();
                  Cash_or_BAnk_ENtry();
                  clearDatafor_com();  
             }
                
        } 
     
    }//GEN-LAST:event_jButton10ActionPerformed
    
   void Cash_or_BAnk_ENtry(){
    try {  String status="";
               if(jRadioButton1.isSelected()){ 
               status="Cash";
               }else if(jRadioButton2.isSelected()){
                   status="Check"; 
               }else if(jRadioButton3.isSelected()){
                   status="Bkash"; 
               }else{
               status="";
               }
               
     String details="Purchase - "+bill_no.getText()+" - "+company_combo.getSelectedItem(); 
     String ammount=paidd.getText();
     SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd"); 
     String date1 = sd.format(jDateChooser1.getDate());
     String bname=bank_combo.getSelectedItem().toString();
     String account=account_combo.getSelectedItem().toString();
  String user_name=Name_txt.getText();
     String bkash_number=bkash_txt.getText();
  
     if(status.equals("Cash")){
         
             String ss=" INSERT INTO `rmc_chemical_ltd`.`cash`(`date`,`amount`,`status`,`details`)VALUES ('"+date1+"','"+ammount+"','Debit','"+details+"')";
             con.contest();
             
             int result = con.st.executeUpdate(ss);
             if (result > 0) { 
             
             
             
             }else{
             JOptionPane.showMessageDialog(this, "Something was wrong in Cash");
             
             }
         
     
     }else if(status.equals("Check")){
         
         if(bank_combo.getSelectedIndex()<=0){
         JOptionPane.showMessageDialog(this, "Please Select Bank Name....");
         bank_combo.requestFocus();
         }else if(account_combo.getSelectedIndex()<=0){
         JOptionPane.showMessageDialog(this, "Please Select Account Number ...");
         account_combo.requestFocus();
         }else{
         String s="INSERT INTO `rmc_chemical_ltd`.`bank_data`(`date`,`bank_name`,`bank_account`,`status`,`details`,`amount`)VALUES ('"+date1+"','"+bname+"','"+account+"','Debit','"+details+"','"+ammount+"')";
              int result = con.st.executeUpdate(s);
             if (result > 0) { 
              
                 
             }else{
             JOptionPane.showMessageDialog(this, "Something was wrong in Bank");
             
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
         String s="INSERT INTO `rmc_chemical_ltd`.`bkash`(`name`,`mobile`,`details`,`status`,`amount`,`date`)VALUES ('"+user_name+"','"+bkash_number+"','"+details+"','Debit','"+ammount+"','"+date1+"')";
              int result = con.st.executeUpdate(s);
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
    
    
    
    void clearDatafor_com(){
        Name_txt.setText("");
        bkash_txt.setText("");
        Delivery_place_txt.setEditable(true);
        buttonGroup1.clearSelection();
                   Delivery_place_txt.setText("");
                   company_combo.setEnabled(true);
                bill_no.setEditable(true);
                jDateChooser1.setVisible(true); 
                bill_no.setText("");
                show_date();
                OLD_ammount.setText("");
               today_amm.setText("");
                discount.setText("0");
                Total_Ammount.setText("");
                paidd.setText("");
                deu.setText("");
                DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
                dt.setRowCount(0);
    vou=1;}
    private void product_name_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_name_comboActionPerformed
   find_product_price();
    }//GEN-LAST:event_product_name_comboActionPerformed

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

    private void salse_price_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salse_price_txtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_salse_price_txtKeyPressed

    private void quantity_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantity_txtKeyReleased
     try{
        if(!quantity_txt.getText().isEmpty()&& !salse_price_txt.getText().isEmpty()){ 
       double pprice=Double.parseDouble(""+product_price_txt.getText());
        double quantity=Double.parseDouble(""+quantity_txt.getText());
        pprice=pprice*quantity;
         pprice=Math.round(pprice*100.0)/100.0;
        total_txt.setText(""+pprice); 
       }else{ 
       total_txt.setText("");
       }
     }catch(NumberFormatException n){
         if(!quantity_txt.getText().equals(".")){
     JOptionPane.showMessageDialog(this, "Please Enter the number..\n Do not enter the character..");}
     }
    }//GEN-LAST:event_quantity_txtKeyReleased

    private void discountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discountMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_discountMouseClicked

    private void discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountActionPerformed
      
    }//GEN-LAST:event_discountActionPerformed

    private void discountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountKeyPressed
    
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

    private void paiddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paiddKeyReleased
      if(!bill_no.getText().isEmpty() && !Total_Ammount.getText().isEmpty() && !paidd.getText().isEmpty()){
      double tamm=Double.parseDouble(Total_Ammount.getText());
      double pai=Double.parseDouble(paidd.getText());
      tamm=tamm-pai;
      deu.setText(""+tamm);  
      }
    }//GEN-LAST:event_paiddKeyReleased
void Account_Number_Show(){
       try {
           account_combo.removeAllItems();
           account_combo.addItem("Select");
           con.contest();
           String select="SELECT  `account_number` FROM `rmc_chemical_ltd`.`bank_name` WHERE `bank_name`='"+bank_combo.getSelectedItem()+"'";
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
             account_combo.addItem(""+con.rs.getString(1));
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Bank_Data.class.getName()).log(Level.SEVERE, null, ex);
       }
     
     
    
    } 
void Bank_Name_Show(){
       try {
           bank_combo.removeAllItems();
           bank_combo.addItem("Select");
           con.contest();
           String select="SELECT  `bank_name` FROM `rmc_chemical_ltd`.`bank_name` group by `bank_name`";
           con.st = con.ct.prepareCall(select);
           con.rs = con.st.executeQuery(select);
           while (con.rs.next()) {
             bank_combo.addItem(""+con.rs.getString(1));
           
           }
       } catch (SQLException ex) {
           Logger.getLogger(Bank_Data.class.getName()).log(Level.SEVERE, null, ex);
       }
     
     
    
    }
    private void bank_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bank_comboActionPerformed
        Account_Number_Show();
    }//GEN-LAST:event_bank_comboActionPerformed

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
       
        bank_show();
        
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
      bank_show();
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void account_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_account_comboActionPerformed

    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseClicked
        bank_show();       // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        bank_show();      // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        bank_show();       // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
     bank_show();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void bill_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bill_noActionPerformed

    private void company_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_company_comboActionPerformed
        vou=1;
    
    }//GEN-LAST:event_company_comboActionPerformed

    private void bill_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bill_noKeyReleased
        
    }//GEN-LAST:event_bill_noKeyReleased

    private void bill_noMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_bill_noMouseWheelMoved
   
    }//GEN-LAST:event_bill_noMouseWheelMoved

    private void bill_noFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bill_noFocusLost
        if (company_combo.getSelectedIndex()<=0) {
            JOptionPane.showMessageDialog(this,"Please Select Company Name......");
          bill_no.setText("");
            company_combo.requestFocus();
        }else if(bill_no.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Pleae ENter Bill No......");  
            bill_no.requestFocus();
        
        }else{
            try {
                String s=" SELECT`bill`,`Company_Name` FROM `rmc_chemical_ltd`.`purchase_account` WHERE `bill`='"+bill_no.getText()+"'AND`Company_Name`='"+company_combo.getSelectedItem()+"'";
                con.st = con.ct.prepareCall(s);
                con.rs = con.st.executeQuery(s);
                if(con.rs.next()) {
                  
                if(vou==1){
               JOptionPane.showMessageDialog(this,"The same Bill no cannot be added to the same company name...... ");
               bill_no.setText("");
                bill_no.requestFocus();
                
                }
                }} catch (SQLException ex) {
                Logger.getLogger(Product_Purchase.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        
        
        
        
        }
    }//GEN-LAST:event_bill_noFocusLost

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
  if (!((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty()) {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        date_lab.setText(""+df.format(jDateChooser1.getDate()));}
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        demo ob=new demo(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        /*  MessageFormat header=new MessageFormat("Hello");
        MessageFormat footer=new MessageFormat("Hello2");

        try {
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        } catch (PrinterException ex) {

            JOptionPane.showMessageDialog(this,"Failde");

        }
        */
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked

        this.setExtendedState(Product_Purchase.ICONIFIED);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel20MouseClicked
 
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product_Purchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Delivery_place_txt;
    private javax.swing.JTextField Name_txt;
    private javax.swing.JLabel OLD_ammount;
    private javax.swing.JLabel Total_Ammount;
    private javax.swing.JComboBox<String> account_combo;
    private javax.swing.JComboBox<String> bank_combo;
    private javax.swing.JLabel bank_lebel;
    private javax.swing.JLabel banka_lebel;
    private javax.swing.JTextField bill_no;
    private javax.swing.JTextField bkash_txt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> company_combo;
    private javax.swing.JLabel date_lab;
    private javax.swing.JLabel deu;
    private javax.swing.JTextField discount;
    private javax.swing.JTextField id_no;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField paidd;
    private javax.swing.JComboBox<String> product_name_combo;
    private javax.swing.JTextField product_price_txt;
    private javax.swing.JTextField quantity_txt;
    private javax.swing.JTextField salse_price_txt;
    private javax.swing.JLabel today_amm;
    private javax.swing.JTextField total_txt;
    // End of variables declaration//GEN-END:variables

}
