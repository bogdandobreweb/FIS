package CLASS;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author 1BestCsharp
 */
public class DB_INFO {
    
    private static String dbname = "osalogin";
    private static String username = "dobre310899";
    private static String password = "Vegeta99@";
    
       static Connection con=null;
    public static Connection getConnection()
    {
        if (con != null) return con;
        // get db, user, pass from settings file
        return getConnection(dbname, username, password);
    }

    private static Connection getConnection(String db_name,String user_name,String password)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db_name+"?serverTimezone=GMT",user_name,password);
            System.out.println("connected");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return con;        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  /*  
    public static Connection getConnection(){
        
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/"+dbname, username, password);
            System.out.println("connected");
        } catch (Exception ex) {
            System.out.println("not connected");
        }
        
        return con;
        
    }
    
   */ 
}
