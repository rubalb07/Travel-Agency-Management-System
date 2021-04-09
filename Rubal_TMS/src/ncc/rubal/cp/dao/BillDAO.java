/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncc.rubal.cp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import ncc.rubal.cp.entity.Bill;

/**
 *
 * @author dell
 */
public interface BillDAO {
    
    public void Insert(Bill bill) throws SQLException, ClassNotFoundException;
    public ResultSet getById(int bill_id) throws SQLException, ClassNotFoundException;
 
    public void update(Bill bill) throws SQLException, ClassNotFoundException;
    public void Cancel(Bill bill) throws SQLException, ClassNotFoundException;
    public int getId() throws SQLException, ClassNotFoundException;
    
}
