package project1.ver07;

import java.util.Scanner;


public class PhoneInfo
{
	//멤버변수 3가지
	String name;//이름
	String phoneNumber ;//전화번호
	
	
	//3개의 매개변수를 가진 생성자
	public PhoneInfo(String name, String phoneNumber, String birthday)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}
	//2개의 매개변수를 가진 생성자 오버로딩
	public PhoneInfo(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}
	//쇼폰인포 메소드도 가지고있음
	public void showPhoneInfo()
	{
		System.out.println("이름:"+name);
		System.out.println("전화번호:"+phoneNumber);
		
	}
	

}
