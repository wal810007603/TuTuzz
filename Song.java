package week1;

import java.util.Scanner;

public class Song {
	public static void main(String args[]) {
		/* ���ݶ��� */
		// final����(����)��final���εĳ�Ա������ʾ����,ֻ�ܱ���ֵһ��,��ֵ��ֵ�޷��ı�!
		// java��Ĭ��������С����double���͵�,����Ҫ�����ֺ���+f
		final float MANAGER_COMMISSION = 0.12f;
		final float SITE_COMMISSION = 0.03f;

		// �����շ巨����
		String songTitle;
		float songPrice;
		int number;

		float totalRevenue;
		float managerCommission;
		float siteCommission;

		/* �������� */
		Scanner scan = new Scanner(System.in);
		// ����֮ǰ������ʾ
		// next()���Ҳ��������Դ�ɨ��������һ���������,һ��Ҫ��ȡ����Ч�ַ���ſ��Խ�������
		System.out.print("�������������:");
		songTitle = scan.nextLine();

		System.out.print("�������������:");
		songPrice = scan.nextFloat();

		System.out.print("��������������:");
		number = scan.nextInt();

		/* ���ݴ��� */
		totalRevenue = songPrice * number;
		managerCommission = totalRevenue * MANAGER_COMMISSION;
		siteCommission = totalRevenue * SITE_COMMISSION;

		/* ������� */
		System.out.println("������" + number + "�ݡ�" + songTitle + "��,����Ϊ" + songPrice + "Ԫ");
		System.out.println("������Ϊ:" + totalRevenue);
		System.out.println("�����Ӷ��Ϊ:" + managerCommission);
		System.out.println("��վ��Ӷ��Ϊ:" + siteCommission);

	}

}

/*
 * next()һ��Ҫ��ȡ����Ч�ַ���ſ��Խ������룬��������Ч�ַ�֮ǰ�����Ŀո����Tab����Enter���Ƚ�������
 * next()�������Զ�����ȥ����ֻ����������Ч�ַ�֮��next()�����Ž��������Ŀո����Tab����Enter������Ϊ�ָ������������
 * �򵥵�˵��next()���Ҳ��������Դ�ɨ��������һ��������ǡ�������ǵ�ǰ������ָ�ģʽƥ���������Ϣ��
 * ����next�������ܵõ����ո���ַ�����nextLine()�����Ľ�����ֻ��Enter����
 * ��nextLine()�������ص���Enter��֮ǰ�������ַ������ǿ��Եõ����ո���ַ����ġ�
 */