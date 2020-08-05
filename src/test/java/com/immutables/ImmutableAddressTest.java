package com.immutables;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ImmutableAddressTest {

	@Test
	public void testHashCode() {
	
		ImmutableAddress address = ImmutableAddress
				.of("Bangalore", "Old Airport Road", 560037);
		
		ImmutableAddress address2 = address.withCity("Mysore");
		
		assertThat(address.hashCode(),not(is(address2.hashCode())));
	}
}
