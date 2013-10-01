package com.liferay.devcon2013.model.impl;

import com.liferay.devcon2013.model.BeerDrinker;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BeerDrinker in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see BeerDrinker
 * @generated
 */
public class BeerDrinkerCacheModel implements CacheModel<BeerDrinker>,
    Externalizable {
    public String uuid;
    public long beerDrinkerId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public int status;
    public long statusByUserId;
    public String statusByUserName;
    public long statusDate;
    public String name;
    public float alcoholLevel;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(29);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", beerDrinkerId=");
        sb.append(beerDrinkerId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", status=");
        sb.append(status);
        sb.append(", statusByUserId=");
        sb.append(statusByUserId);
        sb.append(", statusByUserName=");
        sb.append(statusByUserName);
        sb.append(", statusDate=");
        sb.append(statusDate);
        sb.append(", name=");
        sb.append(name);
        sb.append(", alcoholLevel=");
        sb.append(alcoholLevel);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public BeerDrinker toEntityModel() {
        BeerDrinkerImpl beerDrinkerImpl = new BeerDrinkerImpl();

        if (uuid == null) {
            beerDrinkerImpl.setUuid(StringPool.BLANK);
        } else {
            beerDrinkerImpl.setUuid(uuid);
        }

        beerDrinkerImpl.setBeerDrinkerId(beerDrinkerId);
        beerDrinkerImpl.setGroupId(groupId);
        beerDrinkerImpl.setCompanyId(companyId);
        beerDrinkerImpl.setUserId(userId);

        if (userName == null) {
            beerDrinkerImpl.setUserName(StringPool.BLANK);
        } else {
            beerDrinkerImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            beerDrinkerImpl.setCreateDate(null);
        } else {
            beerDrinkerImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            beerDrinkerImpl.setModifiedDate(null);
        } else {
            beerDrinkerImpl.setModifiedDate(new Date(modifiedDate));
        }

        beerDrinkerImpl.setStatus(status);
        beerDrinkerImpl.setStatusByUserId(statusByUserId);

        if (statusByUserName == null) {
            beerDrinkerImpl.setStatusByUserName(StringPool.BLANK);
        } else {
            beerDrinkerImpl.setStatusByUserName(statusByUserName);
        }

        if (statusDate == Long.MIN_VALUE) {
            beerDrinkerImpl.setStatusDate(null);
        } else {
            beerDrinkerImpl.setStatusDate(new Date(statusDate));
        }

        if (name == null) {
            beerDrinkerImpl.setName(StringPool.BLANK);
        } else {
            beerDrinkerImpl.setName(name);
        }

        beerDrinkerImpl.setAlcoholLevel(alcoholLevel);

        beerDrinkerImpl.resetOriginalValues();

        return beerDrinkerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        beerDrinkerId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        status = objectInput.readInt();
        statusByUserId = objectInput.readLong();
        statusByUserName = objectInput.readUTF();
        statusDate = objectInput.readLong();
        name = objectInput.readUTF();
        alcoholLevel = objectInput.readFloat();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(beerDrinkerId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
        objectOutput.writeInt(status);
        objectOutput.writeLong(statusByUserId);

        if (statusByUserName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(statusByUserName);
        }

        objectOutput.writeLong(statusDate);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeFloat(alcoholLevel);
    }
}
