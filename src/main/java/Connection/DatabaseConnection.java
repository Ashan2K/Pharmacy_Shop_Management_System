package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {


    private static String url = "jdbc:mysql://localhost:3306/pharmacydb";

    private static  String user = "root";

    private static String pw = "1234";




    private Connection myCon = null;

    public static Connection ConnectionDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection contact = DriverManager.getConnection(url,user,pw);

            return contact;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
