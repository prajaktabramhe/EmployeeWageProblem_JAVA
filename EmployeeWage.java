public class EmployeeWage {

	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmployeeWage() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		numOfCompany++;
	}

	private void calculateEmpWage() {
		for ( int i = 0; i < numOfCompany; i++){
		int totalEmpWage = calculateEmpHrs(companyEmpWageArray[i]);
		System.out.println("Total Emp Wage for Company " + companyEmpWageArray[i].company + " is : " +totalEmpWage);
		}
	}

	private int calculateEmpHrs(CompanyEmpWage companyEmpWage) {
		//Variables
		int empHrs = 0;
	        int totalEmpHrs = 0;
	        int totalWorkingDays = 0;
		//Computation
		while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays){
		totalWorkingDays++;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
	        switch (empCheck) {
	                case IS_FULL_TIME:
				empHrs = 8;
	                        break;
	                case IS_PART_TIME:
	                        empHrs = 4;
	                        break;
	                default:
	                        empHrs = 0;
		}
 		totalEmpHrs += empHrs;
                System.out.println("Day# : " + totalWorkingDays + " Emp Hrs : " +empHrs);
        }
        return totalEmpHrs * companyEmpWage.empRatePerHour;
	}

	public static void main (String args []){
		EmployeeWage employeeWageBuilder = new EmployeeWage();
		employeeWageBuilder.addCompanyEmpWage("D-Mart", 20, 20, 100);
		employeeWageBuilder.addCompanyEmpWage("Relience", 15, 15, 80);
		employeeWageBuilder.calculateEmpWage();
	}
}
