/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acenta;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author castl
 */
public class dbase {
    
    int odaSayisiToplam = 13;
    OtelOdasi[] odalar = new OtelOdasi[odaSayisiToplam];
     
     
     
     
     public OtelOdasi[] GetOdalar(){
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/otel","root","12231223");
            
          Statement stmt = con.createStatement();
          ResultSet rs = stmt.executeQuery("SELECT * FROM "+"otelodasi ");
                  
            for(int i = 0; i < odaSayisiToplam; i++){
                rs.next();
                odalar[i] = new OtelOdasi(rs.getInt("ID"),rs.getString("AD"), rs.getString("KONUM"), rs.getBoolean("OTOPARK"), rs.getBoolean("WİFİ"), rs.getBoolean("HAVUZ"), rs.getBoolean("GYM"), rs.getBoolean("SPA"), rs.getBoolean("SEZON"), rs.getInt("ODA_NO"), rs.getInt("YATAK_SAYİSİ"), rs.getBoolean("TV"), rs.getBoolean("KONSOL"), rs.getDouble("METRE"), rs.getBoolean("MİNİBAR"),rs.getBoolean("REZERVE"));
                
            }
             con.close();
           return odalar; 
           
        } catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return odalar;
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return odalar;
        }
       
                
       
     }
     
     public void Rez(OtelOdasi oda){
         
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/otel","root","12231223");
           
          
         
          Statement stmt = con.createStatement();
        
        //  ResultSet rs = stmt.executeQuery("SELECT * FROM otelodasi ; SET SQL_SAFE_UPDATES = 0;  UPDATE otelodasi SET REZERVE=1 WHERE ID=0");
            //stmt.executeQuery("SELECT * FROM otelodasi ; SET SQL_SAFE_UPDATES = 0;  UPDATE otelodasi SET REZERVE=1 WHERE ID=0");
         
                  
            
             
         
           
        } catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
           
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
           
        }
         
         
         
         
     }
       
     
     
     
}
