import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

class Main {
    private final static String UserName = "root";
    private final static String Password = "root";
    private final static String URL = "jdbc:mysql://127.0.0.1:3306/users?autoReconnect=true&useUnicode=true&characterEncoding=UTF-8";



    public static void main(String[] args) throws SQLException {
        Connection connection = null;
      //  Driver driver;

       // try {
           // driver = new FabricMySQLDriver();
       // }
        //catch(SQLException ex){
         //   System.out.println("Произошла ошибка при создание драйвера. Ошибка №1");
          //  ex.printStackTrace();
           // return;
        //}
        //try{
            //DriverManager.registerDriver(driver);
        //}
       // catch (SQLException ex){
       //     System.out.println("Не удалось зарегистрировать драйвер. Ошибка №2");
       //     ex.printStackTrace();
       // }
        try{
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection(URL,UserName,Password);
            System.out.println("coooodeee.....");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Не удалось создать соединение!");
            ex.printStackTrace();
            return;
        }
        finally {
            if (connection != null)
                connection.close();
        }
    }
}

