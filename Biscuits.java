package week1;

import java.util.Scanner;

public class Biscuits {
	public static void main(String[] args) {
		/* ���ݶ��� */
		int biscuitsNumber; // ���ɵ�����
		int boxNumber; // ���ӵ�����
		int containerNumber;// ����������
		int leftoverBiscuitsNumber;// ʣ����ɵ�����
		int leftoverBoxNumber;// ʣ����ӵ�����

		/* �������� */
		Scanner scan = new Scanner(System.in);
		System.out.print("��������ɵ�����:");
		biscuitsNumber = scan.nextInt();

		/* ���ݴ��� */
		boxNumber = biscuitsNumber / 24;
		leftoverBiscuitsNumber = biscuitsNumber % 24;
		containerNumber = boxNumber / 75;
		leftoverBoxNumber = boxNumber % 75;

		/* ������� */
		System.out.println("���ӵ�����Ϊ:" + boxNumber);
		System.out.println("����������Ϊ:" + containerNumber);
		System.out.println("ʣ����ɵ�����Ϊ:" + leftoverBiscuitsNumber);
		System.out.println("ʣ����ӵ�����Ϊ:" + leftoverBoxNumber);

	}
}
