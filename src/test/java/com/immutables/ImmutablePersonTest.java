package com.immutables;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ImmutablePersonTest {

	@Test
	public void testImmutableBuilder() {
		
		ImmutablePerson person = ImmutablePerson.builder()
				.age(40).name("Pradeep").build();
		assertEquals(40,person.getAge());
		assertEquals("Pradeep",person.getName());
	}
	
	@Test
	public void testImmutability() {
		ImmutablePerson john = ImmutablePerson.builder()
				.name("John").age(40).build();
		// New object will get created if we try to update fields
		ImmutablePerson johnTwo = john.withAge(20);
		assertFalse(john.equals(johnTwo));
		
	}
}
