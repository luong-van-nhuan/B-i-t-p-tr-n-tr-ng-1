package bai3;

import java.util.Arrays;
import java.util.Scanner;

public class News implements INews {
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	private int[] rateList = new int[3];

	public News(int id, String title, String publishDate, String author, String content, float averageRate,
			int[] rateList) {
		this.id = id;
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
		this.averageRate = averageRate;
		this.rateList = rateList;
	}

	public News() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAverageRate() {
		return averageRate;
	}

	public void Calculate() {
		int sum = 0;
		for (int i = 0; i < rateList.length; i++) {
			sum += rateList[i];
		}
		averageRate = (float) sum / rateList.length;
	}

	public void Display() {
		System.out.println("Title: " + title);
		System.out.println("Publish Date: " + publishDate);
		System.out.println("Author: " + author);
		System.out.println("Content: " + content);
		System.out.println("Average Rate: " + averageRate);
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter title: ");
		title = sc.nextLine();
		System.out.println("Enter publish date: ");
		publishDate = sc.nextLine();
		System.out.println("Enter author: ");
		author = sc.nextLine();
		System.out.println("Enter content: ");
		content = sc.nextLine();
		rateList = new int[3];
		System.out.println("Enter 3 ratings: ");
		for (int i = 0; i < 3; i++) {
			rateList[i] = sc.nextInt();
			sc.nextLine();
		}
		
	}

}
