package week2;

import java.util.Scanner;

//���nλˮ�ɻ���
public class NarcissisticNumber {
	public static void main(String[] args) {
		int weishu;
		int n;// ÿһλ������
		System.out.print("������λ��:");
		Scanner scan = new Scanner(System.in);
		weishu = scan.nextInt();
		System.out.println(weishu + "λˮ�ɻ�������:");
		for (int i = (int) Math.pow(10, weishu - 1); i < Math.pow(10, weishu); i++) {// ����ÿ����������3λ����100��999
			int number = i, sum = 0;
			for (int j = 1; j <= weishu; j++) { // ��ȡÿһλ
				n = number % 10;
				sum += (int) Math.pow(n, weishu);
				number = number / 10;
			}
			if (sum == i)
				System.out.println(i);
		}
	}

}
