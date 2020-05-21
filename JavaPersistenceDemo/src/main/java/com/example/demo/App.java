package com.example.demo;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Student;
import com.example.service.StudentService;
import com.example.service.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc= new Scanner(System.in);
    	
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
        StudentService service=context.getBean("studentServiceImpl",StudentServiceImpl.class);
        Student student=null;
        int choice =0;
        while(choice!=5)
        {
        	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        	System.out.println("                           1. Create student");
	        System.out.println("                           2. Dispaly student by ID");
	    	System.out.println("                           3. Remove Student ");
	    	System.out.println("                           4. Update Student by ID");
	    	System.out.println("                           5. Exit");
	    	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	    	System.out.println("Please enter your choice :: ");
	    	choice=sc.nextInt();
	    	
	    	switch(choice)
	    	{
	    		case 1:
	    		{
	    			System.out.println("Enter the name of the student ::");
	    			String name=sc.next();
	    			student=service.creatStudent(new Student(name));
	    			System.out.println("Entered student:: "+student);
	    		}
	    		break;
	    		case 2:
	    		{
	    			System.out.println("Enter the ID of the student ::");
	    			student=service.findStudent(sc.nextInt());
	    			System.out.println("Student Details ::"+student);
	    		}
	    		break;
	    		case 3:
	    		{
	    			System.out.println("Enter the ID of the student ::");
	    			service.removeStudent(sc.nextInt());
	    		}
	    		break;
	    		case 4:
	    		{
	    			System.out.println("Enter the ID of the student ::");
	    			int id=sc.nextInt();
	    			System.out.println("Enter the name of the student ::");
	    			String name=sc.next();
	    			service.updateStudent(id, name);
	    		}
	    		break;
	    		case 5:
	    		{
	    			System.out.println("Exiting the system.......");
	    			System.exit(0);
	    		}
	    		break;
	    		default:
	    			System.out.println("Please enter the valid option from given above......");
	    	}
        }
    }
}
