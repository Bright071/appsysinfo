package Pet;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		Pet d = new Dog("xhao",22,22,"");
//		System.out.println(d.toString());
		String kind = null;//����
		Scanner sc = new Scanner(System.in);//������
		System.out.println("��ӭ����������꣡");//��ʾ
		System.out.println("������Ҫ������������֣�");
		String name = sc.next();//������������
		System.out.println("������Ҫ������������ͣ�(1.����  2.���)");//ѡ���������������
		int leixing = sc.nextInt();//����ѡ���������������
		if (leixing == 1) {//�ж�����
			System.out.println("��ѡ�񹷹���Ʒ�֣�(1����������������Ȯ    2������ѩ����)");
			int a = sc.nextInt();
			if(a ==1) {
				 kind ="��������Ȯ";
			}else if(a ==2) {
				 kind ="ѩ����";
			}
			System.out.println("��ѡ�񹷹��Ľ���ֵ(1~100֮��)��");
			int b = sc.nextInt();//���뽡��ֵ
			Pet dog = new Dog(name, b, 0, kind);//����ת��
			System.out.println(dog.toString());

		} else if (leixing == 2) {
			System.out.println("��ѡ�������Ա�(1��Q��   2��Q��)");
			int a = sc.nextInt();
			String sex = null;//�Ա�
			if(a ==1) {
				 sex ="Q��";
			}else if(a ==2) {
				 sex ="Q��";
			}
			System.out.println("��ѡ�����Ľ���ֵ(1~100֮��)��");
			int b = sc.nextInt();
			Pet penguin = new Penguin(name, b, 0, sex);
			System.out.println(penguin.toString());
		} else {
			System.out.println("��������");
		}

	}
}
