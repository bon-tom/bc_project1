/**
 * 
 */
package cz.bootcampProject.simplicities;

import java.text.ParseException;
/**
 * @author tomas.majda
 *
 */
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date; 


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.oracle.tutorial.jdbc.JDBCTutorialUtilities;

import cz.bootcampProject.simplicities.regularExpression;
import cz.bootcampProject.jdbc.AccountsTable;
import cz.bootcampProject.jdbc.CustomersTable;
import cz.bootcampProject.jdbc.TransactionsTable;

public class csvReaderII 
{
	public static void readCSV(String csvFile) throws SQLException
	//public static String [] readCSV(String csvFile)
	{
	    System.out.println("Start of reading of file by csvReader II");
	    String line = null;
	    String cvsSplitBy = ",";
	    String [] Marina= null;
	    
	    
	    int NameofFile =-1;
	    String pathofFile=regularExpression.splitFileName(csvFile)[0];
	    System.out.println("Path of File je "+ pathofFile);
	    NameofFile=regularExpression.readNameofFile(pathofFile);
	    System.out.println(NameofFile);
	    
	    String rememberDate=regularExpression.splitFileName(csvFile)[1];
	    
	    System.out.println("RememberDate je "+ rememberDate +" a delka je "+rememberDate.length());
	    rememberDate=regularExpression.splitFileNameDot(rememberDate);
	    System.out.println("RememberDate je "+ rememberDate +" a delka je "+rememberDate.length());
	    rememberDate=rememberDate.substring(0, 4)+"-"+rememberDate.substring(4, 6)+"-"+rememberDate.substring(6, 8);
	    System.out.println("RememberDate je "+ rememberDate +" a delka je "+rememberDate.length());
	    int iterationLine = 0;
	    
	    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) 
	    {
	        while ((line = br.readLine()) != null) 
	        {
	        if(iterationLine == 0) 
	        	{
	                iterationLine++;  
	                continue;
	            }
	         String[] country = line.split(cvsSplitBy);
             for( int iterator = 0; iterator<country.length; iterator++)
	         	{
	        	 country[iterator]=regularExpression.deleteQuotes(country[iterator]);
       	 
	        	 if (iterator ==0)
	        	 	{
	        		if (!(country[iterator].equals(rememberDate)))
	        			{
	        			System.err.println("Dochazi k prepsani datumu "+ country[iterator]);
	        			rememberDate=country[iterator];
	        			System.err.println("RememberDate je nyni "+ rememberDate+" a delka je "+rememberDate.length());
	        			}
	        	 	}
	        	 if ((iterator ==1) && (NameofFile==1) )
	        	 	{
	        		 if (!regularExpression.positiveNumber( (country[iterator])))
	        			{
	        			
	        			System.err.println("Doslo k chybe pri cteni souboru, A_C_ID neni kladným èíslem");
	        			
	        			}
	        	 	}
	        	 if ((iterator ==3) && (NameofFile==1) )
	        	 	{
	        		 if (!regularExpression.correctcurrency( (country[iterator])))
	        			{
	        			
	        			System.err.println("Doslo k chybe pri cteni souboru, currency nesouhlasi");
	        			
	        			}

	        	 	}
	        	 if ((iterator ==4) && (NameofFile==1) )
	        	 	{
	        		 if (!regularExpression.positiveNumber( (country[iterator])))
	        			{
	        			
	        			System.err.println("Doslo k chybe pri cteni souboru, A_F_ID není kladným èíslem");
	        			
	        			}
	        	 	}
	        	 if ((iterator ==5) && (NameofFile==1) )
	        	 	{
	        		 if (!regularExpression.correctAccountType( (country[iterator])))
	        			{
	        			
	        			System.err.println("Doslo k chybe pri cteni souboru, A_Type není požadovaným druhem");
	        			
	        			}
	        		/*if (!(country[iterator].equals(rememberDate)))
	        			{
	        			System.err.println("Dochazi k prepsani datumu "+ country[iterator]);
	        			rememberDate=country[iterator];
	        			System.err.println("RememberDate je nyni "+ rememberDate);
	        			}*/
	        	 	}
	        	 
	        	 /*
	        	  * 
	        	  * 
	        	  * 
	        	  * 
	        	  * 
	        	  */
	        	 
	        	 
	        	 
	        	 if ((iterator ==1) && (NameofFile==2) )
	        	 	{
	        		/*if (!(country[iterator].equals(rememberDate)))
	        			{
	        			System.err.println("Dochazi k prepsani datumu "+ country[iterator]);
	        			rememberDate=country[iterator];
	        			System.err.println("RememberDate je nyni "+ rememberDate);
	        			}*/
	        	 	}
	        	 if ((iterator ==3) && (NameofFile==2) )
	        	 	{
	        		/*if (!(country[iterator].equals(rememberDate)))
	        			{
	        			System.err.println("Dochazi k prepsani datumu "+ country[iterator]);
	        			rememberDate=country[iterator];
	        			System.err.println("RememberDate je nyni "+ rememberDate);
	        			}*/
	        	 	}
	        	 if ((iterator ==4) && (NameofFile==2) )
	        	 	{
	        		 if (!regularExpression.correctTransactionInternal(country[iterator]))
	        			{
	        			
	        			System.err.println("Doslo k chybe pri cteni souboru, correctTransactionInternal nesouhlasi");
	        			
	        			}
	        		/*if (!(country[iterator].equals(rememberDate)))
	        			{
	        			System.err.println("Dochazi k prepsani datumu "+ country[iterator]);
	        			rememberDate=country[iterator];
	        			System.err.println("RememberDate je nyni "+ rememberDate);
	        			}*/
	        	 	}
	        	 if ((iterator ==5) && (NameofFile==2) )
	        	 	{
	        		 if (!regularExpression.correctTransactionDirection(country[iterator]))
	        			{
	        			
	        			System.err.println("Doslo k chybe pri cteni souboru, correctTransactionDirection nesouhlasi");
	        			
	        			}
	        	 	}
	        	 if ((iterator ==6) && (NameofFile==2) )
	        	 	{

	        		if (!regularExpression.correctTransactionType(country[iterator]))
	        			{
	        			
	        			System.err.println("Doslo k chybe pri cteni souboru, correctTransactionType nesouhlasi");
	        			
	        			}

	        	 	}
	        	 
	        	 
	        	 /*
	        	  * 
	        	  * 
	        	  * 
	        	  * 
	        	  * 
	        	  * 
	        	  * 
	        	  * 
	        	  * 
	        	  * 
	        	  * 
	        	  * 
	        	  * 
	        	  */
	        	 if ((iterator ==1) && (NameofFile==3) )
	        	 	{
	        		 if (!regularExpression.positiveNumber( (country[iterator])))
	        			{
	        			
	        			System.err.println("Doslo k chybe pri cteni souboru, C_ID neni kladným èíslem");
	        			
	        			}
	        	 	}
	        	 if ((iterator ==2) && (NameofFile==3) )
	        	 	{
	        		 if (!regularExpression.privatebusinessCustomer( (country[iterator])))
	        			{
	        			
	        			System.err.println("Doslo k chybe pri cteni souboru, C_Type není požadovaným druhem");
	        			
	        			}
	        	 	}
	        /*	 if ((iterator ==4) && (NameofFile==3) )
	        	 	{
	        		if (!(country[iterator].equals(rememberDate)))
	        			{
	        			System.err.println("Dochazi k prepsani datumu "+ country[iterator]);
	        			rememberDate=country[iterator];
	        			System.err.println("RememberDate je nyni "+ rememberDate);
	        			}
	        	 	}*/
	         	}
            //AccountsTable.populateTablewithFile(country);
            //TransactionsTable.populateTransactionTablewithFile(country);
              CustomersTable.populateCustomersTablewithFile(country);
             //for(int iterator1=0; iterator1<country.length; iterator1++)
            // {
	        // System.out.print(country[] +"  ");
	        // System.out.println("------------------");
            // }
             
             /*String query = "INSERT INTO AccountsTable " + 
             		"(A_DAY,A_C_ID,A_IBAN) "+
             		"VALUES (date '2015-04-30',67,'952786c6d696c79c2')";*/
             /*try {
                 stmt = connection.createStatement();
                 stmt.executeQuery(query);

             	} catch (SQLException e ) 
             		{
             		JDBCTutorialUtilities.printSQLException(e);
             		}*/
	         /*String pattern = "yyyy-MM-dd";
	         SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

	         Date date = null;
	         try {
	        	 date = simpleDateFormat.parse(country[0]);
	         	 } catch (ParseException e) 
	         			{
	         		 	// TODO Auto-generated catch block
	         		 	e.printStackTrace();
	         			}*/
	         //System.out.println("Vypsat datum: "+ country[0]+"\t"+date);  
	        }
	        System.out.println("End of reading of file csvReader II");

	    } catch (IOException e) 
	    	{
	            e.printStackTrace();
	        }
		//return Marina ;
	    
	    }

	
	
	

}
