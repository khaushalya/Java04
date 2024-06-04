import java.util.*;
class Example{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	boolean x=true;
L1:do{
	System.out.println("                     __   ______             __");
	System.out.println("                    |  \\ /      \\           |  \\");
	System.out.println("                     \\$$|  $$$$$$\\  ______  | $$  _______");
	System.out.println("                    |  \\| $$   \\$$ |      \\ | $$ /       \\");
	System.out.println("                    | $$| $$        \\$$$$$$\\| $$|  $$$$$$$");
	System.out.println("                    | $$| $$   __  /      $$| $$| $$");
	System.out.println("                    | $$| $$__/  \\|  $$$$$$$| $$| $$_____");
	System.out.println("                    | $$ \\$$    $$ \\$$    $$| $$ \\$$     \\");
	System.out.println("                     \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$");
	System.out.println("    _   _                       _                         _____                                        _");
	System.out.println("   | \\ | |                     | |                       / ____|                                      | |");
	System.out.println("   |  \\| |  _   _   _ __ __    | |__     ___   _ __     | |        ___    _ __  __    __  ___   _ __  | |_   ___   _ __ ");
	System.out.println("   | ,   | | | | | | '_   _ \\  | '_ \\   / _ \\ | '__|    | |       / _ \\  | '_ \\ \\ \\  / / / _ \\ | '__| | __| / _ \\ | '__|");
	System.out.println("   | |\\  | | |_| | | | | | | | | | ) | |  __/ | |       | |____  | ( ) | | | | | \\ \\/ / |  __/ | |    | |_ |  __/ | |  ");
	System.out.println("   |_| \\_|  \\__,_| |_| |_| |_| |_,__/   \\___| |_|        \\_____|  \\___/  |_| |_|  \\__/   \\___| |_|     \\__| \\___| |_| ");
	System.out.println("========================================================================================================================");
	System.out.println("\n\n             [01] Decimal Converter");
	System.out.println("             [02] Binary Converter");
	System.out.println("             [03] Octal Converter");
	System.out.println("             [04] Hexadecimal Converter");
	System.out.println("             [05] Roman Number Converter");
	System.out.print("\n\nEnter Option -> ");
	int cho=input.nextInt();
	//---------------------------------------------------------------
	if(cho==1){
		L2:while(x){
		System.out.println("+-------------------------------------------+");
		System.out.println("|            Decimal Converter              |");
		System.out.println("+-------------------------------------------+\n\n");
		System.out.print("Enter Decimal Number : ");
		int num=input.nextInt();
	if(num<0){
		System.out.println("          Invalid input...");
		System.out.print("\nDo you want to input number again (Y/N) -> ");
		char choice2=input.next().charAt(0);
		if(choice2=='y'||choice2=='Y'){continue L2;}
		if(choice2=='n'||choice2=='N'){continue L1;}
		}
	else{
		int Bi=num;
		int Oct=num;
		String bynary_num=" ";
		while(Bi>=2){
			int temp = Bi%2;
			bynary_num = temp+bynary_num;
			Bi/=2;
		}
		System.out.println("\nBinary number : "+Bi+bynary_num);
		String Oct_num=" ";
		
		while(Oct>=8){
			int temp = Oct%8;
			Oct_num = temp+Oct_num;
			Oct/=8;
		}
		System.out.println("Octal number : "+Oct+Oct_num);
		
		if(num>=16){
			int Hex=num;
			String Hex_num=" ";
		while(Hex>=16){
			int temp = Hex%16;
			String hex =" ";
			if(temp>9){switch(temp){
				case 10:hex="A";break;
				case 11:hex="B";break;
				case 12:hex="C";break;
				case 13:hex="D";break;
				case 14:hex="E";break;
				case 15:hex="F";break;
							}
						}
			else{hex=""+temp;}
					Hex_num = hex+Hex_num;
					Hex/=16;
				}
				System.out.println("Hexadecimal number : "+Hex+Hex_num);
			}
			
		else{
			int Hex=num;
			String hex="";
			if(Hex>9){switch(Hex){
				case 10:hex="A";break;
				case 11:hex="B";break;
				case 12:hex="C";break;
				case 13:hex="D";break;
				case 14:hex="E";break;
				case 15:hex="F";break;
							}
						}
			else{hex=""+Hex;}
			System.out.println("Hexadecimal number : "+hex);
			}
			System.out.print("\nDo you want to go to homepage (Y/N) -> ");
			char choice=input.next().charAt(0);
			if(choice=='y'||choice=='Y'){continue L1;}
			if(choice=='n'||choice=='N'){return;}
		}

		
	}}
	//-------------------------------------------------------------
	if(cho==2){
		L2:while(x){
		System.out.println("+-------------------------------------------+");
		System.out.println("|            Binary Converter               |");
		System.out.println("+-------------------------------------------+\n\n");
		System.out.print("Enter an Binary number :   ");

	int Binum=input.nextInt();
	int deci=0;
	int count=0;
	int count2=0;
	while(Binum!=0){
		int temp1=Binum%10;
		if(temp1>1){
			System.out.println("          Invalid input...\n");
			System.out.print("Do you want to input number again (Y/N) -> ");
			char choice2=input.next().charAt(0);
			if(choice2=='y'||choice2=='Y'){continue L2 ;}
			if(choice2=='n'||choice2=='N'){continue L1;}
			}
		count2+=temp1*Math.pow(2,count);
		count++;
		Binum/=10;
		}
	System.out.println("      Decimal Number: "+count2);
	int Oct=count2;
	String Oct_num=" ";
	while(Oct>=8){
			int temp = Oct%8;
			Oct_num = temp+Oct_num;
			Oct/=8;
		}
		System.out.println("      Octal number : "+Oct+Oct_num);
	if(count2>=16){
			int Hex=count2;
			String Hex_num=" ";
		while(Hex>=16){
			int temp = Hex%16;
			String hex =" ";
			if(temp>9){switch(temp){
				case 10:hex="A";break;
				case 11:hex="B";break;
				case 12:hex="C";break;
				case 13:hex="D";break;
				case 14:hex="E";break;
				case 15:hex="F";break;
							}
						}
			else{hex=""+temp;}
					Hex_num = hex+Hex_num;
					Hex/=16;
				}
				System.out.println("      Hexadecimal number : "+Hex+Hex_num);
			}
			
		else{
			int Hex=count2;
			String hex="";
			if(Hex>9){switch(Hex){
				case 10:hex="A";break;
				case 11:hex="B";break;
				case 12:hex="C";break;
				case 13:hex="D";break;
				case 14:hex="E";break;
				case 15:hex="F";break;
							}
						}
			else{hex=""+Hex;}
			System.out.println("      Hexadecimal number : "+hex);
			}
			System.out.print("\nDo you want to go to homepage (Y/N) -> ");

		char choice2=input.next().charAt(0);
		if(choice2=='y'||choice2=='Y'){continue L1;}
		if(choice2=='n'||choice2=='N'){return;}

	}}
	//---------------------------------------------------------------
	if(cho==3){
	L3: while(x){
	System.out.println("+-----------------------------------------+");
	System.out.println("|           Octal Converter               |");
	System.out.println("+-----------------------------------------+");
	System.out.print("\n\nEnter an Octal number :   ");
	int octal=input.nextInt();
	int temp=octal;
	int Oct=0;
	int count=0;
	while(temp!=0){
		int temp2=temp%10;
		if(temp2>7){
			System.out.println("          Invalid input...\n");
			System.out.print("Do you want to input number again (Y/N) -> ");
			char choice3=input.next().charAt(0);
			if(choice3=='y'||choice3=='Y'){continue L3 ;}
			if(choice3=='n'||choice3=='N'){return;}
			}
		Oct+=temp2*(Math.pow(8,count));
		count++;
		temp/=10;
		}
	System.out.println("      Decimal number : "+Oct);
	int bin=Oct;
	String bi="";
	int temp3=0;
	while(bin>1){
		temp3 =bin%2;
		bi=temp3+bi;
		bin/=2;
		}
		System.out.println("      Binary number : "+bin+bi);
		if(Oct>=16){
			int Hex=Oct;
			String Hex_num=" ";
		while(Hex>=16){
			int temp4 = Hex%16;
			String hex =" ";
			if(temp>9){switch(temp){
				case 10:hex="A";break;
				case 11:hex="B";break;
				case 12:hex="C";break;
				case 13:hex="D";break;
				case 14:hex="E";break;
				case 15:hex="F";break;
							}
						}
			else{hex=""+temp4;}
					Hex_num = hex+Hex_num;
					Hex/=16;
				}
				System.out.println("      Hexadecimal number : "+Hex+Hex_num);
			}
			
		else{
			int Hex=Oct;
			String hex="";
			if(Hex>9){switch(Hex){
				case 10:hex="A";break;
				case 11:hex="B";break;
				case 12:hex="C";break;
				case 13:hex="D";break;
				case 14:hex="E";break;
				case 15:hex="F";break;
							}
						}
			else{hex=""+Hex;}
			System.out.println("      Hexadecimal number : "+hex);
			}
			System.out.print("\nDo you want to go to homepage (Y/N) -> ");

		char choice2=input.next().charAt(0);
		if(choice2=='y'||choice2=='Y'){continue L1;}
		if(choice2=='n'||choice2=='N'){return;}

	}}
	//-------------------------------------------------------------
	if(cho==4){while(x){
	System.out.println("\n+-----------------------------------------+");
	System.out.println("|        HexaDecimal Converte             |");
	System.out.println("+-----------------------------------------+");
		System.out.print("\nEnter an Hexadecimal number : ");
	String Hex = input.next();
	int len =Hex.length();
	int count=0;
	
	int total=0;
	while(len!=0){
		char ch=Hex.charAt(len-1);
		len--;
		int temp=0;
		switch(ch){
			case 'a' :;case 'A' :temp=10;break;
			case 'b' :;case 'B' :temp=11;break;
			case 'c' :;case 'C' :temp=12;break;
			case 'd' :;case 'D' :temp=13;break;
			case 'e' :;case 'E' :temp=14;break;
			case 'f' :;case 'F' :temp=15;break;
			case '0':temp=0;break;
			case '1':temp=1;break;
			case '2':temp=2;break;
			case '3':temp=3;break;
			case '4':temp=4;break;
			case '5':temp=5;break;
			case '6':temp=6;break;
			case '7':temp=7;break;
			case '8':temp=8;break;
			case '9':temp=9;break;
			}
			total+=temp*(Math.pow(16,count));
			count++;
		}
	System.out.println("\nDecimal number : "+total);
	int Bi=total;
		int Oct=total;
		String bynary_num=" ";
		while(Bi>=2){
			int temp = Bi%2;
			bynary_num = temp+bynary_num;
			Bi/=2;
		}
		System.out.println("Binary number : "+Bi+bynary_num);
		String Oct_num=" ";
		
		while(Oct>=8){
			int temp = Oct%8;
			Oct_num = temp+Oct_num;
			Oct/=8;
		}
		System.out.println("Octal number : "+Oct+Oct_num);
		System.out.print("\nDo you want to go to homepage (Y/N) -> ");
		char choice2=input.next().charAt(0);
		if(choice2=='y'||choice2=='Y'){continue L1;}
		if(choice2=='n'||choice2=='N'){return;}
}}
	if(cho==5){
		boolean y =true;
	L3:do{
	
	System.out.println("\n+-------------------------------------------+");
	System.out.println("|        Roman Number Converter             |");
	System.out.println("+-------------------------------------------+\n");
		System.out.println("          [1] Decimal Number to Roman Number Converter ");
		System.out.println("          [2] Roman Number to Decimal Number Converter ");
		System.out.print("\nEnter an Option -> ");
		int choi = input.nextInt();

	if(choi==2){
	System.out.println("\n+-------------------------------------------------------------+");
	System.out.println("|            Roman Number to Decimal Number Converter         |");
	System.out.println("+-------------------------------------------------------------+\n");
	System.out.print("Enter an Roman number : ");
	String rom =input.next();
	int tota=0;
	int temp1=0;
	int temp2=0;
	int temp3=0;
	int coun=0;
	int len1 = rom.length();

	while(len1!=0){
		
		char ch1=rom.charAt(coun);
		switch(ch1){
			case 'I':temp1=1;break;
			case 'V':temp1=5;break;
			case 'X':temp1=10;break;
			case 'L':temp1=50;break;
			case 'C':temp1=100;break;
			case 'D':temp1=500;break;
			case 'M':temp1=1000;break;
			}
			if(temp2<temp1){temp2=-temp2;}
			tota+=temp2;
			coun++;
			len1--;

			
		if(len1>0){
			char ch2=rom.charAt(coun);
		switch(ch2){
			case 'I':temp2=1;break;
			case 'V':temp2=5;break;
			case 'X':temp2=10;break;
			case 'L':temp2=50;break;
			case 'C':temp2=100;break;
			case 'D':temp2=500;break;
			case 'M':temp2=1000;break;
			}
			coun++;
			len1--;

			if(temp1<temp2){temp1=-temp1;}
				if(len1==0){	tota+=temp2;}}
		
			tota+=temp1;
		}
		System.out.println("      Decimal number: "+tota);
		System.out.print("\nDo you want to go to homepage (Y/N) -> ");

		char choice4=input.next().charAt(0);
		if(choice4=='y'||choice4=='Y'){continue L1;}
		if(choice4=='n'||choice4=='N'){return;}}
	//---------------------------------------------------------------------------------
	if(choi==1){
	System.out.println("\n+-------------------------------------------------------------+");
	System.out.println("|           Decimal Number to Roman Number Converter          |");
	System.out.println("+-------------------------------------------------------------+\n");
	System.out.print("Enter an Decimal number : ");
		int deci =input.nextInt();
	System.out.print("      Roman numeral : ");
	if(deci>=1000){
		int a =deci/1000;
		for(int i=0;i<a;i++){
			System.out.print("M");
			deci=deci-1000;
			if(i==2){
				break;
				}
				}
		}
	if(deci>=900){
		System.out.print("CM");
		deci=deci-900;
		}
	if(deci>=500){
		System.out.print("D");
		deci=deci-500;
		for(int i=0;i<3;i++){
			if(deci<100){
				break;
				}
				System.out.print("C");
				deci=deci-100;
				}
			}
	if(deci>=400){
		System.out.print("CD");
		deci=deci-400
		;}
	if(400>deci & 100<=deci){
		int a = deci/100;
		for(int i=0;i<a;i++){
			System.out.print("C");
			deci=deci-100;
			}
		}
	if(99>=deci & 90<=deci){
		System.out.print("XC");
		deci=deci-90;
		}
	if(deci>=50){
		System.out.print("L");
		deci=deci-50;int a =deci/10;
		for(int i=0;i<a;i++){
			System.out.print("X");
			deci=deci-10;
			}
		}
	if(deci>=40){
		System.out.print("XL");
		deci=deci-40;
		}
	if(deci>=10){
		int a =deci/10;
		for(int i=0;i<a;i++){
			System.out.print("X");
			deci=deci-10;
			}
		}
	if(deci>=9){
		System.out.print("IX");
		deci=deci-9;
		}
	if(deci>=5){
		System.out.print("V");
		deci=deci-5;
		int a =deci;
		for(int i=0;i<a;i++){
			System.out.print("I");
			deci=deci-1;
			}
			}
	if(deci>=4){
		System.out.print("IV");
		deci=deci-4;
		}
	if(deci>=1){
		int a =deci;
		for(int i=0;i<a;i++){
			System.out.print("I");
			deci=deci-1;
			}
		}	
	System.out.print("\n\nDo you want to go to homepage (Y/N) -> ");
	char choice3=input.next().charAt(0);
		if(choice3=='y'||choice3=='Y'){continue L1;}
		if(choice3=='n'||choice3=='N'){return;}}

		}while(y);
	}
		}while(x);
	}
}
