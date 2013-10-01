package com.liferay.devcon2013.service.persistence;

import com.liferay.devcon2013.model.BeerDrinker;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the beer drinker service. This utility wraps {@link BeerDrinkerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BeerDrinkerPersistence
 * @see BeerDrinkerPersistenceImpl
 * @generated
 */
public class BeerDrinkerUtil {
    private static BeerDrinkerPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(BeerDrinker beerDrinker) {
        getPersistence().clearCache(beerDrinker);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<BeerDrinker> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<BeerDrinker> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<BeerDrinker> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static BeerDrinker update(BeerDrinker beerDrinker)
        throws SystemException {
        return getPersistence().update(beerDrinker);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static BeerDrinker update(BeerDrinker beerDrinker,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(beerDrinker, serviceContext);
    }

    /**
    * Returns all the beer drinkers where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.devcon2013.model.BeerDrinker> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the beer drinkers where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.devcon2013.model.impl.BeerDrinkerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of beer drinkers
    * @param end the upper bound of the range of beer drinkers (not inclusive)
    * @return the range of matching beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.devcon2013.model.BeerDrinker> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the beer drinkers where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.devcon2013.model.impl.BeerDrinkerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of beer drinkers
    * @param end the upper bound of the range of beer drinkers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.devcon2013.model.BeerDrinker> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first beer drinker in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching beer drinker
    * @throws com.liferay.devcon2013.NoSuchBeerDrinkerException if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.devcon2013.model.BeerDrinker findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first beer drinker in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching beer drinker, or <code>null</code> if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.devcon2013.model.BeerDrinker fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last beer drinker in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching beer drinker
    * @throws com.liferay.devcon2013.NoSuchBeerDrinkerException if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.devcon2013.model.BeerDrinker findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last beer drinker in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching beer drinker, or <code>null</code> if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.devcon2013.model.BeerDrinker fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the beer drinkers before and after the current beer drinker in the ordered set where uuid = &#63;.
    *
    * @param beerDrinkerId the primary key of the current beer drinker
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next beer drinker
    * @throws com.liferay.devcon2013.NoSuchBeerDrinkerException if a beer drinker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.devcon2013.model.BeerDrinker[] findByUuid_PrevAndNext(
        long beerDrinkerId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_PrevAndNext(beerDrinkerId, uuid,
            orderByComparator);
    }

    /**
    * Removes all the beer drinkers where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of beer drinkers where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns the beer drinker where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.devcon2013.NoSuchBeerDrinkerException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching beer drinker
    * @throws com.liferay.devcon2013.NoSuchBeerDrinkerException if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.devcon2013.model.BeerDrinker findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUUID_G(uuid, groupId);
    }

    /**
    * Returns the beer drinker where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching beer drinker, or <code>null</code> if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.devcon2013.model.BeerDrinker fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId);
    }

    /**
    * Returns the beer drinker where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching beer drinker, or <code>null</code> if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.devcon2013.model.BeerDrinker fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
    }

    /**
    * Removes the beer drinker where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the beer drinker that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.devcon2013.model.BeerDrinker removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByUUID_G(uuid, groupId);
    }

    /**
    * Returns the number of beer drinkers where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public static int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUUID_G(uuid, groupId);
    }

    /**
    * Returns all the beer drinkers where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.devcon2013.model.BeerDrinker> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId);
    }

    /**
    * Returns a range of all the beer drinkers where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.devcon2013.model.impl.BeerDrinkerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of beer drinkers
    * @param end the upper bound of the range of beer drinkers (not inclusive)
    * @return the range of matching beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.devcon2013.model.BeerDrinker> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId, start, end);
    }

    /**
    * Returns an ordered range of all the beer drinkers where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.devcon2013.model.impl.BeerDrinkerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of beer drinkers
    * @param end the upper bound of the range of beer drinkers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.devcon2013.model.BeerDrinker> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first beer drinker in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching beer drinker
    * @throws com.liferay.devcon2013.NoSuchBeerDrinkerException if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.devcon2013.model.BeerDrinker findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the first beer drinker in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching beer drinker, or <code>null</code> if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.devcon2013.model.BeerDrinker fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last beer drinker in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching beer drinker
    * @throws com.liferay.devcon2013.NoSuchBeerDrinkerException if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.devcon2013.model.BeerDrinker findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last beer drinker in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching beer drinker, or <code>null</code> if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.devcon2013.model.BeerDrinker fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the beer drinkers before and after the current beer drinker in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param beerDrinkerId the primary key of the current beer drinker
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next beer drinker
    * @throws com.liferay.devcon2013.NoSuchBeerDrinkerException if a beer drinker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.devcon2013.model.BeerDrinker[] findByUuid_C_PrevAndNext(
        long beerDrinkerId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_PrevAndNext(beerDrinkerId, uuid, companyId,
            orderByComparator);
    }

    /**
    * Removes all the beer drinkers where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid_C(uuid, companyId);
    }

    /**
    * Returns the number of beer drinkers where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid_C(uuid, companyId);
    }

    /**
    * Caches the beer drinker in the entity cache if it is enabled.
    *
    * @param beerDrinker the beer drinker
    */
    public static void cacheResult(
        com.liferay.devcon2013.model.BeerDrinker beerDrinker) {
        getPersistence().cacheResult(beerDrinker);
    }

    /**
    * Caches the beer drinkers in the entity cache if it is enabled.
    *
    * @param beerDrinkers the beer drinkers
    */
    public static void cacheResult(
        java.util.List<com.liferay.devcon2013.model.BeerDrinker> beerDrinkers) {
        getPersistence().cacheResult(beerDrinkers);
    }

    /**
    * Creates a new beer drinker with the primary key. Does not add the beer drinker to the database.
    *
    * @param beerDrinkerId the primary key for the new beer drinker
    * @return the new beer drinker
    */
    public static com.liferay.devcon2013.model.BeerDrinker create(
        long beerDrinkerId) {
        return getPersistence().create(beerDrinkerId);
    }

    /**
    * Removes the beer drinker with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param beerDrinkerId the primary key of the beer drinker
    * @return the beer drinker that was removed
    * @throws com.liferay.devcon2013.NoSuchBeerDrinkerException if a beer drinker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.devcon2013.model.BeerDrinker remove(
        long beerDrinkerId)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(beerDrinkerId);
    }

    public static com.liferay.devcon2013.model.BeerDrinker updateImpl(
        com.liferay.devcon2013.model.BeerDrinker beerDrinker)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(beerDrinker);
    }

    /**
    * Returns the beer drinker with the primary key or throws a {@link com.liferay.devcon2013.NoSuchBeerDrinkerException} if it could not be found.
    *
    * @param beerDrinkerId the primary key of the beer drinker
    * @return the beer drinker
    * @throws com.liferay.devcon2013.NoSuchBeerDrinkerException if a beer drinker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.devcon2013.model.BeerDrinker findByPrimaryKey(
        long beerDrinkerId)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(beerDrinkerId);
    }

    /**
    * Returns the beer drinker with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param beerDrinkerId the primary key of the beer drinker
    * @return the beer drinker, or <code>null</code> if a beer drinker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.devcon2013.model.BeerDrinker fetchByPrimaryKey(
        long beerDrinkerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(beerDrinkerId);
    }

    /**
    * Returns all the beer drinkers.
    *
    * @return the beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.devcon2013.model.BeerDrinker> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.liferay.devcon2013.model.BeerDrinker> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the beer drinkers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.devcon2013.model.impl.BeerDrinkerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of beer drinkers
    * @param end the upper bound of the range of beer drinkers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.devcon2013.model.BeerDrinker> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the beer drinkers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of beer drinkers.
    *
    * @return the number of beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static BeerDrinkerPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (BeerDrinkerPersistence) PortletBeanLocatorUtil.locate(com.liferay.devcon2013.service.ClpSerializer.getServletContextName(),
                    BeerDrinkerPersistence.class.getName());

            ReferenceRegistry.registerReference(BeerDrinkerUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(BeerDrinkerPersistence persistence) {
    }
}
