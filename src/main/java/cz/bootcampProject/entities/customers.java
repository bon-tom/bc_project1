/**
 * 
 */
package cz.bootcampProject.entities;

/**
 * @author tomas.majda
 *
 */

import java.sql.Timestamp;

public class customers 
{
	//private String c_day;
	private Timestamp c_day;
	private int c_id;
	private String c_type;
	private String c_origin_date;
	private String c_rel_date;
	private String c_legal_id;
	private String c_name;
	
	
	/*public customers(String c_day, int c_id, String c_type, String c_origin_date, String c_rel_date, String c_legal_id,
			String c_name) 
	{
		
		this.c_day = c_day;
		this.c_id = c_id;
		this.c_type = c_type;
		this.c_origin_date = c_origin_date;
		this.c_rel_date = c_rel_date;
		this.c_legal_id = c_legal_id;
		this.c_name = c_name;
	}*/

	public customers(Timestamp c_day, int c_id, String c_type, String c_origin_date, String c_rel_date, String c_legal_id,
			String c_name) 
	{
		
		this.c_day = c_day;
		this.c_id = c_id;
		this.c_type = c_type;
		this.c_origin_date = c_origin_date;
		this.c_rel_date = c_rel_date;
		this.c_legal_id = c_legal_id;
		this.c_name = c_name;
	}

	/*public String getC_day() {
		return c_day;
	}*/
	public Timestamp getC_day() {
		return c_day;
	}

	/*public void setC_day(String c_day) {
		this.c_day = c_day;
	}*/
	
	public void setC_day(Timestamp c_day) {
		this.c_day = c_day;
	}

	public int getC_id() {
		return c_id;
	}


	public void setC_id(int c_id) {
		this.c_id = c_id;
	}


	public String getC_type() {
		return c_type;
	}


	public void setC_type(String c_type) {
		this.c_type = c_type;
	}


	public String getC_origin_date() {
		return c_origin_date;
	}


	public void setC_origin_date(String c_origin_date) {
		this.c_origin_date = c_origin_date;
	}


	public String getC_rel_date() {
		return c_rel_date;
	}


	public void setC_rel_date(String c_rel_date) {
		this.c_rel_date = c_rel_date;
	}


	public String getC_legal_id() {
		return c_legal_id;
	}


	public void setC_legal_id(String c_legal_id) {
		this.c_legal_id = c_legal_id;
	}


	public String getC_name() {
		return c_name;
	}


	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	
	

}
