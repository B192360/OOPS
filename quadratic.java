import static java.lang.Math.*;
public class quadratic
{
	static void calculateRoots(int a,int b,int c)
	{
		if(a==0)
		{
		System.out.println("the value of a cannot be 0.");
		return;
	}
	int d=b*b-4*a*c;
	double sqrtval=sqrt(abs(d));
	if(d>0)
		{
		System.out.println("the roots of the equation are real and different.\n");
		System.out.println((double)(-b+sqrtval)/(2*a)+"\n"+(double)(-b-sqrtval)/(2*a));
		}
	else if(d==0)
		{
		System.out.println("the roots of the equation are real and equal.\n");
		System.out.println(-(double)b / (2 * a) + "\n"+ -(double)b / (2 * a));  
		}
	else
		{
		System.out.println("the roots of the equation are complex");
		System.out.println(-(double)b/(2*a)+"+i"+sqrtval+"\n"+-(double)b / (2 * a)+ " - i" + sqrtval);  
		}
	}
	public static void main(String args[])
	{
	int a=1,b=1,c=1;
	calculateRoots(a,b,c);
	}
}
