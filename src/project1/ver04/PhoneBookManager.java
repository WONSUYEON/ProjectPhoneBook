package project1.ver04;

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
	public static void printMenu() {
		System.out.println("선택하세요...");
		System.out.println("1.데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 주소록 출력");
		System.out.println("5.프로그램 종료");
		System.out.println("선택:");
	}

	//정보//입력메소드
	public void dataInput()
	{	
			Scanner scanner = new Scanner(System.in);
			int choice;
			System.out.println("데이터 입력을 시작합니다.");
			System.out.println("1.일반");
			System.out.println("2. 동창");
			System.out.println("3. 회사 ");
			
			
			System.out.println("선택>>");choice=scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("이름:");
			String name = scanner.nextLine();
			System.out.println("전화번호:");
			String phoneNumber = scanner.nextLine();

			
			if(choice == 1) {
				
				PhoneInfo pi = new PhoneInfo(name, phoneNumber);
				myPhoneInfo[numOfPhone++] = pi;
			}
			else if(choice ==2) {
				
				System.out.println("전공:");
				String major = scanner.nextLine();
				System.out.println("학년:");
				String grade = scanner.nextLine();
				PhoneSchoolInfo psi = new PhoneSchoolInfo(name, phoneNumber, major, grade);
				myPhoneInfo[numOfPhone++] = new PhoneSchoolInfo(name, phoneNumber, major, grade);
			}
			
			else if (choice ==3) {
				
				System.out.println("회사명:");
				String companyName = scanner.nextLine();
				PhoneCompanyInfo pci = new PhoneCompanyInfo(name, phoneNumber, companyName);
				myPhoneInfo[numOfPhone++] = new PhoneSchoolInfo(name, phoneNumber, phoneNumber, companyName);
			}
		
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
