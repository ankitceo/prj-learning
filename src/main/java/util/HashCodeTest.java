package util;

import java.util.HashMap;

public class HashCodeTest {

	public static void main(String[] args) {
		Student s1 = new Student(1, "A");
		Student s2 = new Student(2, "B");
		Student s3 = new Student(3, "C");
		Student s4 = new Student(4, "D");
		Student s5 = new Student(5, "E");
		Student s6 = new Student(6, "F");
		Student s7 = new Student(7, "G");
		Student s8 = new Student(8, "H");
		Student s9 = new Student(9, "I");
		Student s10 = new Student(10, "J");
		Student s11 = new Student(11, "K");
		Student s12 = new Student(12, "L");
		Student s13 = new Student(13, "M");
		Student s14 = new Student(14, "N");
		Student s15 = new Student(15, "O");
		Student s16 = new Student(16, "P");
		Student s17 = new Student(17, "Q");
		Student s18 = new Student(18, "R");
		Student s19 = new Student(19, "S");
		Student s20 = new Student(20, "T");
		Student s21 = new Student(21, "U");
		Student s22 = new Student(22, "V");
		Student s23 = new Student(23, "W");
		Student s24 = new Student(24, "X");
		Student s25 = new Student(25, "Y");
		Student s26 = new Student(26, "Z");
		
		HashMap<Student, String> map = new HashMap<Student, String>();
		
		map.put(s1, "A");
		map.put(s2, "B");
		map.put(s3, "C");
		map.put(s4, "D");
		map.put(s5, "E");
		map.put(s6, "F");
		map.put(s7, "G");
		map.put(s8, "H");
		map.put(s9, "I");
		map.put(s10, "J");
		map.put(s11, "K");
		map.put(s12, "L");
		map.put(s13, "M");
		map.put(s14, "N");
		map.put(s15, "O");
		map.put(s16, "P");
		map.put(s17, "Q");
		map.put(s18, "R");
		map.put(s19, "S");
		map.put(s20, "T");
		map.put(s21, "U");
		map.put(s22, "V");
		map.put(s23, "W");
		map.put(s24, "X");
		map.put(s25, "Y");
		map.put(s26, "Z");
		

		System.out.println(map.get(s1));
		System.out.println(map.get(s2));
		System.out.println(map.get(s3));
		System.out.println(map.get(s4));
		System.out.println(map.get(s5));
		System.out.println(map.get(s6));
		System.out.println(map.get(s7));
		System.out.println(map.get(s8));
		System.out.println(map.get(s9));
		System.out.println(map.get(s10));
		System.out.println(map.get(s11));
		System.out.println(map.get(s12));
		System.out.println(map.get(s13));
		System.out.println(map.get(s14));
		System.out.println(map.get(s15));
		System.out.println(map.get(s16));
		System.out.println(map.get(s17));
		System.out.println(map.get(s18));
		System.out.println(map.get(s19));
		System.out.println(map.get(s20));
		System.out.println(map.get(s21));
		System.out.println(map.get(s22));
		System.out.println(map.get(s23));
		System.out.println(map.get(s24));
		System.out.println(map.get(s25));
		System.out.println(map.get(s26));

		s11.setName("L");s11.setRollNum(12);
		s12.setName("M");s12.setRollNum(13);
		s13.setName("N");s13.setRollNum(14);
		s14.setName("O");s14.setRollNum(15);
		s15.setName("P");s15.setRollNum(16);
		s16.setName("Q");s16.setRollNum(17);
		s17.setName("R");s17.setRollNum(18);
		s18.setName("S");s18.setRollNum(19);
		s19.setName("T");s19.setRollNum(20);
		s20.setName("U");s20.setRollNum(21);
		s21.setName("V");s21.setRollNum(22);
		s22.setName("W");s22.setRollNum(23);
		s23.setName("X");s23.setRollNum(24);
		s24.setName("Y");s24.setRollNum(25);
		s25.setName("Z");s25.setRollNum(26);

		System.out.println(map.get(s1));
		System.out.println(map.get(s2));
		System.out.println(map.get(s3));
		System.out.println(map.get(s4));
		System.out.println(map.get(s5));
		System.out.println(map.get(s6));
		System.out.println(map.get(s7));
		System.out.println(map.get(s8));
		System.out.println(map.get(s9));
		System.out.println(map.get(s10));
		System.out.println(map.get(s11));
		System.out.println(map.get(s12));
		System.out.println(map.get(s13));
		System.out.println(map.get(s14));
		System.out.println(map.get(s15));
		System.out.println(map.get(s16));
		System.out.println(map.get(s17));
		System.out.println(map.get(s18));
		System.out.println(map.get(s19));
		System.out.println(map.get(s20));
		System.out.println(map.get(s21));
		System.out.println(map.get(s22));
		System.out.println(map.get(s23));
		System.out.println(map.get(s24));
		System.out.println(map.get(s25));
		System.out.println(map.get(s26));

	}

}
