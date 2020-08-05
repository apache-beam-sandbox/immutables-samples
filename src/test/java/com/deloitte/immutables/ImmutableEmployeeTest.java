package com.deloitte.immutables;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class ImmutableEmployeeTest {
	
	@Test
	public void testConstructor() {
		
		ImmutableEmployee emp = ImmutableEmployee.of("Pradeep", 10000);
		assertThat(emp.getName(),is("Pradeep"));
		
	}

	@Test
	public void testDefaultValue() {
		ImmutableEmployee emp = ImmutableEmployee.of("Pradeep", 10000);
		assertThat(emp.getAge(),is(40));
	}
	
	
	@Test
	public void tesToString() {
		ImmutableEmployee emp = ImmutableEmployee.of("Pradeep",10000);
		assertThat(emp.toString(),is("Employee{name=Pradeep, salary=10000, age=40}"));
	}
}
