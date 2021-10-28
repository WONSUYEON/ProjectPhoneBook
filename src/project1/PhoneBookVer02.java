package project1;

import java.util.Scanner;

import project1.ver02.PhoneInfo;

public class PhoneBookVer02
{
	public static void menuShow() {
		System.out.println("선택하세요...");
		System.out.println("1.데이터 입력");
		System.out.println("2.프로그램 종료");
	}
	
	public static void main(String[] args)
	{	
		Scanner scanner = new Scanner(System.in);	
		
		while(true) {
			menuShow();
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1: 
				String name, phoneNumber, birthday;				
				
				System.out.println("이름:");name = scanner.nextLine();
				System.out.println("전화번호:");phoneNumber = scanner.nextLine();
				System.out.println("생년월일:");birthday = scanner.nextLine();
				
				PhoneInfo pi = new PhoneInfo(name, phoneNumber, birthday);
				pi.showPhoneInfo();				
				break;
		
			case 2:
				System.out.println("프로그램종료");
				return;
			}
		}
	}
}
