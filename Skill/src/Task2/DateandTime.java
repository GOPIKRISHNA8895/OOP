package Task2;
	import java.time.LocalDate;
	import java.time.LocalTime;
	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;

	public class DateandTime{
	    public static void main(String[] args) {
	        LocalDate date = LocalDate.now();
	        LocalTime time = LocalTime.now();
	        LocalDateTime dateTime = LocalDateTime.now();

	        System.out.println("Current Date: " + date);
	        System.out.println("Current Time: " + time);
	        System.out.println("Current Date & Time: " + dateTime);

	        // Custom format
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	        System.out.println("Formatted DateTime: " + dateTime.format(formatter));
	    }
	}
