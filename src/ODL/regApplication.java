package ODL;

import java.awt.Desktop;
import java.net.URI;

import java.util.Scanner;

public class regApplication {


	public void videolink() {
		
		try {
			  Desktop desktop = java.awt.Desktop.getDesktop();
	
			  URI oURL1 = new URI("https://youtube.com/playlist?list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&si=UAXyc60noTooICEU");
			  URI oURL2 = new URI("https://youtube.com/playlist?list=PLsyeobzWxl7rrvgG7MLNIMSTzVCDZZcT4&si=hh0FH-hbrbEnzhk5");
			  URI oURL3 = new URI("https://youtube.com/playlist?list=PLBlnK6fEyqRjKA_NuK9mHmlk0dZzuP1P5&si=Bm5ZvqiCAf5fbgBd");
			  URI oURL4 = new URI("https://youtube.com/playlist?list=PLdo5W4Nhv31YU5Wx1dopka58teWP9aCee&si=CDiUFibU9ykdLnLI");
			  Scanner sc = new Scanner(System.in);
			  System.out.println("Enter to open in Youtube\n1. Python Video PlayList\n2. JavaScript Video PlayList\n3. Java Video PlayList\n4. c++ Video PlayList\nEnter '5' for Main Menu ");
			  int op = sc.nextInt();
			  switch(op) {
			  case 1:desktop.browse(oURL1);
			  break;
			  
//			  System.out.println("Enter 1 to Change Language");
//		        System.out.println("Enter 2 for Main Menu");
//		        int choice=sc.nextInt();
//		           switch(choice) {
//		        case 1:
//		    	    CourseDetails cd=new CourseDetails();
//		        	 cd.CourseDetails1();
//		    	     break;
//		        case 2:
//		    	    Reg r=new Reg();
//		        	 r.home();
//		    	   break;
//		       }
//		      break;
			  case 2:desktop.browse(oURL2);
			  
//			  System.out.println("Enter 1 to Change Language");
//		        System.out.println("Enter 2 for Main Menu");
//		        int choice1=sc.nextInt();
//		           switch(choice1) {
//		        case 1:
//		    	    CourseDetails cd=new CourseDetails();
//		        	 cd.CourseDetails1();
//		    	     break;
//		        case 2:
//		    	    Reg r=new Reg();
//		        	 r.home();
//		    	   break;
//		       }
		      break;
			  case 3:desktop.browse(oURL3);
//			  System.out.println("Enter 1 to Change Language");
//		        System.out.println("Enter 2 for Main Menu");
//		        int choice2=sc.nextInt();
//		           switch(choice2) {
//		        case 1:
//		    	    CourseDetails cd=new CourseDetails();
//		        	 cd.CourseDetails1();
//		    	     break;
//		        case 2:
//		    	    Reg r=new Reg();
//		        	 r.home();
//		    	   break;
//		       }
		      break;
			  case 4:desktop.browse(oURL4);
//			  System.out.println("Enter 1 to Change Language");
//		        System.out.println("Enter 2 for Main Menu");
//		        int choice3=sc.nextInt();
//		           switch(choice3) {
//		        case 1:
//		    	    CourseDetails cd=new CourseDetails();
//		        	 cd.CourseDetails1();
//		    	     break;
//		        case 2:
//		    	    Reg r=new Reg();
//		        	 r.home();
//		    	   break;
//		       }
		      break;
			  case 5:
				  Registration r=new Registration();
				  r.home();
			  default:System.out.println("Enter correct option");
			  }
			  videolink();
			  System.out.println("Enter 1 to Change Language");
		        System.out.println("Enter 2 for Main Menu");
		        int choice1=sc.nextInt();
		           switch(choice1) {
		        case 1:
		    	    CourseDetails cd=new CourseDetails();
		        	 cd.CourseDetails1();
		    	     break;
		        case 2:
		    	    Registration r=new Registration();
		        	 r.home();
		    	   break;
		       }
			  
			} 
		      catch (Exception e) {
			  e.printStackTrace();
			}}}
