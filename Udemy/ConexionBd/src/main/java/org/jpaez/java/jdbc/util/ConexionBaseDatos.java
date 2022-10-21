package org.jpaez.java.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBaseDatos {

    //variables staticas se pueden llamar sin necesidad de instanciar el objeto y se pueden acceder directamente
    private static String url = "jdbc:mysql://localhost:3306/java_curso";
    private static String username = "root";
    private static String password = "javier";
    private static Connection connection;

    public static Connection getInstancia(){
        if(connection == null){
            connection = DriverManager.getConnection(url,username,password);
        }
    }
}
