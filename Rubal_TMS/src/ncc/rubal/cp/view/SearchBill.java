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
import ncc.rubal.cp.DAOImpl.StaffImpl;
import ncc.rubal.cp.connection.DbCon;
import ncc.rubal.cp.dao.AirlinesDAO;
import ncc.rubal.cp.dao.BillDAO;
import ncc.rubal.cp.dao.CustomerDAO;
import ncc.rubal.cp.dao.StaffDAO;
import ncc.rubal.cp.entity.Airlines;
import ncc.rubal.cp.entity.Bill;
import ncc.rubal.cp.entity.Customer;
import ncc.rubal.cp.entity.Staff;

/**
 *
 * @author dell
 */
public class SearchBill extends javax.swing.JInternalFrame {

    private DbCon con;

    /**
     * Creates new form SearchBill
     */
    public SearchBill() throws SQLException, ClassNotFoundException {
        initComponents();
        con = DbCon.getInstance();
        fillCustomerCombo();
        fillAirlinesCombo();
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

        txtSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtFlight = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSector = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbCust = new javax.swing.JComboBox<>();
        txtPax = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbAir = new javax.swing.JComboBox<>();
        txtCost = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtStaff = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Void");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Sector");

        jLabel1.setText("Select Customer");

        jLabel6.setText("Flight Date");

        jLabel7.setText("No. of Passenger");

        cmbCust.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        txtPax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPaxFocusLost(evt);
            }
        });

        jLabel3.setText("Select Airlines");

        jLabel8.setText("Cost");

        cmbAir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        txtCost.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCostFocusLost(evt);
            }
        });

        jButton2.setText("Add New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Total Cost");

        jButton5.setText("Add New");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtTotal.setEditable(false);

        jLabel4.setText("Flight No");

        jLabel2.setText("Inserted By");

        txtStaff.setEditable(false);

        jLabel10.setText("Search Bill");

        jLabel11.setText("Void Status");

        txtStatus.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel11))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbCust, 0, 178, Short.MAX_VALUE)
                                            .addComponent(cmbAir, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton2)
                                            .addComponent(jButton5)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtStatus, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtStaff, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCost)
                                        .addComponent(txtPax, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSector, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFlight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel10)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbCust, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cmbAir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSector, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            bill.setBill_no(Integer.parseInt(txtSearch.getText()));
            
            bdao.update(bill);
            JOptionPane.showMessageDialog(null, "Bill updated Sucessful");
        } catch (SQLException ex) {
            Logger.getLogger(SearchBill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchBill.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            AddCustomer cust = new AddCustomer();
            cust.setVisible(true);
            setContentPane(cust);

        } catch (Exception ex) {
            Logger.getLogger(AddBill.class.getName()).log(Level.SEVERE, null, ex);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {

            AddAirlines air = new AddAirlines();
            air.setVisible(true);
            setContentPane(air);

        } catch (Exception ex) {
            Logger.getLogger(AddBill.class.getName()).log(Level.SEVERE, null, ex);
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            BillDAO bdao = new BillImpl();
            Bill bill=new Bill();
            bill.setBill_no(Integer.parseInt(txtSearch.getText()));
            bdao.Cancel(bill);
            JOptionPane.showMessageDialog(null, "Bill void Sucessful");
        } catch (SQLException ex) {
            Logger.getLogger(SearchBill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchBill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            DbCon db = new DbCon();
            BillDAO bdao = new BillImpl();
            Bill bill = new Bill();
            CustomerDAO cdao = new CustomerImpl();
            Customer customer = new Customer();
            AirlinesDAO adao = new AirlinesImpl();
            Airlines airlines = new Airlines();
            StaffDAO sdao = new StaffImpl();
            Staff staff = new Staff();
           
            ResultSet rs = bdao.getById(Integer.parseInt(txtSearch.getText()));
            int cust_id = 0;
            int air_id = 0;
            int staff_id = 0;
            while (rs.next()) {
                cust_id = rs.getInt("customer_id");
                air_id = rs.getInt("airlines_id");
                txtFlight.setText(rs.getString("flight_no"));
                txtSector.setText(rs.getString("sector"));
                txtPax.setText(String.valueOf(rs.getInt("pax_no")));
                txtDate.setText(rs.getString("flight_date"));
                txtCost.setText(String.valueOf(rs.getFloat("cost")));
                if (rs.getInt("cancel")==0){
                    txtStatus.setText("Not Void");
                }
                else{
                    txtStatus.setText("Void");
                }
                staff_id = rs.getInt("staff_id");
            }
            cmbCust.setSelectedItem(cdao.getName(cust_id));
            cmbAir.setSelectedItem(adao.getName(air_id));
           staff.setStaff_id(staff_id);
            sdao.getName(staff);
            txtStaff.setText(staff.getStaff_name());
            String add=String.valueOf(Integer.parseInt(txtPax.getText())*Float.parseFloat(txtCost.getText()));
            txtTotal.setText(add); 
        } catch (SQLException ex) {
            Logger.getLogger(SearchBill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchBill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCostFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCostFocusLost
if(txtCost.getText() != null || txtPax.getText() != null){
        String add=String.valueOf(Integer.parseInt(txtPax.getText())*Float.parseFloat(txtCost.getText()));
            txtTotal.setText(add); 
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txtCostFocusLost

    private void txtPaxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaxFocusLost
if(txtCost.getText() != null || txtPax.getText() != null){
        String add=String.valueOf(Integer.parseInt(txtPax.getText())*Float.parseFloat(txtCost.getText()));
            txtTotal.setText(add); 
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txtPaxFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbAir;
    private javax.swing.JComboBox<String> cmbCust;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFlight;
    private javax.swing.JTextField txtPax;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSector;
    private javax.swing.JTextField txtStaff;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
