package project1;

import java.util.Scanner;

import project1.ver03.PhoneBookManager;
import project1.ver03.PhoneInfo;

public class PhoneBookVer03
{
	public static void printMenu() {
		System.out.println("선택하세요...");
		System.out.println("1.데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 주소록 출력");
		System.out.println("5.프로그램 종료");
	}
	
	public static void main(String[] args)
	{	
		Scanner scanner = new Scanner(System.in);	
		PhoneBookManager manager = new PhoneBookManager(100);
		
		while(true) {
			printMenu();
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1: 
				manager.dataInput();
				break;
			case 2://검색
				manager.dataSearch();
				break;
			case 3://삭제
				manager.dataDelete();
				break;
			case 4://주소록 출력
				manager.dataAllShow();
				break;
				
			case 5://프로그램 종료
				System.out.println("프로그램종료");
				return;
			}
		}

	}
}


