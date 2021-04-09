/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncc.rubal.cp.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import ncc.rubal.cp.entity.Staff;

/**
 *
 * @author dell
 */
public interface StaffDAO {
    
    public void insert(Staff staff) throws SQLException, ClassNotFoundException;
    public ArrayList<Staff> getAllStaff() throws SQLException, ClassNotFoundException;
    public void update(Staff staff) throws SQLException, ClassNotFoundException;
    public void delete(Staff staff) throws SQLException, ClassNotFoundException;
    public int login(String username, String password) throws SQLException, ClassNotFoundException;
    public int getByUser(String username) throws SQLException, ClassNotFoundException ;
    public void getName(Staff staff) throws SQLException, ClassNotFoundException;
}
