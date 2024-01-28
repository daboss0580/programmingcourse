import java.sql.*;

public class JDBCStatements {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/holla_employees", "root", "root");
            System.out.println("Connected");
            statement=connection.createStatement();
            //statement.execute("create table dev_team(id_no int(3), emp_name varchar(40), emp_job_title varchar(30))");
            //System.out.println("Table created");
            /***statement.executeUpdate("insert into dev_team values (001, 'Cliff Williams', 'Developer')");
            statement.executeUpdate("insert into dev_team values (002, 'Kelly Dawson', 'Developer')");
            statement.executeUpdate("insert into dev_team values (003, 'Felix Moore', 'QA')");
            statement.executeUpdate("insert into dev_team values (004, 'Anna Stone', 'Developer')");
            System.out.println(" Records Inserted");*/
            //statement.executeUpdate("update dev_team set emp_job_title='QA'");
            //System.out.println(n+ " records Updated");
            //int n = statement.executeUpdate("delete from dev_team");
            //System.out.println(n+ " Records deleted");
            ResultSet resultSet=statement.executeQuery("select * from dev_team");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id_no")+". "+resultSet.getString("emp_name")+", "+resultSet.getString("emp_job_title"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            try {
                if (statement !=null){
                    statement.close();
                }
                if (connection !=null){
                    connection.close();
                }
            }catch (Exception e){
                System.out.println(e);
            }


        }
    }
}
