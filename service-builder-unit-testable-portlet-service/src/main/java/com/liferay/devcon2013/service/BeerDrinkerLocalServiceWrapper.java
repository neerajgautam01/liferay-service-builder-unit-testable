package com.liferay.devcon2013.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BeerDrinkerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BeerDrinkerLocalService
 * @generated
 */
public class BeerDrinkerLocalServiceWrapper implements BeerDrinkerLocalService,
    ServiceWrapper<BeerDrinkerLocalService> {
    private BeerDrinkerLocalService _beerDrinkerLocalService;

    public BeerDrinkerLocalServiceWrapper(
        BeerDrinkerLocalService beerDrinkerLocalService) {
        _beerDrinkerLocalService = beerDrinkerLocalService;
    }

    /**
    * Adds the beer drinker to the database. Also notifies the appropriate model listeners.
    *
    * @param beerDrinker the beer drinker
    * @return the beer drinker that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.devcon2013.model.BeerDrinker addBeerDrinker(
        com.liferay.devcon2013.model.BeerDrinker beerDrinker)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinkerLocalService.addBeerDrinker(beerDrinker);
    }

    /**
    * Creates a new beer drinker with the primary key. Does not add the beer drinker to the database.
    *
    * @param beerDrinkerId the primary key for the new beer drinker
    * @return the new beer drinker
    */
    @Override
    public com.liferay.devcon2013.model.BeerDrinker createBeerDrinker(
        long beerDrinkerId) {
        return _beerDrinkerLocalService.createBeerDrinker(beerDrinkerId);
    }

    /**
    * Deletes the beer drinker with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param beerDrinkerId the primary key of the beer drinker
    * @return the beer drinker that was removed
    * @throws PortalException if a beer drinker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.devcon2013.model.BeerDrinker deleteBeerDrinker(
        long beerDrinkerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinkerLocalService.deleteBeerDrinker(beerDrinkerId);
    }

    /**
    * Deletes the beer drinker from the database. Also notifies the appropriate model listeners.
    *
    * @param beerDrinker the beer drinker
    * @return the beer drinker that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.devcon2013.model.BeerDrinker deleteBeerDrinker(
        com.liferay.devcon2013.model.BeerDrinker beerDrinker)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinkerLocalService.deleteBeerDrinker(beerDrinker);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _beerDrinkerLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinkerLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.devcon2013.model.impl.BeerDrinkerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinkerLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.devcon2013.model.impl.BeerDrinkerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinkerLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinkerLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinkerLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.liferay.devcon2013.model.BeerDrinker fetchBeerDrinker(
        long beerDrinkerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinkerLocalService.fetchBeerDrinker(beerDrinkerId);
    }

    /**
    * Returns the beer drinker with the matching UUID and company.
    *
    * @param uuid the beer drinker's UUID
    * @param companyId the primary key of the company
    * @return the matching beer drinker, or <code>null</code> if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.devcon2013.model.BeerDrinker fetchBeerDrinkerByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinkerLocalService.fetchBeerDrinkerByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the beer drinker matching the UUID and group.
    *
    * @param uuid the beer drinker's UUID
    * @param groupId the primary key of the group
    * @return the matching beer drinker, or <code>null</code> if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.devcon2013.model.BeerDrinker fetchBeerDrinkerByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinkerLocalService.fetchBeerDrinkerByUuidAndGroupId(uuid,
            groupId);
    }

    /**
    * Returns the beer drinker with the primary key.
    *
    * @param beerDrinkerId the primary key of the beer drinker
    * @return the beer drinker
    * @throws PortalException if a beer drinker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.devcon2013.model.BeerDrinker getBeerDrinker(
        long beerDrinkerId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinkerLocalService.getBeerDrinker(beerDrinkerId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinkerLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the beer drinker with the matching UUID and company.
    *
    * @param uuid the beer drinker's UUID
    * @param companyId the primary key of the company
    * @return the matching beer drinker
    * @throws PortalException if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.devcon2013.model.BeerDrinker getBeerDrinkerByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinkerLocalService.getBeerDrinkerByUuidAndCompanyId(uuid,
            companyId);
    }

    /**
    * Returns the beer drinker matching the UUID and group.
    *
    * @param uuid the beer drinker's UUID
    * @param groupId the primary key of the group
    * @return the matching beer drinker
    * @throws PortalException if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.devcon2013.model.BeerDrinker getBeerDrinkerByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinkerLocalService.getBeerDrinkerByUuidAndGroupId(uuid,
            groupId);
    }

    /**
    * Returns a range of all the beer drinkers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.devcon2013.model.impl.BeerDrinkerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of beer drinkers
    * @param end the upper bound of the range of beer drinkers (not inclusive)
    * @return the range of beer drinkers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.liferay.devcon2013.model.BeerDrinker> getBeerDrinkers(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinkerLocalService.getBeerDrinkers(start, end);
    }

    /**
    * Returns the number of beer drinkers.
    *
    * @return the number of beer drinkers
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getBeerDrinkersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinkerLocalService.getBeerDrinkersCount();
    }

    /**
    * Updates the beer drinker in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param beerDrinker the beer drinker
    * @return the beer drinker that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.devcon2013.model.BeerDrinker updateBeerDrinker(
        com.liferay.devcon2013.model.BeerDrinker beerDrinker)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinkerLocalService.updateBeerDrinker(beerDrinker);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _beerDrinkerLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _beerDrinkerLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _beerDrinkerLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BeerDrinkerLocalService getWrappedBeerDrinkerLocalService() {
        return _beerDrinkerLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBeerDrinkerLocalService(
        BeerDrinkerLocalService beerDrinkerLocalService) {
        _beerDrinkerLocalService = beerDrinkerLocalService;
    }

    @Override
    public BeerDrinkerLocalService getWrappedService() {
        return _beerDrinkerLocalService;
    }

    @Override
    public void setWrappedService(
        BeerDrinkerLocalService beerDrinkerLocalService) {
        _beerDrinkerLocalService = beerDrinkerLocalService;
    }
}
