package Pet;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		Pet d = new Dog("xhao",22,22,"");
//		System.out.println(d.toString());
		String kind = null;//种类
		Scanner sc = new Scanner(System.in);//构造器
		System.out.println("欢迎您来到宠物店！");//提示
		System.out.println("请输入要领养宠物的名字：");
		String name = sc.next();//输入宠物的名字
		System.out.println("请输入要领养宠物的类型：(1.狗狗  2.企鹅)");//选择领养宠物的类型
		int leixing = sc.nextInt();//输入选择领养宠物的类型
		if (leixing == 1) {//判断类型
			System.out.println("请选择狗狗的品种：(1、聪明的拉布拉多犬    2、酷酷的雪纳瑞)");
			int a = sc.nextInt();
			if(a ==1) {
				 kind ="拉布拉多犬";
			}else if(a ==2) {
				 kind ="雪纳瑞";
			}
			System.out.println("请选择狗狗的健康值(1~100之间)：");
			int b = sc.nextInt();//输入健康值
			Pet dog = new Dog(name, b, 0, kind);//向上转型
			System.out.println(dog.toString());

		} else if (leixing == 2) {
			System.out.println("请选择企鹅的性别：(1、Q仔   2、Q妹)");
			int a = sc.nextInt();
			String sex = null;//性别
			if(a ==1) {
				 sex ="Q仔";
			}else if(a ==2) {
				 sex ="Q妹";
			}
			System.out.println("请选择企鹅的健康值(1~100之间)：");
			int b = sc.nextInt();
			Pet penguin = new Penguin(name, b, 0, sex);
			System.out.println(penguin.toString());
		} else {
			System.out.println("输入有误！");
		}

	}
}
