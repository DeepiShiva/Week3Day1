package Org.System;

public class Desktop extends Computer {

	public void desktopSize()
	{
		System.out.println("This Desktop size is 4 GB RAM");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopSize();
	}

}
