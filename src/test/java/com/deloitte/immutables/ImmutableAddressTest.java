package com.deloitte.immutables;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ImmutableAddressTest {

	@Test
	public void testHashCode() {
	
		ImmutableAddress address = ImmutableAddress
				.of("Bangalore", "Old Airport Road", 560037);
		
		ImmutableAddress addressWithDifferntCity = address.withCity("Mysore");
		
		assertThat(address.hashCode(),not(is(addressWithDifferntCity.hashCode())));
		assertThat(address.hashCode(),is(addressWithDifferntCity.withCity("Bangalore").hashCode()));
		
	}
}
