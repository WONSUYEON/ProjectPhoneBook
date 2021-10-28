package project1.ver03;

import java.util.Scanner;



public class PhoneBookManager
{
	private PhoneInfo[] myPhoneInfo;
	private int numOfPhone;
	
	public PhoneBookManager(int num)
	{
		this.myPhoneInfo = new PhoneInfo[num];
		this.numOfPhone = 0;
	}


	//정보//입력메소드
	public void dataInput()
	{
		Scanner scanner = new Scanner(System.in);
		String name, phoneNumber, birthday;				
		
		System.out.println("이름:");name = scanner.nextLine();
		System.out.println("전화번호:");phoneNumber = scanner.nextLine();
		System.out.println("생년월일:");birthday = scanner.nextLine();
		
		PhoneInfo pi = new PhoneInfo(name, phoneNumber, birthday);
		myPhoneInfo[numOfPhone++] = pi;
		
		System.out.println("친구정보 입력이 완료되었습니다.");			
	}
		
	//검색메소드
	public void dataSearch()
	{
		boolean isFind = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요:");
		String searchName = scanner.nextLine();
		
		for(int i= 0 ; i<numOfPhone; i++) {
			if(searchName.compareTo(myPhoneInfo[i].name)==0) {
				myPhoneInfo[i].showPhoneInfo();
				System.out.println("데이터검색이 완료되었습니다");
				isFind=true;
			}
			////////일단 검색해도 정보가 안나오는 문제점!!!!!!!!
		}
	}	
	//삭제메소드
	public void dataDelete()
	{
		System.out.println("데이터삭제를 시작합니다");
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름");
		String deleteName = scanner.nextLine();
		int deleteIndex = -1;
		for(int i=0; i<numOfPhone ; i++) {
			if(deleteName.compareTo(myPhoneInfo[i].name)==0) {
				myPhoneInfo[i]=null;
				deleteIndex = i;
				numOfPhone--;
				break;
			}
		}
		if(deleteIndex==1) {
			System.out.println("삭제된 데이터가 없습니다");
		}
		else {
			for(int i=deleteIndex; i<numOfPhone; i++)
				myPhoneInfo[i]= myPhoneInfo[i+1];
		}
		System.out.println("==데이터("+deleteIndex+"번)가 삭제되었습니다==");
	}
		
	//주소록 전체출력메소드
	public void dataAllShow()
	{
		for(int i=0; i<numOfPhone ; i++) {
			myPhoneInfo[i].showPhoneInfo();
		}
		System.out.println("전체정보출력했다요");
	}
}
