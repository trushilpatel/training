package Learn;

import javax.swing.plaf.nimbus.State;
import javax.xml.transform.Result;
import java.sql.*;
public class JDBCExa2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/product",
                    "root", "1234");

            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from master;");

            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println(rsmd.getColumnName(1) + rsmd.getColumnName(2) +rsmd.getColumnName(3)  );
            System.out.println(rsmd.getColumnClassName(1));
            rs.last();
            System.out.println(rs.getString(1));




            while (rs.previous()){
                System.out.println(rs.getString(2));
            }



        } catch (ClassNotFoundException | SQLException c){
            System.out.println(c.getMessage());
        }


    }
}
