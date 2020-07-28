package Learn;

import java.sql.*;

public class JDBCExa {
    public static void main(String[] args){
        try {
            Class c = Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/product",
                                                    "root", "1234");
            con.setAutoCommit(false);


            PreparedStatement ps = con.prepareStatement("update master set product_name = ?, price = 8230 Where product_no = 6;");
            ps.addBatch("insert into master values(51,'Hello',20);");
            ps.addBatch("insert into master values(52,'Hello',20);");
            ps.executeBatch();

            ps.setString(1,"Monitor");
           //ps.setInt(2,590);
            ps.executeUpdate();
            Statement sm = con.createStatement();
            ResultSet rss = sm.executeQuery("select * from master;");
            while (rss.next()){
                System.out.println(rss.getInt(1) + "\t" +rss.getString(2) + "\t" +
                        rss.getFloat(3) + "\t" );

            }

            con.close();
        } catch ( ClassNotFoundException | SQLException s){
            System.out.println(s);
        }


    }
}
