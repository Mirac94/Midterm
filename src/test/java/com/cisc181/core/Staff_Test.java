package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void testStaffAverageSalery() throws PersonException {
		ArrayList<Staff> TestStaff = new ArrayList<Staff>();
		Staff A = new Staff("Amanda", "Flynn", "Brooks", new Date(1964, 11, 03), "34 Hallow Drive, Houston, TX",
				"3546454498", "amanda@yahoo.com","Engineering", 1, 10000.00, new Date(2017, 05, 31), eTitle.MS);
		TestStaff.add(A);

		Staff B = new Staff("John", "Woodbury", "Appleseed", new Date(1982, 4, 03),
				"7801 Old Town Road, Las Vegas, NV", "3487456748", "john@hotmail.com","Software Engineering", 2, 11000.00,
				new Date(2004, 02, 13), eTitle.MS);
		TestStaff.add(B);

		Staff C = new Staff("Glenn", "Lee", "Huan", new Date(1990, 5, 15), "564 Drewbloom Drive, Washington, DC",
				"4238987900", "Glenn@gmail.com","Biomedical Engineering", 3, 12000.00, new Date(2008, 04, 11), eTitle.MS);
		TestStaff.add(C);

		Staff D = new Staff("Adrian", "Boodew", "Baker", new Date(2000, 1, 07),
				"879 Thornview Drive, Nashville,TN", "4539876775", "Adrian@comcast.net","Criminal Justice", 4, 13000.00,
				new Date(2013, 01, 11), eTitle.MS);
		TestStaff.add(D);

		Staff E = new Staff("Joe", "Vincent", "Alston", new Date(2005, 9, 23),
				"12 Johnson Street, Newark, DE", "3022938485", "Joe@yahoo.com","Psychology", 5, 14000.00,
				new Date(2002, 8, 12), eTitle.MS);
		TestStaff.add(E);

		double totalSalary = 0;
		for (Staff s : TestStaff) {
			totalSalary += s.getSalary();
		}
		totalSalary /= 5;

		int t = (int) totalSalary;

		assertEquals(t, 12000);
	}
	@Test(expected = PersonException.class)
	public void testAgeException() throws PersonException {
		Staff F = new Staff("Donald", "Elmo", "Trump", new Date(1699, 10, 03),
				"Istanbul,Turkey", "3497586965", "Trump@gmail.com", "Civil Engineering", 1, 9000.00,
				new Date(1795, 6, 30), eTitle.MRS);
	}

	@Test(expected = PersonException.class)
	public void testPhoneNumException() throws PersonException {
		Staff F = new Staff("Barack", "Homie", "Obama", new Date(1964, 3, 14),
				"Hawaiian Islands", "7364932", "Barack@WhiteHouse.net", "Criminal Justice", 1, 200000.00,
				new Date(2016, 9, 22), eTitle.MRS);
	}
}

