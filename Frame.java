package week1;

import java.util.Scanner;

public class Frame {
	public static void main(String[] args) {
	/* ���ݶ��� */
	float length;
	float width;
	char typeOfFrame;
	String colorOfFrame;
	int numberOfCrown;
	
	float totalCost;
	float costOfFrame = 0; 
	float costOfColor;
	float costOfCardboard;
	float costOfGlass;
	float costOfCrown;
	
	/* �������� */
	Scanner scan = new Scanner(System.in);
	System.out.print("��������Ƭ�ĳ�(��λΪinch):");
	length = scan.nextFloat();
	System.out.print("��������Ƭ�Ŀ�(��λΪinch):");
	width = scan.nextFloat();
	System.out.print("��������������(r or f;rΪ��ͨ���,fΪ�������):");
	typeOfFrame = scan.next().charAt(0);//char������
	System.out.print("������������ɫ(��ɫ��Ӣ��):");
	colorOfFrame = scan.next();
	System.out.print("���������Ļʹڸ���(����0��1��2��3��4):");
	numberOfCrown = scan.nextInt();
	
	/* ���ݴ��� */
	switch(typeOfFrame) {
	case'r':
		costOfFrame = ((length+width)*2+4)*0.15f;
		break;
	case'f':
		costOfFrame = ((length+width)*2+4)*0.25f;
		break;
	default:
		System.out.print("��������ȷ�ķ��ţ�");
	}
	
	switch(colorOfFrame) {
	case"white":
		costOfColor = 0;
		break;
	default:
		costOfColor = ((length+width)*2+4)*0.1f;
	}
	
	costOfCardboard = length*width*0.02f;
	costOfGlass = length*width*0.07f;
	costOfCrown = numberOfCrown*0.35f;
	
	totalCost = costOfFrame+costOfColor+costOfCardboard+costOfGlass+costOfCrown;
	

	/* ������� */
	System.out.println();
	System.out.println("�۸�");
	System.out.println(typeOfFrame+"�����Ļ���Ϊ:"+costOfFrame);
	System.out.println("��"+colorOfFrame+"��ɫ�Ļ���Ϊ:"+costOfColor);
	System.out.println("Ӳֽ��Ļ���Ϊ:"+costOfCardboard);
	System.out.println("�����Ļ���Ϊ:"+costOfGlass);
	System.out.println("�ʹڵĻ���Ϊ:"+costOfCrown);
	System.out.println();
	System.out.println("�ܻ���Ϊ:"+totalCost);
}

}

