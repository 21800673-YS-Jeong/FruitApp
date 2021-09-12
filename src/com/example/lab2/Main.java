package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<Fruit>();
		Fruit s1 = new Fruit(101, "Apple", 1000);
		Fruit s2 = new Fruit(102, "Orange", 1500);
		Fruit s3 = new Fruit(103, "Kiwi", 2000);
		Fruit s4 = new Fruit(104, "Banana", 700);
		Fruit s5 = new Fruit(105, "Tomato", 800);
		Fruit s6 = new Fruit(106, "Melon", 8000);
		Fruit s7 = new Fruit(107, "grape", 3000);
		Fruit s8 = new Fruit(108, "Mango", 5000);
		Fruit s9 = new Fruit(109, "Strawberry", 4000);
		Fruit s10 = new Fruit(110, "Cherry", 4500);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8);
		list.add(s9);
		list.add(s10);
		
		Collections.sort(list, new FruitComparator());
		
		System.out.println("Fruit List (ordered by name)");
		
		for(Fruit s : list) {
			System.out.println(s.toString());
		}
		
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(list, new FruitComparatorDesc());
		for(Fruit s : list) {
			System.out.println(s.toString());
		}
	}
}
