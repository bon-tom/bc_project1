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
//import cz.bootcampProject.simplicities;
import cz.bootcampProject.simplicities.csvReaderII;


public class AccountsTable 
{

	private String dbName;
	private Connection con;
	private String dbms;

	public AccountsTable(Connection connArg, String dbNameArg, String dbmsArg) 
	{
	  super();
	  this.con = connArg;
	  this.dbName = dbNameArg;
	  this.dbms = dbmsArg;
	}
	
	
	public static void populateTablewithFile(String[] csvAccountsTable) throws SQLException 
	{
		
		System.out.println("-------- Oracle JDBC Connection Testing -populateTableAccounts-Table-----");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        	} catch (ClassNotFoundException e) 
        			{
        			System.out.println("Where is your Oracle JDBC Driver? -populateTableAccounts-Table");
        			e.printStackTrace();
        			return;
        			}
        System.out.println("Oracle JDBC Driver Registered! -populateTableAccounts-Table");
        Connection connection = null;
        try {
           
            //String [] pokus = null; 
            //pokus = csvReaderII.readCSV(csvAccountsTable);
            //System.out.println("AccountTable"+Arrays.toString(pokus));
           
            connection = DriverManager.getConnection("jdbc:oracle:thin:@10.29.8.35:1521:xe", "omajda", "8Tt9Orcamp");
            
            Statement stmt = null;

            System.out.println("AccountTable"+Arrays.toString(csvAccountsTable));
           /* String query = "INSERT INTO AccountsMarina " + 
            		"(A_DAY,A_C_ID,A_IBAN, A_CURRENCY, A_F_ID, A_TYPE) "+
            		"VALUES (date '2015-04-30',67,'952786c6d696c79c2', 'EUR', 3, 'IR')";*/
           /* String query1 = "INSERT INTO AccountsMarina " + 
            		"(A_DAY,A_C_ID,A_IBAN, A_CURRENCY, A_F_ID, A_TYPE) "+
            		"VALUES (date '" +csvAccountsTable[0]+" ',"+ csvAccountsTable[1]+ ",'"+csvAccountsTable[2]+"', '"+csvAccountsTable[3]+"', "+csvAccountsTable[4]+", '"+csvAccountsTable[5]+"')";
            */
            String query2 = "INSERT INTO AccountsMarina " + 
            		//"(A_DAY,A_C_ID,A_IBAN, A_CURRENCY, A_F_ID, A_TYPE) "+
            		"VALUES (date '" +csvAccountsTable[0]+" ',"+ csvAccountsTable[1]+ ",'"+csvAccountsTable[2]+"', '"+csvAccountsTable[3]+"', "+csvAccountsTable[4]+", '"+csvAccountsTable[5]+"')";
            
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
        			System.out.println("Connection Failed! Check output console -populateTableAccounts-Table");
        			e.printStackTrace();
        			return;
        			}

        if (connection != null) 
        	{
            System.out.println("You made it, take control your database now! -populateTableAccounts-Table");
        	} else 
        		{
            System.out.println("Failed to make connection!");
        		}
	 
    }
	
	public static void populateTablewithString(String[] country) throws SQLException 
	{
		
		System.out.println("-------- Oracle JDBC Connection Testing -populateTableAccounts-Table-----");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver -populateTableAccounts-Table");
        	} catch (ClassNotFoundException e) 
        			{
        			System.out.println("Where is your Oracle JDBC Driver? -populateTableAccounts-Table");
        			e.printStackTrace();
        			return;
        			}
        System.out.println("Oracle JDBC Driver Registered! -populateTableAccounts-Table");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@10.29.8.35:1521:xe", "omajda", "8Tt9Orcamp");
            Statement stmt = null;
          
            System.out.println("AccountTable"+Arrays.toString(country));
            String query = "INSERT INTO AccountsTable " + 
            		"(A_DAY,A_C_ID,A_IBAN) "+
            		"VALUES (date '2015-04-30',67,'952786c6d696c79c2')";
            		//country;
            try {
                stmt = connection.createStatement();
                stmt.executeQuery(query);
               
            	} catch (SQLException e ) 
            		{
            		JDBCTutorialUtilities.printSQLException(e);
            		} 
                finally {
                if (stmt != null) { stmt.close(); }
                		}
          
        	} catch (SQLException e) 
        			{
        			System.out.println("Connection Failed! Check output console -populateTableAccounts-Table");
        			e.printStackTrace();
        			return;
        			}

        if (connection != null) 
        	{
            System.out.println("You made it, take control your database now! -populateTableAccounts-Table");
        	} else 
        		{
            System.out.println("Failed to make connection!");
        		}

    }
	 	 	  
}
