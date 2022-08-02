package restaurantmgmtsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Food> foodlist = new ArrayList<>();
		ManageFood managefood = new ManageFood();
		int select;
		
		Scanner bp=new Scanner(System.in);
		do 
		{
			Menumain();
			select= Integer.parseInt(bp.nextLine());
			switch(select)
			{
			case 1:
				do 
				{
					MenuManageFood();
					select= Integer.parseInt(bp.nextLine());
					switch(select)
					{
					case 1:
						managefood.bp();
						break;
					case 2:
						managefood.print();
						managefood.EditFood();
						break;
					case 3:
						managefood.print();
						managefood.DeleteFood();
						break;	
					case 4:
						managefood.PrintOrder();
						break;
					case 5:
						managefood.search();
						break;
					case 0:
						System.out.println("back");
						break;	
					default:
						
						break;
					}
				}
				while(select !=0);
				
				break;
			case 2:
				do 
				{
					MenuOrder();
					select= Integer.parseInt(bp.nextLine());
					switch(select)
					{
					case 1:
						managefood.print();
						managefood.Price();
						break;
					case 0:
						System.out.println("back");
						break;	
					default:
						
						break;
					}
				}
				while(select !=0);
				
				break;
			
			default:
				
				break;
			}
		}
		while(select !=3);
		
	}
	static void MenuManageFood()
	{
		System.out.println("******--------------MENU MANAGEFOOD--------------******");
		System.out.println("0.BACK TO menu main");
		System.out.println("1.Add Food");
		System.out.println("2.Edit Food");
		System.out.println("3.Delete Food");
		System.out.println("4.Print Info Table Order");
		System.out.println("5.Payment");
		System.out.println("-------------------------------------------------------");
		System.out.println("select");
	}
	static void MenuOrder()
	{
		System.out.println("******------------------MENU ORDER---------------******");
		System.out.println("0.BACK TO menu main");
		System.out.println("1.Print Menu Food and Order");
		System.out.println("-------------------------------------------------------");
		System.out.println("select");
	}
	static void Menumain()
	{
		System.out.println("******------------------MENU MAIN----------------******");
		System.out.println("1.Manage Food");
		System.out.println("2.Manage Order");
		System.out.println("3.Exit");
	}

}
