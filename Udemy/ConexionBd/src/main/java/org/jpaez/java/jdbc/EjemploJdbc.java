package org.jpaez.java.jdbc;

import java.sql.*;

public class EjemploJdbc {

    public static void main(String []args){
        String url = "jdbc:mysql://localhost:3306/java_curso";
        String username = "root";
        String password = "javier";
        try(Connection conn = DriverManager.getConnection(url,username,password);
            Statement stm = conn.createStatement();
            ResultSet resultado = stm.executeQuery("SELECT * FROM productos")){  //asi se hace un auto close de RESULTADO, STM, Y CONN

            while(resultado.next()) {
                System.out.print("Producto: " + resultado.getString("NOMBRE"));
                System.out.print(" | ");
                System.out.print("Precio:" + resultado.getInt("PRECIO"));
                System.out.print(" | ");
                System.out.println("Fecha Registro: " + resultado.getDate("FECHA_REGISTRO"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}