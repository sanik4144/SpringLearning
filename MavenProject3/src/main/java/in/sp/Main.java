package in.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        NamedParameterJdbcTemplate npJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("key_rollno", "105");
        map.put("key_name", "Arifin");
        map.put("key_marks", "88.1");

        String insert_sql_query = "INSERT INTO student VALUES(:key_rollno, :key_name, :key_marks)";
        int count = npJdbcTemplate.update(insert_sql_query, map);
        if(count>0) System.out.println("Insertion Success");
        else System.out.println("Insertion Failed");

    }
}