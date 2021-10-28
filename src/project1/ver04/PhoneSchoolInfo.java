package project1.ver04;

public class PhoneSchoolInfo extends PhoneInfo
{
	String major;//전공
	String grade;//학년
	
	public PhoneSchoolInfo (String name, String phoneNumber, String major,String grade)
	{
		super(name, phoneNumber);//부모를 받을땐 슈퍼
		this.major = major;//자기자신을 상속할땐 디스
		this.phoneNumber = phoneNumber;
		
	}
	
	@Override
	public void showPhoneInfo()
	{
		
		super.showPhoneInfo();
		System.out.println("전공:"+major);
		System.out.println("학년:"+grade);
	}
}
