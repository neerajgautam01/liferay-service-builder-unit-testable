package com.liferay.devcon2013.service.impl;

import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.liferay.counter.service.CounterLocalService;
import com.liferay.devcon2013.model.BeerDrinker;
import com.liferay.devcon2013.model.BeerDrinkerClp;
import com.liferay.devcon2013.service.persistence.BeerDrinkerPersistence;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalService;

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

	@Test
	public void testAddBeerDrinker() throws Exception {
		long beerDrinkerId = 1000;
		String name = "Drunke";
		float alcoholLevel = 0;
		ServiceContext serviceContext = getServiceContext();
		BeerDrinkerLocalServiceImpl impl = new BeerDrinkerLocalServiceImpl();

		User user = createNiceMock(User.class);

		replay(user);

		UserLocalService userLocalService = createNiceMock(UserLocalService.class);

		expect(userLocalService.getUser(serviceContext.getUserId())).andReturn(user);
		replay(userLocalService);

		impl.setUserLocalService(userLocalService);

		CounterLocalService counterLocalService = createNiceMock(CounterLocalService.class);

		expect(counterLocalService.increment(BeerDrinker.class.getName())).andReturn(beerDrinkerId);
		replay(counterLocalService);

		impl.setCounterLocalService(counterLocalService);

		BeerDrinker beerDrinker = new BeerDrinkerClp();

		beerDrinker.setBeerDrinkerId(beerDrinkerId);

		BeerDrinkerPersistence beerDrinkerPersistence = createNiceMock(BeerDrinkerPersistence.class);

		expect(beerDrinkerPersistence.create(beerDrinkerId)).andReturn(beerDrinker);
		replay(beerDrinkerPersistence);

		impl.setBeerDrinkerPersistence(beerDrinkerPersistence);

		BeerDrinker beerDrinker2 = impl.addBeerDrinker(name, alcoholLevel, serviceContext);

		assertNotNull(beerDrinker2);
		assertEquals(beerDrinkerId, beerDrinker2.getBeerDrinkerId());
		assertEquals(name, beerDrinker2.getName());
		assertEquals(alcoholLevel, beerDrinker2.getAlcoholLevel(), 0);
		
		verify(user, userLocalService, counterLocalService, beerDrinkerPersistence);
	}

	protected ServiceContext getServiceContext() {
		ServiceContext serviceContext = new ServiceContext();

		serviceContext.setCompanyId(1000);
		serviceContext.setScopeGroupId(2000);
		serviceContext.setUserId(3000);

		return serviceContext;
	}
}
