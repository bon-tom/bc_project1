/**
 * 
 */
package cz.bootcampProject.simplicities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author tomas.majda
 *
 */
public class csvReader 
{
	public static void main(String[] args){
	String fileName = "data.csv";
	File file = new File(fileName);
	{
		try
		{
		Scanner inputStream = new Scanner(file);
		inputStream.next(); //ignore the first line
		while (inputStream.hasNext())
			{
			String data = inputStream.next();
			String[]values=data.split(",");
			double closingPrice = Double.parseDouble(values[1]); 
//			int closingPrice = Int.parse(values[2]);
			System.out.println(closingPrice);
			}
		inputStream.close();
		}catch (FileNotFoundException e)
			{
			e.printStackTrace();
			}
	}
	}
}
