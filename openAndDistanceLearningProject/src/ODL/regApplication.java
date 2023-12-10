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
			  System.out.println("Enter to open in Youtube\n1. Python Video PlayList\n2. JavaScript Video PlayList\n3. Java Video PlayList\n4. c++ Video PlayList");
			  int op = sc.nextInt();
			  switch(op) {
			  case 1:desktop.browse(oURL1);
			  break;
			  case 2:desktop.browse(oURL2);
			  break;
			  case 3:desktop.browse(oURL3);
			  break;
			  case 4:desktop.browse(oURL4);
			  break;
			  default:System.out.println("Enter correct option");
			  }
			  videolink();
			  
			} 
		      catch (Exception e) {
			  e.printStackTrace();
			}}}
