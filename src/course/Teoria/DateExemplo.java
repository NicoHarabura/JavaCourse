package course.Teoria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExemplo {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("25/03/2018");
		Date y2 = sdf2.parse("24/09/2015 17:25:05");
		
		Date x1 = new Date();
		Date x3 = new Date(0L);
		
		System.out.println(y1);
		System.out.println(y2);
		System.out.println();
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println();
		System.out.println(x1);
		System.out.println();
		System.out.println(x3);
	}
}
