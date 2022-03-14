package report;  
import Main_PAck.connection_class; 
import Main_PAck.demo_user1;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;  
import javax.swing.JOptionPane;
import javax.swing.JTextField; 
public class BAlance_Sheet_Final extends javax.swing.JFrame {
connection_class con;
String e="";
SimpleDateFormat sf;
static String h;
public  BAlance_Sheet_Final(String string) {
    initComponents();
        con=new connection_class();
        show_date();
        h=string;
      show_test();
        
    }  
private BAlance_Sheet_Final() {
  initComponents();    con=new connection_class();    show_test(); } 
void show_test(){
       
    try { 
        long pu=0,exp=0,cos=0,sal=0,em=0,com=0,cash_cr=0,cash_de=0,cr=0,dr=0,gd=0;
      Date dt = new Date();
        DateFormat year = new SimpleDateFormat("yyyy"); 
        DateFormat month = new SimpleDateFormat("MM");  
        DateFormat day = new SimpleDateFormat("dd"); 
        String days=day.format(dt);
        String months=month.format(dt);
        String years=year.format(dt);
        
        String mm="";
        
        switch (months) {
            case "01":
                mm="January";
                break;
            case "02":
                mm="February";
                break;
            case "03":
                mm="March";
                break;
            case "04":
                mm="April";
                break;
            case "05":
                mm="May";
                break;
            case "06":
                mm="June";
                break;
            case "07":
                mm="July";
                break;
            case "08":
                mm="August";
                break;
            case "09":
                mm="September";
                break;
            case "10":
                mm="October";
                break;
            case "11":
                mm="November";
                break;
            case "12":
                mm="December";
                break;
            default:
                break;
        }
        jLabel2.setText(mm+" "+days+", "+years);
        con.contest();
        
        String bs_putotal="SELECT SUM(`amount`)AS `purchase` FROM `bs_putotal`";
        con.st = con.ct.prepareCall(bs_putotal);
        con.rs = con.st.executeQuery(bs_putotal);
        if(con.rs.next()){
           pu=con.rs.getLong(1);
            
        }
        
        
        
        String bs_employe="SELECT SUM(`amount`)AS `employe` FROM `bs_employe`";
        con.st = con.ct.prepareCall(bs_employe);
        con.rs = con.st.executeQuery(bs_employe);
        if(con.rs.next()){
           em=con.rs.getLong(1);
            
        }
        
        String bs_eng_con_commmission="SELECT SUM(`amount`)AS `commision` FROM `bs_eng_con_commmission`";
        con.st = con.ct.prepareCall(bs_eng_con_commmission);
        con.rs = con.st.executeQuery(bs_eng_con_commmission);
        if(con.rs.next()){
           com=con.rs.getLong(1);
            
        }
        
        
        String bs_expenditure="SELECT SUM(`amount`)AS `expenditure` FROM `bs_expenditure`";
        con.st = con.ct.prepareCall(bs_expenditure);
        con.rs = con.st.executeQuery(bs_expenditure);
        if(con.rs.next()){
           exp=con.rs.getLong(1);
            
        }
        
         String bs_utility_cost="SELECT SUM(`amount`)AS `cost` FROM `bs_utility_cost` ";
        con.st = con.ct.prepareCall(bs_utility_cost);
        con.rs = con.st.executeQuery(bs_utility_cost);
        if(con.rs.next()){
           cos=con.rs.getLong(1);
            
        }
          String bs_cash_de="SELECT SUM(`amount`)AS `cash` FROM `bs_cash_de`";
        con.st = con.ct.prepareCall(bs_cash_de);
        con.rs = con.st.executeQuery(bs_cash_de);
        if(con.rs.next()){
           cash_de=con.rs.getLong(1);
            
        }
        
        
        
        
        String bs_sales="SELECT SUM(`amount`)AS `sales` FROM `bs_sales`";
        con.st = con.ct.prepareCall(bs_sales);
        con.rs = con.st.executeQuery(bs_sales);
        if(con.rs.next()){
           sal=con.rs.getLong(1);
            
        }
        
           String bs_cash="SELECT SUM(`amount`)AS `cash` FROM `bs_cash`";
        con.st = con.ct.prepareCall(bs_cash);
        con.rs = con.st.executeQuery(bs_cash);
        if(con.rs.next()){
           cash_cr=con.rs.getLong(1);
            
        }
        
        
        cr=sal+cash_cr;
        dr=pu+cos+exp+com+em+cash_de; 
        gd=dr-cr; 
        cr=sal+cash_cr+gd;
        gd=gd/2;
        
        
        purchase_ll.setText(""+pu);  
        cash_dr_lbl.setText(""+cos); 
        expenditure_lbl.setText(""+exp);
        comision_lbl.setText(""+com); 
        employe_lbl.setText(""+em);
        cash_dr_lbl.setText(""+cash_de);
        initial_cash_lbl.setText(""+cash_cr);
        salse_lbl.setText(""+sal);
        total_ce.setText(""+cr);
        total_de.setText(""+dr); 
        
        good_well_lbl.setText(""+gd);
          comany_lbl.setText(""+gd);
        
    } catch (SQLException ex) {
        Logger.getLogger(BAlance_Sheet_Final.class.getName()).log(Level.SEVERE, null, ex);
    }
    
   }  


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cash_dr_lbl = new javax.swing.JLabel();
        purchase_ll = new javax.swing.JLabel();
        expenditure_lbl = new javax.swing.JLabel();
        comision_lbl = new javax.swing.JLabel();
        employe_lbl = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        initial_cash_lbl = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        salse_lbl = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        good_well_lbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        comany_lbl = new javax.swing.JLabel();
        total_ce = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        good_well_lbl1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        purchase_ll2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        total_de = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        good_well_lbl2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Credit Balance");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(940, 190, 230, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Drebit Balance");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(480, 190, 230, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Particulars");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(710, 190, 230, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Particulars");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel5);
        jLabel5.setBounds(250, 190, 230, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Employe");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(270, 230, 190, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Commission");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(270, 270, 190, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Expenditure");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(270, 310, 190, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Utility Cost");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(270, 350, 190, 40);

        cash_dr_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cash_dr_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(cash_dr_lbl);
        cash_dr_lbl.setBounds(500, 390, 190, 40);

        purchase_ll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        purchase_ll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(purchase_ll);
        purchase_ll.setBounds(500, 350, 190, 40);

        expenditure_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        expenditure_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(expenditure_lbl);
        expenditure_lbl.setBounds(500, 310, 190, 40);

        comision_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comision_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(comision_lbl);
        comision_lbl.setBounds(500, 270, 190, 40);

        employe_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        employe_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(employe_lbl);
        employe_lbl.setBounds(500, 230, 190, 40);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Initial Amount");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(730, 230, 190, 40);

        initial_cash_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        initial_cash_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(initial_cash_lbl);
        initial_cash_lbl.setBounds(960, 230, 190, 40);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Sales");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(730, 270, 190, 40);

        salse_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salse_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(salse_lbl);
        salse_lbl.setBounds(960, 270, 190, 40);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Good Well");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(730, 310, 190, 40);

        good_well_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        good_well_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(good_well_lbl);
        good_well_lbl.setBounds(960, 310, 190, 40);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        comany_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comany_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(comany_lbl);
        comany_lbl.setBounds(20, 130, 190, 40);

        total_ce.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total_ce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_ce.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(total_ce);
        total_ce.setBounds(0, 280, 230, 50);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Good Well");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(730, 310, 190, 40);

        good_well_lbl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        good_well_lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(good_well_lbl1);
        good_well_lbl1.setBounds(960, 310, 190, 40);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(940, 230, 230, 330);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Payment");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(20, 160, 190, 40);

        purchase_ll2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        purchase_ll2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(purchase_ll2);
        purchase_ll2.setBounds(250, 160, 190, 40);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(250, 230, 230, 330);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        total_de.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total_de.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_de.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(total_de);
        total_de.setBounds(0, 280, 230, 50);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(480, 230, 230, 330);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Good Well");
        jPanel5.add(jLabel26);
        jLabel26.setBounds(730, 310, 190, 40);

        good_well_lbl2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        good_well_lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(good_well_lbl2);
        good_well_lbl2.setBounds(960, 310, 190, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Comapany ");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(20, 120, 190, 40);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(710, 230, 230, 330);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 110, 1360, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("RMC CHEMICAL COMPANY LTD.");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 20, 1360, 60);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Balance Sheet");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(0, 80, 1360, 30);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Utility Cost");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(270, 390, 190, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Purchase");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(270, 350, 190, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1370, 700);
        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(1384, 742));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void show_date() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
 // ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText(""+df.format(dt));
 }  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BAlance_Sheet_Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BAlance_Sheet_Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BAlance_Sheet_Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BAlance_Sheet_Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BAlance_Sheet_Final().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel cash_dr_lbl;
    private javax.swing.JLabel comany_lbl;
    private javax.swing.JLabel comision_lbl;
    private javax.swing.JLabel employe_lbl;
    private javax.swing.JLabel expenditure_lbl;
    private javax.swing.JLabel good_well_lbl;
    private javax.swing.JLabel good_well_lbl1;
    private javax.swing.JLabel good_well_lbl2;
    private javax.swing.JLabel initial_cash_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel purchase_ll;
    private javax.swing.JLabel purchase_ll2;
    private javax.swing.JLabel salse_lbl;
    private javax.swing.JLabel total_ce;
    private javax.swing.JLabel total_de;
    // End of variables declaration//GEN-END:variables

}
