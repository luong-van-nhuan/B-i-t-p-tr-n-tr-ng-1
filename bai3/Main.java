package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<News> newsList = new ArrayList<>();
		News news = new News();
		int choose = 0;
		do {
			System.out.println("===Menu===");
			System.out.println("1. Insert news");
			System.out.println("2. View list news");
			System.out.println("3. Average rate");
			System.out.println("4. Exit");
			System.out.println("Enter choose: ");
			choose = sc.nextInt();
			sc.nextLine();
			switch (choose) {
			case 1:
				news.input();
				
				break;
			case 2:
				news.Display();
				break;
			case 3:
				news.Display();
				news.Calculate();
				break;
			case 4:
				System.out.println();
				break;
			default:
				System.out.println("Error!!!");
			}
		} while (choose != 4);
		sc.close();
	}
}
