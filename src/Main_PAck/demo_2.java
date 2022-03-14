 
package Main_PAck;
 
import Auth_test.Create_Login_Pin;
import Data_Entry.Con_ENg_Comission_Incentive;
import Data_Entry.Cost_Add;
import Data_Entry.Employe_Salery;
import Data_Entry.Employe_Sales_Target;
import Data_Entry.Expenditure;
import Information_add.Con_Eng__Add;
import Information_add.Customer_information_Add;
import Information_add.Employe_Add;
import Information_add.Product_information;
import Information_add.Suplier_information_Add;
import cash.Bank_Data;
 
import cash.Bkash_Amount;
import cash.Cash_Ammount;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date; 
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.tree.DefaultMutableTreeNode;
import purchase.Product_Purchase;
import purchase.Purchase_Paid; 
import report.Balance_sheet_profit1;
import report.Cash_Register;
import report.Con_ENg_Comission_IncentiveShow;
import report.Con_ENg_Sales_report;
import report.Customer_due;
import report.Customer_due_Customer_Wise;
import report.Employe_salary_register;
import report.Employe_salse_salary_report;
import report.Expences_show;
import report.Expenditure_Show;
import report.Product_buying;
import report.RMC_Transaction_Report;
import report.Sales_report_Bill_product_;
import report.Stock;
import sales.Sales;
import sales.Sales_Paid;
public class demo_2 extends javax.swing.JFrame {
connection_class con;
Color color,color2; 
static String h="1";
public demo_2(String string) {
        initComponents();
        con=new connection_class();
        show_date(); 
       h=string;
       
    }

    private demo_2() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        cash_add = new javax.swing.JButton();
        bank_add = new javax.swing.JButton();
        bksh_add = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        con_eng_add = new javax.swing.JButton();
        customer_info_add = new javax.swing.JButton();
        employe_add = new javax.swing.JButton();
        pro_info = new javax.swing.JButton();
        suplier_info = new javax.swing.JButton();
        employe_sale_tar_Add = new javax.swing.JButton();
        expenditure_Add = new javax.swing.JButton();
        emmploye_salary_add = new javax.swing.JButton();
        utility_cost_add = new javax.swing.JButton();
        con_eng_commi_Add = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        pro_purchase = new javax.swing.JButton();
        purchase_paid = new javax.swing.JButton();
        pr_sales = new javax.swing.JButton();
        pro_sales_colle = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Balance_Sheet_re = new javax.swing.JButton();
        rmc_transaction_re = new javax.swing.JButton();
        stock_re = new javax.swing.JButton();
        sales_bill_pro_report = new javax.swing.JButton();
        produuct_buying_re = new javax.swing.JButton();
        expenditure_re = new javax.swing.JButton();
        expences_re = new javax.swing.JButton();
        empl_sals_sala_re = new javax.swing.JButton();
        employe_salary_re = new javax.swing.JButton();
        Customer_Due_cust_re = new javax.swing.JButton();
        Customer_Due_re = new javax.swing.JButton();
        con_eng_sales_re = new javax.swing.JButton();
        con_eng_Comisson_incentive_re = new javax.swing.JButton();
        cash_Ragister_cash_salse_wise_re = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        copyMenuItem1 = new javax.swing.JMenuItem();
        editMenu3 = new javax.swing.JMenu();
        cutMenuItem3 = new javax.swing.JMenuItem();
        copyMenuItem5 = new javax.swing.JMenuItem();
        copyMenuItem6 = new javax.swing.JMenuItem();
        copyMenuItem7 = new javax.swing.JMenuItem();
        copyMenuItem8 = new javax.swing.JMenuItem();
        editMenu2 = new javax.swing.JMenu();
        cutMenuItem2 = new javax.swing.JMenuItem();
        copyMenuItem2 = new javax.swing.JMenuItem();
        copyMenuItem3 = new javax.swing.JMenuItem();
        copyMenuItem4 = new javax.swing.JMenuItem();
        cutMenuItem12 = new javax.swing.JMenuItem();
        editMenu4 = new javax.swing.JMenu();
        cutMenuItem4 = new javax.swing.JMenuItem();
        copyMenuItem10 = new javax.swing.JMenuItem();
        editMenu5 = new javax.swing.JMenu();
        cutMenuItem5 = new javax.swing.JMenuItem();
        copyMenuItem9 = new javax.swing.JMenuItem();
        editMenu6 = new javax.swing.JMenu();
        cutMenuItem6 = new javax.swing.JMenuItem();
        copyMenuItem14 = new javax.swing.JMenuItem();
        cutMenuItem9 = new javax.swing.JMenuItem();
        copyMenuItem15 = new javax.swing.JMenuItem();
        copyMenuItem16 = new javax.swing.JMenuItem();
        copyMenuItem17 = new javax.swing.JMenuItem();
        copyMenuItem18 = new javax.swing.JMenuItem();
        copyMenuItem19 = new javax.swing.JMenuItem();
        copyMenuItem20 = new javax.swing.JMenuItem();
        copyMenuItem21 = new javax.swing.JMenuItem();
        cutMenuItem7 = new javax.swing.JMenuItem();
        cutMenuItem8 = new javax.swing.JMenuItem();
        cutMenuItem10 = new javax.swing.JMenuItem();
        cutMenuItem11 = new javax.swing.JMenuItem();
        editMenu1 = new javax.swing.JMenu();
        copyMenuItem11 = new javax.swing.JMenuItem();

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
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(1180, 0, 180, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo_back.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(650, 0, 720, 240);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RMC CHEMICAL COMPANY LTD.");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(650, 240, 710, 70);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("All Kinds of Construction Chemical & Paints Manufacturer Company");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(660, 300, 710, 60);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Drum_Picture .png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(850, 370, 490, 340);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Home");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Cash Amount");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cash");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Bank");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Bkash");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Information Add");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Con - Eng Add");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Customer Information");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Employe Add");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Product Information");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Suplier Information");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Data Entry");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Con -  Eng Comission Add");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Utility Cost Add");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Employe Salary");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Employe Sales Target");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Expendture");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Purchase");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Product Purchase");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Purchase Collection");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Sales");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Product Sales");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Sales Collection");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Report");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cash Register (Cash & Sales Wise)");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Con -  Eng Sales Report");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Customer Due");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Customer Due( Customer Wise )");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Employe Salary Register");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Employe Sales & Salary Report");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Exences Show");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Expenditure Show");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Product Buying");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Sales Report ( Bill & Product )");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Stock");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("RMC Transaction Report");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Balance Sheet");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTree1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(380, 150, 270, 360);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(255, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cash");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        cash_add.setBackground(new java.awt.Color(0, 204, 51));
        cash_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cash_add.setForeground(new java.awt.Color(255, 255, 255));
        cash_add.setText("   Cash");
        cash_add.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 255)));
        cash_add.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cash_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cash_addActionPerformed(evt);
            }
        });

        bank_add.setBackground(new java.awt.Color(0, 204, 51));
        bank_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bank_add.setForeground(new java.awt.Color(255, 255, 255));
        bank_add.setText("Bank");
        bank_add.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bank_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bank_addActionPerformed(evt);
            }
        });

        bksh_add.setBackground(new java.awt.Color(0, 204, 51));
        bksh_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bksh_add.setForeground(new java.awt.Color(255, 255, 255));
        bksh_add.setText("Bkash");
        bksh_add.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bksh_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bksh_addActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Information Add");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        con_eng_add.setBackground(new java.awt.Color(0, 204, 51));
        con_eng_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        con_eng_add.setForeground(new java.awt.Color(255, 255, 255));
        con_eng_add.setText("Con\\Eng Add");
        con_eng_add.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        con_eng_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                con_eng_addActionPerformed(evt);
            }
        });

        customer_info_add.setBackground(new java.awt.Color(0, 204, 51));
        customer_info_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customer_info_add.setForeground(new java.awt.Color(255, 255, 255));
        customer_info_add.setText("Customer Information");
        customer_info_add.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        customer_info_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_info_addActionPerformed(evt);
            }
        });

        employe_add.setBackground(new java.awt.Color(0, 204, 51));
        employe_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        employe_add.setForeground(new java.awt.Color(255, 255, 255));
        employe_add.setText("Employe Add");
        employe_add.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        employe_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employe_addActionPerformed(evt);
            }
        });

        pro_info.setBackground(new java.awt.Color(0, 204, 51));
        pro_info.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pro_info.setForeground(new java.awt.Color(255, 255, 255));
        pro_info.setText("Product Information");
        pro_info.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pro_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_infoActionPerformed(evt);
            }
        });

        suplier_info.setBackground(new java.awt.Color(0, 204, 51));
        suplier_info.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        suplier_info.setForeground(new java.awt.Color(255, 255, 255));
        suplier_info.setText("Suplier Information");
        suplier_info.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        suplier_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suplier_infoActionPerformed(evt);
            }
        });

        employe_sale_tar_Add.setBackground(new java.awt.Color(0, 204, 51));
        employe_sale_tar_Add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        employe_sale_tar_Add.setForeground(new java.awt.Color(255, 255, 255));
        employe_sale_tar_Add.setText("Employe Sales Target");
        employe_sale_tar_Add.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        employe_sale_tar_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employe_sale_tar_AddActionPerformed(evt);
            }
        });

        expenditure_Add.setBackground(new java.awt.Color(0, 204, 51));
        expenditure_Add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        expenditure_Add.setForeground(new java.awt.Color(255, 255, 255));
        expenditure_Add.setText("Expenditure");
        expenditure_Add.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        expenditure_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expenditure_AddActionPerformed(evt);
            }
        });

        emmploye_salary_add.setBackground(new java.awt.Color(0, 204, 51));
        emmploye_salary_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        emmploye_salary_add.setForeground(new java.awt.Color(255, 255, 255));
        emmploye_salary_add.setText("Employe Salary");
        emmploye_salary_add.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emmploye_salary_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emmploye_salary_addActionPerformed(evt);
            }
        });

        utility_cost_add.setBackground(new java.awt.Color(0, 204, 51));
        utility_cost_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        utility_cost_add.setForeground(new java.awt.Color(255, 255, 255));
        utility_cost_add.setText("Utility Cost Add");
        utility_cost_add.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        utility_cost_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utility_cost_addActionPerformed(evt);
            }
        });

        con_eng_commi_Add.setBackground(new java.awt.Color(0, 204, 51));
        con_eng_commi_Add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        con_eng_commi_Add.setForeground(new java.awt.Color(255, 255, 255));
        con_eng_commi_Add.setText("Con/ENg Comission Add");
        con_eng_commi_Add.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        con_eng_commi_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                con_eng_commi_AddActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 153, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Data Entry");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jButton4.setBackground(new java.awt.Color(51, 153, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Purchase");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        pro_purchase.setBackground(new java.awt.Color(0, 204, 51));
        pro_purchase.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pro_purchase.setForeground(new java.awt.Color(255, 255, 255));
        pro_purchase.setText("Product Purchase");
        pro_purchase.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pro_purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_purchaseActionPerformed(evt);
            }
        });

        purchase_paid.setBackground(new java.awt.Color(0, 204, 51));
        purchase_paid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        purchase_paid.setForeground(new java.awt.Color(255, 255, 255));
        purchase_paid.setText("Purchase PAid");
        purchase_paid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        purchase_paid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchase_paidActionPerformed(evt);
            }
        });

        pr_sales.setBackground(new java.awt.Color(0, 204, 51));
        pr_sales.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pr_sales.setForeground(new java.awt.Color(255, 255, 255));
        pr_sales.setText("Product  Sales ");
        pr_sales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pr_sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pr_salesActionPerformed(evt);
            }
        });

        pro_sales_colle.setBackground(new java.awt.Color(0, 204, 51));
        pro_sales_colle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pro_sales_colle.setForeground(new java.awt.Color(255, 255, 255));
        pro_sales_colle.setText("Product Sales Collection");
        pro_sales_colle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pro_sales_colle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_sales_colleActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 153, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Sales");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Balance_Sheet_re.setBackground(new java.awt.Color(0, 204, 51));
        Balance_Sheet_re.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Balance_Sheet_re.setForeground(new java.awt.Color(255, 255, 255));
        Balance_Sheet_re.setText("Balance Sheet");
        Balance_Sheet_re.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Balance_Sheet_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Balance_Sheet_reActionPerformed(evt);
            }
        });

        rmc_transaction_re.setBackground(new java.awt.Color(0, 204, 51));
        rmc_transaction_re.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rmc_transaction_re.setForeground(new java.awt.Color(255, 255, 255));
        rmc_transaction_re.setText("RMC Transaction Report");
        rmc_transaction_re.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rmc_transaction_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmc_transaction_reActionPerformed(evt);
            }
        });

        stock_re.setBackground(new java.awt.Color(0, 204, 51));
        stock_re.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        stock_re.setForeground(new java.awt.Color(255, 255, 255));
        stock_re.setText("Stock");
        stock_re.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        stock_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_reActionPerformed(evt);
            }
        });

        sales_bill_pro_report.setBackground(new java.awt.Color(0, 204, 51));
        sales_bill_pro_report.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sales_bill_pro_report.setForeground(new java.awt.Color(255, 255, 255));
        sales_bill_pro_report.setText("Sales Report Bill & Product");
        sales_bill_pro_report.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sales_bill_pro_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sales_bill_pro_reportActionPerformed(evt);
            }
        });

        produuct_buying_re.setBackground(new java.awt.Color(0, 204, 51));
        produuct_buying_re.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        produuct_buying_re.setForeground(new java.awt.Color(255, 255, 255));
        produuct_buying_re.setText("Product Buying");
        produuct_buying_re.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        produuct_buying_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produuct_buying_reActionPerformed(evt);
            }
        });

        expenditure_re.setBackground(new java.awt.Color(0, 204, 51));
        expenditure_re.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        expenditure_re.setForeground(new java.awt.Color(255, 255, 255));
        expenditure_re.setText("Expenditure Show");
        expenditure_re.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        expenditure_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expenditure_reActionPerformed(evt);
            }
        });

        expences_re.setBackground(new java.awt.Color(0, 204, 51));
        expences_re.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        expences_re.setForeground(new java.awt.Color(255, 255, 255));
        expences_re.setText("Expences Show");
        expences_re.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        expences_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expences_reActionPerformed(evt);
            }
        });

        empl_sals_sala_re.setBackground(new java.awt.Color(0, 204, 51));
        empl_sals_sala_re.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        empl_sals_sala_re.setForeground(new java.awt.Color(255, 255, 255));
        empl_sals_sala_re.setText("Employe Sales & Salary  Report");
        empl_sals_sala_re.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        empl_sals_sala_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empl_sals_sala_reActionPerformed(evt);
            }
        });

        employe_salary_re.setBackground(new java.awt.Color(0, 204, 51));
        employe_salary_re.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        employe_salary_re.setForeground(new java.awt.Color(255, 255, 255));
        employe_salary_re.setText("Employe Salary Register");
        employe_salary_re.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        employe_salary_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employe_salary_reActionPerformed(evt);
            }
        });

        Customer_Due_cust_re.setBackground(new java.awt.Color(0, 204, 51));
        Customer_Due_cust_re.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Customer_Due_cust_re.setForeground(new java.awt.Color(255, 255, 255));
        Customer_Due_cust_re.setText("Customer Due Customer Wise");
        Customer_Due_cust_re.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Customer_Due_cust_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Customer_Due_cust_reActionPerformed(evt);
            }
        });

        Customer_Due_re.setBackground(new java.awt.Color(0, 204, 51));
        Customer_Due_re.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Customer_Due_re.setForeground(new java.awt.Color(255, 255, 255));
        Customer_Due_re.setText("Customer Due");
        Customer_Due_re.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Customer_Due_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Customer_Due_reActionPerformed(evt);
            }
        });

        con_eng_sales_re.setBackground(new java.awt.Color(0, 204, 51));
        con_eng_sales_re.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        con_eng_sales_re.setForeground(new java.awt.Color(255, 255, 255));
        con_eng_sales_re.setText("Con/Eng Sales Report");
        con_eng_sales_re.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        con_eng_sales_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                con_eng_sales_reActionPerformed(evt);
            }
        });

        con_eng_Comisson_incentive_re.setBackground(new java.awt.Color(0, 204, 51));
        con_eng_Comisson_incentive_re.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        con_eng_Comisson_incentive_re.setForeground(new java.awt.Color(255, 255, 255));
        con_eng_Comisson_incentive_re.setText("Con_Eng  Comission Incentive");
        con_eng_Comisson_incentive_re.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        con_eng_Comisson_incentive_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                con_eng_Comisson_incentive_reActionPerformed(evt);
            }
        });

        cash_Ragister_cash_salse_wise_re.setBackground(new java.awt.Color(0, 204, 51));
        cash_Ragister_cash_salse_wise_re.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cash_Ragister_cash_salse_wise_re.setForeground(new java.awt.Color(255, 255, 255));
        cash_Ragister_cash_salse_wise_re.setText("Cash Rgister (Cash & Sales Wise)");
        cash_Ragister_cash_salse_wise_re.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cash_Ragister_cash_salse_wise_re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cash_Ragister_cash_salse_wise_reActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 153, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Report");
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cash_add, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bank_add, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bksh_add, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(con_eng_add, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customer_info_add, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employe_add, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_info, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suplier_info, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(con_eng_commi_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(utility_cost_add, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emmploye_salary_add, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expenditure_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employe_sale_tar_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchase_paid, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pr_sales, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_sales_colle, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cash_Ragister_cash_salse_wise_re, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(con_eng_Comisson_incentive_re, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(con_eng_sales_re, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Customer_Due_re, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Customer_Due_cust_re, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employe_salary_re, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empl_sals_sala_re, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expences_re, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expenditure_re, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produuct_buying_re, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sales_bill_pro_report, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stock_re, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rmc_transaction_re, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Balance_Sheet_re, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(cash_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(bank_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bksh_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(con_eng_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(customer_info_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(employe_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pro_info, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(suplier_info, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(con_eng_commi_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(utility_cost_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(emmploye_salary_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(expenditure_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(employe_sale_tar_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(pro_purchase, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(purchase_paid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(pr_sales, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(pro_sales_colle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(cash_Ragister_cash_salse_wise_re, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(con_eng_Comisson_incentive_re, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(con_eng_sales_re, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Customer_Due_re, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Customer_Due_cust_re, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(employe_salary_re, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(empl_sals_sala_re, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(expences_re, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(expenditure_re, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(produuct_buying_re, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sales_bill_pro_report, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(stock_re, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rmc_transaction_re, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Balance_Sheet_re, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel7.add(jScrollPane1);
        jScrollPane1.setBounds(20, 10, 370, 1530);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(0, 0, 380, 1610);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 1620);

        menuBar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        editMenu.setMnemonic('e');
        editMenu.setText("Cash       ");
        editMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        cutMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cash");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        copyMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Bank");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        copyMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem1.setMnemonic('y');
        copyMenuItem1.setText("Bkash");
        copyMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem1);

        menuBar.add(editMenu);

        editMenu3.setMnemonic('e');
        editMenu3.setText("Information Add       ");
        editMenu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        cutMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cutMenuItem3.setMnemonic('t');
        cutMenuItem3.setText("Con/ENg Add");
        cutMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItem3ActionPerformed(evt);
            }
        });
        editMenu3.add(cutMenuItem3);

        copyMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem5.setMnemonic('y');
        copyMenuItem5.setText("Customer Information");
        copyMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem5ActionPerformed(evt);
            }
        });
        editMenu3.add(copyMenuItem5);

        copyMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem6.setMnemonic('y');
        copyMenuItem6.setText("Employe Add");
        copyMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem6ActionPerformed(evt);
            }
        });
        editMenu3.add(copyMenuItem6);

        copyMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem7.setMnemonic('y');
        copyMenuItem7.setText("Product Information");
        copyMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem7ActionPerformed(evt);
            }
        });
        editMenu3.add(copyMenuItem7);

        copyMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem8.setMnemonic('y');
        copyMenuItem8.setText("Suplier Information");
        copyMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem8ActionPerformed(evt);
            }
        });
        editMenu3.add(copyMenuItem8);

        menuBar.add(editMenu3);

        editMenu2.setMnemonic('e');
        editMenu2.setText("Data Entry       ");
        editMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        cutMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cutMenuItem2.setMnemonic('t');
        cutMenuItem2.setText("Con/ENg Comission Add");
        cutMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItem2ActionPerformed(evt);
            }
        });
        editMenu2.add(cutMenuItem2);

        copyMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem2.setMnemonic('y');
        copyMenuItem2.setText("Utility Cost Add");
        copyMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem2ActionPerformed(evt);
            }
        });
        editMenu2.add(copyMenuItem2);

        copyMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem3.setMnemonic('y');
        copyMenuItem3.setText("Employe Salary");
        copyMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem3ActionPerformed(evt);
            }
        });
        editMenu2.add(copyMenuItem3);

        copyMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem4.setMnemonic('y');
        copyMenuItem4.setText("Expenditure");
        copyMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem4ActionPerformed(evt);
            }
        });
        editMenu2.add(copyMenuItem4);

        cutMenuItem12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cutMenuItem12.setMnemonic('t');
        cutMenuItem12.setText("Employe Sales Target");
        cutMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItem12ActionPerformed(evt);
            }
        });
        editMenu2.add(cutMenuItem12);

        menuBar.add(editMenu2);

        editMenu4.setMnemonic('e');
        editMenu4.setText("    Purchase       ");
        editMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        cutMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cutMenuItem4.setMnemonic('t');
        cutMenuItem4.setText("Product Purchase");
        cutMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cutMenuItem4MouseClicked(evt);
            }
        });
        cutMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItem4ActionPerformed(evt);
            }
        });
        editMenu4.add(cutMenuItem4);

        copyMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem10.setMnemonic('y');
        copyMenuItem10.setText("Purchase PAid");
        copyMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem10ActionPerformed(evt);
            }
        });
        editMenu4.add(copyMenuItem10);

        menuBar.add(editMenu4);

        editMenu5.setMnemonic('e');
        editMenu5.setText("Sales       ");
        editMenu5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        cutMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cutMenuItem5.setMnemonic('t');
        cutMenuItem5.setText("Product  Sales ");
        cutMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItem5ActionPerformed(evt);
            }
        });
        editMenu5.add(cutMenuItem5);

        copyMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem9.setMnemonic('y');
        copyMenuItem9.setText("Product Sales Collection");
        copyMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem9ActionPerformed(evt);
            }
        });
        editMenu5.add(copyMenuItem9);

        menuBar.add(editMenu5);

        editMenu6.setMnemonic('e');
        editMenu6.setText(" Report        ");
        editMenu6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        cutMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cutMenuItem6.setMnemonic('t');
        cutMenuItem6.setText("Cash Rgister (Cash & Sales Wise)");
        cutMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItem6ActionPerformed(evt);
            }
        });
        editMenu6.add(cutMenuItem6);

        copyMenuItem14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem14.setMnemonic('y');
        copyMenuItem14.setText("Con_Eng  Comission Incentive");
        copyMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem14ActionPerformed(evt);
            }
        });
        editMenu6.add(copyMenuItem14);

        cutMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cutMenuItem9.setMnemonic('t');
        cutMenuItem9.setText("Con/Eng Sales Report");
        cutMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItem9ActionPerformed(evt);
            }
        });
        editMenu6.add(cutMenuItem9);

        copyMenuItem15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem15.setMnemonic('y');
        copyMenuItem15.setText("Customer Due");
        copyMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem15ActionPerformed(evt);
            }
        });
        editMenu6.add(copyMenuItem15);

        copyMenuItem16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem16.setMnemonic('y');
        copyMenuItem16.setText("Customer Due Customer Wise");
        copyMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem16ActionPerformed(evt);
            }
        });
        editMenu6.add(copyMenuItem16);

        copyMenuItem17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem17.setMnemonic('y');
        copyMenuItem17.setText("Employe Salary Register");
        copyMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem17ActionPerformed(evt);
            }
        });
        editMenu6.add(copyMenuItem17);

        copyMenuItem18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem18.setMnemonic('y');
        copyMenuItem18.setText("Employe Sales & Salary  Report");
        copyMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem18ActionPerformed(evt);
            }
        });
        editMenu6.add(copyMenuItem18);

        copyMenuItem19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem19.setMnemonic('y');
        copyMenuItem19.setText("Expences Show");
        copyMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem19ActionPerformed(evt);
            }
        });
        editMenu6.add(copyMenuItem19);

        copyMenuItem20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem20.setMnemonic('y');
        copyMenuItem20.setText("Expenditure Show");
        copyMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem20ActionPerformed(evt);
            }
        });
        editMenu6.add(copyMenuItem20);

        copyMenuItem21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem21.setMnemonic('y');
        copyMenuItem21.setText("Product Buying");
        copyMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem21ActionPerformed(evt);
            }
        });
        editMenu6.add(copyMenuItem21);

        cutMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cutMenuItem7.setMnemonic('t');
        cutMenuItem7.setText("Sales Report Bill & Product");
        cutMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItem7ActionPerformed(evt);
            }
        });
        editMenu6.add(cutMenuItem7);

        cutMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cutMenuItem8.setMnemonic('t');
        cutMenuItem8.setText("Stock");
        cutMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItem8ActionPerformed(evt);
            }
        });
        editMenu6.add(cutMenuItem8);

        cutMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cutMenuItem10.setMnemonic('t');
        cutMenuItem10.setText("RMC Transaction Report");
        cutMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItem10ActionPerformed(evt);
            }
        });
        editMenu6.add(cutMenuItem10);

        cutMenuItem11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cutMenuItem11.setMnemonic('t');
        cutMenuItem11.setText("Balance Sheet");
        cutMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItem11ActionPerformed(evt);
            }
        });
        editMenu6.add(cutMenuItem11);

        menuBar.add(editMenu6);

        editMenu1.setMnemonic('e');
        editMenu1.setText("Pin");
        editMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        copyMenuItem11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        copyMenuItem11.setMnemonic('y');
        copyMenuItem11.setText("Create Pin");
        copyMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItem11ActionPerformed(evt);
            }
        });
        editMenu1.add(copyMenuItem11);

        menuBar.add(editMenu1);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1384, 1695));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cutMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItem11ActionPerformed
        report.Balance_sheet_profit1 ob=new Balance_sheet_profit1(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_cutMenuItem11ActionPerformed

    private void cutMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItem10ActionPerformed
        RMC_Transaction_Report ob=new RMC_Transaction_Report(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_cutMenuItem10ActionPerformed

    private void cutMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItem8ActionPerformed
        report.Stock ob=new Stock(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_cutMenuItem8ActionPerformed

    private void cutMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItem7ActionPerformed
        report.Sales_report_Bill_product_ ob=new Sales_report_Bill_product_(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_cutMenuItem7ActionPerformed

    private void copyMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem21ActionPerformed
        report.Product_buying ob=new Product_buying(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem21ActionPerformed

    private void copyMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem20ActionPerformed
        report.Expenditure_Show ob=new Expenditure_Show(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem20ActionPerformed

    private void copyMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem19ActionPerformed
        report.Expences_show ob=new Expences_show(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem19ActionPerformed

    private void copyMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem18ActionPerformed
        report.Employe_salse_salary_report ob=new Employe_salse_salary_report(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem18ActionPerformed

    private void copyMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem17ActionPerformed
        report.Employe_salary_register ob=new Employe_salary_register(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem17ActionPerformed

    private void copyMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem16ActionPerformed
        report.Customer_due_Customer_Wise ob=new Customer_due_Customer_Wise(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem16ActionPerformed

    private void copyMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem15ActionPerformed
        report.Customer_due ob=new Customer_due(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem15ActionPerformed

    private void cutMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItem9ActionPerformed
        report.Con_ENg_Sales_report ob=new Con_ENg_Sales_report(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_cutMenuItem9ActionPerformed

    private void copyMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem14ActionPerformed
        report.Con_ENg_Comission_IncentiveShow ob=new Con_ENg_Comission_IncentiveShow(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem14ActionPerformed

    private void cutMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItem6ActionPerformed
        report.Cash_Register ob=new Cash_Register(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_cutMenuItem6ActionPerformed

    private void copyMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem9ActionPerformed
        sales.Sales_Paid ob=new Sales_Paid(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem9ActionPerformed

    private void cutMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItem5ActionPerformed
        sales.Sales ob=new Sales(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_cutMenuItem5ActionPerformed

    private void copyMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem10ActionPerformed
        purchase.Purchase_Paid ob=new Purchase_Paid(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem10ActionPerformed

    private void cutMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItem4ActionPerformed
        new Product_Purchase(h).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cutMenuItem4ActionPerformed

    private void cutMenuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cutMenuItem4MouseClicked
        // TODO add your handling code here:
        new Product_Purchase(h).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cutMenuItem4MouseClicked

    private void cutMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItem12ActionPerformed
        Employe_Sales_Target ob=new Employe_Sales_Target(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_cutMenuItem12ActionPerformed

    private void copyMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem4ActionPerformed
        Data_Entry.Expenditure ob=new Expenditure(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem4ActionPerformed

    private void copyMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem3ActionPerformed
        Data_Entry.Employe_Salery ob=new Employe_Salery(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem3ActionPerformed

    private void copyMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem2ActionPerformed
        Data_Entry.Cost_Add ob=new Cost_Add(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem2ActionPerformed

    private void cutMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItem2ActionPerformed
        Data_Entry.Con_ENg_Comission_Incentive ob=new Con_ENg_Comission_Incentive(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_cutMenuItem2ActionPerformed

    private void copyMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem8ActionPerformed
        Information_add.Suplier_information_Add ob=new Suplier_information_Add(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem8ActionPerformed

    private void copyMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem7ActionPerformed
        Information_add.Product_information ob=new Product_information(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem7ActionPerformed

    private void copyMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem6ActionPerformed
        Information_add.Employe_Add ob=new Employe_Add(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem6ActionPerformed

    private void copyMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem5ActionPerformed
        Information_add.Customer_information_Add ob=new Customer_information_Add(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem5ActionPerformed

    private void cutMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItem3ActionPerformed
        Information_add.Con_Eng__Add ob=new Con_Eng__Add(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_cutMenuItem3ActionPerformed

    private void copyMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem1ActionPerformed
        Bkash_Amount ob=new Bkash_Amount(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem1ActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        Cash_Ammount ob=new Cash_Ammount(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        Cash_Ammount ob=new Cash_Ammount(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void copyMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItem11ActionPerformed
        Create_Login_Pin on=new Create_Login_Pin();
        on.setVisible(true);
        dispose();
    }//GEN-LAST:event_copyMenuItem11ActionPerformed

    private void cash_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cash_addActionPerformed
        Cash_Ammount ob=new Cash_Ammount(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_cash_addActionPerformed

    private void bank_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bank_addActionPerformed
        Cash_Ammount ob=new Cash_Ammount(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_bank_addActionPerformed

    private void bksh_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bksh_addActionPerformed
        Bkash_Amount ob=new Bkash_Amount(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_bksh_addActionPerformed

    private void con_eng_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_con_eng_addActionPerformed
        Information_add.Con_Eng__Add ob=new Con_Eng__Add(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_con_eng_addActionPerformed

    private void customer_info_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_info_addActionPerformed
        Information_add.Customer_information_Add ob=new Customer_information_Add(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_customer_info_addActionPerformed

    private void employe_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employe_addActionPerformed
        Information_add.Employe_Add ob=new Employe_Add(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_employe_addActionPerformed

    private void pro_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_infoActionPerformed
        Information_add.Product_information ob=new Product_information(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_pro_infoActionPerformed

    private void suplier_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suplier_infoActionPerformed
        Information_add.Suplier_information_Add ob=new Suplier_information_Add(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_suplier_infoActionPerformed

    private void employe_sale_tar_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employe_sale_tar_AddActionPerformed
        Employe_Sales_Target ob=new Employe_Sales_Target(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_employe_sale_tar_AddActionPerformed

    private void expenditure_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expenditure_AddActionPerformed
        Data_Entry.Expenditure ob=new Expenditure(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_expenditure_AddActionPerformed

    private void emmploye_salary_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emmploye_salary_addActionPerformed
        Data_Entry.Employe_Salery ob=new Employe_Salery(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_emmploye_salary_addActionPerformed

    private void utility_cost_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utility_cost_addActionPerformed
        Data_Entry.Cost_Add ob=new Cost_Add(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_utility_cost_addActionPerformed

    private void con_eng_commi_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_con_eng_commi_AddActionPerformed
        Data_Entry.Con_ENg_Comission_Incentive ob=new Con_ENg_Comission_Incentive(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_con_eng_commi_AddActionPerformed

    private void pro_purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_purchaseActionPerformed
        new Product_Purchase(h).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pro_purchaseActionPerformed

    private void purchase_paidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchase_paidActionPerformed
        purchase.Purchase_Paid ob=new Purchase_Paid(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_purchase_paidActionPerformed

    private void pr_salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pr_salesActionPerformed
        sales.Sales ob=new Sales(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_pr_salesActionPerformed

    private void pro_sales_colleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_sales_colleActionPerformed
        sales.Sales_Paid ob=new Sales_Paid(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_pro_sales_colleActionPerformed

    private void Balance_Sheet_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Balance_Sheet_reActionPerformed
        report.Balance_sheet_profit1 ob=new Balance_sheet_profit1(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_Balance_Sheet_reActionPerformed

    private void rmc_transaction_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmc_transaction_reActionPerformed
        RMC_Transaction_Report ob=new RMC_Transaction_Report(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_rmc_transaction_reActionPerformed

    private void stock_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_reActionPerformed
        report.Stock ob=new Stock(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_stock_reActionPerformed

    private void sales_bill_pro_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sales_bill_pro_reportActionPerformed
        report.Sales_report_Bill_product_ ob=new Sales_report_Bill_product_(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_sales_bill_pro_reportActionPerformed

    private void produuct_buying_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produuct_buying_reActionPerformed
        report.Product_buying ob=new Product_buying(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_produuct_buying_reActionPerformed

    private void expenditure_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expenditure_reActionPerformed
        report.Expenditure_Show ob=new Expenditure_Show(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_expenditure_reActionPerformed

    private void expences_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expences_reActionPerformed
        report.Expences_show ob=new Expences_show(h);
        ob.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_expences_reActionPerformed

    private void empl_sals_sala_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empl_sals_sala_reActionPerformed
        report.Employe_salse_salary_report ob=new Employe_salse_salary_report(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_empl_sals_sala_reActionPerformed

    private void employe_salary_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employe_salary_reActionPerformed
        report.Employe_salary_register ob=new Employe_salary_register(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_employe_salary_reActionPerformed

    private void Customer_Due_cust_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Customer_Due_cust_reActionPerformed
        report.Customer_due_Customer_Wise ob=new Customer_due_Customer_Wise(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_Customer_Due_cust_reActionPerformed

    private void Customer_Due_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Customer_Due_reActionPerformed
        report.Customer_due ob=new Customer_due(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_Customer_Due_reActionPerformed

    private void con_eng_sales_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_con_eng_sales_reActionPerformed
        report.Con_ENg_Sales_report ob=new Con_ENg_Sales_report(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_con_eng_sales_reActionPerformed

    private void con_eng_Comisson_incentive_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_con_eng_Comisson_incentive_reActionPerformed
        report.Con_ENg_Comission_IncentiveShow ob=new Con_ENg_Comission_IncentiveShow(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_con_eng_Comisson_incentive_reActionPerformed

    private void cash_Ragister_cash_salse_wise_reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cash_Ragister_cash_salse_wise_reActionPerformed
        report.Cash_Register ob=new Cash_Register(h);
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_cash_Ragister_cash_salse_wise_reActionPerformed

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
  try{
        
        DefaultMutableTreeNode dt=(DefaultMutableTreeNode) jTree1.getSelectionPath().getLastPathComponent();
       String  s=dt.getUserObject().toString();     
        if(s.equals("Cash")){
            Cash_Ammount ob=new Cash_Ammount(h);
            ob.setVisible(true);
            dispose();
        }else if(s.equals("Bank")){
            cash.Bank_Data ob=new Bank_Data(h);
            ob.setVisible(true);
            dispose();
        }else if(s.equals("Bkash")){
            Bkash_Amount ob=new Bkash_Amount(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("Con - Eng Add")){
             Information_add.Con_Eng__Add ob=new Con_Eng__Add(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("Customer Information")){
            Information_add.Con_Eng__Add ob=new Con_Eng__Add(h);
            ob.setVisible(true);
            dispose();
        }else if(s.equals("Employe Add")){
            Information_add.Employe_Add ob=new Employe_Add(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("Product Information")){
              Information_add.Product_information ob=new Product_information(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("Sumplier Information")){
             Information_add.Suplier_information_Add ob=new Suplier_information_Add(h);
            ob.setVisible(true);
            dispose();
        }else if(s.equals("Con - Eng Comission Add")){
           Data_Entry.Con_ENg_Comission_Incentive ob=new Con_ENg_Comission_Incentive(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("Utility Cost Add")){
              Data_Entry.Cost_Add ob=new Cost_Add(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("Employe Salary")){
             Data_Entry.Employe_Salery ob=new Employe_Salery(h);
            ob.setVisible(true);
            dispose();
        }else if(s.equals("Emplye Sales Target")){
            Employe_Sales_Target ob=new Employe_Sales_Target(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("Expenditure")){
             Expenditure ob=new Expenditure(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("Product Purchase")){
            Product_Purchase ob=new Product_Purchase(h);
            ob.setVisible(true);
            dispose();
        }else if(s.equals("Purchase Collection")){
            Purchase_Paid ob=new Purchase_Paid(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("Product Sales")){
            Sales ob=new Sales(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("Sales Collection")){
            Sales_Paid ob=new Sales_Paid(h);
            ob.setVisible(true);
            dispose();
        }else if(s.equals("Cash Register (Cash & Sales Wise)")){
           Cash_Register ob=new Cash_Register(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("Con -  Eng Sales Report")){
             report.Con_ENg_Sales_report ob=new Con_ENg_Sales_report(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("Customer Due")){
            report.Customer_due ob=new Customer_due(h);
            ob.setVisible(true);
            dispose();
        }else if(s.equals("Customer Due( Customer Wise )")){
           report.Customer_due_Customer_Wise ob=new Customer_due_Customer_Wise(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("Employe Salary Register")){
             report.Employe_salary_register ob=new Employe_salary_register(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("Employe Sales & Salary Report")){
            report.Employe_salse_salary_report ob=new Employe_salse_salary_report(h);
            ob.setVisible(true);
            dispose();
        }else if(s.equals("Exences Show")){
           report.Expences_show ob=new Expences_show(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("Expenditure Show")){
             report.Expenditure_Show ob=new Expenditure_Show(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("Product Buying")){
            report.Product_buying ob=new Product_buying(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("Sales Report ( Bill & Product )")){
           report.Sales_report_Bill_product_ ob=new Sales_report_Bill_product_(h);
            ob.setVisible(true);
            dispose();
        }else if(s.equals("Stock")){
            report.Stock ob=new Stock(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("RMC Transaction Report")){
             report.RMC_Transaction_Report ob=new RMC_Transaction_Report(h);
        ob.setVisible(true);
        dispose();
        }else if(s.equals("Balance Sheet")){
             report.Balance_sheet_profit1 ob=new Balance_sheet_profit1(h);
        ob.setVisible(true);
        dispose();
        }
        
        
  }
  catch(Exception e){
      
  }
        
    }//GEN-LAST:event_jTree1MouseClicked
 public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
 } 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new demo_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Balance_Sheet_re;
    private javax.swing.JButton Customer_Due_cust_re;
    private javax.swing.JButton Customer_Due_re;
    private javax.swing.JButton bank_add;
    private javax.swing.JButton bksh_add;
    private javax.swing.JButton cash_Ragister_cash_salse_wise_re;
    private javax.swing.JButton cash_add;
    private javax.swing.JButton con_eng_Comisson_incentive_re;
    private javax.swing.JButton con_eng_add;
    private javax.swing.JButton con_eng_commi_Add;
    private javax.swing.JButton con_eng_sales_re;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem copyMenuItem1;
    private javax.swing.JMenuItem copyMenuItem10;
    private javax.swing.JMenuItem copyMenuItem11;
    private javax.swing.JMenuItem copyMenuItem14;
    private javax.swing.JMenuItem copyMenuItem15;
    private javax.swing.JMenuItem copyMenuItem16;
    private javax.swing.JMenuItem copyMenuItem17;
    private javax.swing.JMenuItem copyMenuItem18;
    private javax.swing.JMenuItem copyMenuItem19;
    private javax.swing.JMenuItem copyMenuItem2;
    private javax.swing.JMenuItem copyMenuItem20;
    private javax.swing.JMenuItem copyMenuItem21;
    private javax.swing.JMenuItem copyMenuItem3;
    private javax.swing.JMenuItem copyMenuItem4;
    private javax.swing.JMenuItem copyMenuItem5;
    private javax.swing.JMenuItem copyMenuItem6;
    private javax.swing.JMenuItem copyMenuItem7;
    private javax.swing.JMenuItem copyMenuItem8;
    private javax.swing.JMenuItem copyMenuItem9;
    private javax.swing.JButton customer_info_add;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem cutMenuItem10;
    private javax.swing.JMenuItem cutMenuItem11;
    private javax.swing.JMenuItem cutMenuItem12;
    private javax.swing.JMenuItem cutMenuItem2;
    private javax.swing.JMenuItem cutMenuItem3;
    private javax.swing.JMenuItem cutMenuItem4;
    private javax.swing.JMenuItem cutMenuItem5;
    private javax.swing.JMenuItem cutMenuItem6;
    private javax.swing.JMenuItem cutMenuItem7;
    private javax.swing.JMenuItem cutMenuItem8;
    private javax.swing.JMenuItem cutMenuItem9;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu editMenu1;
    private javax.swing.JMenu editMenu2;
    private javax.swing.JMenu editMenu3;
    private javax.swing.JMenu editMenu4;
    private javax.swing.JMenu editMenu5;
    private javax.swing.JMenu editMenu6;
    private javax.swing.JButton emmploye_salary_add;
    private javax.swing.JButton empl_sals_sala_re;
    private javax.swing.JButton employe_add;
    private javax.swing.JButton employe_salary_re;
    private javax.swing.JButton employe_sale_tar_Add;
    private javax.swing.JButton expences_re;
    private javax.swing.JButton expenditure_Add;
    private javax.swing.JButton expenditure_re;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton pr_sales;
    private javax.swing.JButton pro_info;
    private javax.swing.JButton pro_purchase;
    private javax.swing.JButton pro_sales_colle;
    private javax.swing.JButton produuct_buying_re;
    private javax.swing.JButton purchase_paid;
    private javax.swing.JButton rmc_transaction_re;
    private javax.swing.JButton sales_bill_pro_report;
    private javax.swing.JButton stock_re;
    private javax.swing.JButton suplier_info;
    private javax.swing.JButton utility_cost_add;
    // End of variables declaration//GEN-END:variables

}
