/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncc.rubal.cp.DAOImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import ncc.rubal.cp.connection.DbCon;
import ncc.rubal.cp.dao.CustomerDAO;
import ncc.rubal.cp.entity.Customer;

/**
 *
 * @author dell
 */
public class CustomerImpl implements CustomerDAO {
    
    private DbCon con;
    Customer customer = new Customer();

    public CustomerImpl() {
        con = DbCon.getInstance();
    }

    @Override
    public void insert(Customer customer) throws SQLException, ClassNotFoundException{
        con.connect();
        String sql = "insert into customer (customer_name, customer_phone, customer_address) values"
                + "('" + customer.getCustomer_name()+ "','" + customer.getCustomer_phone()+ "','"
                + customer.getCustomer_address() + "')";

        con.executeUpdate(sql);
       con.close();
    }

    @Override
    public void getById(Customer customer) throws SQLException, ClassNotFoundException {

        con.connect();
        String sql = "SELECT * from customer where customer_name=" + "'" +  customer.getCustomer_name()+ "'";
        ResultSet rs = con.executeQuery(sql);
        if (rs.next()) {
            customer.setCustomer_id(rs.getInt("customer_id"));
            customer.setCustomer_name(rs.getString("customer_name"));
            customer.setCustomer_phone(rs.getString("customer_phone"));
            customer.setCustomer_address(rs.getString("customer_address"));
     
        } else{
            JOptionPane.showMessageDialog(null,"Record Not Found");
        }
  
       
    }

    @Override
    public void delete(Customer customer) throws SQLException, ClassNotFoundException {
         con.connect();
        String sql = "delete from customer where customer_id=" + customer.getCustomer_id();
        con.executeUpdate(sql);
        con.close();
    }

    @Override
    public void update(Customer customer) throws SQLException, ClassNotFoundException {
    con.connect();
        String sql = "update customer set customer_name="
                + "'" + customer.getCustomer_name() + "',"
                + "customer_phone='" + customer.getCustomer_phone() + "',"
                + "customer_address='" + customer.getCustomer_address() + "'"
                + "where customer_id=" + customer.getCustomer_id();
        con.executeUpdate(sql);
        con.close();
    }

    @Override
    public String getName(int customer_id) throws SQLException, ClassNotFoundException {
        String a=null;
       con.connect();
        String sql = "SELECT * from customer where customer_id=" + "'" +  customer_id+ "'";
        ResultSet rs = con.executeQuery(sql);
        while (rs.next()) {
            a=rs.getString("customer_name"); 
            
        }
        return a; 
    }
    
    @Override
    public int getId(Customer customer) throws SQLException, ClassNotFoundException {
        int a=0;
       con.connect();
        String sql = "SELECT * from customer where customer_name=" + "'" +  customer.getCustomer_name()+ "'";
        ResultSet rs = con.executeQuery(sql);
        while (rs.next()) {
            a=rs.getInt("customer_id"); 
            
        }
        return a; 
    }
    
}
