
public class JavaPractise01Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array with simple for loop
		
		String [] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		for (int i=0;i<week.length;i++)
		{
			System.out.println(week[i].toUpperCase().concat(" IS HOLIDAY"));
		}
		
		//Array with enhanced For loop
		String[] months = {"January","February","March"};
		
		for (String m: months)
		{
			System.out.println(m);
		}
	}
	

}
