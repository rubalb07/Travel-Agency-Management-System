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
import ncc.rubal.cp.dao.StaffDAO;
import ncc.rubal.cp.entity.Staff;

/**
 *
 * @author dell
 */
public class StaffImpl implements StaffDAO {
    
    private DbCon con;
    Staff staff = new Staff();

    public StaffImpl() {
        con = DbCon.getInstance();
    }

    @Override
    public void insert(Staff staff) throws SQLException, ClassNotFoundException {
   con.connect();
        String sql = "insert into staff (staff_name, staff_phone, staff_address, username,password,admin) values"
                + "('" + staff.getStaff_name()+ "','" + staff.getStaff_phone()+ "','"
                + staff.getStaff_address() + "','"
                + staff.getStaff_username()+ "','"
                + staff.getStaff_password()+ "','"
                + 0 + "')";

        con.executeUpdate(sql);
       con.close();
    }

    @Override
    public ArrayList<Staff> getAllStaff() throws SQLException, ClassNotFoundException {
    ArrayList<Staff> StaffList = new ArrayList<>();
        con.connect();
        String sql = "SELECT * from staff";
        ResultSet rs = con.executeQuery(sql);
        while (rs.next()) {
            Staff staff;
            staff = new Staff(rs.getString("staff_name"), rs.getString("staff_phone"),rs.getString("staff_address"));
            staff.setStaff_name(rs.getString("staff_name"));
            staff.setStaff_id(rs.getInt("staff_id"));
            staff.setStaff_phone("staff_phone");
            staff.setStaff_address("staff_address");
            StaffList.add(staff);
        }
        return StaffList;
    }

    @Override
    public void update(Staff staff) throws SQLException, ClassNotFoundException {
   con.connect();
        String sql = "update staff set staff_name="
                + "'" + staff.getStaff_name() + "',"
                + "staff_phone='" + staff.getStaff_phone() + "',"
                + "staff_address='" + staff.getStaff_address() + "'"
                + "where staff_id=" + staff.getStaff_id();
        con.executeUpdate(sql);
        con.close();
    }

    @Override
    public void delete(Staff staff) throws SQLException, ClassNotFoundException {
   con.connect();
        String sql = "delete from staff where staff_id=" + staff.getStaff_id();
        con.executeUpdate(sql);
        con.close();
    }

    @Override
    public int login(String username, String password) throws SQLException, ClassNotFoundException {
   try{
      
       int admin=0;
           con.connect();
            String sql = "select * from staff where username='"+username+"'"+"AND password='"+password+"'";
             ResultSet rs=con.executeQuery(sql);
        while (rs.next()) {
            admin=rs.getInt("admin");
                staff.setStaff_id(rs.getInt("staff_id"));
                if(admin==1){
                    return 2;
                }else{
                return 1;
                }
        }
        con.close();
        
   }
        catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        
      return 0;  
    }

    @Override
    public int getByUser(String username) throws SQLException, ClassNotFoundException {
    con.connect();
        String sql = "SELECT * from staff where username=" + "'" +  username+ "'";
        ResultSet rs = con.executeQuery(sql);
        if (rs.next()) {
            int staff_id=rs.getInt("staff_id");
     return staff_id;
        } 
       return 0;
    }
    

    @Override
    public void getName(Staff staff) throws SQLException, ClassNotFoundException {
con.connect();
        String sql = "SELECT * from staff where staff_id="+"'" +  staff.getStaff_id() + "'";
        ResultSet rs = con.executeQuery(sql);
        while (rs.next()) {
            staff.setStaff_name(rs.getString("staff_name"));
            staff.setStaff_address(rs.getString("staff_address"));
            staff.setStaff_phone(rs.getString("staff_phone"));
            staff.setStaff_id(rs.getInt("staff_id"));
            
            
        }
        con.close();
        }
        

}

    

