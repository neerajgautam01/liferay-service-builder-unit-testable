package com.liferay.devcon2013.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BeerDrinker}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BeerDrinker
 * @generated
 */
public class BeerDrinkerWrapper implements BeerDrinker,
    ModelWrapper<BeerDrinker> {
    private BeerDrinker _beerDrinker;

    public BeerDrinkerWrapper(BeerDrinker beerDrinker) {
        _beerDrinker = beerDrinker;
    }

    @Override
    public Class<?> getModelClass() {
        return BeerDrinker.class;
    }

    @Override
    public String getModelClassName() {
        return BeerDrinker.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("beerDrinkerId", getBeerDrinkerId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("status", getStatus());
        attributes.put("statusByUserId", getStatusByUserId());
        attributes.put("statusByUserName", getStatusByUserName());
        attributes.put("statusDate", getStatusDate());
        attributes.put("name", getName());
        attributes.put("alcoholLevel", getAlcoholLevel());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long beerDrinkerId = (Long) attributes.get("beerDrinkerId");

        if (beerDrinkerId != null) {
            setBeerDrinkerId(beerDrinkerId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Integer status = (Integer) attributes.get("status");

        if (status != null) {
            setStatus(status);
        }

        Long statusByUserId = (Long) attributes.get("statusByUserId");

        if (statusByUserId != null) {
            setStatusByUserId(statusByUserId);
        }

        String statusByUserName = (String) attributes.get("statusByUserName");

        if (statusByUserName != null) {
            setStatusByUserName(statusByUserName);
        }

        Date statusDate = (Date) attributes.get("statusDate");

        if (statusDate != null) {
            setStatusDate(statusDate);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Float alcoholLevel = (Float) attributes.get("alcoholLevel");

        if (alcoholLevel != null) {
            setAlcoholLevel(alcoholLevel);
        }
    }

    /**
    * Returns the primary key of this beer drinker.
    *
    * @return the primary key of this beer drinker
    */
    @Override
    public long getPrimaryKey() {
        return _beerDrinker.getPrimaryKey();
    }

    /**
    * Sets the primary key of this beer drinker.
    *
    * @param primaryKey the primary key of this beer drinker
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _beerDrinker.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this beer drinker.
    *
    * @return the uuid of this beer drinker
    */
    @Override
    public java.lang.String getUuid() {
        return _beerDrinker.getUuid();
    }

    /**
    * Sets the uuid of this beer drinker.
    *
    * @param uuid the uuid of this beer drinker
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _beerDrinker.setUuid(uuid);
    }

    /**
    * Returns the beer drinker ID of this beer drinker.
    *
    * @return the beer drinker ID of this beer drinker
    */
    @Override
    public long getBeerDrinkerId() {
        return _beerDrinker.getBeerDrinkerId();
    }

    /**
    * Sets the beer drinker ID of this beer drinker.
    *
    * @param beerDrinkerId the beer drinker ID of this beer drinker
    */
    @Override
    public void setBeerDrinkerId(long beerDrinkerId) {
        _beerDrinker.setBeerDrinkerId(beerDrinkerId);
    }

    /**
    * Returns the group ID of this beer drinker.
    *
    * @return the group ID of this beer drinker
    */
    @Override
    public long getGroupId() {
        return _beerDrinker.getGroupId();
    }

    /**
    * Sets the group ID of this beer drinker.
    *
    * @param groupId the group ID of this beer drinker
    */
    @Override
    public void setGroupId(long groupId) {
        _beerDrinker.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this beer drinker.
    *
    * @return the company ID of this beer drinker
    */
    @Override
    public long getCompanyId() {
        return _beerDrinker.getCompanyId();
    }

    /**
    * Sets the company ID of this beer drinker.
    *
    * @param companyId the company ID of this beer drinker
    */
    @Override
    public void setCompanyId(long companyId) {
        _beerDrinker.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this beer drinker.
    *
    * @return the user ID of this beer drinker
    */
    @Override
    public long getUserId() {
        return _beerDrinker.getUserId();
    }

    /**
    * Sets the user ID of this beer drinker.
    *
    * @param userId the user ID of this beer drinker
    */
    @Override
    public void setUserId(long userId) {
        _beerDrinker.setUserId(userId);
    }

    /**
    * Returns the user uuid of this beer drinker.
    *
    * @return the user uuid of this beer drinker
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinker.getUserUuid();
    }

    /**
    * Sets the user uuid of this beer drinker.
    *
    * @param userUuid the user uuid of this beer drinker
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _beerDrinker.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this beer drinker.
    *
    * @return the user name of this beer drinker
    */
    @Override
    public java.lang.String getUserName() {
        return _beerDrinker.getUserName();
    }

    /**
    * Sets the user name of this beer drinker.
    *
    * @param userName the user name of this beer drinker
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _beerDrinker.setUserName(userName);
    }

    /**
    * Returns the create date of this beer drinker.
    *
    * @return the create date of this beer drinker
    */
    @Override
    public java.util.Date getCreateDate() {
        return _beerDrinker.getCreateDate();
    }

    /**
    * Sets the create date of this beer drinker.
    *
    * @param createDate the create date of this beer drinker
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _beerDrinker.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this beer drinker.
    *
    * @return the modified date of this beer drinker
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _beerDrinker.getModifiedDate();
    }

    /**
    * Sets the modified date of this beer drinker.
    *
    * @param modifiedDate the modified date of this beer drinker
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _beerDrinker.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the status of this beer drinker.
    *
    * @return the status of this beer drinker
    */
    @Override
    public int getStatus() {
        return _beerDrinker.getStatus();
    }

    /**
    * Sets the status of this beer drinker.
    *
    * @param status the status of this beer drinker
    */
    @Override
    public void setStatus(int status) {
        _beerDrinker.setStatus(status);
    }

    /**
    * Returns the status by user ID of this beer drinker.
    *
    * @return the status by user ID of this beer drinker
    */
    @Override
    public long getStatusByUserId() {
        return _beerDrinker.getStatusByUserId();
    }

    /**
    * Sets the status by user ID of this beer drinker.
    *
    * @param statusByUserId the status by user ID of this beer drinker
    */
    @Override
    public void setStatusByUserId(long statusByUserId) {
        _beerDrinker.setStatusByUserId(statusByUserId);
    }

    /**
    * Returns the status by user uuid of this beer drinker.
    *
    * @return the status by user uuid of this beer drinker
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getStatusByUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _beerDrinker.getStatusByUserUuid();
    }

    /**
    * Sets the status by user uuid of this beer drinker.
    *
    * @param statusByUserUuid the status by user uuid of this beer drinker
    */
    @Override
    public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
        _beerDrinker.setStatusByUserUuid(statusByUserUuid);
    }

    /**
    * Returns the status by user name of this beer drinker.
    *
    * @return the status by user name of this beer drinker
    */
    @Override
    public java.lang.String getStatusByUserName() {
        return _beerDrinker.getStatusByUserName();
    }

    /**
    * Sets the status by user name of this beer drinker.
    *
    * @param statusByUserName the status by user name of this beer drinker
    */
    @Override
    public void setStatusByUserName(java.lang.String statusByUserName) {
        _beerDrinker.setStatusByUserName(statusByUserName);
    }

    /**
    * Returns the status date of this beer drinker.
    *
    * @return the status date of this beer drinker
    */
    @Override
    public java.util.Date getStatusDate() {
        return _beerDrinker.getStatusDate();
    }

    /**
    * Sets the status date of this beer drinker.
    *
    * @param statusDate the status date of this beer drinker
    */
    @Override
    public void setStatusDate(java.util.Date statusDate) {
        _beerDrinker.setStatusDate(statusDate);
    }

    /**
    * Returns the name of this beer drinker.
    *
    * @return the name of this beer drinker
    */
    @Override
    public java.lang.String getName() {
        return _beerDrinker.getName();
    }

    /**
    * Sets the name of this beer drinker.
    *
    * @param name the name of this beer drinker
    */
    @Override
    public void setName(java.lang.String name) {
        _beerDrinker.setName(name);
    }

    /**
    * Returns the alcohol level of this beer drinker.
    *
    * @return the alcohol level of this beer drinker
    */
    @Override
    public float getAlcoholLevel() {
        return _beerDrinker.getAlcoholLevel();
    }

    /**
    * Sets the alcohol level of this beer drinker.
    *
    * @param alcoholLevel the alcohol level of this beer drinker
    */
    @Override
    public void setAlcoholLevel(float alcoholLevel) {
        _beerDrinker.setAlcoholLevel(alcoholLevel);
    }

    /**
    * @deprecated As of 6.1.0, replaced by {@link #isApproved()}
    */
    @Override
    public boolean getApproved() {
        return _beerDrinker.getApproved();
    }

    /**
    * Returns <code>true</code> if this beer drinker is approved.
    *
    * @return <code>true</code> if this beer drinker is approved; <code>false</code> otherwise
    */
    @Override
    public boolean isApproved() {
        return _beerDrinker.isApproved();
    }

    /**
    * Returns <code>true</code> if this beer drinker is denied.
    *
    * @return <code>true</code> if this beer drinker is denied; <code>false</code> otherwise
    */
    @Override
    public boolean isDenied() {
        return _beerDrinker.isDenied();
    }

    /**
    * Returns <code>true</code> if this beer drinker is a draft.
    *
    * @return <code>true</code> if this beer drinker is a draft; <code>false</code> otherwise
    */
    @Override
    public boolean isDraft() {
        return _beerDrinker.isDraft();
    }

    /**
    * Returns <code>true</code> if this beer drinker is expired.
    *
    * @return <code>true</code> if this beer drinker is expired; <code>false</code> otherwise
    */
    @Override
    public boolean isExpired() {
        return _beerDrinker.isExpired();
    }

    /**
    * Returns <code>true</code> if this beer drinker is inactive.
    *
    * @return <code>true</code> if this beer drinker is inactive; <code>false</code> otherwise
    */
    @Override
    public boolean isInactive() {
        return _beerDrinker.isInactive();
    }

    /**
    * Returns <code>true</code> if this beer drinker is incomplete.
    *
    * @return <code>true</code> if this beer drinker is incomplete; <code>false</code> otherwise
    */
    @Override
    public boolean isIncomplete() {
        return _beerDrinker.isIncomplete();
    }

    /**
    * Returns <code>true</code> if this beer drinker is in the Recycle Bin.
    *
    * @return <code>true</code> if this beer drinker is in the Recycle Bin; <code>false</code> otherwise
    */
    @Override
    public boolean isInTrash() {
        return _beerDrinker.isInTrash();
    }

    /**
    * Returns <code>true</code> if this beer drinker is pending.
    *
    * @return <code>true</code> if this beer drinker is pending; <code>false</code> otherwise
    */
    @Override
    public boolean isPending() {
        return _beerDrinker.isPending();
    }

    /**
    * Returns <code>true</code> if this beer drinker is scheduled.
    *
    * @return <code>true</code> if this beer drinker is scheduled; <code>false</code> otherwise
    */
    @Override
    public boolean isScheduled() {
        return _beerDrinker.isScheduled();
    }

    @Override
    public boolean isNew() {
        return _beerDrinker.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _beerDrinker.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _beerDrinker.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _beerDrinker.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _beerDrinker.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _beerDrinker.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _beerDrinker.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _beerDrinker.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _beerDrinker.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _beerDrinker.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _beerDrinker.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BeerDrinkerWrapper((BeerDrinker) _beerDrinker.clone());
    }

    @Override
    public int compareTo(BeerDrinker beerDrinker) {
        return _beerDrinker.compareTo(beerDrinker);
    }

    @Override
    public int hashCode() {
        return _beerDrinker.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<BeerDrinker> toCacheModel() {
        return _beerDrinker.toCacheModel();
    }

    @Override
    public BeerDrinker toEscapedModel() {
        return new BeerDrinkerWrapper(_beerDrinker.toEscapedModel());
    }

    @Override
    public BeerDrinker toUnescapedModel() {
        return new BeerDrinkerWrapper(_beerDrinker.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _beerDrinker.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _beerDrinker.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _beerDrinker.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BeerDrinkerWrapper)) {
            return false;
        }

        BeerDrinkerWrapper beerDrinkerWrapper = (BeerDrinkerWrapper) obj;

        if (Validator.equals(_beerDrinker, beerDrinkerWrapper._beerDrinker)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _beerDrinker.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public BeerDrinker getWrappedBeerDrinker() {
        return _beerDrinker;
    }

    @Override
    public BeerDrinker getWrappedModel() {
        return _beerDrinker;
    }

    @Override
    public void resetOriginalValues() {
        _beerDrinker.resetOriginalValues();
    }
}
