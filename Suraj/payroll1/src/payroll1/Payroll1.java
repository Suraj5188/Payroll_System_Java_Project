/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package payroll1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author suraj
 */
public class Payroll1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll?autoReconnect=true&useSSL=false", "root", "System@2002");
            System.out.println(con);
            if(con!=null){
                login1 obj = new login1();
                obj.setVisible(true);
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Payroll1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
