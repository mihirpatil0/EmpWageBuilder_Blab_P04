package empwagebuilder;

import java.util.Random;

public class EmpWageBuilder 
{
	public static void main(String[] args) 
	{
		int EMP_IS_FULLTIME = 1;
		Random random = new Random();
		int empCheck = random.nextInt(2);
		if (EMP_IS_FULLTIME == empCheck)
		{
			System.out.println("Employee is present.");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}
}
