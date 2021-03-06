/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.contenttargeting.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the RuleInstance service. Represents a row in the &quot;CT_RuleInstance&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.contenttargeting.model.impl.RuleInstanceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.contenttargeting.model.impl.RuleInstanceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RuleInstance
 * @see com.liferay.contenttargeting.model.impl.RuleInstanceImpl
 * @see com.liferay.contenttargeting.model.impl.RuleInstanceModelImpl
 * @generated
 */
public interface RuleInstanceModel extends BaseModel<RuleInstance>,
	StagedGroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a rule instance model instance should use the {@link RuleInstance} interface instead.
	 */

	/**
	 * Returns the primary key of this rule instance.
	 *
	 * @return the primary key of this rule instance
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this rule instance.
	 *
	 * @param primaryKey the primary key of this rule instance
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this rule instance.
	 *
	 * @return the uuid of this rule instance
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this rule instance.
	 *
	 * @param uuid the uuid of this rule instance
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the rule instance ID of this rule instance.
	 *
	 * @return the rule instance ID of this rule instance
	 */
	public long getRuleInstanceId();

	/**
	 * Sets the rule instance ID of this rule instance.
	 *
	 * @param ruleInstanceId the rule instance ID of this rule instance
	 */
	public void setRuleInstanceId(long ruleInstanceId);

	/**
	 * Returns the group ID of this rule instance.
	 *
	 * @return the group ID of this rule instance
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this rule instance.
	 *
	 * @param groupId the group ID of this rule instance
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this rule instance.
	 *
	 * @return the company ID of this rule instance
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this rule instance.
	 *
	 * @param companyId the company ID of this rule instance
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this rule instance.
	 *
	 * @return the user ID of this rule instance
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this rule instance.
	 *
	 * @param userId the user ID of this rule instance
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this rule instance.
	 *
	 * @return the user uuid of this rule instance
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this rule instance.
	 *
	 * @param userUuid the user uuid of this rule instance
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this rule instance.
	 *
	 * @return the user name of this rule instance
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this rule instance.
	 *
	 * @param userName the user name of this rule instance
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this rule instance.
	 *
	 * @return the create date of this rule instance
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this rule instance.
	 *
	 * @param createDate the create date of this rule instance
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this rule instance.
	 *
	 * @return the modified date of this rule instance
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this rule instance.
	 *
	 * @param modifiedDate the modified date of this rule instance
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the rule key of this rule instance.
	 *
	 * @return the rule key of this rule instance
	 */
	@AutoEscape
	public String getRuleKey();

	/**
	 * Sets the rule key of this rule instance.
	 *
	 * @param ruleKey the rule key of this rule instance
	 */
	public void setRuleKey(String ruleKey);

	/**
	 * Returns the user segment ID of this rule instance.
	 *
	 * @return the user segment ID of this rule instance
	 */
	public long getUserSegmentId();

	/**
	 * Sets the user segment ID of this rule instance.
	 *
	 * @param userSegmentId the user segment ID of this rule instance
	 */
	public void setUserSegmentId(long userSegmentId);

	/**
	 * Returns the type settings of this rule instance.
	 *
	 * @return the type settings of this rule instance
	 */
	@AutoEscape
	public String getTypeSettings();

	/**
	 * Sets the type settings of this rule instance.
	 *
	 * @param typeSettings the type settings of this rule instance
	 */
	public void setTypeSettings(String typeSettings);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(RuleInstance ruleInstance);

	@Override
	public int hashCode();

	@Override
	public CacheModel<RuleInstance> toCacheModel();

	@Override
	public RuleInstance toEscapedModel();

	@Override
	public RuleInstance toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}