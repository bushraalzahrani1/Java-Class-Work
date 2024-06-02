package Day4;
import Day4.Job;

import java.sql.*;
import java.util.ArrayList;

public class jobDAO {
    private static final String URL = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\untitled2\\src\\main\\java\\Day4\\hr.db";
    private static final String SELECT_ALL_JOBS = "select * from Jobs";
    private static final String SELECT_ONE_JOBS = "select * from Jobs where job_id = ?";
    private static final String INSERT_JOBS = "insert into Jobs values (?, ?, ? ,?)";
    private static final String UPDATE_JOBS = "update Jobs set job_title = ? ,min_salary = ?, max_salary = ? where job_id = ?";
    private static final String DELETE_JOBS = "delete from Jobs where job_id = ?";

    public void setInsertJobs(Job d) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(INSERT_JOBS);
        st.setInt(1, d.getJob_id());
        st.setString(2, d.getJob_title());
        st.setDouble(3, d.getMin_salary());
        st.setDouble(4, d.getMax_salary());
        st.executeUpdate();
    }

    public void setUpdateJobs(Job d) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(UPDATE_JOBS);
        st.setInt(1, d.getJob_id());
        st.setString(2, d.getJob_title());
        st.setDouble(3, d.getMin_salary());
        st.setDouble(4, d.getMax_salary());
        st.executeUpdate();
    }

    public void setUpdateJobs(int deptId) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(DELETE_JOBS);
        st.setInt(1, deptId);
        st.executeUpdate();
    }

    public Job selectJobs(int job_id) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(SELECT_ONE_JOBS);
        st.setInt(1, job_id);
        ResultSet rs = st.executeQuery();
        if(rs.next()) {
            return new Job(rs);
        }
        else {
            return null;
        }
    }

    public ArrayList<Job> selectAllJobs() throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(SELECT_ALL_JOBS);
        ResultSet rs = st.executeQuery();
        ArrayList<Job> jobs = new ArrayList<>();
        while (rs.next()) {
            jobs.add(new Job(rs));
        }

        return jobs;
    }
}