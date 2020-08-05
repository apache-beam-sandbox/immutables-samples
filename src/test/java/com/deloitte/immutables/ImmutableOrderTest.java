package com.deloitte.immutables;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;
public class ImmutableOrderTest {

	@Test
	public void testAuxiliaryFieldOfOrder() {

		ImmutableOrder order1 = ImmutableOrder.builder().item("football").price(200).auxiliaryField("auxiliaryField")
				.build();

		assertThat(order1.auxiliaryField(), is("auxiliaryField"));

		// Auxiliary field not part of equals
		ImmutableOrder order2 = ImmutableOrder.copyOf(order1);
		order2 = order2.withAuxiliaryField("auxiliaryFieldTwo");

		assertThat(order1, is(order2));

		order2 = order2.withItem("baseball");

		assertThat(order1, not(is(order2)));
	}
}
