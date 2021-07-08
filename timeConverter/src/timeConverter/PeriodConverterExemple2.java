package timeConverter;

public class PeriodConverterExemple2 {

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
	    int restDaysOfYears;
	    int restDaysOfMonths;
	    
	    // # CALCULATIONS
	    toYears = periodDays / YEAR_DAYS;
	    restDaysOfYears = periodDays % YEAR_DAYS;
	    toMonth = restDaysOfYears / MONTH_DAYS;
	    restDaysOfMonths = restDaysOfYears % MONTH_DAYS;
	    toWeeks = restDaysOfMonths / WEEK_DAYS;
	    toDays = restDaysOfMonths % WEEK_DAYS;
	    
	    // # PRINT RESULTS
	    System.out.println( periodDays + " days = " + toYears + " years, " + toMonth + " months, " + toWeeks + " weeks, " + toDays + " days" );
	    
	}

}
