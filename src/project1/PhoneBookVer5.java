package project1;

import java.util.Scanner;

import project1.ver05.MenuItem;
import project1.ver05.PhoneBookManager;
import project1.ver05.PhoneInfo;
import project1.ver05.SubMenuItem;

public class PhoneBookVer5 implements MenuItem,SubMenuItem
{
	
	public static void main(String[] args)
	{	
		Scanner scanner = new Scanner(System.in);	
		PhoneBookManager manager = new PhoneBookManager(100);
		
		while(true) {
			manager.printMenu();
			
			int choice = scanner.nextInt();
			
			
			switch(choice) {
			case 1: //데이터입력
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


