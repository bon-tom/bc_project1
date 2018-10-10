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
public class TransactionsTable 

{
	  private String dbName;
	  private Connection con;
	  private String dbms;

	  public TransactionsTable(Connection connArg, String dbNameArg, String dbmsArg) 
	  {
	    super();
	    this.con = connArg;
	    this.dbName = dbNameArg;
	    this.dbms = dbmsArg;
	  }
	  
	/*  public void createTable() throws SQLException 
	  {
	    String createString =
	      "create table TRANSACTIONS " + "(SUP_ID integer NOT NULL, " +
	      "SUP_NAME varchar(40) NOT NULL, " + "STREET varchar(40) NOT NULL, " +
	      "CITY varchar(20) NOT NULL, " + "STATE char(2) NOT NULL, " +
	      "ZIP char(5), " + "PRIMARY KEY (SUP_ID))";
	    Statement stmt = null;
	    try {
	      stmt = con.createStatement();
	      stmt.executeUpdate(createString);
	    } catch (SQLException e) {
	      JDBCTutorialUtilities.printSQLException(e);
	    } finally {
	      if (stmt != null) { stmt.close(); }
	    }
	  }*/
	  
	  
	  public static void createTable() throws SQLException 
	    {

	        System.out.println("-------- Oracle JDBC Connection Testing -createTableTransactions-Table-----");
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	        	} catch (ClassNotFoundException e) 
	        			{
	        			System.out.println("Where is your Oracle JDBC Driver? -createTableTransactions-Table");
	        			e.printStackTrace();
	        			return;
	        			}
	        System.out.println("Oracle JDBC Driver Registered! -createTableTransactions-Table");
	        Connection connection = null;
	        try {
	            connection = DriverManager.getConnection("jdbc:oracle:thin:@10.29.8.35:1521:xe", "omajda", "8Tt9Orcamp");
	            
	            /***
	             * 
	             * Create a statement
	             */
	            //String dbName = "Bootcamp";
	            Statement stmt = null;
	          
	            /*String query = "create table ACCOUNTS " + 
	          	  	      		"(A_DAY timestamp NOT NULL"+
	          	  	      		"A_C_ID integer NOT NULL, " +
	          	  	      		"A_IBAN varchar(34)"+
	          	  	      		"FOREIGN KEY (A_C_ID) REFERENCES CUSTOMERS(C_ID)"+
	          	  	      		"PRIMARY KEY (A_IBAN))";*/
	            
	            
	            String query = "create table OMAJDA.TRANSACTIONS " + 
      	  	      		"(T_DAY timestamp NOT NULL"+
	            		"T_A_IBAN varchar(34)"+
      	  	      		"T_NUMB integer"+
	            		"T_DATE_TIMESTAMP timestamp"+
      	  	      		"T_INTERNAL varchar(1)"+
      	  	      		"T_DIRECTION varchar(1)"+
      	  	      		"T_TYPE varchar(3)"+
      	  	      		//"T_NUMBER numeric(20,6)"+
      	  	      		//"FOREIGN KEY (T_A_IBAN) REFERENCES ACCOUNTS(A_IBAN)"+
      	  	      		")";
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
	        			System.out.println("Connection Failed! Check output console -createTableTransactions-Table");
	        			e.printStackTrace();
	        			return;
	        			}

	        if (connection != null) 
	        	{
	            System.out.println("You made it, take control your database now! -createTableTransactions-Table");
	        	} else 
	        		{
	            System.out.println("Failed to make connection! -createTableTransactions-Table");
	        		}
	    }
	  
	  
	  public static void dropTable() throws SQLException 
	    {

	        System.out.println("-------- Oracle JDBC Connection Testing -dropTableTransactions-Table------");
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	        	} catch (ClassNotFoundException e) 
	        			{
	        			System.out.println("Where is your Oracle JDBC Driver? -dropTableTransactions-Table");
	        			e.printStackTrace();
	        			return;
	        			}
	        System.out.println("Oracle JDBC Driver Registered! -dropTableTransactions-Table");
	        Connection connection = null;
	        try {
	            connection = DriverManager.getConnection("jdbc:oracle:thin:@10.29.8.35:1521:xe", "omajda", "8Tt9Orcamp");
	            
	            /***
	             * 
	             * Create a statement
	             */
	            //String dbName = "Bootcamp";
	            Statement stmt = null;
	          
	            String query = "drop table TransactionsTable ";
	            		
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
	        			System.out.println("Connection Failed! Check output console -dropTableTransactions-Table");
	        			e.printStackTrace();
	        			return;
	        			}

	        if (connection != null) 
	        	{
	            System.out.println("You made it, take control your database now! -dropTableTransactions-Table");
	        	} else 
	        		{
	            System.out.println("Failed to make connection! -dropTableTransactions-Table");
	        		}
	    }
	  
	  public static void populateTransactionTablewithFile(String[] csvTransactionsTable) throws SQLException 
		{
			
			System.out.println("-------- Oracle JDBC Connection Testing -populateTableTransactions-Table-----");
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	        	} catch (ClassNotFoundException e) 
	        			{
	        			System.out.println("Where is your Oracle JDBC Driver? -populateTableTransactions-Table");
	        			e.printStackTrace();
	        			return;
	        			}
	        System.out.println("Oracle JDBC Driver Registered! -populateTableTransactions-Table");
	        Connection connection = null;
	        try {
	           
	            //String [] pokus = null; 
	            //pokus = csvReaderII.readCSV(csvAccountsTable);
	            //System.out.println("AccountTable"+Arrays.toString(pokus));
	           
	            connection = DriverManager.getConnection("jdbc:oracle:thin:@10.29.8.35:1521:xe", "omajda", "8Tt9Orcamp");
	            
	            Statement stmt = null;

	            System.out.println("TransactionsTable"+Arrays.toString(csvTransactionsTable));
	            
	            
	            //INSERT INTO transactions (T_DAY, T_A_IBAN, T_NUMB, T_DATE_TIMESTAMP, T_INTERNAL, T_DIRECTION, T_TYPE, T_AMOUNT)
	            //values (DATE '2015-04-30',"5feceb66ffc86f38d952786c6d696c79c2",1132,DATE '2015-04-29 10:14:08.394',"","C","CC",12);
	            
	            String query2 = "INSERT INTO TransactionsMarina231 " + 
	            		//"(A_DAY,A_C_ID,A_IBAN, A_CURRENCY, A_F_ID, A_TYPE) "+
	            		"VALUES (date '" +csvTransactionsTable[0]+"'"+
	            		",'"+csvTransactionsTable[1]+"',"
	            		+ csvTransactionsTable[2]+","+
	            		//"date '" +csvTransactionsTable[3]+
	            		"'"+csvTransactionsTable[4] +"','"+ 
	            		csvTransactionsTable[5] +"',"+"'"+csvTransactionsTable[6] +"',"+ 
	            		csvTransactionsTable[7]+
	            		//",'"+csvTransactionsTable[2]+
	            		//"', '"+csvAccountsTable[3]+"', "+csvAccountsTable[4]+", '"+
	            		//csvAccountsTable[5]+
	            		")";
	            
	            
	            //System.out.println(query2);
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
	        			System.out.println("Connection Failed! Check output console -populateTableTransactions-Table");
	        			e.printStackTrace();
	        			return;
	        			}

	        if (connection != null) 
	        	{
	            System.out.println("You made it, take control your database now! -populateTableTransactions-Table");
	        	} else 
	        		{
	            System.out.println("Failed to make connection!");
	        		}
		 
	    }
}
