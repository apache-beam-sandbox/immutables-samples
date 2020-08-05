package com.immutables;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.immutables.value.Value;
import org.junit.Test;

@Value.Immutable
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
}
