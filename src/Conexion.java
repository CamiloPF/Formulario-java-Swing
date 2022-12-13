/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author USUARIO
 */
import java.sql.Connection; // Conexion
import java.sql.DriverManager; // Permite usar conectar sqlite
import java.sql.PreparedStatement; //Operaciones
import java.sql.ResultSet; //Obtener Resultado
import java.sql.SQLException; // Obtener Errores a nivel BD

public class Conexion {

    String nombreBDconConector = "jdbc:sqlite:reto4.s3db";
    Connection cn = null;  //variable de tipo conexion

    public String conectar() {
        try {
            Class.forName("org.sqlite.JDBC"); //Cargar Conector
            cn = DriverManager.getConnection(nombreBDconConector); // Conecto BD con java
            return "Conexion Exitosa";
        } catch (Exception e) {
            return "Error de conexion...";
        }
    }

    public String CerrarConexion() {
        try {
            cn.close();
            return "Conexion Cerrada Satisfactoriamente...";
        } catch (Exception e) {
            return "Error al cerrar la conexion...";
        }
    }

    public ResultSet ejecutarSQL(String instruccion,int tipo) {
        ResultSet rs = null;

        try {
            
            // insert, update, delete no devuelve respuesta
            // tipo maneja dos valores 
            // 1. ejecutar insert, update, delete
            // 2. ejecutar select
            
            PreparedStatement pt=cn.prepareStatement(instruccion);
            if(tipo==2){
                rs=pt.executeQuery();
            }
            else{
                pt.execute();
            }
            return rs;
        } catch  (SQLException e) {
            System.out.println("Error :" + e);
            
            return rs;
        }

    }

}

