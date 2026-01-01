package in.sp;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException{
        Employee emp = new Employee();

        emp.setEmpId(rs.getInt("emp_id"));
        emp.setEmpName(rs.getString("emp_name"));
        emp.setEmpSalary(rs.getInt("emp_salary"));

        return emp;
    }
}
