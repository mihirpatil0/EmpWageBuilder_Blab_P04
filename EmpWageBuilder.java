package empwagebuilder;

import java.util.Random;

public class EmpWageBuilder 
	{	
		public static final int EMP_IS_FULLTIME = 2;
		public static final int EMP_IS_PARTTIME = 1;
		public static final int EMP_WAGE_PER_HR = 20;
		public static final int DAY_IN_MONTH = 20;
		public static final int MAX_HR_IN_MONTH = 100;
	
	public static void main(String[] args) 
	{
		
		int empHr = 0;
		int empWage = 0;
		int monthlyWage = 0;
		int totalEmpHr = 0;
		int totalWorkingDays = 0;
		Random random = new Random();
		while( totalEmpHr <= MAX_HR_IN_MONTH && totalWorkingDays < DAY_IN_MONTH )
		{	
			totalWorkingDays++;
			int empCheck = random.nextInt(3);
			switch (empCheck)
			{
				case EMP_IS_FULLTIME:
				{
					empHr = 8;
					break;
				}
				case EMP_IS_PARTTIME:
				{
					empHr = 4;
					break;
				}
				default:
					empHr = 0;
			}
			totalEmpHr += empHr;
			empWage = EMP_WAGE_PER_HR * empHr;
			System.out.println("Employee daily wage is : " + empWage + " Rs");
			monthlyWage += empWage;
		}
		System.out.println("Employee monthly wage is : " + monthlyWage + " Rs for " + totalEmpHr + " Hr" + " and " + totalWorkingDays + " working days." );
	}
}
