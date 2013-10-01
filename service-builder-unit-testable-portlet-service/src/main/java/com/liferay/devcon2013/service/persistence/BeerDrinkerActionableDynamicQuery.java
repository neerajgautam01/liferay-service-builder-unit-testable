package com.liferay.devcon2013.service.persistence;

import com.liferay.devcon2013.model.BeerDrinker;
import com.liferay.devcon2013.service.BeerDrinkerLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BeerDrinkerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BeerDrinkerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BeerDrinkerLocalServiceUtil.getService());
        setClass(BeerDrinker.class);

        setClassLoader(com.liferay.devcon2013.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("beerDrinkerId");
    }
}
