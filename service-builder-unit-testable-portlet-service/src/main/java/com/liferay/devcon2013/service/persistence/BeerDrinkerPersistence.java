package com.liferay.devcon2013.service.persistence;

import com.liferay.devcon2013.model.BeerDrinker;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the beer drinker service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BeerDrinkerPersistenceImpl
 * @see BeerDrinkerUtil
 * @generated
 */
public interface BeerDrinkerPersistence extends BasePersistence<BeerDrinker> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link BeerDrinkerUtil} to access the beer drinker persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the beer drinkers where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.devcon2013.model.BeerDrinker> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.devcon2013.model.BeerDrinker> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.devcon2013.model.BeerDrinker> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first beer drinker in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching beer drinker
    * @throws com.liferay.devcon2013.NoSuchBeerDrinkerException if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.devcon2013.model.BeerDrinker findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first beer drinker in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching beer drinker, or <code>null</code> if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.devcon2013.model.BeerDrinker fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last beer drinker in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching beer drinker
    * @throws com.liferay.devcon2013.NoSuchBeerDrinkerException if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.devcon2013.model.BeerDrinker findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last beer drinker in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching beer drinker, or <code>null</code> if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.devcon2013.model.BeerDrinker fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.liferay.devcon2013.model.BeerDrinker[] findByUuid_PrevAndNext(
        long beerDrinkerId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the beer drinkers where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of beer drinkers where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the beer drinker where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.devcon2013.NoSuchBeerDrinkerException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching beer drinker
    * @throws com.liferay.devcon2013.NoSuchBeerDrinkerException if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.devcon2013.model.BeerDrinker findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the beer drinker where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching beer drinker, or <code>null</code> if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.devcon2013.model.BeerDrinker fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the beer drinker where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching beer drinker, or <code>null</code> if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.devcon2013.model.BeerDrinker fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the beer drinker where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the beer drinker that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.devcon2013.model.BeerDrinker removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of beer drinkers where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the beer drinkers where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.devcon2013.model.BeerDrinker> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.devcon2013.model.BeerDrinker> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.devcon2013.model.BeerDrinker> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.liferay.devcon2013.model.BeerDrinker findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first beer drinker in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching beer drinker, or <code>null</code> if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.devcon2013.model.BeerDrinker fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.liferay.devcon2013.model.BeerDrinker findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last beer drinker in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching beer drinker, or <code>null</code> if a matching beer drinker could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.devcon2013.model.BeerDrinker fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.liferay.devcon2013.model.BeerDrinker[] findByUuid_C_PrevAndNext(
        long beerDrinkerId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the beer drinkers where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of beer drinkers where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the beer drinker in the entity cache if it is enabled.
    *
    * @param beerDrinker the beer drinker
    */
    public void cacheResult(
        com.liferay.devcon2013.model.BeerDrinker beerDrinker);

    /**
    * Caches the beer drinkers in the entity cache if it is enabled.
    *
    * @param beerDrinkers the beer drinkers
    */
    public void cacheResult(
        java.util.List<com.liferay.devcon2013.model.BeerDrinker> beerDrinkers);

    /**
    * Creates a new beer drinker with the primary key. Does not add the beer drinker to the database.
    *
    * @param beerDrinkerId the primary key for the new beer drinker
    * @return the new beer drinker
    */
    public com.liferay.devcon2013.model.BeerDrinker create(long beerDrinkerId);

    /**
    * Removes the beer drinker with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param beerDrinkerId the primary key of the beer drinker
    * @return the beer drinker that was removed
    * @throws com.liferay.devcon2013.NoSuchBeerDrinkerException if a beer drinker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.devcon2013.model.BeerDrinker remove(long beerDrinkerId)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.devcon2013.model.BeerDrinker updateImpl(
        com.liferay.devcon2013.model.BeerDrinker beerDrinker)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the beer drinker with the primary key or throws a {@link com.liferay.devcon2013.NoSuchBeerDrinkerException} if it could not be found.
    *
    * @param beerDrinkerId the primary key of the beer drinker
    * @return the beer drinker
    * @throws com.liferay.devcon2013.NoSuchBeerDrinkerException if a beer drinker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.devcon2013.model.BeerDrinker findByPrimaryKey(
        long beerDrinkerId)
        throws com.liferay.devcon2013.NoSuchBeerDrinkerException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the beer drinker with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param beerDrinkerId the primary key of the beer drinker
    * @return the beer drinker, or <code>null</code> if a beer drinker with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.devcon2013.model.BeerDrinker fetchByPrimaryKey(
        long beerDrinkerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the beer drinkers.
    *
    * @return the beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.devcon2013.model.BeerDrinker> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.devcon2013.model.BeerDrinker> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.devcon2013.model.BeerDrinker> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the beer drinkers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of beer drinkers.
    *
    * @return the number of beer drinkers
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
