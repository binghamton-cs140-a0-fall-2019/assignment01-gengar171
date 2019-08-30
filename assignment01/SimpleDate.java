package assignment01;

public class SimpleDate{
	private int year, month, day;

	public static SimpleDate of(int yr, int m, int d) {
		var returnValue = new SimpleDate();
		returnValue.year = yr;
		returnValue.month = m;
		returnValue.day = d;

		return returnValue;
	}

	public boolean before(SimpleDate other){
		if(year < other.year)
			return true;
		if(year == other.year) {
			if(month < other.month)
				return true;
			if(month == other.month) {
				if(day < other.day)
					return true;
				else
					return false;
			}
			else
				return false;
		}
		else
			return false;
	}
}