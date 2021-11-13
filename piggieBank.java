class addAmount
{
	private int amt = 50;
	addAmount()
	{
		System.out.println(amt);
	}
	addAmount(int n)
	{
		System.out.println(amt+=n);
	}
}
public class piggieBank
{
	public static void main(String args[])
	{   
        System.out.print("Intial amount:-");
		addAmount obj1 = new addAmount();
        System.out.print("After puting 100rs:-");
		addAmount obj2 = new addAmount(100);
	}
}
