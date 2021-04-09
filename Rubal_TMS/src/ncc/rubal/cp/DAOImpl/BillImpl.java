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
import ncc.rubal.cp.dao.BillDAO;
import ncc.rubal.cp.entity.Bill;

/**
 *
 * @author dell
 */
public class BillImpl implements BillDAO {
    
    private DbCon con;
    Bill bill = new Bill();

    public BillImpl() {
        con = DbCon.getInstance();
    }

    @Override
    public void Insert(Bill bill) throws SQLException, ClassNotFoundException {
    con.connect();
        String sql = "insert into bills (customer_id, airlines_id, flight_no, sector,flight_date, pax_no, cost,staff_id,cancel) values"
                + "('" + bill.getCustomer_no()+ "','" + bill.getAirlines_no()+ "','"+ bill.getFlight_no() + "','" +bill.getSector() + "','" + bill.getFlight_date() +"','" + bill.getPax_no()+ "','" + bill.getCost()+ "','" + bill.getStaff_id() + "','" + 0+ "')";

        con.executeUpdate(sql);
       con.close();
    }

    @Override
    public ResultSet getById(int bill_id) throws SQLException, ClassNotFoundException {
 
    con.connect();
        String sql = "SELECT * from bills where bill_id="+"'" +  bill_id + "'";
        ResultSet rs = con.executeQuery(sql);
        return rs;
         
        
  
  
        
    }

    @Override
    public void update(Bill bill) throws SQLException, ClassNotFoundException {
   con.connect();
        System.out.println(bill.getCustomer_no());
         String sql = "update bills set customer_id="
                + "'" + bill.getCustomer_no()+ "',"
                + "airlines_id='" + bill.getAirlines_no()+ "',"
                + "flight_no='" +bill.getFlight_no() + "',"
                + "sector='" + bill.getSector() + "',"
                + "flight_date='" + bill.getFlight_date()+ "',"
                + "pax_no='" + bill.getPax_no()+ "',"
                
                + "cost='" + bill.getCost()+ "'"
                + "where bill_id=" + bill.getBill_no();

        con.executeUpdate(sql);
        con.close();
    }

    @Override
    public void Cancel(Bill bill) throws SQLException, ClassNotFoundException {
   con.connect();
        String sql = "update bills set cancel="
                + "'1'"
                + "where bill_id=" + bill.getBill_no();
        con.executeUpdate(sql);
        con.close();
    }

    @Override
    public int getId() throws SQLException, ClassNotFoundException {
      int bill_id=0;
       con.connect();
       String sql="Select MAX(bill_id) from bills";
       ResultSet rs=con.executeQuery(sql);
       while(rs.next()){
        bill_id= rs.getInt("MAX(bill_id)");
    }
       return bill_id;
    }
    
}
