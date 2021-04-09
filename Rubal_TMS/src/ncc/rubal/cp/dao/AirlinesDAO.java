/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncc.rubal.cp.dao;


import java.sql.SQLException;
import java.util.ArrayList;
import ncc.rubal.cp.entity.Airlines;

/**
 *
 * @author dell
 */
public interface AirlinesDAO {
    
    public void insert(Airlines airlines) throws SQLException,ClassNotFoundException;
    public void getById(Airlines airlines) throws SQLException,ClassNotFoundException;
    public void update(Airlines airlines) throws SQLException,ClassNotFoundException;
    public void delete(Airlines airlines) throws SQLException,ClassNotFoundException;
    public int getId(Airlines airlines) throws SQLException,ClassNotFoundException;
     public String getName(int customer_id) throws SQLException, ClassNotFoundException;
    
}
