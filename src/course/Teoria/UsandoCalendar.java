package course.Teoria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class UsandoCalendar {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = sdf1.parse("24/09/2018 15:25:21");
		
		System.out.println(sdf1.format(x1));
		
		x1 = Date.from(Instant.parse("2018-09-24T15:25:21Z")); //EM UTM (3 HORAS A MENOS)
		
		System.out.println(x1);
		System.out.println(sdf1.format(x1));
		
		Calendar cal = Calendar.getInstance(); //INSTANCIANDO CALENDARIO
		cal.setTime(x1); // SETTANDO A DATA
		cal.add(Calendar.HOUR_OF_DAY, 4);
		x1 = cal.getTime(); // PARA MINHA DATA RECEBER A DATA ATUALIZADA
		System.out.println();
		System.out.println(x1);
		System.out.println(sdf1.format(x1));
		
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println(minutes);
		
		int month = cal.get(Calendar.MONTH) + 1; // JANEIRO é 0;
		System.out.println(month);
		
	}
}
