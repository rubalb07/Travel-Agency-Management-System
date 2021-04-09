/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.SQLException;
import ncc.rubal.cp.connection.DbCon;
import ncc.rubal.cp.view.Login;

/**
 *
 * @author dell
 */
public class MainProgram {

    private DbCon conn;

    public MainProgram() {
        conn = DbCon.getInstance();
    }
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       Login login = new Login();
        login.setVisible(true);

    }
    
}
