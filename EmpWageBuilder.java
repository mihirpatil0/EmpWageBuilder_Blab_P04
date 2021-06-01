package empwagebuilder;

import java.util.Random;

public class EmpWageBuilder 
{
	public static void main(String[] args) 
	{
		int EMP_IS_FULLTIME = 1;
		int EMP_WAGE_PER_HR = 20;
		int empHr = 0;
		int empWage = 0;
		Random random = new Random();
		int empCheck = random.nextInt(2);
		if (EMP_IS_FULLTIME == empCheck)
		{
			empHr = 8;
			System.out.println("Employee is present.");
		}
		else
		{
			empHr = 0;
			System.out.println("Employee is absent");
		}
		empWage = EMP_WAGE_PER_HR * empHr;
		System.out.println("Employee daily wage is : " + empWage + " Rs");
	}
}
