/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncc.rubal.cp.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ncc.rubal.cp.DAOImpl.AirlinesImpl;
import ncc.rubal.cp.DAOImpl.BillImpl;
import ncc.rubal.cp.DAOImpl.CustomerImpl;
import ncc.rubal.cp.connection.DbCon;
import ncc.rubal.cp.dao.AirlinesDAO;
import ncc.rubal.cp.dao.BillDAO;
import ncc.rubal.cp.dao.CustomerDAO;
import ncc.rubal.cp.entity.Airlines;
import ncc.rubal.cp.entity.Bill;
import ncc.rubal.cp.entity.Customer;

/**
 *
 * @author dell
 */
public class AddBill extends javax.swing.JInternalFrame {
static int staff_id;
    private DbCon con;

    /**
     * Creates new form AddPurchaseDetail
     */
   

    
    
    public AddBill(int id) throws SQLException, ClassNotFoundException {
        this.staff_id=id;
        con = DbCon.getInstance();
        initComponents();
        fillCustomerCombo();
        fillAirlinesCombo();
        fillBillNo();
      
    }
    
    public void fillBillNo() throws SQLException, ClassNotFoundException{
        BillDAO bdao=new BillImpl();
        int id=bdao.getId()+1;
        String i=String.valueOf(id);        
        lblBill.setText(i);
    }
    
    
    public void fillCustomerCombo() throws SQLException, ClassNotFoundException {

        con.connect();
        String sql = "select customer_name from customer";
        ResultSet rs = con.executeQuery(sql);
        while (rs.next()) {
            String customer = rs.getString("customer_name");
            cmbCust.addItem(customer);
        }
    }
    
     public void fillAirlinesCombo() throws SQLException, ClassNotFoundException {

        String sql = "select airlines_name from airlines";
        ResultSet rs = con.executeQuery(sql);
        while (rs.next()) {
            String airlines = rs.getString("airlines_name");
            cmbAir.addItem(airlines);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        dateComponentFormatter1 = new org.jdatepicker.impl.DateComponentFormatter();
        jDatePickerUtil2 = new org.jdatepicker.util.JDatePickerUtil();
        jDateComponentFactory1 = new org.jdatepicker.JDateComponentFactory();
        sqlDateModel1 = new org.jdatepicker.impl.SqlDateModel();
        utilDateModel1 = new org.jdatepicker.impl.UtilDateModel();
        sqlDateModel2 = new org.jdatepicker.impl.SqlDateModel();
        jLabel1 = new javax.swing.JLabel();
        lblBill = new javax.swing.JLabel();
        cmbCust = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbAir = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtFlight = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSector = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPax = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();

        jLabel1.setText("Select Customer");

        lblBill.setText("lbl");

        cmbCust.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel3.setText("Select Airlines");

        cmbAir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jButton1.setText("Add New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Flight No");

        jLabel5.setText("Sector");

        jLabel6.setText("Flight Date");

        jLabel7.setText("No. of Passenger");

        txtPax.setText("0");
        txtPax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPaxFocusLost(evt);
            }
        });

        jLabel8.setText("Cost");

        txtCost.setText("0");
        txtCost.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCostFocusLost(evt);
            }
        });
        txtCost.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtCostInputMethodTextChanged(evt);
            }
        });
        txtCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostActionPerformed(evt);
            }
        });
        txtCost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostKeyTyped(evt);
            }
        });

        jLabel9.setText("Total Cost");

        txtTotal.setEditable(false);

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Clear");

        jLabel2.setText("Bill No.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbAir, 0, 173, Short.MAX_VALUE)
                                    .addComponent(cmbCust, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2))
                                .addGap(45, 45, 45))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCost)
                                    .addComponent(txtPax, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSector, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFlight, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(txtDate))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblBill)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBill)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbCust, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbAir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSector, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPax, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try {
          
            AddCustomer cust= new AddCustomer();
            cust.setVisible(true);
            setContentPane(cust);

        } catch (Exception ex) {
            Logger.getLogger(AddBill.class.getName()).log(Level.SEVERE, null, ex);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        try {
           
            BillDAO bdao = new BillImpl();
            Bill bill = new Bill();
            CustomerDAO cdao=new CustomerImpl();
            Customer customer=new Customer();
            AirlinesDAO adao=new AirlinesImpl();
            Airlines airlines=new Airlines();
            customer.setCustomer_name((String) cmbCust.getSelectedItem());
            int cust_id=cdao.getId(customer);
            airlines.setAirlines_name((String) cmbAir.getSelectedItem());
            int airlines_id=adao.getId(airlines);
            bill.setCustomer_no(cust_id);
            bill.setAirlines_no(airlines_id);
            bill.setFlight_no(txtFlight.getText());
            bill.setSector(txtSector.getText());
            bill.setFlight_date(txtDate.getText());
            bill.setPax_no(Integer.parseInt(txtPax.getText()));
            bill.setCost(Float.parseFloat(txtCost.getText()));
            bill.setStaff_id(staff_id);
            
            bdao.Insert(bill);
            JOptionPane.showMessageDialog(null, "Bill added Sucessful");
        } catch (SQLException ex) {
            Logger.getLogger(AddBill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddBill.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try {
          
            AddAirlines air= new AddAirlines();
            air.setVisible(true);
            setContentPane(air);

        } catch (Exception ex) {
            Logger.getLogger(AddBill.class.getName()).log(Level.SEVERE, null, ex);
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostActionPerformed

    }//GEN-LAST:event_txtCostActionPerformed

    private void txtCostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostKeyTyped
       // TODO add your handling code here:
    }//GEN-LAST:event_txtCostKeyTyped

    private void txtCostInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtCostInputMethodTextChanged
       // TODO add your handling code here:
    }//GEN-LAST:event_txtCostInputMethodTextChanged

    private void txtCostFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCostFocusLost
        if(txtCost.getText() != null || txtPax.getText() != null){
        String add=String.valueOf(Integer.parseInt(txtPax.getText())*Float.parseFloat(txtCost.getText()));
            txtTotal.setText(add); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_txtCostFocusLost

    private void txtPaxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaxFocusLost
       if(txtCost.getText() != null || txtPax.getText() != null){
        String add=String.valueOf(Integer.parseInt(txtPax.getText())*Float.parseFloat(txtCost.getText()));
            txtTotal.setText(add); 
        }    // TODO add your handling code here:
    }//GEN-LAST:event_txtPaxFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbAir;
    private javax.swing.JComboBox<String> cmbCust;
    private org.jdatepicker.impl.DateComponentFormatter dateComponentFormatter1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private org.jdatepicker.JDateComponentFactory jDateComponentFactory1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblBill;
    private org.jdatepicker.impl.SqlDateModel sqlDateModel1;
    private org.jdatepicker.impl.SqlDateModel sqlDateModel2;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFlight;
    private javax.swing.JTextField txtPax;
    private javax.swing.JTextField txtSector;
    private javax.swing.JTextField txtTotal;
    private org.jdatepicker.impl.UtilDateModel utilDateModel1;
    // End of variables declaration//GEN-END:variables
}
