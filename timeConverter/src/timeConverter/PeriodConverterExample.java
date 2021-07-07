package timeConverter;

public class PeriodConverterExample {

	public static void main(String[] args) {
		
		// # DATA - CONSTANTS    
	    final int YEAR_DAYS = 365;
	    final int MONTH_DAYS = 30;
	    final int WEEK_DAYS = 7;

	    // # DATA - variables
	    int periodDays = 1234;
	    int toYears;
	    int toMonth;
	    int toWeeks;
	    int toDays;
	    
	    // # CALCULATIONS
	    toYears = periodDays / YEAR_DAYS;
	    toMonth = (periodDays % YEAR_DAYS) / MONTH_DAYS;
	    toWeeks = ((periodDays % YEAR_DAYS) % MONTH_DAYS) / WEEK_DAYS;
	    toDays = ((periodDays % YEAR_DAYS) % MONTH_DAYS) % WEEK_DAYS;
	    
	    // # PRINT RESULTS
	    System.out.println( periodDays + " days = " + toYears + " years, " + toMonth + " months, " + toWeeks + " weeks, " + toDays + " days" );
	    
	}

}
