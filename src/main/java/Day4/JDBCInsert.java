package Day4;

import java.sql.*;
import java.util.Scanner;
public class JDBCInsert {



    public static void main(String[] args) throws SQLException{
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\untitled2\\src\\main\\java\\Day4\\hr.db";
        String query = "insert into jobs values (?,?,?,?)";




        try (Connection coon = DriverManager.getConnection(url);){

            // ccmtit

            PreparedStatement st = coon.prepareStatement(query);
            // job id
            System.out.println("enter job id: ");
            int job_id = sc.nextInt();
            st.setInt(1,job_id);
            // sc.nextInt();
            sc.nextLine();

            System.out.println("enter job title: ");
            String job_titLe = sc.nextLine();
            st.setString(2,"job_title");

            System.out.println("enter job min: ");
            double min_salary = sc.nextDouble();
            st.setDouble(3,min_salary);


            System.out.println("enter job max:  ");
            double max_salary = sc.nextDouble();
            st.setDouble(4,max_salary);



            int rows = st.executeUpdate();
            System.out.println(rows+ "inserted update");

        }


    }
}