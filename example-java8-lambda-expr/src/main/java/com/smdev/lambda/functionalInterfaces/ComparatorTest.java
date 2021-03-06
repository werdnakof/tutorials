package com.smdev.lambda.functionalInterfaces;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.smdev.lambda.Person;
import com.smdev.lambda.util.Util;

/**
 * A functional interface, introduced in Java 8, is an interface which has only a single abstract
 * method. Conversely, if you have any interface which has only a single abstract method, then that
 * will effectively be a functional interface. This interface can then be used anywhere where a
 * functional interface is eligible to be used.
 * 
 * Example:
 * {@link http://www.oracle.com/webfolder/technetwork/tutorials/obe/java/Lambda-QuickStart/index.html}
 *
 * @author Ireth
 */
public class ComparatorTest {

	public static void main(String[] args) throws URISyntaxException {

		// ================= OLD ===========================
		List<Person> l1 = Util.create(Person.class, "people.txt");
		Collections.sort(l1, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getSurName().compareTo(p2.getSurName());
			}
		});
		for (Person p : l1) {
			System.out.println(p.getSurName());
		}

		// ================= NEW ===========================
		List<Person> l2 = Util.create(Person.class, "people.txt");
		Collections.sort(l2, (p1, p2) -> p1.getSurName().compareTo(p2.getSurName()));
		l2.forEach(p -> System.out.println(p.getSurName()));
	}
}
