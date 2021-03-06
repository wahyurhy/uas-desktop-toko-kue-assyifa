/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.assyifacake.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class KoneksiDatabase {
        
        private static Properties propert = new Properties();
        private static Connection conn;
        public static Connection getConnection() throws SQLException {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String path = new File("src/main/java/com/assyifacake/db/KonfigurasiDatabase.properties").getAbsolutePath();
                propert.load(new FileInputStream(path));
                conn = DriverManager.getConnection(propert.getProperty("jdbc.url"), propert.getProperty("jdbc.username"), propert.getProperty("jdbc.password"));
                
            } catch (ClassNotFoundException | IOException ex) {
                Logger.getLogger(KoneksiDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
            return conn;
        
    }
}
