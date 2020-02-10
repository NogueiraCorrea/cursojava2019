package controller;

import java.sql.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class FormatData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date data = new Date(0);
		System.out.println("Data " + data);
		@SuppressWarnings("deprecation")
		@Deprecated
		Date dataInserida = new Date(2020,9,14);
		System.out.println("Data Inserida" + dataInserida);
		//Esta Classe está obsoleta.
		Calendar data2 = new GregorianCalendar();
		System.out.println("Data: " + data2);	
		data2.set(2020, 3, 19);
		System.out.println("Mês :" + data2.get(Calendar.MONTH));
		System.out.println("Dia da Semana: " +
		data2.get(Calendar.DAY_OF_WEEK));
		System.out.println("Dia do Mês: " +
		data2.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia do Ano: " + data2.get(Calendar.DAY_OF_YEAR));
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL);
		Calendar data3 = new GregorianCalendar();
		data3.set(2020,8,25);
		System.out.println("Data 3 (FULL): " +
		df3.format(data3.getTime()));
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG);
		Calendar data4 = new GregorianCalendar();
		data4.set(2020,8,25);
		System.out.println("Data 4 (LONG): " + df4.format(data4.getTime()));
		DateFormat df5 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		Calendar data5 = new GregorianCalendar();
		data5.set(2020, 8, 25);
		System.out.println("Data 5 (MEDIUM): "+ df5.format(data5.getTime()));
		DateFormat df6 = DateFormat.getDateInstance(DateFormat.SHORT);
		Calendar data6 = new GregorianCalendar();
		data6.set(2020,8,25);
		System.out.println("Data 6 (SHORT): "+ df6.format(data6.getTime()));
		TimeZone tz = TimeZone.getTimeZone("GMT-3:00");
		TimeZone.setDefault(tz);
		System.out.println(DateFormat.getTimeInstance().format(new Date(0)));
		
	}

}
