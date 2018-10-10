/**
 * 
 */
package cz.bootcampProject.stupidexamples;

import java.io.BufferedReader;

/**
 * @author tomas.majda
 *
 */

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Driver;
import java.util.Properties;

import cz.bootcampProject.simplicities.csvReaderII;

/*
import com.northconcepts.datapipeline.core.DataReader;
import com.northconcepts.datapipeline.core.DataWriter;
import com.northconcepts.datapipeline.csv.CSVReader;
import com.northconcepts.datapipeline.jdbc.JdbcWriter;
import com.northconcepts.datapipeline.job.Job;
import com.northconcepts.datapipeline.job.JobTemplate;*/
public class InsertationII {
	
	
    
	    public static void main(String[] args) throws Throwable {
	        // connect to the database
	        Driver driver = (Driver) Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
	        Properties properties = new Properties();
	        properties.put("user", "scott");
	        properties.put("password", "tiger");
	        Connection connection = driver.connect("jdbc:odbc:dp-cookbook", properties);
	 
	        BufferedReader br = new BufferedReader(new FileReader(csvFile))) 
	            //.setFieldNamesInFirstRow(true);
	        
	        DataWriter writer = new  JdbcWriter(connection, "dp_credit_balance")
	          //  .setAutoCloseConnection(true);
	        
	        Job.run(reader, writer);
	    }
	 
	}

