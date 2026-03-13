package com.softserve.edu07comp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppStud {
	private String info = "Hello";
	private static String info2 = "world";

	public static void main(String[] args) {
		// /*-
		Student[] students = new Student[7];
		students[0] = new Student("Oksana", 26);
		students[1] = new Student("Bogdan", 27);
		students[2] = new Student("Orest", 24);
		students[3] = new Student("Ira", 23);
		students[4] = new Student("Yarko", 21);
		students[5] = new Student("Bogdan", 30);
		students[6] = new Student("Bogdan", 22);
		//
		System.out.println("Original Arrays: " + Arrays.toString(students));
		//
		//Arrays.sort(students);
		//
		//Arrays.sort(students, new Student.ByDestName());
		//Arrays.sort(students, new Student().new ByAge());
		Arrays.sort(students, new Student.ByNameAndAge());
		//
		/*
		Arrays.sort(students, new Comparator<Student>() {
				@Override
				public int compare(Student st1, Student st2) {
					int byName = st1.getName().compareTo(st2.getName());
					return byName == 0 ? -st1.getAge() + st2.getAge() : byName;
				}
			}
		);
		*/
		//
		//List<Student> students2 = Arrays.asList(students);
		//Collections.sort(students2);
		//Collections.sort(students, new Student.ByNameAndAge());
		//students.sort(new Student.ByDestName());
//		Collections.sort(students, new Comparator<Student>() {
//				@Override
//					public int compare(Student st1, Student st2) {
//						return st1.getAge() - st2.getAge();
//					}
//				}
//		);
		//
		System.out.println("Sorted Arrays: " + Arrays.toString(students));
		//
		AppStud app = new AppStud();
		System.out.println(app.info + " " + info2);
		//
	}
}         