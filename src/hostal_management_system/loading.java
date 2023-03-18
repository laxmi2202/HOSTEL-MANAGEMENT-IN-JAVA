/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostal_management_system;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author laxmi
 */
public class loading extends javax.swing.JFrame {

    public loading() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hostel Management System");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb1.setBackground(new java.awt.Color(153, 0, 255));
        lb1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 282, 61));

        jLabel2.setBackground(new java.awt.Color(153, 0, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ezgif.com-resize.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 130, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        setSize(500,500);

        pack();
    }

    
    public void checkconn() throws InterruptedException {
    
    
    
      
        try {

           String myUrl = Utils.myUrl;
            java.sql.Connection conn = DriverManager.getConnection(myUrl, Utils.user, Utils.pass);

            try ( //create the java statement
                Statement st = conn.createStatement()) {
                System.out.println("connected");
                st.close();
                lb1.setText("database connected..");
                TimeUnit.SECONDS.sleep(3); 
                setVisible(false); //you can't see me!
                new Login().setVisible(true);
                dispose(); //Destroy the JFrame object
                          
            }
        }
        catch (SQLException e)
        {
            lb1.setText("database connection failed!");
            System.out.println("connectionfaild");
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
       
        
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        
        
        
      
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loading().setVisible(true);
            }
        });
    }

   
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb1;

}
