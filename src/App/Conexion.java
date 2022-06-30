/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

//import com.sun.jdi.connect.spi.Connection;
// librerias de sql server para realizar la conexion 
//  sql.Connection  sql .DriverManager sql.SQLException
import  java.sql.Connection;     // sql 
import java .sql.DriverManager;   // sql 
import javax.swing.JOptionPane;
import java .sql.SQLException;   // sql 


/**
 *
 * juan esteban gomez pachon 
 * innova colombia 
 * Estructura de datos 
 * juanesteban.gomez2002@gmail.com
 */
public class Conexion {
     public static Connection getConexion(){
        
                  // saber el hostname de su pc
        String url = "jdbc:sqlserver://LAPTOP-HL1GPUVI:1433;"
                +"database=InnovaColombia;"  // esta es mi base de datos
                +"user=sa;" // usuario de mi base de datos
                +"password=1233;";// contraseña
        
        
        try{
            
            Connection con = DriverManager.getConnection(url);
            return con ;
            
        }catch(SQLException e ){
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
            
            
            
        }
        
        
        
        
    }
    
}  
    

