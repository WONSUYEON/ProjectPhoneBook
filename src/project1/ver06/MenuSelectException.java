package project1.ver06;

public class MenuSelectException extends Exception	
{	
	public MenuSelectException() {
		super("1~5사이의 숫자를 입력하세요.");
	}

}