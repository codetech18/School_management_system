package schoolmanagementsystems;
import java.sql.*;
/**
 *
 * @author Akorede Alao
 */
public class ConnectionProvider  {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagementsystem","root","");
            return con;
//            Statement sm = con.createStatement();
//            ResultSet rs = sm.executeQuery("Select * from employee");
//        while(rs.next())
//            System.out.println("Database Connected");
//            con.close();
        }catch(Exception e){
                System.out.println(e);
                }
        return null;
        
    }
    
}
