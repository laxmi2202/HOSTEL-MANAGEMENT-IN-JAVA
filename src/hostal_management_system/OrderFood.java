/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hostal_management_system;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.JFrame;
/**
 *
 * @author laxmi
 */
public class OrderFood extends javax.swing.JFrame {

    
    
    int b=0,l=0,d=0,m=0;
    String id;
    int bal,newww,tott;
    
    
    

    
    
    
    
    
    /**
     * Creates new form OrderFood
     */
    public OrderFood() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        txtstdentid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblbreakfast = new javax.swing.JRadioButton();
        lbllunch = new javax.swing.JRadioButton();
        lbldinner = new javax.swing.JRadioButton();
        lblmilk = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Order Foods");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(86, 115, 152));
        jLabel1.setText("Food Order");

        lb.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lb.setForeground(new java.awt.Color(44, 128, 120));
        lb.setText("Student ID");

        txtstdentid.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                chanedtext(evt);
            }
        });
        txtstdentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstdentidActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButton1.setText("Pay");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblbreakfast.setBackground(new java.awt.Color(255, 255, 255));
        lblbreakfast.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblbreakfast.setText("Breakfast");

        lbllunch.setBackground(new java.awt.Color(255, 255, 255));
        lbllunch.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbllunch.setText("Lunch");

        lbldinner.setBackground(new java.awt.Color(255, 255, 255));
        lbldinner.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbldinner.setSelected(true);
        lbldinner.setText("Dinner");

        lblmilk.setBackground(new java.awt.Color(255, 255, 255));
        lblmilk.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblmilk.setText("Tea");

        jButton2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jButton2.setText("change food price");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bread.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lunch.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/noodles.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tea.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblbreakfast, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(lbllunch, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(lbldinner, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(lblmilk)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)
                                        .addComponent(jLabel3)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtstdentid, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(317, 317, 317))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel5)
                        .addGap(39, 39, 39)
                        .addComponent(lblmilk)
                        .addGap(110, 110, 110))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)))))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbldinner)
                            .addComponent(lbllunch)
                            .addComponent(lblbreakfast))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtstdentid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {



        
    
        
        
        
        


    if(lblbreakfast.isSelected()==true)
    {
        b=1;
    }
    if(lbllunch.isSelected()==true)
    {
        l=1;
    }
    if(lbldinner.isSelected()==true)
    {
        d=1;
    }
    if(lblmilk.isSelected()==true)
    {
        m=1;
    }
    
    
    id=txtstdentid.getText();
    
    
    
    
    try {
            
            String myUrl = Utils.myUrl;
            java.sql.Connection conn = DriverManager.getConnection(myUrl, Utils.user, Utils.pass);
            
            String query ="SELECT moneyPaid FROM student WHERE id="+id+";"; 
            
            
            //create the java statement
            Statement st = conn.createStatement();
            // execute the query, and get a java result set
            ResultSet rs = st.executeQuery(query);
      
       while (rs.next())
      {
         bal = rs.getInt("moneyPaid");
   
        
        // print the results
        System.out.format("%s\n", bal);
      }
      st.close();
    }
       catch (Exception e)
        {
           System.err.println("Got an exception! ");
           System.err.println(e.getMessage());
       }
    
     
   int idint=Integer.parseInt(id); 
   
   
        getpay n= new getpay();
        int breakfastprice =n.getitemprice(001);
        int lunchprice =n.getitemprice(003);
        int dinnerprice =n.getitemprice(004);
        int milkprice =n.getitemprice(005);
        
   
   
   
   
   
   
   
  
   
   Order obj= new Order(idint,bal,b,l,d,m,breakfastprice,lunchprice,dinnerprice,milkprice);
  /* obj.setBrakfast(breakfastprice);
   obj.setDinner(dinnerprice);
   obj.setDinner(lunchprice);
   obj.setMilk(milkprice);*/
   int tot=obj.getTotal();
   int newbal=obj.getnewAccountbalance();
   
   
   
   
   Date Currentdate = new Date(); 
   
   
   // System.out.format("%s %s %s %s %s %s %s %s\n", bal,id,b,l,d,m,tot,newbal);//test
    System.out.println(Currentdate);
   
    newww=newbal;
    tott=tot;
   
    if(newww>0){
    try {
            
            String myUrl = Utils.myUrl;
            java.sql.Connection conn = DriverManager.getConnection(myUrl, Utils.user, Utils.pass);
            
            String query1 ="update student set moneyPaid = '"+newww+"' where id = "+id+""; 
            String query2 ="INSERT INTO orderinfo (student_id,payment,breakfast,lunch,dinner,tea) VALUES ("+id+","+tott+","+b+","+l+","+d+","+m+")";
            
            //create the java statement
            Statement st = conn.createStatement();
            // execute the query, and get a java result set
            st.execute(query1);
            st.execute(query2);
            JOptionPane.showMessageDialog(null, "done");
      
      st.close();
    }
       catch (Exception e)
        {
           System.err.println("Got an exception! ");
           System.err.println(e.getMessage());
       }
    
   
    }
    else{
    
    JOptionPane.showMessageDialog(null, "insuffiction balance please recharge");
    
    }
   
   
   /*
    
    
    
    
    Connection con = DriverManager.getConnection (
            "jdbc:derby://localhost:1527/testDb","username", "password");
         
         Statement stmt = con.createStatement();
         String query1 = "update emp set name = 'ravi' where id = 2";
         String query2 = "delete from emp where id = 1";
         String query3 = "insert into emp values (1,'ronak','manager')";
         
         stmt.execute(query1);
         stmt.execute(query2);
    
    
    
    
    
    
    
    
    
    
    */
   
   
   
   
   
   
   
   
   b=0;l=0;d=0;m=0;
  
   
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
/*
     try
    {
      // create our mysql database connection
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost/test";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
      
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "SELECT * FROM users";

      // create the java statement
      Statement st = conn.createStatement();
      
      // execute the query, and get a java resultset
      ResultSet rs = st.executeQuery(query);
      
      // iterate through the java resultset
      while (rs.next())
      {
        int id = rs.getInt("id");
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        Date dateCreated = rs.getDate("date_created");
        boolean isAdmin = rs.getBoolean("is_admin");
        int numPoints = rs.getInt("num_points");
        
        // print the results
        System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, dateCreated, isAdmin, numPoints);
      }
      st.close();
*/






        // TODO add your handling code here:
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        // TODO add your handling code here:
    }

    private void txtstdentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstdentidActionPerformed
        // TODO add your handling code here:
    }

    private void chanedtext(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_chanedtext
                 // TODO add your handling code here:
                 

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        changefoodpricemini cp = new changefoodpricemini();
        cp.setVisible(true);
        cp.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
         
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
       
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
            java.util.logging.Logger.getLogger(OrderFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderFood().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb;
    private javax.swing.JRadioButton lblbreakfast;
    private javax.swing.JRadioButton lbldinner;
    private javax.swing.JRadioButton lbllunch;
    private javax.swing.JRadioButton lblmilk;
    private javax.swing.JTextField txtstdentid;
   
}
