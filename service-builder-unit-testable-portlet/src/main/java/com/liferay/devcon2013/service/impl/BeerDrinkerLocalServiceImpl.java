package com.liferay.devcon2013.service.impl;

import com.liferay.devcon2013.model.BeerDrinker;
import com.liferay.devcon2013.service.base.BeerDrinkerLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the beer drinker local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.devcon2013.service.BeerDrinkerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.devcon2013.service.base.BeerDrinkerLocalServiceBaseImpl
 * @see com.liferay.devcon2013.service.BeerDrinkerLocalServiceUtil
 */
public class BeerDrinkerLocalServiceImpl extends BeerDrinkerLocalServiceBaseImpl {

	public BeerDrinker addBeerDrinker(
		String name, float alcoholLevel, ServiceContext serviceContext)
		throws PortalException, SystemException {

		if (Validator.isNull(name)) {
			throw new IllegalArgumentException(
				"Parameter name cannot be null or empty!");
		}

		return null;
	}
}
