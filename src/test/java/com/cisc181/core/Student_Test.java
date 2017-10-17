package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;
import com.cisc181.core.Section;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		
		try {
			Student A = new Student("Amanda", "Flynn", "Brooks", new Date(1964, 11, 03),eMajor.CHEM, "34 Hallow Drive, Houston, TX",
					"3546454498", "amanda@yahoo.com");

			Student B = new Student("John", "Woodbury", "Appleseed", new Date(1982, 4, 03),eMajor.NURSING,
					"7801 Old Town Road, Las Vegas, NV", "3487456748", "john@hotmail.com");

			Student C = new Student("Glenn", "Lee", "Huan", new Date(1990, 5, 15),eMajor.BUSINESS, "564 Drewbloom Drive, Washington, DC",
					"4238987900", "Glenn@gmail.com");
			
			Student D = new Student("Adrian", "Boodew", "Baker", new Date(2000, 1, 07),eMajor.PHYSICS,
					"879 Thornview Drive, Nashville,TN", "4539876775", "Adrian@comcast.net");

			Student E = new Student("Joe", "Vincent", "Alston", new Date(2005, 9, 23),eMajor.COMPSI,
					"12 Johnson Street, Newark, DE", "3022938485", "Joe@yahoo.com");
			
			Student F = new Student("Amanda", "Flynn", "Brooks", new Date(1964, 11, 03),eMajor.CHEM, "34 Hallow Drive, Houston, TX",
					"3546454498", "amanda@yahoo.com");

			Student G = new Student("John", "Woodbury", "Appleseed", new Date(1982, 4, 03),eMajor.NURSING,
					"7801 Old Town Road, Las Vegas, NV", "3487456748", "john@hotmail.com");

			Student H = new Student("Glenn", "Lee", "Huan", new Date(1990, 5, 15),eMajor.BUSINESS, "564 Drewbloom Drive, Washington, DC",
					"4238987900", "Glenn@gmail.com");
			
			Student I = new Student("Adrian", "Boodew", "Baker", new Date(2000, 1, 07),eMajor.PHYSICS,
					"879 Thornview Drive, Nashville,TN", "4539876775", "Adrian@comcast.net");

			Student J = new Student("Joe", "Vincent", "Alston", new Date(2005, 9, 23),eMajor.COMPSI,
					"12 Johnson Street, Newark, DE", "3022938485", "Joe@yahoo.com");
			
			ArrayList<Student> TestStudent = new ArrayList<Student>();
			TestStudent.add(A);
			TestStudent.add(B);
			TestStudent.add(C);
			TestStudent.add(D);
			TestStudent.add(E);
			TestStudent.add(F);
			TestStudent.add(G);
			TestStudent.add(H);
			TestStudent.add(I);
			TestStudent.add(J);

			Course c1 = new Course(UUID.randomUUID(), "Computer Science", 80, eMajor.COMPSI);
			Course c2 = new Course(UUID.randomUUID(), "Physics", 90, eMajor.PHYSICS);
			Course c3 = new Course(UUID.randomUUID(), "Business", 100, eMajor.BUSINESS);
			
			ArrayList<Course> TestCourse = new ArrayList<Course>();
			TestCourse.add(c1);
			TestCourse.add(c2);
			TestCourse.add(c3);
			
			Semester fall = new Semester(UUID.randomUUID(), new Date(2017, 8, 22), new Date(2017, 12, 25));
			Semester spring = new Semester(UUID.randomUUID(), new Date(2018, 2, 5), new Date(2018, 5, 22));
			
			ArrayList<Semester> TestSemester = new ArrayList<Semester>();
			TestSemester.add(fall);
			TestSemester.add(spring);
			
			Section s1 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 1);
			Section s2 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 2);
			Section s3 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 3);
			Section s4 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 4);
			Section s5 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 5);
			Section s6 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 6);
			
			ArrayList<Section> TestSection = new ArrayList<Section>();
			TestSection.add(s1);
			TestSection.add(s2);
			TestSection.add(s3);
			TestSection.add(s4);
			TestSection.add(s5);
			TestSection.add(s6);
			
			Enrollment enrollingAs1 = new Enrollment(s1.getSectionID(), A.getStudentID());
			enrollingAs1.setGrade(100);
			Enrollment enrollingAs2 = new Enrollment(s2.getSectionID(), A.getStudentID());
			enrollingAs2.setGrade(100);
			Enrollment enrollingAs3 = new Enrollment(s3.getSectionID(), A.getStudentID());
			enrollingAs3.setGrade(100);
			
			assertEquals(((enrollingAs1.getGrade() + enrollingAs2.getGrade() + enrollingAs3.getGrade()) / 3), 100);

			Enrollment enrollingBs1 = new Enrollment(s1.getSectionID(), B.getStudentID());
			enrollingBs1.setGrade(90);
			Enrollment enrollingBs2 = new Enrollment(s2.getSectionID(), B.getStudentID());
			enrollingBs2.setGrade(90);
			Enrollment enrollingBs3 = new Enrollment(s3.getSectionID(), B.getStudentID());
			enrollingBs3.setGrade(90);
			
			assertEquals(((enrollingBs1.getGrade() + enrollingBs2.getGrade() + enrollingBs3.getGrade()) / 3), 90);

			Enrollment enrollingCs2 = new Enrollment(s2.getSectionID(), C.getStudentID());
			enrollingCs2.setGrade(80);
			Enrollment enrollingCs3 = new Enrollment(s3.getSectionID(), C.getStudentID());
			enrollingCs3.setGrade(80);
			Enrollment enrollingCs4 = new Enrollment(s4.getSectionID(), C.getStudentID());
			enrollingCs4.setGrade(80);

			assertEquals(((enrollingCs2.getGrade() + enrollingCs3.getGrade() + enrollingCs4.getGrade()) / 3), 80);

			Enrollment enrollingDs2 = new Enrollment(s2.getSectionID(), D.getStudentID());
			enrollingDs2.setGrade(70);
			Enrollment enrollingDs3 = new Enrollment(s3.getSectionID(), D.getStudentID());
			enrollingDs3.setGrade(70);
			Enrollment enrollingDs4 = new Enrollment(s4.getSectionID(), D.getStudentID());
			enrollingDs4.setGrade(70);

			assertEquals(((enrollingDs2.getGrade() + enrollingDs3.getGrade() + enrollingDs4.getGrade()) / 3), 70);

			Enrollment enrollingEs3 = new Enrollment(s3.getSectionID(), E.getStudentID());
			enrollingEs3.setGrade(60);
			Enrollment enrollingEs4 = new Enrollment(s4.getSectionID(), E.getStudentID());
			enrollingEs4.setGrade(60);
			Enrollment enrollingEs5 = new Enrollment(s5.getSectionID(), E.getStudentID());
			enrollingEs5.setGrade(60);

			assertEquals(((enrollingEs3.getGrade() + enrollingEs4.getGrade() + enrollingEs5.getGrade()) / 3), 60);

			Enrollment enrollingFs3 = new Enrollment(s3.getSectionID(), F.getStudentID());
			enrollingFs3.setGrade(50);
			Enrollment enrollingFs4 = new Enrollment(s4.getSectionID(), F.getStudentID());
			enrollingFs4.setGrade(50);
			Enrollment enrollingFs5 = new Enrollment(s5.getSectionID(), F.getStudentID());
			enrollingFs5.setGrade(50);

			assertEquals(((enrollingFs3.getGrade() + enrollingFs4.getGrade() + enrollingFs5.getGrade()) / 3), 50);

			Enrollment enrollingGs4 = new Enrollment(s4.getSectionID(), G.getStudentID());
			enrollingGs4.setGrade(40);
			Enrollment enrollingGs5 = new Enrollment(s5.getSectionID(), G.getStudentID());
			enrollingGs5.setGrade(40);
			Enrollment enrollingGs6 = new Enrollment(s6.getSectionID(), G.getStudentID());
			enrollingGs6.setGrade(40);

			assertEquals(((enrollingGs4.getGrade() + enrollingGs5.getGrade() + enrollingGs6.getGrade()) / 3), 40);

			Enrollment enrollingHs4 = new Enrollment(s4.getSectionID(), H.getStudentID());
			enrollingHs4.setGrade(30);
			Enrollment enrollingHs5 = new Enrollment(s5.getSectionID(), H.getStudentID());
			enrollingHs5.setGrade(30);
			Enrollment enrollingHs6 = new Enrollment(s6.getSectionID(), H.getStudentID());
			enrollingHs6.setGrade(30);

			assertEquals(((enrollingHs4.getGrade() + enrollingHs5.getGrade() + enrollingHs6.getGrade()) / 3), 30);

			Enrollment enrollingIs1 = new Enrollment(s1.getSectionID(), I.getStudentID());
			enrollingIs1.setGrade(10);
			Enrollment enrollingIs3 = new Enrollment(s2.getSectionID(), I.getStudentID());
			enrollingIs3.setGrade(10);
			Enrollment enrollingIs5 = new Enrollment(s5.getSectionID(), I.getStudentID());
			enrollingIs5.setGrade(10);

			assertEquals(((enrollingIs1.getGrade() + enrollingIs3.getGrade() + enrollingIs5.getGrade()) / 3), 10);

			Enrollment enrollingJs2 = new Enrollment(s2.getSectionID(), J.getStudentID());
			enrollingJs2.setGrade(0);
			Enrollment enrollingJs4 = new Enrollment(s4.getSectionID(), J.getStudentID());
			enrollingJs4.setGrade(0);
			Enrollment enrollingJs6 = new Enrollment(s6.getSectionID(), J.getStudentID());
			enrollingJs6.setGrade(0);

			assertEquals(((enrollingJs2.getGrade() + enrollingJs4.getGrade() + enrollingJs6.getGrade()) / 3), 10);
			
			assertEquals(((enrollingAs1.getGrade() + enrollingBs1.getGrade() + enrollingIs1.getGrade()) / 3),
					(200 / 3));

			assertEquals(((enrollingAs2.getGrade() + enrollingBs2.getGrade() + enrollingCs2.getGrade()
					+ enrollingDs2.getGrade() + enrollingJs2.getGrade()) / 5), 68);

			assertEquals(((enrollingAs3.getGrade() + enrollingBs3.getGrade() + enrollingCs3.getGrade()
					+ enrollingDs3.getGrade() + enrollingEs3.getGrade() + enrollingFs3.getGrade()
					+ enrollingIs3.getGrade()) / 7), (460 / 7));

			assertEquals(((enrollingCs4.getGrade() + enrollingDs4.getGrade() + enrollingEs4.getGrade()
					+ enrollingFs4.getGrade() + enrollingGs4.getGrade() + enrollingHs4.getGrade()
					+ enrollingJs4.getGrade()) / 3), (330 / 7));

			assertEquals(((enrollingEs5.getGrade() + enrollingFs5.getGrade() + enrollingGs5.getGrade()
					+ enrollingHs5.getGrade() + enrollingIs5.getGrade()) / 3), 38);




		}catch (PersonException e) {
			e.printStackTrace();
			
		}
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}