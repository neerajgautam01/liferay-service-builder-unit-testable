package com.liferay.devcon2013.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.service.ServiceContext;

public class BeerDrinkerLocalServiceImplTest {

	@Test(expected = IllegalArgumentException.class)
	public void testAddBeerDrinkerWithEmptyName() throws Exception {
		String name = StringPool.BLANK;
		float alcoholLevel = 0;
		ServiceContext serviceContext = new ServiceContext();
		BeerDrinkerLocalServiceImpl impl = new BeerDrinkerLocalServiceImpl();

		impl.addBeerDrinker(name, alcoholLevel, serviceContext);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAddBeerDrinkerWithNegativeAlcoholLevel() throws Exception {
		String name = "Drunk";
		float alcoholLevel = -1;
		ServiceContext serviceContext = new ServiceContext();
		BeerDrinkerLocalServiceImpl impl = new BeerDrinkerLocalServiceImpl();

		impl.addBeerDrinker(name, alcoholLevel, serviceContext);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAddBeerDrinkerWithNullName() throws Exception {
		String name = null;
		float alcoholLevel = 0;
		ServiceContext serviceContext = new ServiceContext();
		BeerDrinkerLocalServiceImpl impl = new BeerDrinkerLocalServiceImpl();

		impl.addBeerDrinker(name, alcoholLevel, serviceContext);
	}
	}

}
