package in.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        // --------------------INSERT OPERATION---------------------------
//        String std_rollno = "104";
//        String std_name = "Riad";
//        String std_marks = "96.5";
//
//        String insert_sql_query = "INSERT INTO student VALUES(?,?,?)";
//        int count = jdbcTemplate.update(insert_sql_query, std_rollno, std_name, std_marks);
//        if(count>0){
//            System.out.println("Insertion Success");
//        }
//        else System.out.println("Insertion Failed");

        //----------------------UPDATE OPERATION---------------------------
//        String rollno = "101";
//        String marks = "98.3";
//
//        String update_sql_query = "UPDATE student SET std_marks=? WHERE std_roll=?";
//        int count = jdbcTemplate.update(update_sql_query, marks, rollno);
//        if(count>0) System.out.println("Updation Success");
//        else System.out.println("Updation Failed");

        //----------------------DELETE OPERATION-------------------------------
//        String rollNo = "102";
//
//        String delete_sql_query = "DELETE FROM student WHERE std_roll=?";
//        int count = jdbcTemplate.update(delete_sql_query, rollNo);
//
//        if(count>0) System.out.println("Deletion Success");
//        else System.out.println("Deletion Failed");

        //----------------------SELECT OPERATION---------------------------------
//        String select_sql_query = "SELECT * FROM student";
//
//        List<Student> std_list = jdbcTemplate.query(select_sql_query, new StudentRowMapper());
//
//        for(Student std: std_list){
//            System.out.println("RollNo: "+std.getRollno());
//            System.out.println("Name: "+std.getName());
//            System.out.println("Marks: "+std.getMarks());
//            System.out.println("------------------------");
//        }

        //----------------------SELECT OPERATION 2 ---------------------------------
        String rollNo = "102";
        String select_sql_query = "SELECT * FROM student WHERE std_roll=?";

        Student std = jdbcTemplate.queryForObject(select_sql_query, new StudentRowMapper(), rollNo);

        System.out.println("RollNo: "+std.getRollno());
        System.out.println("Name: "+std.getName());
        System.out.println("Marks: "+std.getMarks());
    }
}