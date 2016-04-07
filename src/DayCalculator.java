
public class DayCalculator {
	private String[] daynames = {"Sun", "Mon" ,"Tue", "Wen", "Thu", "Fri", "Sat"};
	int[] numberOfMonthDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,31};
	

	
	public int getTotalDays(int year ,int month , int day){
		int totaldays = 0;
		
		for(int yearIndex = 1;yearIndex<year;yearIndex++){
	
			if(isLeap(yearIndex))
				totaldays = totaldays +366;
			else
				totaldays = totaldays +365;
		}
		for(int monthIndex = 1;monthIndex < month; monthIndex++)
			totaldays = totaldays+numberOfMonthDay[monthIndex];
			
		if(isLeap(year)&&month>=3)
			totaldays++;
		
		
		totaldays = totaldays+day;
		return totaldays;
	}
	
	public String getday(int year ,int month , int day) throws Exception{
		if(month<=0||month>=13||day>numberOfMonthDay[month] )
			throw new Exception("no");
		
		
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
