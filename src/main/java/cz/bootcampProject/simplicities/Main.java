/**
 * 
 */
package cz.bootcampProject.simplicities;

import java.sql.SQLException;

import cz.bootcampProject.stupidexamples.CoffeesTable;
import cz.bootcampProject.stupidexamples.JDBCOracleConnection;
import cz.bootcampProject.stupidexamples.OracleJDBCExample;
import cz.bootcampProject.stupidexamples.SuppliersTable;
import cz.bootcampProject.jdbc.AccountsTable;
import cz.bootcampProject.jdbc.CustomersTable;
import cz.bootcampProject.jdbc.TransactionsTable;

/**
 * @author tomas.majda
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//csvReaderII.readCSV();System.out.println("Výraz obsahuje øetìzec CUSTOMER");System.out.println("Výraz obsahuje øetìzec CUSTOMER");System.out.println("Výraz obsahuje øetìzec CUSTOMER");
		String csvCustomerFile = "\\Users\\tomas.majda\\eclipse-workspace64\\bootcampProject1\\csv\\CUSTOMER_20150430.csv" ;
		String csvAccountsFile = "\\Users\\tomas.majda\\eclipse-workspace64\\bootcampProject1\\csv\\ACCOUNTS_20150430.csv" ;
		String csvTransactionsFile = "\\Users\\tomas.majda\\eclipse-workspace64\\bootcampProject1\\csv\\TRANSACTIONS_20150430.csv" ;
		
		/*String ValueforCustomersTable = "( date '2015-04-30',459,'B',date '1946-02-08', date '1946-02-08','1b3a4eeb3803dcc','42f0bec3310ddd8a55e8d62817337ca') ";
		try {
			//cz.bootcampProject.jdbc.CustomersTable.populateTable();
			//cz.bootcampProject.jdbc.CustomersTable.populateTablewithString(ValueforCustomersTable);
			AccountsTable.populateTablewithFile(csvAccountsFile);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//csvReaderII.readCSV(csvTransactionsFile);
		/*try {
			csvReaderII.readCSV(csvAccountsFile);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try {
			csvReaderII.readCSV(csvCustomerFile);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//csvReaderII.readCSV(csvCustomerFile);
		/*String ValuesforAccount = " date '2015-04-30',67,'952786c6d696c79c2' ";
		try {
			AccountsTable.populateTablewithString(ValuesforAccount);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*try {
			AccountsTable.populateTablewithFile(csvAccountsFile);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
			
		/*String nameTable = "SuppliersTable";
		try {
			SuppliersTable.populateTable(nameTable);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		
		
		
	}

}
