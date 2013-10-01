package com.liferay.devcon2013.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BeerDrinkerService}.
 *
 * @author Brian Wing Shun Chan
 * @see BeerDrinkerService
 * @generated
 */
public class BeerDrinkerServiceWrapper implements BeerDrinkerService,
    ServiceWrapper<BeerDrinkerService> {
    private BeerDrinkerService _beerDrinkerService;

    public BeerDrinkerServiceWrapper(BeerDrinkerService beerDrinkerService) {
        _beerDrinkerService = beerDrinkerService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _beerDrinkerService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _beerDrinkerService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _beerDrinkerService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BeerDrinkerService getWrappedBeerDrinkerService() {
        return _beerDrinkerService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBeerDrinkerService(
        BeerDrinkerService beerDrinkerService) {
        _beerDrinkerService = beerDrinkerService;
    }

    @Override
    public BeerDrinkerService getWrappedService() {
        return _beerDrinkerService;
    }

    @Override
    public void setWrappedService(BeerDrinkerService beerDrinkerService) {
        _beerDrinkerService = beerDrinkerService;
    }
}
