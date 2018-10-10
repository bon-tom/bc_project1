package cz.bootcampProject1.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.jws.WebMethod;
/*import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;*/
import javax.sql.DataSource;


public class Jdbc1 
{

	@Resource(mappedName = "java:/jboss/datasources/ExampleDS")
	private DataSource ds;

	@WebMethod
	public void testJdbc1() 
	{
		try (Connection con = ds.getConnection()) {
			PreparedStatement ps = con.prepareStatement("SELECT * FROM HR.DEPARTMENTS");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("DEPARTMENT_ID");
				String name = rs.getString("DEPARTMENT_NAME");
				System.out.println(id + "; " + name);
			}
		} catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}

	@WebMethod
	public void testTx1() 
	{
		try (Connection con = ds.getConnection()) {
			PreparedStatement ps = con.prepareStatement(
					"insert into test1_table (id,val1) values (?,?)");
			ps.setInt(1, 1500);
			ps.setString(2, "Hello world");
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}


	@WebMethod
	public void testTx2() 
	{
		try (Connection con = ds.getConnection()) {
			PreparedStatement ps = con.prepareStatement(
					"insert into test1_table (id,val1) values (?,?)");
			ps.setInt(1, 1600);
			ps.setString(2, "Hello world");
			ps.executeUpdate();
			
			if (true)
				throw new IllegalStateException("true");
		} catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}
        

}