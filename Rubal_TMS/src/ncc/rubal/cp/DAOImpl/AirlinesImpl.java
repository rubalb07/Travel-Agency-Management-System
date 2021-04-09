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
import ncc.rubal.cp.dao.AirlinesDAO;
import ncc.rubal.cp.entity.Airlines;
import ncc.rubal.cp.entity.Airlines;


/**
 *
 * @author dell
 */
public class AirlinesImpl implements AirlinesDAO {
    
    private DbCon con;
    Airlines airlines = new Airlines();

    public AirlinesImpl() {
        con = DbCon.getInstance();
    }

    @Override
    public void insert(Airlines airlines) throws SQLException, ClassNotFoundException {
   con.connect();
        String sql = "insert into airlines (airlines_name, airlines_phone, airlines_address) values"
                + "('" + airlines.getAirlines_name()+ "','" + airlines.getAirlines_phone()+ "','"
                + airlines.getAirlines_address() + "')";

        con.executeUpdate(sql);
       con.close();
    }

    @Override
    public void getById(Airlines airlines) throws SQLException, ClassNotFoundException {
        con.connect();
        String sql = "SELECT * from airlines where airlines_name="+"'" +  airlines.getAirlines_name()+ "'";
        ResultSet rs = con.executeQuery(sql);
        if (rs.next()) {
            airlines.setAirlines_name(rs.getString("airlines_name"));
            airlines.setAirlines_id(rs.getInt("airlines_id"));
            airlines.setAirlines_phone(rs.getString("airlines_phone"));
            airlines.setAirlines_address(rs.getString("airlines_address"));
            
            
        }else{
            JOptionPane.showMessageDialog(null,"Record Not Found");
        }
        con.close();
        
    }

    @Override
    public void update(Airlines airlines) throws SQLException, ClassNotFoundException {
    
        con.connect();
        String sql = "update airlines set airlines_name="
                + "'" + airlines.getAirlines_name() + "',"
                + "airlines_phone='" + airlines.getAirlines_phone() + "',"
                + "airlines_address='" + airlines.getAirlines_address() + "'"
                + "where airlines_id=" + airlines.getAirlines_id();
        con.executeUpdate(sql);
        con.close();
    }

    @Override
    public void delete(Airlines airlines) throws SQLException, ClassNotFoundException {
   con.connect();
        String sql = "delete from airlines where airlines_id=" + airlines.getAirlines_id();
        con.executeUpdate(sql);
        con.close();
    }

    @Override
    public int getId(Airlines airlines) throws SQLException, ClassNotFoundException {
        int a=0;
        con.connect();
        String sql = "SELECT * from airlines where airlines_name="+"'" +  airlines.getAirlines_name()+ "'";
        ResultSet rs = con.executeQuery(sql);
        while (rs.next()) {
            a=rs.getInt("airlines_id");
            
        }
        con.close();
        return a;
    }
     @Override
    public String getName(int airlines_id) throws SQLException, ClassNotFoundException {
        String a=null;
       con.connect();
        String sql = "SELECT * from airlines where airlines_id=" + "'" +  airlines_id+ "'";
        ResultSet rs = con.executeQuery(sql);
        while (rs.next()) {
            a=rs.getString("airlines_name"); 
            
        }
        return a; 
    }

    
    
}
