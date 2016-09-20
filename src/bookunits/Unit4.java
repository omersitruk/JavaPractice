package bookunits;

import java.util.Scanner;

public class Unit4 {

	public static void main(String[] args) {
		ex8();

	}

	public static void ex6() {
		Scanner in = new Scanner(System.in);
		int code = in.nextInt();
		in.close();
		int floor = code / 100;
		int room = code % 100;
		System.out.println("Floor num : " + floor);
		System.out.println("Room num : " + room);

	}

	public static void ex7() {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		int finalnum = changeNum(num);
		System.out.println(finalnum);
	}

	private static int changeNum(int num) {
		int asarot = num / 10 + 1;
		int ahadot = num % 10 - 1;
		int finalnum = 10 * asarot + ahadot;
		return finalnum;
	}

	public static void ex8() {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		int rishon = num / 100;
		int sheni = (num % 100) / 10;
		int shlishi = num % 10;
		int rishonasarot = rishon * 10;
		int sheniasarot = sheni * 10;
		int shlishiasarot = shlishi * 10;

		System.out.println(rishonasarot+sheni);
		System.out.println(rishonasarot+shlishi);
		System.out.println(sheniasarot+rishon);
		System.out.println(sheniasarot+shlishi);
		System.out.println(shlishiasarot+rishon);
		System.out.println(shlishiasarot+sheni);
	}
}
