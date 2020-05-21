package com.example.ImageProject;

import java.util.Scanner;

import com.example.DAO.ImageOperationImpl;
import com.example.Service.ImageServiceImpl;
import com.example.Service.ImageServiceInt;
import com.example.model.Image;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    ImageServiceInt objService=new ImageServiceImpl();	
    int choice=0;
    Scanner sc= new Scanner(System.in);
    while(choice!=5)
    {
    	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    	System.out.println("                           1. Add Image");
    	System.out.println("                           2. Display Image");
    	System.out.println("                           3. Update Image");
    	System.out.println("                           4. Delete Image");
    	System.out.println("                           5. Exit");
    	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    	System.out.println("Please enter your choice :: ");
    	choice=sc.nextInt();
    	switch (choice) {
		case 1:
		{
			System.out.println("Enter id:");
			int id=sc.nextInt();
			System.out.println("enter name:");
			String name= sc.next();
			System.out.println("Enter Availability");
			Boolean bool =sc.nextBoolean();
			Image objImg= new Image(id,name,bool);
			objService.addImageSer(objImg);
		}
			
			break;

		case 2:
		{
			System.out.println("Enter id:");
			int id=sc.nextInt();
			objService.displayImageSer(id);
			
		}
		break;
		case 3:
		{
			System.out.println("Enter id:");
			int id=sc.nextInt();
			System.out.println("enter name:");
			String name= sc.next();
			objService.updateImageNameSer(id, name);
			
		}
		break;
		case 4:
		{
			System.out.println("Enter id:");
			int id=sc.nextInt();
			objService.deleteImageSer(id);
			
		}
		break;
		case 5:
		{
			System.out.println("Exiting the console......");
			System.exit(0);
		}
		break;
		default:
		{
			System.out.println("Invalid option entry.......");
		}

		}
    }
    }
}