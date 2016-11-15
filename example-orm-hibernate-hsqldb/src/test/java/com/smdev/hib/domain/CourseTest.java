package com.smdev.hib.domain;

import org.junit.Assert;
import org.junit.Test;

import com.smdev.hib.AppException;
import com.smdev.hib.BaseHibernateTest;

/**
 * @author Ireth
 */
public class CourseTest extends BaseHibernateTest {

	private Course course = null;
	private CourseDetails details = null;
	private Student student = null;
	private Subject subject = null;
	private Teacher teacher = null;

	/* @see com.smdev.hib.BaseHibernateTest#cleanUp() */
	@Override
	protected void cleanUp() {
		delete(this.course);
		delete(this.details);
		delete(this.subject);
		delete(this.student);
		delete(this.teacher);
	}

	@Test
	public void testAddStudent() {
		try {
			this.subject = createSubject("EN");
			this.details = createCourseDetails("EN_A1", "English Lvl A1");
			this.course = createCourse(this.subject, this.details);

			this.student = createStudent("student1");
			this.course.addStudent(this.student);

			// TODO verify
		} catch (AppException e) {
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void testAddTeacher() {
		try {
			this.subject = createSubject("EN");
			this.details = createCourseDetails("EN_A1", "English Lvl A1");
			this.course = createCourse(this.subject, this.details);

			this.teacher = createTeacher("teacher");
			this.course.addTeacher(this.teacher);

			// TODO verify
		} catch (AppException e) {
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void testInsert() {
		try {
			this.subject = createSubject("EN");
			this.details = createCourseDetails("EN_A1", "English Lvl A1");
			this.course = createCourse(this.subject, this.details);
			Assert.assertNotNull(this.course.getId());
		} catch (AppException e) {
			Assert.fail(e.getMessage());
		}
	}

}
