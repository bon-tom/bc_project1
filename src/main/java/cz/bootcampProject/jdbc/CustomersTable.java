/**
 * 
 */
package cz.bootcampProject.jdbc;

/**
 * @author tomas.majda
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import com.oracle.tutorial.jdbc.JDBCTutorialUtilities;
/**
 * @author tomas.majda
 *
 */
public class CustomersTable 
{
	 private String dbName;
	 private Connection con;
	 private String dbms;

	 public CustomersTable(Connection connArg, String dbNameArg, String dbmsArg) 
	 {
	   super();
	   this.con = connArg;
	   this.dbName = dbNameArg;
	   this.dbms = dbmsArg;
	  }
	 
	 public static void createTable() throws SQLException 
	    {

	        System.out.println("-------- Oracle JDBC Connection Testing -createTableCustomers-Table------");
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	        	} catch (ClassNotFoundException e) 
	        			{
	        			System.out.println("Where is your Oracle JDBC Driver? -createTableCustomers-Table");
	        			e.printStackTrace();
	        			return;
	        			}
	        System.out.println("Oracle JDBC Driver Registered! -createTableCustomers-Table");
	        Connection connection = null;
	        try {
	            connection = DriverManager.getConnection("jdbc:oracle:thin:@10.29.8.35:1521:xe", "omajda", "8Tt9Orcamp");
	            
	            /***
	             * 
	             * Create a statement
	             */
	            //String dbName = "Bootcamp";
	            Statement stmt = null;
	          
	            String query = "create table OMAJDA.CustomersTableNE "
	            		+ " (C_DAY timestamp, C_ID int NOT NULL, "+
	            		"C_TYPE varchar(1), C_ORIGIN_DATE timestamp, "+
	            		"C_REL_DATE timestamp, C_LEGAL_ID varchar(24), C_NAME varchar(64), PRIMARY KEY (C_ID) )" ;
	            try {
	                stmt = connection.createStatement();
	                stmt.executeQuery(query);
	               // ResultSet rs = stmt.executeQuery(query);
	                /*while (rs.next()) 
	                {
	                    String coffeeName = rs.getString("COF_NAME");
	                    int supplierID = rs.getInt("SUP_ID");
	                    float price = rs.getFloat("PRICE");
	                    int sales = rs.getInt("SALES");
	                    int total = rs.getInt("TOTAL");
	                    System.out.println(coffeeName + "\t" + supplierID +
	                                       "\t" + price + "\t" + sales +
	                                       "\t" + total);
	                }*/
	            	} catch (SQLException e ) 
	            		{
	            		JDBCTutorialUtilities.printSQLException(e);
	            		} 
	            	//Closing Connections
	                finally {
	                if (stmt != null) { stmt.close(); }
	            }
	          
	            /***
	             * 
	             * 
	             */
	        	} catch (SQLException e) 
	        			{
	        			System.out.println("Connection Failed! Check output console -createTableCustomers-Table");
	        			e.printStackTrace();
	        			return;
	        			}

	        if (connection != null) 
	        	{
	            System.out.println("You made it, take control your database now! -createTableCustomers-Table");
	        	} else 
	        		{
	            System.out.println("Failed to make connection!");
	        		}
	    }
	 
	 
	 
	 public static void dropTable() throws SQLException 
	    {

	        System.out.println("-------- Oracle JDBC Connection Testing -dropTableCustomers-Table------");
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	        	} catch (ClassNotFoundException e) 
	        			{
	        			System.out.println("Where is your Oracle JDBC Driver? -dropTableCustomers-Table");
	        			e.printStackTrace();
	        			return;
	        			}
	        System.out.println("Oracle JDBC Driver Registered! -dropTableCustomers-Table");
	        Connection connection = null;
	        try {
	            connection = DriverManager.getConnection("jdbc:oracle:thin:@10.29.8.35:1521:xe", "omajda", "8Tt9Orcamp");
	            
	            /**** Create a statement
	             */
	            //String dbName = "Bootcamp";
	            Statement stmt = null;
	          
	            String query = "drop table CustomersTableNE ";
	            		
	            try {
	                stmt = connection.createStatement();
	                stmt.executeQuery(query);
	            	} catch (SQLException e ) 
	            		{
	            		JDBCTutorialUtilities.printSQLException(e);
	            		} 
	            	//Closing Connections
	                finally {
	                if (stmt != null) { stmt.close(); }
	            }
	          
	            /***
	             * 
	             * 
	             */
	        	} catch (SQLException e) 
	        			{
	        			System.out.println("Connection Failed! Check output console -dropTableCustomers-Table");
	        			e.printStackTrace();
	        			return;
	        			}

	        if (connection != null) 
	        	{
	            System.out.println("You made it, take control your database now! -dropTableCustomers-Table");
	        	} else 
	        		{
	            System.out.println("Failed to make connection! -dropTableCustomers-Table");
	        		}
	    }

	 public static void populateTablewithString(String ValueforCustomersTable) throws SQLException 
	    {

	        System.out.println("-------- Oracle JDBC Connection Testing -populateTableCustomers-Table----");
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	        	} catch (ClassNotFoundException e) 
	        			{
	        			System.out.println("Where is your Oracle JDBC Driver? -populateTableCustomers-Table");
	        			e.printStackTrace();
	        			return;
	        			}
	        System.out.println("Oracle JDBC Driver Registered! -populateTableCustomers-Table");
	        Connection connection = null;
	        try {
	            connection = DriverManager.getConnection("jdbc:oracle:thin:@10.29.8.35:1521:xe", "omajda", "8Tt9Orcamp");
	            
	            /***
	             * 
	             * Create a statement
	             */
	            //String dbName = "Bootcamp";
	            Statement stmt = null;
	          
	            //String query = "drop table CustomersTableNE ";
	            
	            //String query = "INSERT INTO CUSTOMERS (C_DAY, C_ID, C_TYPE, C_ORIGIN_DATE, C_REL_DATE, C_LEGAL_ID, C_NAME ) " + 
	            // 		"values (date '2015-04-30',67,'P', date '1972-02-28',date '2006-08-11','97912a4321dd510','49d180ecf56132819571bf39d9b7b34')";	
	            
	            //String query ="INSERT INTO CUSTOMERS (C_DAY, C_I, C_TYPE, C_ORIGIN_DATE, C_REL_DATE, C_LEGAL_ID, C_NAME ) \r\n" + 
	            // 		"values (DATE '2015-04-30',67,\"P\",DATE '1972-02-28', DATE '2006-08-11',\"97912a4321dd510\",\"49d180ecf56132819571bf39d9b7b34\")";
	            
	            String query = "INSERT INTO customers(C_DAY, C_ID, C_TYPE, C_ORIGIN_DATE, C_REL_DATE, C_LEGAL_ID, C_NAME ) " +
	            "values"+ ValueforCustomersTable;
	            System.out.println("Insert with string has been done! -populateTableCustomers-Table");   
	            
	            try {
	                stmt = connection.createStatement();
	                stmt.executeQuery(query);
	            	} catch (SQLException e ) 
	            		{
	            		JDBCTutorialUtilities.printSQLException(e);
	            		} 
	            	//Closing Connections
	                finally {
	                if (stmt != null) { stmt.close(); }
	            }
	          
	            /***
	             * 
	             * 
	             */
	        	} catch (SQLException e) 
	        			{
	        			System.out.println("Connection Failed! Check output console -populateTableCustomers-Table");
	        			e.printStackTrace();
	        			return;
	        			}

	        if (connection != null) 
	        	{
	            System.out.println("You made it, take control your database now! -populateTableCustomers-Table");
	        	} else 
	        		{
	            System.out.println("Failed to make connection! -populateTableCustomers-Table");
	        		}
	    }
	 
	 public static void populateTable() throws SQLException 
	    {

	        System.out.println("-------- Oracle JDBC Connection Testing -populateTableCustomers-Table----");
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	        	} catch (ClassNotFoundException e) 
	        			{
	        			System.out.println("Where is your Oracle JDBC Driver?");
	        			e.printStackTrace();
	        			return;
	        			}
	        System.out.println("Oracle JDBC Driver Registered!");
	        Connection connection = null;
	        try {
	            connection = DriverManager.getConnection("jdbc:oracle:thin:@10.29.8.35:1521:xe", "omajda", "8Tt9Orcamp");
	            
	            /***
	             * 
	             * Create a statement
	             */
	            //String dbName = "Bootcamp";
	            Statement stmt = null;
	          
	            
	           // String query = "INSERT INTO CUSTOMERS (C_DAY, C_ID, C_TYPE, C_ORIGIN_DATE, C_REL_DATE, C_LEGAL_ID, C_NAME )" + 
	            //		"values (date '2015-04-30,67','P',date '1972-02-28', date '2006-08-11','97912a4321dd510','49d180ecf56132819571bf39d9b7b34')";	
	            
	            String query = "INSERT INTO customers(C_DAY, C_ID, C_TYPE, C_ORIGIN_DATE, C_REL_DATE, C_LEGAL_ID, C_NAME ) " +
	    	            "values (DATE '2015-04-30',67,'P',DATE '1972-02-28', DATE '2006-08-11','97912a4321dd510','de')";
	            System.out.println("Insert has been done!");          
	        
	            
	            try {
	                stmt = connection.createStatement();
	                stmt.executeQuery(query);
	            	} catch (SQLException e ) 
	            		{
	            		JDBCTutorialUtilities.printSQLException(e);
	            		} 
	            	//Closing Connections
	                finally {
	                if (stmt != null) { stmt.close(); }
	            }
	          
	            /***
	             * 
	             * 
	             */
	        	} catch (SQLException e) 
	        			{
	        			System.out.println("Connection Failed! Check output console");
	        			e.printStackTrace();
	        			return;
	        			}

	        if (connection != null) 
	        	{
	            System.out.println("You made it, take control your database now!");
	        	} else 
	        		{
	            System.out.println("Failed to make connection!");
	        		}
	    }

	 public static void populateCustomersTablewithFile(String[] csvCustomersTable) throws SQLException 
		{
			
			System.out.println("-------- Oracle JDBC Connection Testing -populateTableCustomers-Table-----");
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	        	} catch (ClassNotFoundException e) 
	        			{
	        			System.out.println("Where is your Oracle JDBC Driver? -populateTableCustomers-Table");
	        			e.printStackTrace();
	        			return;
	        			}
	        System.out.println("Oracle JDBC Driver Registered! -populateTableCustomers-Table");
	        Connection connection = null;
	        try {
	           
	            //String [] pokus = null; 
	            //pokus = csvReaderII.readCSV(csvAccountsTable);
	            //System.out.println("AccountTable"+Arrays.toString(pokus));
	           
	            connection = DriverManager.getConnection("jdbc:oracle:thin:@10.29.8.35:1521:xe", "omajda", "8Tt9Orcamp");
	            
	            Statement stmt = null;

	            System.out.println("CustomersTable"+Arrays.toString(csvCustomersTable));
	            
	           /* INSERT INTO CUSTOMERS (C_DAY, C_ID, C_TYPE, C_ORIGIN_DATE, C_REL_DATE, C_LEGAL_ID, C_NAME ) 
	            values (DATE '2015-04-30',171,"P",DATE '1941-02-04', DATE '2014-09-21',"1c5d0cb4dfa3230","284de502c9847342318c17d474733ef");

	            INSERT INTO CUSTOMERS (C_DAY, C_ID, C_TYPE, C_ORIGIN_DATE, C_REL_DATE, C_LEGAL_ID, C_NAME ) 
	            values (2015-04-30,343,"P",1948-02-10,1976-04-09,"78ab011ae682558", );

	            */
	            
	            String query2 = "INSERT INTO Customers886 " + 
	            	//	"(C_DAY, C_ID, C_TYPE, C_ORIGIN_DATE"+
	            	//	", C_ID, C_TYPE, C_ORIGIN_DATE, C_REL_DATE, C_LEGAL_ID, C_NAME+
	            	//	")"+
	            		"VALUES (date '" +csvCustomersTable[0]+"',"+ csvCustomersTable[1]+", '"+
	            		csvCustomersTable[2]+"'"+", date '"+csvCustomersTable[3] +"',"+
	            		//"',date '"+csvCustomersTable[4]+"','"+
	            		"'"+csvCustomersTable[5]+"','"+csvCustomersTable[6]+"'"+
	            		")";
	            
	            
	            System.out.println(query2);
	            try {
	                stmt = connection.createStatement();
	                //stmt.executeQuery(query1);
	                
	                //stmt.executeUpdate(query1);
	                stmt.executeUpdate(query2);
	            	} catch (SQLException e ) 
	            		{
	            		JDBCTutorialUtilities.printSQLException(e);
	            		} 
	            
	            
	            	//Closing Connections
	                finally {
	                if (stmt != null) { stmt.close(); }
	                }
	          

	        	} catch (SQLException e) 
	        			{
	        			System.out.println("Connection Failed! Check output console -populateTableCustomers-Table");
	        			e.printStackTrace();
	        			return;
	        			}

	        if (connection != null) 
	        	{
	            System.out.println("You made it, take control your database now! -populateTableCustomers-Table");
	        	} else 
	        		{
	            System.out.println("Failed to make connection!");
	        		}
		 
	    }
}
