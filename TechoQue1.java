import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/*Q1(Full Stack):
The pay date for company Acme is the last Friday of every month. Can you write a program to
determine on which date it will fall given the first day of the Year. Let's assume Sunday = 1,
Monday = 2 ... Saturday = 7 for example the 1st January 2015 is a Thursday (5) expected output:
January - 30 February- 27 March - 27 April - 24 : December - 25*/

public class TechoQue1 {

	public static void main(String... args) {

		int year = 2015;
		GregorianCalendar c = new GregorianCalendar(year, 0, 1);

		for (String mon : new DateFormatSymbols(Locale.US).getShortMonths()) {
			if (!mon.isEmpty()) {
				int totalDaysOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
				c.set(Calendar.DAY_OF_MONTH, totalDaysOfMonth);

				int daysToRollBack = (c.get(Calendar.DAY_OF_WEEK) + 1) % 7;

				int day = totalDaysOfMonth - daysToRollBack;
				c.set(Calendar.DAY_OF_MONTH, day);

				System.out.printf("%d %s %d Friday\n", year, mon, day);

				c.set(year, c.get(Calendar.MONTH) + 1, 1);
			}
		}
	}
}
