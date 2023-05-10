package com.ciq.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ciq.pojo.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private static Logger LOGS = LoggerFactory.getLogger(EmployeeDaoImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void save(Employee employee) {
		LOGS.info("dao impl save method start here ..........");
		int result = jdbcTemplate.update("insert into employee values(?,?,?)",
				new Object[] { employee.getId(), employee.getName(), employee.getSalary() });
		System.out.println(result);
		LOGS.info("save method result .........." + result);
		LOGS.info("dao impl save method ends here ..........");
	}

	public List<Employee> getEmployees() {
		LOGS.info("dao impl row mapper method ends here ..........");
		RowMapper<Employee> rowMapper = new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setSalary(rs.getDouble(3));
				return employee;
			}
		};
		LOGS.info("dao impl row mapper method ends here ..........");
		LOGS.info("dao impl jdbc template method executing query here ..........");
		List<Employee> emps = jdbcTemplate.query("select * from employee", rowMapper);
		LOGS.info("emps " + emps);
		return emps;
	}

	@Override
	public int update(Employee employee) {
		System.out.println("update method started here....");
		int result = jdbcTemplate.update("update employee set name=?, salary=? where id=?",
				new Object[] { employee.getName(), employee.getSalary(), employee.getId() });
		System.out.println(result);
		System.out.println("update method ends here....");
		return result;
	}

	@Override
	public int delete(int id) {
		LOGS.info("dao impl save method start here ..........");
		Employee employee = new Employee();
		LOGS.info("employee instanitiaed ..........");
		employee.setId(id);
		LOGS.info("employee id .........." + id);

		int result = jdbcTemplate.update("delete from employee  where id=?", new Object[] { employee.getId() });
		LOGS.info("employee result .........." + id);
		return result;
	}

	@Override
	public Employee getByID(int id) {
		return null;
	}

}
