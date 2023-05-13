package com.ciq.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ciq.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}

	public void save(Employee employee) {
		int result = jdbcTemplate.update("insert into employee values(?,?,?)",
				new Object[] { employee.getId(), employee.getName(), employee.getSalary() });
		System.out.println(result);

	}

	public List<Employee> getEmployees() {
//		LOGS.info("dao impl row mapper method ends here ..........");
//		RowMapper<Employee> rowMapper = new RowMapper<Employee>() {
//			@Override
//			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Employee employee = new Employee();
//				employee.setId(rs.getInt(1));
//				employee.setName(rs.getString(2));
//				employee.setSalary(rs.getDouble(3));
//				LOGS.info(" row mapper  ..........");
//				return employee;
//			}
//		};
//		LOGS.info("dao impl row mapper method ends here ..........");
//		LOGS.info("dao impl jdbc template method executing query here ..........");
//		List<Employee> emps = jdbcTemplate.query("select * from employee", rowMapper);
//		LOGS.info("emps " + emps);
//		return emps;
		List<Employee> emps = jdbcTemplate.query("select * from employee", new EmployeeRowMapper());
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
		Employee employee = new Employee();
		employee.setId(id);

		int result = jdbcTemplate.update("delete from employee  where id=?", new Object[] { employee.getId() });
		return result;
	}

	@Override
	public Employee getByID(int id) {
//		Employee employee = new Employee();
//		employee.setId(id);
		Employee employee = jdbcTemplate.queryForObject("select * from employee where id=?",
				new BeanPropertyRowMapper<Employee>(Employee.class), id);
		return employee;
	}

	@Override
	public List<Employee> findAllEmps() {
		return jdbcTemplate.query("select * from employee", new EmployeeResultsetExtractor());
	}

	@Override
	public List<Employee> getEmps() {
		return jdbcTemplate.query("select * from employee", new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	// get by id, get by name

	public void getProcedureCall(int id) {
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("employeeGetByID");
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();
		namedParameters.addValue("t_id", id);
		Map<String, Object> result = simpleJdbcCall.execute(namedParameters);
		System.out.println(result);
	}

	@Override
	@Transactional
	public int batchUpdate(List<Employee> emps) {
		String sql = "insert into employee values(?,?,?)";

		int[] results = jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Employee employee = emps.get(i);
				ps.setInt(1, employee.getId());
				ps.setString(2, employee.getName());
				ps.setDouble(3, employee.getSalary());

			}

			@Override
			public int getBatchSize() {
				return emps.size();
			}
		});
		int count = 0;
		for (int i = 0; i < results.length; i++) {
			if (results[i] == 1) {
				count++;
			}
		}
		System.out.println(Arrays.toString(results));
		System.out.println(count);
		return count;
	}

}
