package collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcPreparedStatementDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Employee id and hit ENTER:");
        int id_no=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Employee full name and hit ENTER:");
        String emp_name=scanner.nextLine();
        System.out.println("Enter Job title and hit ENTER:");
        String emp_job_title=scanner.nextLine();
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/holla_employees","root","root");
            preparedStatement=connection.prepareStatement("insert into dev_team values(?,?,?)");
            preparedStatement.setInt(1, id_no);
            preparedStatement.setString(2,emp_name);
            preparedStatement.setString(3,emp_job_title);
            preparedStatement.executeUpdate();
            System.out.println("Inserted");
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            try {


                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
