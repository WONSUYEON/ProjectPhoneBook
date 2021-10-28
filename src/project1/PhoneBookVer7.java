package project1;

import java.util.InputMismatchException;
import java.util.Scanner;

import project1.ver07.MenuItem;
import project1.ver07.MenuSelectException;
import project1.ver07.PhoneBookManager;
import project1.ver07.PhoneInfo;
import project1.ver07.SubMenuItem;

public class PhoneBookVer7 implements MenuItem,SubMenuItem
{
	
	public static void main(String[] args)
	{	
		Scanner scanner = new Scanner(System.in);	
		PhoneBookManager manager = new PhoneBookManager(100);
		
		while(true) {
			try {
				
			manager.printMenu();
			int choice = scanner.nextInt();
			if(choice<1 ||choice>5) {
				MenuSelectException ex = new MenuSelectException();
				throw ex;
			}
			
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
			catch (MenuSelectException e) {
				System.out.println(e.getMessage());
			}
			catch (InputMismatchException e) {
				System.out.println("[예외]숫자만 입력하세요");
			}
			catch (Exception e) {
				System.out.println("[예외]알 수 없는 예외발생");
				e.printStackTrace();
			}
			scanner.nextLine();	
		}
	}
}