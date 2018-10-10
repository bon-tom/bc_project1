/**
 * 
 */
package cz.bootcampProject.entities;

/**
 * @author tomas.majda
 *
 */

import java.sql.Timestamp;

public class accounts 
{
	//private String a_day;
	private Timestamp a_day;
	private int a_c_id;
	private String a_currency;
	private int a_f_id;
	private String a_type;
	
	/*public accounts(String a_day, int a_c_id, String a_currency, int a_f_id, String a_type) 
	{
		//super();
		this.a_day = a_day;
		this.a_c_id = a_c_id;
		this.a_currency = a_currency;
		this.a_f_id = a_f_id;
		this.a_type = a_type;
	}
	*/
	
	public accounts(Timestamp a_day, int a_c_id, String a_currency, int a_f_id, String a_type) 
		{
		//super();
		this.a_day = a_day;
		this.a_c_id = a_c_id;
		this.a_currency = a_currency;
		this.a_f_id = a_f_id;
		this.a_type = a_type;
	}

	
	/*public String getA_day() {
		return a_day;
	}*/
	
	public Timestamp getA_day() 
	{
		return a_day;
	}

	/*public void setA_day(String a_day) {
		this.a_day = a_day;
	}*/

	public void setA_day(Timestamp a_day) 
	{
		this.a_day = a_day;
	}
	public int getA_c_id() {
		return a_c_id;
	}

	public void setA_c_id(int a_c_id) {
		this.a_c_id = a_c_id;
	}

	public String getA_currency() {
		return a_currency;
	}

	public void setA_currency(String a_currency) {
		this.a_currency = a_currency;
	}

	public int getA_f_id() {
		return a_f_id;
	}

	public void setA_f_id(int a_f_id) {
		this.a_f_id = a_f_id;
	}

	public String getA_type() {
		return a_type;
	}

	public void setA_type(String a_type) {
		this.a_type = a_type;
	}
	
	
	

}
