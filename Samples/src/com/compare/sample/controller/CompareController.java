package com.compare.sample.controller;

import java.util.*;

import com.compare.sample.model.*;

public class CompareController {

	public static void main(String[] args) {
		// Comparable
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(3, "Hari", 453));
		studs.add(new Student(8, "Muhi", 853));
		studs.add(new Student(5, "Muthu", 453));
		studs.add(new Student(3, "Jack", 233));
		Collections.sort(studs);
		for (Student std : studs)
			System.out.println(std);
		// Comparator
		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop(5, "Dell", 500));
		laps.add(new Laptop(8, "Hp", 900));
		laps.add(new Laptop(3, "Asus", 480));
		laps.add(new Laptop(6, "Toshiba", 209));
		Comparator<Laptop> com = new Comparator<Laptop>() {
			@Override
			public int compare(Laptop lap1, Laptop lap2) {
				if (lap1.getPrice() > lap2.getPrice())
					return 1;
				else if (lap1.getPrice() < lap2.getPrice())
					return -1;
				else
					return 0;
			}
		};
		Collections.sort(laps, com);
		System.out.println();
		for (Laptop lap : laps)
			System.out.println(lap);

	}
}
