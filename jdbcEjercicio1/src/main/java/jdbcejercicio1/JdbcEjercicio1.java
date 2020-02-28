package jdbcejercicio1;

import java.sql.*;

public class JdbcEjercicio1 {

    public static void main(String[] args) {
        //Cadena de conexion de MySql, el parametro useSSL es opcional
        String url = "jdbc:mysql://localhost:3306/repasomysql?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        // Cargamos el driver de mysql
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Creamos el objeto conexion
            Connection conexion = (Connection) DriverManager.getConnection(url, "root", "admin");
            // Creamos un objeto Statement
            Statement instruccion = conexion.createStatement();
            // Creamos el query
            String sql = "select idpersona, nombre, apellido, "
                          + "direccion, email, celular, idpais "
                          + "from personas";
            ResultSet result = instruccion.executeQuery(sql);
            while (result.next()) {
                System.out.print("Id Persona:" + result.getInt(1));
                System.out.print(" Nombre:" + result.getString(2));
                System.out.println(" Apellido:" + result.getString(3));
                System.out.print(" Direccion:" + result.getString(4));
                System.out.print(" Correo Electronico :" + result.getString(5));
                System.out.print(" Celular:" + result.getString(6));
                System.out.println(" Id Pais:" + result.getInt(7));     
            }
            // Cerrar cada uno de los objetos utilizados
            result.close();
            instruccion.close();
            conexion.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No cargo la BD!!!");
            e.printStackTrace();
        }
    }
    
}
