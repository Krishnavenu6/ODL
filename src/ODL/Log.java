package ODL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Log{
	String email;
	String  Password;
     
	
	public void login() throws Exception {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your Emailid");
			email=sc.next();
			
			System.out.println("Enter your Password");
			Password=sc.next();
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Connection venu=null;
			
			String dbURL = "jdbc:mysql://localhost:3306/user";
			String username="root";
			String password="root";
			
			try {
				venu=DriverManager.getConnection(dbURL,username,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String query="select * from user1";
			PreparedStatement view;
			
			
			try {
				int user=1;
				view=venu.prepareStatement(query);
				ResultSet rs=view.executeQuery(query);
				while(rs.next()) {
					if(email.equals(rs.getString("Emailid")) && Password.equals(rs.getString("Password"))) {
	
					  user=2;
					  Registration r=new Registration();
					  r.home();
//					  System.out.println("----------------------------------------");
//					  System.out.println("You are Logged into Website");
//					  System.out.println("----------------------------------------");
//					  System.out.println("Enter 1 to Show Course Details");
//					  System.out.println("Enter 2 to participate Quiz");
//					  System.out.println("Enter 3 to Interactive Learning");
//					  System.out.println("Enter 4 to Course Videos");
//					  
//					  int select=sc.nextInt();
//					  CourseDetails cd= new CourseDetails();
//					  switch(select) {
//					  case 1:
//						    cd.CourseDetails1();
//						    break;					    
//					  case 2:
//						    ParticipateQuiz pq=new ParticipateQuiz();
//						    pq.ParticipateQuiz1();
//						    break;					    
//					  case 3:
//						    InteractiveLearning IL=new InteractiveLearning();
//						    System.out.println("Enter 1 for  Python Learning");
//						    System.out.println("Enter 2 for JavaScript Learning");
//						    System.out.println("Enter 3 for  Java  Learning");
//						    System.out.println("Enter 4 for BootStrap Learning");
//						    Scanner sc1=new Scanner(System.in);
//						    int choice=sc1.nextInt();
//						    switch(choice) {
//						    case 1:
//						    	IL.PythonLearn();
//						    	break;
//						    case 2:
//						    	IL.JavaScriptLearn();
//						    	break;
//						    case 3:
//						    	IL.JavaLearn();
//						    	break;
//						    case 4:
//						    	IL.BootStrapLearn();
//						        break;
//						    }
//					  case 4:
//						    regApplication rA=new regApplication();
//						    rA.videolink();
//						    break;
////						  InteractiveLearning();
//					    }		
					  
				}
				}
			if(user==1) {
					System.out.println("Wrong Email or Password ");
					login();
				}
			}
					  
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


