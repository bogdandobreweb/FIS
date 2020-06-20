import java.sql.Connection;
import java.sql.DriverManager;
public class AvoidSQLWarnDemo {
   public static void main(String[] args) {
      String JdbcURL = "jdbc:mysql://localhost:8080/phpMyAdmin" + "autoReconnect=true&useSSL=false";
      String Username = "root";
      String password = "root061299";
      Connection con = null;
      try {
         con = DriverManager.getConnection(JdbcURL, Username, password);
         System.out.println("Your JDBC URL is as follows:" + JdbcURL);
      } catch (Exception exec) {
         exec.printStackTrace();
      }
   }
}
