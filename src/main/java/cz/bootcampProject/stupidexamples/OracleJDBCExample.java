/**
 * 
 */
package cz.bootcampProject.stupidexamples;

/**
 * @author tomas.majda
 *
 */
/*public class OracleJDBCExample {

}*/


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.oracle.tutorial.jdbc.JDBCTutorialUtilities;

public class OracleJDBCExample 
{

    public static void makeConnect() 
    {

        System.out.println("-------- Oracle JDBC Connection Testing ------");
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
           /* String query = "create table OMAJDA.COFFEESLI "
            		+ " (COF_NAME varchar(32) NOT NULL, SUP_ID int NOT NULL, PRICE numeric(10,2) NOT NULL, "
            		+ " SALES integer NOT NULL, TOTAL integer NOT NULL,  PRIMARY KEY (COF_NAME) )" ;*/
            
            String query = "create table OMAJDA.CustomersTableH "
            		+ " (C_ID int NOT NULL, C_TYPE varchar(1), C_LEGAL_ID varchar(24), C_NAME varchar(64), PRIMARY KEY (C_ID) )" ;
            try {
                stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(query);
         /*       while (rs.next()) 
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

}

