package com.liferay.devcon2013.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.service.ServiceContext;

public class BeerDrinkerLocalServiceImplTest {

	@Test
	public void testAddBeerDrinkerWithNullName() {
		String name = null;
		float alcoholLevel = 0;
		ServiceContext serviceContext = new ServiceContext();
		BeerDrinkerLocalServiceImpl impl = new BeerDrinkerLocalServiceImpl();

		try {
			impl.addBeerDrinker(name, alcoholLevel, serviceContext);
			fail("It must throw an " + IllegalArgumentException.class.getName());
		} catch (Exception e) {
			assertEquals(IllegalArgumentException.class, e.getClass());
		}
	}

	@Test
	public void testAddBeerDrinkerWithEmptyName() {
		String name = StringPool.BLANK;
		float alcoholLevel = 0;
		ServiceContext serviceContext = new ServiceContext();
		BeerDrinkerLocalServiceImpl impl = new BeerDrinkerLocalServiceImpl();

		try {
			impl.addBeerDrinker(name, alcoholLevel, serviceContext);
			fail("It must throw an " + IllegalArgumentException.class.getName());
		} catch (Exception e) {
			assertEquals(IllegalArgumentException.class, e.getClass());
		}
	}
}
