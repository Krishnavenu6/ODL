package ODL;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Registration {
	String Name;
	String Emailid;
	String Password;
	
	
	Scanner sc = new Scanner(System.in);
	public void registers() throws Exception {
		
		
		System.out.println("Enter Name");
		Name=sc.next();
		
		System.out.println("Enter Emailid");
		Emailid=sc.next();
		
		System.out.println("Enter Password");
		Password=sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		Connection teja=null;
		
		String dbURL = "jdbc:mysql://localhost:3306/user";
		String username="root";
		String password="root";
		
		try {
			teja=DriverManager.getConnection(dbURL,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String query1="insert into user1(Name,Emailid,Password) values(?,?,?)";
		
		 try(PreparedStatement preparedStatement=teja.prepareStatement(query1)) {
			
				preparedStatement.setString(1, Name);
				preparedStatement.setString(2, Emailid);
				preparedStatement.setString(3, Password);
				
				preparedStatement.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		 
			int useropt=1;
			
			while(useropt==1) {
				System.out.println("Registration Completed");
				System.out.println("-----------------***-----------------");
				System.out.println("Enter 1 to Login");
				System.out.println("Enter 2 to Exit");
				int select=sc.nextInt();
				
				
				if(select==1) {
					Log log =new Log();
					log.login();
				}
				else if(select==2) {
					System.out.println("thank you");
				}
				
		}
	}
	public void home() {
		System.out.println("----------------------------------------");
		  System.out.println("You are Logged into Website");
		  System.out.println("----------------------------------------");
		  System.out.println("Enter 1 to Show Course Details");
		  System.out.println("Enter 2 to participate Quiz");
		  System.out.println("Enter 3 to Interactive Learning");
		  System.out.println("Enter 4 to Course Videos");
		  
		  int select=sc.nextInt();
		  CourseDetails cd= new CourseDetails();
		  switch(select) {
		  case 1:
			try {
				cd.CourseDetails1();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			    break;					    
		  case 2:
			    ParticipateQuiz pq=new ParticipateQuiz();
			    pq.ParticipateQuiz1();
			    break;					    
		  case 3:
			    InteractiveLearning IL=new InteractiveLearning();
			    System.out.println("Enter 1 for  Python Learning");
			    System.out.println("Enter 2 for JavaScript Learning");
			    System.out.println("Enter 3 for  Java  Learning");
			    System.out.println("Enter 4 for cpp Learning");
			    Scanner sc1=new Scanner(System.in);
			    int choice=sc1.nextInt();
			    switch(choice) {
			    case 1:
			    	try {
						IL.PythonLearn();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	break;
			    case 2:
			    	try {
						IL.JavaScriptLearn();
					} catch (URISyntaxException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	break;
			    case 3:
			    	try {
						IL.JavaLearn();
					} catch (URISyntaxException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	break;
			    case 4:
			    	try {
			    		IL.cppLearn();
					} catch (URISyntaxException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			        break;
			    }
		  case 4:
			    regApplication rA=new regApplication();
			    rA.videolink();
			    break;

		    }
	}
	

}
