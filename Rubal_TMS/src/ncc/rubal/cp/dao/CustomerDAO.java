/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncc.rubal.cp.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import ncc.rubal.cp.entity.Customer;

/**
 *
 * @author dell
 */
public interface CustomerDAO {
        
        public void insert(Customer customer) throws SQLException, ClassNotFoundException;
        public String getName(int customer_id) throws SQLException, ClassNotFoundException;
        public void getById(Customer customer) throws SQLException, ClassNotFoundException;
        public void delete(Customer customer)throws SQLException, ClassNotFoundException;
        public void update(Customer customer)throws SQLException, ClassNotFoundException;
        public int getId(Customer customer) throws SQLException, ClassNotFoundException;
    
}
