package com.example.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;
import com.example.demo.service.AccountServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
        AccountService service =context.getBean("accountServiceImpl", AccountServiceImpl.class);
        Account account=context.getBean("account",Account.class);
        Scanner scanner=new Scanner(System.in);
        int choice=0;
        
        while(choice!=6)
        {
        	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        	System.out.println("                           1. Create Account");
        	System.out.println("                           2. Display Account by ID");
        	System.out.println("                           3. Update Account by ID");
        	System.out.println("                           4. Delete Account by ID");
        	System.out.println("                           5. List all account details");
        	System.out.println("                           6. Exit");
        	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        	System.out.println("Please enter your choice :: ");
        	choice=scanner.nextInt();
        	
        	switch(choice)
        	{
        		case 1:
        		{
        			System.out.println("Enter the accountID");
        			String accountID=scanner.next();
        			System.out.println("Enter the accountType");
        			String accountType=scanner.next();
        			System.out.println("Enter the Balance");
        			Double balance=scanner.nextDouble();
        			service.createAccount(new Account(accountID,accountType,balance));
        			System.out.println("Data entered successfully");
        			
        		}
        		break;
        		case 2:
        		{
        			System.out.println("Enter the accountID");
        			String accountID=scanner.next();
        			account=service.displayAccountByID(accountID);
        			System.out.println("Account Details ::"+account);
        		}
        		break;
        		case 3:
        		{
        			System.out.println("Enter the accountID");
        			String accountID=scanner.next();
        			System.out.println("Enter the change in accountType");
        			String accountType=scanner.next();
        			service.updateAccountByID(accountID, accountType);
        			System.out.println("Account Updated.....");
        		}
        		break;
        		case 4:
        		{
        			System.out.println("Enter the accountID");
        			String accountID=scanner.next();
        			service.deleteAccountByID(accountID);
        			System.out.println("Account deleted");
        		}
        		break;
        		case 5:
        		{
        			List<Account> accountDetails=service.listAllAccountDetails();
        			System.out.println("Account details ::"+accountDetails);
        		}
        		break;
        		case 6:
        		{
        			System.out.println("Exiting the console....   Have a great day");
        			System.exit(0);
        		}
        		break;
        		default:
        			System.out.println("--------------------Please enter avalid option from above given options------------------");
        	}
        }
        
        
    }
}
