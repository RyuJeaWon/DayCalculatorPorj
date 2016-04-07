
public class DayCalculator {
	private String[] daynames = {"Sun", "Mon" ,"Tue", "Wen", "Thu", "Fri", "Sat"};
	int[] numberOfMonthDay = {0, 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
	

	
	public int getTotalDays(int year ,int month , int day){
		int totaldays = 0;
		
		
		if(year==2)
			totaldays=totaldays+365;
		
		for(int yearIndex = 1;yearIndex<year;yearIndex++){
			
		}
		
		for(int monthIndex = 1;monthIndex < month; monthIndex++)
			totaldays = totaldays+numberOfMonthDay[monthIndex];
		
		totaldays = totaldays+day;
		
		return totaldays;
	}
	
	public String getday(int year ,int month , int day){
		int totaldays=getTotalDays(year ,month , day);
		return daynames[totaldays % 7];
	
	}
	public static Boolean isLeap(int year){
		if(year % 400==0)	
			return true;
		else if(year % 100==0)
			return false;
		else if(year % 4==0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
