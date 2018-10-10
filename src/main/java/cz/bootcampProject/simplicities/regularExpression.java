/**
 * 
 */
package cz.bootcampProject.simplicities;

import java.util.regex.*;
import java.math.BigInteger;


/**
 * @author tomas.majda
 *
 */
public class regularExpression 
{
	// Regulární výraz pro ovìøení emailové adresy
	
	public static int readNameofFile(String toMatch)
	{
	
	Pattern p = Pattern.compile("CUSTOMER");
	//Pattern p = Pattern.compile("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}");
	// Následnì vytvoøíme Matcher, na který zavoláme matcher objektu pattern.

	//Matcher m = p.matcher("Text k ovìøení");
	Matcher m = p.matcher(toMatch);
	//Matcher m = p.matcher("CUSTOMER1");
	
	//Aby se text ovìøil, tak zavoláme metodu find() na matcher. 
	//Tato metoda vrátí true pokud text splnil pravidla, pokud pravidla nesplní,
	//vrátí false. Dále už jen pøidáme podmínky, které to ovìøí:
	{
	if (m.find()) 
		{
	        System.out.println("Výraz obsahuje øetìzec CUSTOMER");
	        return 3;
		} 
		else 
		{
			Pattern p1 = Pattern.compile("TRANSACTIONS");
			//Pattern p = Pattern.compile("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}");
			// Následnì vytvoøíme Matcher, na který zavoláme matcher objektu pattern.

			//Matcher m = p.matcher("Text k ovìøení");
			Matcher m1 = p1.matcher(toMatch);
			//Matcher m = p.matcher("CUSTOMER1");
			
			//Aby se text ovìøil, tak zavoláme metodu find() na matcher. 
			//Tato metoda vrátí true pokud text splnil pravidla, pokud pravidla nesplní,
			//vrátí false. Dále už jen pøidáme podmínky, které to ovìøí:
			{
			if (m1.find()) 
				{
			        System.out.println("Výraz obsahuje øetìzec TRANSACTIONS");
			        return 2;
				} 
			else 
				{ Pattern p11 = Pattern.compile("ACCOUNTS");
				//Pattern p = Pattern.compile("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}");
				// Následnì vytvoøíme Matcher, na který zavoláme matcher objektu pattern.

				//Matcher m = p.matcher("Text k ovìøení");
				Matcher m11 = p11.matcher(toMatch);
				//Matcher m = p.matcher("CUSTOMER1");
			
				//Aby se text ovìøil, tak zavoláme metodu find() na matcher. 
				//Tato metoda vrátí true pokud text splnil pravidla, pokud pravidla nesplní,
				//vrátí false. Dále už jen pøidáme podmínky, které to ovìøí:
					{
					if (m11.find()) 
						{
						System.out.println("Výraz obsahuje øetìzec ACCOUNTS");
						return 1;
						} 
					else
						{
						System.err.println("Výraz NEobsahuje øetìzec ACCOUNTS, ani TRANSACTIONS, ani CUSTOMERS");
						return 0;
						}
					}
				}
			}
		}
	}
	}
	
	public static String [] splitFileName(String csvFile)
	{
		//int NameofFile = -1;
		if (csvFile.contains("_")) {
		    // Split it.
			String[] parts = csvFile.split("_");
			
			String part1 = parts[0]; // CUSTOMER
			String part2 = parts[1]; // 20150430.csv
			System.out.println(part1);
			//NameofFile=regularExpression.readNameofFile(part1);
			
			
			System.out.println(part2);
			part2=regularExpression.splitFileNameDot(part2);
			return parts;
			//regularExpression.splitFileNameUnderscore(part2);
		} else {
		    throw new IllegalArgumentException("String " + csvFile + " does not contain _");
		}
		
	}
	
	public static String splitFileNameDot(String nameFile)
	{
		if (nameFile.contains(".")) 
		{
		    // Split it.
			String[] parts = nameFile.split("\\.");
			
			String part1 = parts[0]; // 20150430
			String part2 = parts[1]; // csv
			
			System.out.println(part1);
			System.out.println(part2);
			return part1;
		} else {
		    throw new IllegalArgumentException("String " + nameFile + " does not contain .");
		}
		
	}
	
	public static String deleteQuotes(String record)
	{
		/*String z=record.replace(" ", "");
		System.out.println(z);
		return z;*/
		
		//int textLength = record.length();

	    //if ((textLength >= 2) && (record.charAt(0) == '"') || (textLength >= 2) && (record.charAt(textLength - 1) == '"')) 
		/*if ((textLength >= 2) && (record.charAt(0) == '"'))
		{
	      if ((textLength >= 2) && (record.charAt(textLength - 1) == '"'))
	      	{
	    	  return record.substring(1, textLength-1);
	      	}
	      return record.substring(1, textLength);
	    }
		if ((textLength >= 2) && (record.charAt(textLength - 1) == '"'))
	      	{
	    	  return record.substring(0, textLength-1);
	      	}

	    return record;*/
	/*	for (int iterator = 0; iterator<textLength; iterator++)
			{
			if (record.charAt(iterator)=='"')
				{
				record.charAt(iterator)=' ';
				}
			}*/
		
		record = record.replace("\"", "");
		return record;
	}
	
	public static boolean validateYear(int year)
	{
		if ((year >=1900) && (year <=2999))
		{
		return true;	
		}
		else return false;
	}
	
	public static boolean validateMonth(int month)
	{
		if ((month >=1) && (month <=12))
		{
		return true;	
		}
		else return false;
	} 
	
	
	public static boolean validateDay(int year, int month, int day)
	{
       
	   int max_number_Of_DaysInMonth = 0; 
       switch (month) 
       {
		   case 1:
		        	max_number_Of_DaysInMonth = 31;
		   case 2:
		          if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) 
		           		{
		                	 max_number_Of_DaysInMonth = 29;
		                } else {
		                	 max_number_Of_DaysInMonth = 28;
		                }
		                
		  case 3:
		       	 max_number_Of_DaysInMonth = 31;
		  case 4:
		               
		         max_number_Of_DaysInMonth = 30;
		                 
		  case 5:
		         max_number_Of_DaysInMonth = 31;
		                
		  case 6:
		       	 max_number_Of_DaysInMonth = 30;
		                 
		  case 7:
		       	 max_number_Of_DaysInMonth = 31;
		                 
		  case 8:
		       	 max_number_Of_DaysInMonth = 31;
		                
		  case 9:
		                
		      	 max_number_Of_DaysInMonth = 30;
		                 
		  case 10:
		                
		       	 max_number_Of_DaysInMonth = 31;
		                 
		  case 11:
		               
		      	 max_number_Of_DaysInMonth = 30;
		                 
		  case 12:
		               
		       	 max_number_Of_DaysInMonth = 31;
		            	
		 }
        if ( day<= max_number_Of_DaysInMonth)
        	{
		    return true;   
		    }
        else return false;
	}



	public static boolean positiveNumber(String str)
	{
	    int number = Integer.parseInt(str);
		if (number>=0)
		{
			return true;
		} else return false;
	}
	
	public static boolean privatebusinessCustomer(String var)
	{
		//if ((var=='P') || (var=='B'))
		if ( (var.matches("P") || var.matches("B") ) )
		{
			return true;
		} else return false;
	}
	
	public static boolean correctcurrency(String var)
	{
		if ( (var.matches("EUR")) )
			//if((var.matches("CC")) ||(var.matches("MAM")) || (var.matches("ASE")) || (var.matches("ASP")) || (var.matches("IP"))  || (var.matches("OO")) || (var.matches("OP")) || (var.matches("UP")) || (var.matches("UD")) || (var.matches("SEP")) || (var.matches("INT")) || (var.matches("SIP")) || (var.matches("W")) || (var.matches("DB")) || (var.matches("CP")) || (var.matches("CC")) || (var.matches("U")))
			
		{
			return true;
		} else return false;
	}
	
	public static boolean correctAccountType(String var)
	{
		//if ( (var==" CH") || (var==" S") || (var==" CD") || (var==" MM") || (var=="IR") )
		if((var.matches("CH")) ||(var.matches("S")) || (var.matches("CD")) || (var.matches("MM")) || (var.matches("IR")) )
			
		{
			return true;
		} else return false;
	}
	
	public static boolean correctTransactionInternal(String var)
	{
		//if ( (var=="I" ) || (var=="" ) )
		//if( (var.matches("MAM")) || (var.matches("ASE")) || (var.matches("ASP")) || (var.matches("IP"))  || (var.matches("OO")) || (var.matches("OP")) || (var.matches("UP")) || (var.matches("UD")) || (var.matches("SO")) || (var.matches("SEP")) || (var.matches("INT")) || (var.matches("SIP")) || (var.matches("W")) || (var.matches("DB")) || (var.matches("CP")) || (var.matches("CC")) || (var.matches("U")))
		if   (var.matches("I") || (var.matches("")) )	
		{
			return true;
		} else return false;
	}
	
	public static boolean correctTransactionDirection(String var)
	{
		if   (var.matches("C") || (var.matches("D")) )	
		//if ( (var=="C" ) || (var=="D" ) )
			//if((var.matches("CC")) ||(var.matches("MAM")) || (var.matches("ASE")) || (var.matches("ASP")) || (var.matches("IP"))  || (var.matches("OO")) || (var.matches("OP")) || (var.matches("UP")) || (var.matches("UD")) || (var.matches("SEP")) || (var.matches("INT")) || (var.matches("SIP")) || (var.matches("W")) || (var.matches("DB")) || (var.matches("CP")) || (var.matches("CC")) || (var.matches("U")))
				
		{
			return true;
		} else return false;
	}
	
	public static boolean correctTransactionType(String var)
	{
		//if ( (var=="MAM") || (var=="ASE") || (var=="ASP") || (var=="IP") || (var=="OO") || (var=="OP") || (var=="UP") || (var=="UD") || (var=="SEP") || (var=="INT")|| (var=="SIP")|| (var=="W") || (var=="DB") || (var=="CP") || (var.matches("CC")) || (var=="U") )
		if(( (var.matches("MAM")) || (var.matches("ASE")) || (var.matches("ASP")) || (var.matches("IP"))  || (var.matches("OO")) || (var.matches("OP")) || (var.matches("UP")) || (var.matches("UC")) || (var.matches("UD"))  || (var.matches("SO"))  || (var.matches("SIP")) || (var.matches("SEP")) || (var.matches("INT"))  || (var.matches("W")) || (var.matches("DB")) || (var.matches("CP")) || (var.matches("CC")) || (var.matches("U")) ))
		{
			//System.out.println(var);
			return true;
		} else return false;
	}
	
	public static boolean isAlpha(String name) 
	{
	    char[] chars = name.toCharArray();

	    for (char c : chars) 
	    {
	        if(!Character.isLetter(c)) 
	        {
	            return false;
	        }
	    }

	    return true;
	}
	
/*	public boolean isDigit(String name) 
	{
	    char[] chars = name.toCharArray();

	    for (char c : chars) 
	    {
	        if(!Character.isLetter(c)) 
	        {
	            return false;
	        }
	    }

	    return true;
	}*/
	
	public static boolean correctIBAN_digits(String IBAN_to_check)
	{
		
		int length_of_IBAN = IBAN_to_check.length();
		System.out.println(length_of_IBAN);
		System.out.println(IBAN_to_check);
		String ISO_code= IBAN_to_check.substring(0, 2);
		System.out.println(ISO_code);
		
		/*if ( (ISO_code =="AL") || ( ISO_code =="AD") || (ISO_code =="AT") || (ISO_code =="BH") || (ISO_code =="BY") || (ISO_code =="BE") || (ISO_code =="BA") || (ISO_code =="BR") || (ISO_code =="BG") ||(ISO_code =="CR") ||(ISO_code =="HR") ||(ISO_code =="CY") ||(ISO_code =="CZ") ||(ISO_code =="DK") ||(ISO_code =="XX") ||(ISO_code =="EE") ||(ISO_code =="FO") ||(ISO_code =="FI") ||(ISO_code =="GE") ||(ISO_code =="DE") ||(ISO_code =="GI") ||(ISO_code =="GR") ||(ISO_code =="GL") ||(ISO_code =="GT") ||(ISO_code =="HU") ||(ISO_code =="IS") ||(ISO_code =="IE") ||(ISO_code =="IL") ||(ISO_code =="IT") ||(ISO_code =="XX") ||(ISO_code =="KZ") ||(ISO_code =="XX") ||(ISO_code =="KW") ||(ISO_code =="LV") ||(ISO_code =="LB") ||(ISO_code =="LI") ||(ISO_code =="LT") ||(ISO_code =="LU") ||(ISO_code =="MK") ||(ISO_code =="MT") ||(ISO_code =="MR") ||(ISO_code =="MU") ||(ISO_code =="MC") ||(ISO_code =="MD") ||(ISO_code =="ME") ||(ISO_code =="NL") ||(ISO_code =="NO") ||(ISO_code =="PK") ||(ISO_code =="PS") ||(ISO_code =="PL") ||(ISO_code =="PT") ||(ISO_code =="XX") ||(ISO_code =="RO") ||(ISO_code =="SM") ||(ISO_code =="SA") ||(ISO_code =="RS") ||(ISO_code =="SK") ||(ISO_code =="SI") ||(ISO_code =="ES") ||(ISO_code =="SE") ||(ISO_code =="CH") ||(ISO_code =="TN") ||(ISO_code =="TR") ||(ISO_code =="AE") ||(ISO_code =="GB") ||(ISO_code =="VR") ){
			
		}*/
	   //String typeOfDay;
		  switch (ISO_code) 
		  {
	         case "AL":
	         	{
	         	if (length_of_IBAN == 28)
	         		{
	         		String BBAN= IBAN_to_check.substring(4, 28);
	         		System.out.println(BBAN);
	         		String numbers_BBAN= BBAN.substring(0, 8);
	         		System.out.println(numbers_BBAN);
	         		
	         		String regex1 = "[0-9]+";
	         		//String data = "23343453";
	         		System.out.println(numbers_BBAN.matches(regex1));
	         		
	         		String characters_BBAN= BBAN.substring(8, 24);
	         		System.out.println(characters_BBAN);
	         		
	         		String regex2 = "\\w+";
	         		//String data = "23343453";
	         		System.out.println(characters_BBAN.matches(regex2));
	         		}
	         	break;
	         	}

	         case "AD":
	         	{
	         	if (length_of_IBAN == 24)
	         		{
	         		String BBAN= IBAN_to_check.substring(4, 24);
	         		System.out.println(BBAN);
	         		String numbers_BBAN= BBAN.substring(0, 8);
	         		System.out.println(numbers_BBAN);
	         		
	         		String regex1 = "[0-9]+";
	         		//String data = "23343453";
	         		System.out.println(numbers_BBAN.matches(regex1));
	         		
	         		
	         		String characters_BBAN= BBAN.substring(8, 20);
	         		System.out.println(characters_BBAN);
	         		
	         		String regex2 = "\\w+";
	         		//String data = "23343453";
	         		System.out.println(characters_BBAN.matches(regex2));
	         		}
	         	break;	
	         	}
	         case "AT":
	         	{
	         	if (length_of_IBAN == 20)
	         		{
	         		String BBAN= IBAN_to_check.substring(4, 20);
	         		System.out.println(BBAN);
	         		String numbers_BBAN= BBAN.substring(0, 16);
	         		System.out.println(numbers_BBAN);
	         		
	         		String regex1 = "[0-9]+";
	         		//String data = "23343453";
	         		System.out.println(numbers_BBAN.matches(regex1));
	         		}
	         	
	         	break;		
	         	}
	         case "AZ":
	         	{
	         	if (length_of_IBAN == 28)
	         		{
	         		String BBAN= IBAN_to_check.substring(4, 28);
	         		System.out.println(BBAN);
	         		
	         		String characters_BBAN= BBAN.substring(0, 4);
	         		System.out.println(characters_BBAN);
	         		
	         		String regex1 = "\\w+";
	         		//String data = "23343453";
	         		System.out.println(characters_BBAN.matches(regex1));
	         		
	         		
	         		String numbers_BBAN= BBAN.substring(4, 28);
	         		System.out.println(numbers_BBAN);
	         		
	         		String regex2 = "[0-9]+";
	         		//String data = "23343453";
	         		System.out.println(numbers_BBAN.matches(regex2));
	         		
	         		
	         		
	         		}
	         	break;		
	         	}

	         case "BH":
	         	{
	         	if (length_of_IBAN == 22)
	         		{
	         		String BBAN= IBAN_to_check.substring(4, 22);
	         		System.out.println(BBAN);
	         		String alphas_BBAN= BBAN.substring(0, 4);
	         		System.out.println(alphas_BBAN);
	         		
	         		System.out.println(isAlpha(alphas_BBAN));
	         		
	           		String characters_BBAN= BBAN.substring(4, 18);
	         		System.out.println(characters_BBAN);
	         		}
	         	break;		
	         	}
	         case "BY":
	         	{
	         	if (length_of_IBAN == 28)
	         		{
	         		String BBAN= IBAN_to_check.substring(4, 28);
	         		System.out.println(BBAN);
	         		
	         		String characters_BBAN1= BBAN.substring(0, 4);
	         		System.out.println(characters_BBAN1);
	         		
	         		String regex1 = "\\w+";
	         		//String data = "23343453";
	         		System.out.println(characters_BBAN1.matches(regex1));
	         		
	         		
	         		String numbers_BBAN= BBAN.substring(4, 8);
	         		System.out.println(numbers_BBAN);
	         		
	         		String regex2 = "[0-9]+";
	         		//String data = "23343453";
	         		System.out.println(numbers_BBAN.matches(regex2));
	         		
	         		
	         		String characters_BBAN2= BBAN.substring(8, 24);
	         		System.out.println(characters_BBAN2);
	         		//String regex1 = "\\w+";
	         		//String data = "23343453";
	         		System.out.println(characters_BBAN2.matches(regex1));
	         		}
	         	break;		
	         	}
	         case "BE":
	         	{
	         	if (length_of_IBAN == 16)
	         		{
	         		String BBAN= IBAN_to_check.substring(4, 16);
	         		System.out.println(BBAN);
	         		String numbers_BBAN= BBAN.substring(0, 12);
	         		System.out.println(numbers_BBAN);
	         		
	         		String regex1 = "[0-9]+";
	         		//String data = "23343453";
	         		System.out.println(numbers_BBAN.matches(regex1));
	         		}
	         	break;		
	         	} 

	         case "BA":
	         	{
	         	if (length_of_IBAN == 20)
	         		{
	         		String BBAN= IBAN_to_check.substring(4, 20);
	         		System.out.println(BBAN);
	         		String numbers_BBAN= BBAN.substring(0, 16);
	         		System.out.println(numbers_BBAN);
	         		
	         		String regex1 = "[0-9]+";
	         		//String data = "23343453";
	         		System.out.println(numbers_BBAN.matches(regex1));
	         		}
	         	break;		
	         	} 
	         case "BR":
	         	{
	         	if (length_of_IBAN == 29)
	         		{
	         		String BBAN= IBAN_to_check.substring(4, 29);
	         		System.out.println(BBAN);
	         		String numbers_BBAN= BBAN.substring(0, 23);
	         		System.out.println(numbers_BBAN);
	         		
	         		String regex1 = "[0-9]+";
	         		//String data = "23343453";
	         		System.out.println(numbers_BBAN.matches(regex1));
	         		
	         		String alphas_BBAN= BBAN.substring(23, 24);
	         		System.out.println(alphas_BBAN);
	         		
	         		//String regex1 = "[0-9]+";
	         		//String data = "23343453";
	         		System.out.println(isAlpha(alphas_BBAN));
	         		
	         		String characters_BBAN= BBAN.substring(24, 25);
	         		System.out.println(characters_BBAN);
	         		
	         		//String regex1 = "[0-9]+";
	         		//String data = "23343453";
	         		String regex2 = "\\w+";
	         		//String data = "23343453";
	         		System.out.println(characters_BBAN.matches(regex2));
	         		
	         		}
	         	break;		
	         	}
	         	
	         case "BG":
	         	{
	         	if (length_of_IBAN == 22)
	         		{
	         		String BBAN= IBAN_to_check.substring(4, 22);
	         		System.out.println(BBAN);
	         		
	         		String alphas_BBAN= BBAN.substring(0, 4);
	         		System.out.println(alphas_BBAN);
	         		
	         		String numbers_BBAN= BBAN.substring(4, 10);
	         		System.out.println(numbers_BBAN);
	         		
	         		String regex1 = "[0-9]+";
	         		//String data = "23343453";
	         		System.out.println(numbers_BBAN.matches(regex1));
	         		
	         		
	         		
	         		//String regex1 = "[0-9]+";
	         		//String data = "23343453";
	         			         		
	         		String characters_BBAN= BBAN.substring(10, 18);
	         		System.out.println(characters_BBAN);
	         		
	         		//String regex1 = "[0-9]+";
	         		//String data = "23343453";
	         		String regex2 = "\\w+";
	         		System.out.println(characters_BBAN.matches(regex2));
	         		
	         		}
	         	break;		
	         	}
	         case "CR":
	         	{
	         	if (length_of_IBAN == 21)
	         		{
	         		String BBAN= IBAN_to_check.substring(4, 21);
	         		System.out.println(BBAN);
	         		String numbers_BBAN= BBAN.substring(0, 17);
	         		System.out.println(numbers_BBAN);
	         		
	         		String regex1 = "[0-9]+";
	         		//String data = "23343453";
	         		System.out.println(numbers_BBAN.matches(regex1));
	         		}
	         	break;		
	         	}
	         case "HR":
	         	{
	         	if (length_of_IBAN == 21)
	         		{
	         		String BBAN= IBAN_to_check.substring(4, 21);
	         		System.out.println(BBAN);
	         		String numbers_BBAN= BBAN.substring(0, 17);
	         		System.out.println(numbers_BBAN);
	         		
	         		String regex1 = "[0-9]+";
	         		//String data = "23343453";
	         		System.out.println(numbers_BBAN.matches(regex1));
	         		}
	         	break;		
	         	}
	         case "CY":
	         	{
	         	if (length_of_IBAN == 28)
	         		{
	         		String BBAN= IBAN_to_check.substring(4, 28);
	         		System.out.println(BBAN);
	         		String numbers_BBAN= BBAN.substring(0, 8);
	         		System.out.println(numbers_BBAN);
	         		
	         		String regex1 = "[0-9]+";
	         		//String data = "23343453";
	         		System.out.println(numbers_BBAN.matches(regex1));
	         		
	         		String characters_BBAN= BBAN.substring(8, 24);
	         		System.out.println(characters_BBAN);
	         		
	         		String regex2 = "\\w+";
	         		System.out.println(characters_BBAN.matches(regex2));
	         		}
	         	break;		
	         	}
	         case "CZ":
	         	{
	         	if (length_of_IBAN == 24)
	         		{
	         		String BBAN= IBAN_to_check.substring(4, 24);
	         		System.out.println(BBAN);
	         		String numbers_BBAN= BBAN.substring(0, 20);
	         		System.out.println(numbers_BBAN);
	         		
	         		String regex1 = "[0-9]+";
	         		//String data = "23343453";
	         		System.out.println(numbers_BBAN.matches(regex1));
	         		}
	         	break;		
	         	}
	         default:
	         	{
	             throw new IllegalArgumentException("Invalid ISO code of the land: " + ISO_code);
	             //return false;
				}
		  }
	      return false;
	}
	
	//public static boolean correctIBAN_digits(String IBAN_to_check)
	public static boolean correctIBAN_division(String IBAN_to_check) 
	{
        String newAccountNumber = IBAN_to_check.trim();
        final BigInteger IBANNUMBER_MAGIC_NUMBER = new BigInteger("97");

        // Move the four initial characters to the end of the string.
        newAccountNumber = newAccountNumber.substring(4) + newAccountNumber.substring(0, 4);

        // Replace each letter in the string with two digits, thereby expanding the string, where A = 10, B = 11, ..., Z = 35.
        StringBuilder numericAccountNumber = new StringBuilder();
        for (int i = 0;i < newAccountNumber.length();i++) 
        {
            numericAccountNumber.append(Character.getNumericValue(newAccountNumber.charAt(i)));
        }

        // Interpret the string as a decimal integer and compute the remainder of that number on division by 97.
        BigInteger ibanNumber = new BigInteger(numericAccountNumber.toString());
        return ibanNumber.mod(IBANNUMBER_MAGIC_NUMBER).intValue() == 1;

    }
	/*public static String deleteQuotes(String record)
	{
		String z=record.replace(" ", "");
		System.out.println(z);
		return z;
		
		int textLength = record.length();

	    //if ((textLength >= 2) && (record.charAt(0) == '"') || (textLength >= 2) && (record.charAt(textLength - 1) == '"')) 
		if ((textLength >= 2) && (record.charAt(0) == '"'))
			regularExpression.deleteQuotes(record.substring(1, textLength));
			if ((textLength >= 2) && (record.charAt(textLength - 1) == '"'))
	      		{
				regularExpression.deleteQuotes(record.substring(1, textLength-1));
	      		}
	      
	    }
		if ((textLength >= 2) && (record.charAt(textLength - 1) == '"'))
	      	{
			regularExpression.deleteQuotes((record.substring(0, textLength-1)));
	      	}

	    return record;
	}*/
	/*public static void splitFileNameDot(String nameFile)
	{
		if (nameFile.contains(".")) 
		{
		    // Split it.
			String[] parts = nameFile.split("\\."); pozor na tuto teckovou notaci
			
			String part1 = parts[0]; // 20150430
			String part2 = parts[1]; // csv
			System.out.println(part1);
			System.out.println(part2);
		} else {
		    throw new IllegalArgumentException("String " + nameFile + " does not contain .");
		}
		
	}*/
}

