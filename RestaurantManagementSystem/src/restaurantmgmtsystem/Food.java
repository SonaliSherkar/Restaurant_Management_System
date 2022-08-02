package restaurantmgmtsystem;

import java.util.Scanner;

public class Food 
{
	public String Name;
	public float Price;
	
	public Food(String Name, float Price)
	{
		this.Name=Name;
		this.Price=Price;
	}
	
	public Food() {
		// TODO Auto-generated constructor stub
	}

	public void input()
	{
		Scanner bp = new Scanner(System.in);
		System.out.println("Enter Food Name:");
		Name=bp.nextLine();
		System.out.println("Enter Food Price:");
		Price=bp.nextFloat();
	}
	
	public void Payment()
	{
		System.out.println("Price: "+Price);
	}
	public String detail()
	{
		return Name+"   "+Price;
	}
	public float getPrice()
	{
		return Price;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public void setPrice(float Price)
	{
		this.Price=Price;
	}
	
}
