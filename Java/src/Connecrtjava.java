import java.beans.Statement;
import java.sql.Connection;

public class Connecrtjava {
    public static void main(String[] args) {
        
        //Register driver 
        class.forName("Com.mysql.jdbc.driver");

        //Create Connection
        Connection  con = DriverManger.getConnection("url","user","Password");

        //create statement
        Statement stmt = con.createStatement();

        Reseult rs = stmt.executeQuery("Select * from emp");

        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+ rs.getString(2));
        }
        con.close();

    }
}
