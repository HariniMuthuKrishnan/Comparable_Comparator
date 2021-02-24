package com.compare.sample.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.compare.sample.model.Laptop;
import com.compare.sample.model.Student;

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
		Laptop lap1 = new Laptop(5, "Dell", 500);
		Laptop lap2 = new Laptop(5, "Dell", 560);
		Laptop lap3 = new Laptop(3, "Asus", 480);
		Laptop lap4 = new Laptop(6, "Toshiba", 209);
		laps.add(lap1);
		laps.add(lap2);
		laps.add(lap3);
		laps.add(lap4);
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

		// Hashcode and equals method overriding
		Set lapSet = new HashSet<>();
		lapSet.add(lap1);
		lapSet.add(lap2);
		lapSet.add(lap3);
		lapSet.add(lap4);
		System.out.println("Set Values are");
		System.out.println(lapSet);
	}
}
