import java.util.Scanner;
 public class EmployeeWage {
       public static final int IS_PART_TIME = 1;
       public static final int IS_FULL_TIME = 2;

	public static void ComputeEmployeeWage(int EMP_RATE_PER_HOUR ,int  NUM_OF_WORKING_DAYS , int MAX_HRS_IN_MONTH)
	{

          //Variables
          int empHrs = 0;
          int totalEmpHrs = 0;
          int totalWorkingDays = 0;
          
          //Computation
          while (totalEmpHrs <= MAX_HRS_IN_MONTH && 
                 totalWorkingDays < NUM_OF_WORKING_DAYS)
          {
                totalWorkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) 
                {
                    case IS_PART_TIME:
                       empHrs = 4;
                       break;
                    case IS_FULL_TIME:
                       empHrs = 8;
                       break;
                    default:
                       empHrs = 0; 
                 }
                 totalEmpHrs += empHrs;
                 System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
           }
           int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
           System.out.println("Total Emp Wage: " + totalEmpWage);


      }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of companies");
		int noOfCompanies=sc.nextInt();
		int EMP_RATE_PER_HOUR , NUM_OF_WORKING_DAYS ,MAX_HRS_IN_MONTH ;

		for(int i=0;i<noOfCompanies;i++)
		{
			System.out.println("Enter the values for "+(i+1)+" comapnay");
                      EMP_RATE_PER_HOUR =sc.nextInt();
		      NUM_OF_WORKING_DAYS=sc.nextInt();
		      MAX_HRS_IN_MONTH=sc.nextInt();
		      ComputeEmployeeWage(EMP_RATE_PER_HOUR , NUM_OF_WORKING_DAYS ,MAX_HRS_IN_MONTH);
	        }

        }
}
