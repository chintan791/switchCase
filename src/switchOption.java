import java.util.Scanner;

public class switchOption {

	public static void main(String[] args) {

        //This program will print 'May' when you run it.
       int month;
		Scanner sc = new Scanner (System.in);
		System.out.println("Number of days");
		month = sc.nextInt();
		
        
        String monthName;
        
        switch (month) {
        
            case 31:  monthName = "January March May July Aug Oct Dec";
                     break;
            case 30:  monthName = "April June Sep Nov";
                     break;
            case 28:  monthName = "Feb";
                     break;
            case 9: monthName= "No months have exactly 9 days" ;        
                     break;
     
            default: monthName = "Unknown";
                     break;
        }
        System.out.println(monthName);
		

	}

}
