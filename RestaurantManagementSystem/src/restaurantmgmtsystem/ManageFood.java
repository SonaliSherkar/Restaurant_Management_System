package restaurantmgmtsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageFood 
{
	ArrayList<Food> foodlist = new ArrayList<>();
	ArrayList<CustomersOrder> customersorder = new ArrayList<>();
	Food Food;
	public CustomersOrder CustomersOrder;
	public int SelectFood;
	
	public ManageFood()
	{
		
	}
	Scanner bp=new Scanner(System.in);
	
	public void bp()
	{
		System.out.println("Enter Number Food add in menu:");  
		int n = Integer.parseInt(bp.nextLine());
		
		for(int i = 0; i < n; i++)
		{
			Food food = new Food();
			food.input();
			foodlist.add(food);
		}
	}
	public void print()
	{
		for(int i = 0; i < foodlist.size(); i++)
		{
			System.out.println((i+1)+"."+foodlist.get(i).detail());
		}
	}
	
	public void Price()
	{
		float PriceFood=0;
		float Totalpayment=0;
		int number;
		CustomersOrder customer = new CustomersOrder();
		customer.input();
		customersorder.add(customer);
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Select Food "+(i+1));             
			SelectFood = bp.nextInt();
			
			if(SelectFood==0) 
			{
				customer.setTotalpayment(Totalpayment);
				System.out.println("Total Payment");
				System.out.println(Totalpayment);
				System.out.println("Thank You, see you again!!!");
				break;
			}
			else
			{
				System.out.println("Enter Number:");                             
				number = bp.nextInt();
				Food food = foodlist.get(SelectFood-1);
				customer.setEatList(food);
				PriceFood = food.Price*number;
			}
			Totalpayment+=PriceFood;
			System.out.println("Order Finish");
			System.out.println("Payment "+(i+1)+" is:");
			System.out.println(" "+PriceFood);
			System.out.println("Finish Order Enter 0");
		}
	}
	public void PrintOrder()
	{
		for(int i = 0; i < customersorder.size(); i++)
		{
			customersorder.get(i).print();
		}
	}
	public void search()
	{
		Scanner bp = new Scanner(System.in);
		String idtable;
		int up=0;
		System.out.println("Enter Table Number Payment: ");
		idtable = bp.nextLine();
		
		for(int i = 0; i < customersorder.size(); i++)
		{
			if(customersorder.get(i).getIdTable().equalsIgnoreCase(idtable))
			{
				customersorder.get(i).print();
				up++;
			}
		}
		if(up==0)
		{
			System.out.println("No Table Number "+idtable);
		}
	}
	public String EditName()
	{
		System.out.println("Enter Name Edit: ");
		return bp.nextLine();
	}
	public float EditPrice()
	{
		System.out.println("Enter Price Edit: ");
		return bp.nextFloat();
	}
	
	public void EditFood()
	{
		String namefood;
		int up=0;
		System.out.println("Enter food name to fix");
		namefood = bp.nextLine();
		for(int i = 0; i < foodlist.size(); i++)
		{
			if(foodlist.get(i).getName().equals(namefood))
			{
				up++;
				foodlist.get(i).setName(EditName());
				foodlist.get(i).setPrice(EditPrice());
				break;
			}
			
		}
		if(up==0)
		{
			System.out.println("no food name is "+namefood);
		}
	}
		public void DeleteFood()
		{
			String deletefood;
			int up=0;
			System.out.println("Enter Food Name to Delete");
			deletefood = bp.nextLine();
			deletefood = bp.nextLine();
			for(int i = 0; i < foodlist.size(); i++)
			{
				if(foodlist.get(i).getName().equals(deletefood))
				{
					up++;
					foodlist.remove(i);
					System.out.println("DELETE FINISH");
					break;
				}
			}
			if(up==0)
			{
				System.out.println("no food name is "+deletefood);
			}
	    }
}

