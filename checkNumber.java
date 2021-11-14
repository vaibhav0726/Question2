// Create class Number with only one private instance variable as a int primitive type. Initialize it with parameterised constructor and include the following methods  isZero( ), isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), isAmstrong() 
// the above methods return boolean primitive type value. 
// getFactorial(), getSqrt(), getSqr(), sumDigits()  these methods return int primitive type value.  
// dispBinary(), dispOctal(), displayhexa() these method return string value 

import java.lang.Math;
import java.util.Scanner;
class checkNumber
{
	private int num;
	checkNumber(int num)
	{
		this.num = num;
	}
	public boolean isZero()
	{
		if(num==0)
			return true;
		else
			return false;
	}
	public boolean isPositive()
	{
		if(num>0)
			return true;
		else
			return false;
	}
	public boolean isNegative()
	{
		if(num<0)
			return true;
		else
			return false;
	}
	public boolean isOdd()
	{
		if(num%2!=0)
			return true;
		else
			return false;
	}
	public boolean isEven()
	{
		if(num%2==0)
			return true;
		else
			return false;
	}
	public boolean isPrime()
	{
		int t=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				t=1;
				break;
			}
		}
		if(t==0)
			return true;
		else
			return false;
	}
	public boolean isArmstrong()
	{
		int t, rem, sum=0, count=0;
		t=num;
		while(t!=0)
		{
			count+=1;
			t/=10;
		}
		t=num;
		while(t!=0)
		{
			rem = t%10;
			sum = sum + (int)Math.pow(rem,count);
			t/=10;

		}
		if(sum==num)
			return true;
		else
			return false;
	}
	public int getFactorial()
	{
		int f=1;
		for(int i=1;i<=num;i++)
		{
			f*=i;
		}
		return f;
	}
	public int getSqrt()
	{
		return (int)Math.sqrt(num);
	}
	public int getSqr()
	{
		return (int)Math.pow(num,2);
	}
	public int sumDigits()
	{
		int sum= 0, rem, t=num;
		while(t!=0)
		{
			rem = t%10;
			sum+=rem;
			t/=10;
		}
		return sum;
	}
	public String dispBinary()
	{
		return Integer.toBinaryString(num);
	}
	public String dispOctal()
	{
		return Integer.toOctalString(num);
	}
	public String dispHexa()
	{
		return Integer.toHexString(num);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value:- ");
		int num = sc.nextInt();
		checkNumber obj = new checkNumber(num);
		System.out.println("Is number zero? "+obj.isZero());
		System.out.println("Is number positive? "+obj.isPositive());
		System.out.println("Is number negative? "+obj.isNegative());
		System.out.println("Is number odd? "+obj.isOdd());
		System.out.println("Is number even? "+obj.isEven());
		System.out.println("Is number prime? "+obj.isPrime());
		System.out.println("Is number armstrong? "+obj.isArmstrong());
		System.out.println("Factorial of the number:- "+obj.getFactorial());
		System.out.println("Square root of the number:- "+obj.getSqrt());
		System.out.println("Square of the number:- "+obj.getSqr());
		System.out.println("Sum of the digits of the number:- "+obj.sumDigits());
		System.out.println("Binary representation of the the number:- "+obj.dispBinary());
		System.out.println("Octal representation of the number:- "+obj.dispOctal());
		System.out.println("Hexadecimal representation of the number:- "+obj.dispHexa());
	}
}