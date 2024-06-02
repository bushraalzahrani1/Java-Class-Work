package Day4;

import java.sql.*;


public class JDBCDemo {

    public static void main(String[] args) throws SQLException{

        String url = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\untitled2\\src\\main\\java\\Day4\\hr.db";
        String query = "select * from jobs";


        try (Connection conn = DriverManager.getConnection(url)){
            Statement st = conn.createStatement();
            ResultSet rs =st.executeQuery(query);


            while (rs.next()){
                Job j = new Job(rs);
                System.out.println(j);
            }
        }
    }


}

