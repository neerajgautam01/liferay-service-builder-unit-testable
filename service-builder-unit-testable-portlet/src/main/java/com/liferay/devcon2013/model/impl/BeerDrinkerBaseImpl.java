package com.liferay.devcon2013.model.impl;

import com.liferay.devcon2013.model.BeerDrinker;
import com.liferay.devcon2013.service.BeerDrinkerLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the BeerDrinker service. Represents a row in the &quot;SBUT_BeerDrinker&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BeerDrinkerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BeerDrinkerImpl
 * @see com.liferay.devcon2013.model.BeerDrinker
 * @generated
 */
public abstract class BeerDrinkerBaseImpl extends BeerDrinkerModelImpl
    implements BeerDrinker {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a beer drinker model instance should use the {@link BeerDrinker} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BeerDrinkerLocalServiceUtil.addBeerDrinker(this);
        } else {
            BeerDrinkerLocalServiceUtil.updateBeerDrinker(this);
        }
    }
}
