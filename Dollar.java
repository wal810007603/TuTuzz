package week1;

import java.util.Scanner;

public class Dollar {
	public static void main(String args[]) {
		/* ���ݶ��� */
		float amount; // ���
		int numberOfDollars; // ��Ԫ������
		int numberOf_5Cent;// 5����Ӳ�ҵ�����
		int numberOf_10Cent;// 10����Ӳ�ҵ�����
		int numberOf_20Cent;// 20����Ӳ�ҵ�����
		int numberOf_50Cent;// 50����Ӳ�ҵ�����
		int numberOf_1Dollar;// 1��ԪӲ�ҵ�����
		int numberOf_2Dollar;// 2��ԪӲ�ҵ�����

		/* �������� */
		Scanner scan = new Scanner(System.in);
		System.out.print("��������(��λΪ��Ԫ):");
		amount = scan.nextFloat();

		/* ���ݴ��� */
		numberOfDollars = (int) amount;
		numberOf_50Cent = (int) ((amount - (float) numberOfDollars) * 100 / 50);
		numberOf_20Cent = (int) ((amount - (float) numberOfDollars) * 100 - numberOf_50Cent * 50) / 20;
		numberOf_10Cent = (int) (((amount - (float) numberOfDollars) * 100 - numberOf_50Cent * 50
				- numberOf_20Cent * 20) / 10);
		numberOf_5Cent = ((int) ((amount - (float) numberOfDollars) * 100) - numberOf_50Cent * 50 - numberOf_20Cent * 20
				- numberOf_10Cent * 10) / 5;
		numberOf_2Dollar = (int) (amount / 2);
		numberOf_1Dollar = (int) amount - numberOf_2Dollar * 2;

		/* ������� */
		System.out.println("$" + amount + " would be " + "$" + numberOfDollars + "," + numberOf_50Cent + "x50c,"
				+ numberOf_20Cent + "x20c," + numberOf_10Cent + "x10c,and " + numberOf_5Cent + "x5c.");
		System.out.println("2��ԪӲ�ҵ�����:" + numberOf_2Dollar);
		System.out.println("1��ԪӲ�ҵ�����:" + numberOf_1Dollar);
	}

}
