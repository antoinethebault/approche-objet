package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author antoinethebault
 *TestDates : classe executable qui teste les dates
 */
public class TestDates {

	public static void main(String[] args) {
		Date date = new Date(120,2,12);
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-YY");
		System.out.println(format.format(date));
		
		Date date2 = new Date(120,2,12,23,30,59);
		SimpleDateFormat format2 = new SimpleDateFormat("dd-MM-YY HH:mm:ss");
		System.out.println(format2.format(date2));
		
		Calendar cal = Calendar.getInstance();
		Date date3 = cal.getTime();
		System.out.println(format2.format(date3));
	}

}
