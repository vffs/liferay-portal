/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.translation.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.AttachedModel;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.MVCCModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;
import com.liferay.portal.kernel.model.change.tracking.CTModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the TranslationEntry service. Represents a row in the &quot;TranslationEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.translation.model.impl.TranslationEntryModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.translation.model.impl.TranslationEntryImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TranslationEntry
 * @generated
 */
@ProviderType
public interface TranslationEntryModel
	extends AttachedModel, BaseModel<TranslationEntry>,
			CTModel<TranslationEntry>, GroupedModel, MVCCModel, ShardedModel,
			StagedAuditedModel, WorkflowedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a translation entry model instance should use the {@link TranslationEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this translation entry.
	 *
	 * @return the primary key of this translation entry
	 */
	@Override
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this translation entry.
	 *
	 * @param primaryKey the primary key of this translation entry
	 */
	@Override
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the mvcc version of this translation entry.
	 *
	 * @return the mvcc version of this translation entry
	 */
	@Override
	public long getMvccVersion();

	/**
	 * Sets the mvcc version of this translation entry.
	 *
	 * @param mvccVersion the mvcc version of this translation entry
	 */
	@Override
	public void setMvccVersion(long mvccVersion);

	/**
	 * Returns the ct collection ID of this translation entry.
	 *
	 * @return the ct collection ID of this translation entry
	 */
	@Override
	public long getCtCollectionId();

	/**
	 * Sets the ct collection ID of this translation entry.
	 *
	 * @param ctCollectionId the ct collection ID of this translation entry
	 */
	@Override
	public void setCtCollectionId(long ctCollectionId);

	/**
	 * Returns the uuid of this translation entry.
	 *
	 * @return the uuid of this translation entry
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this translation entry.
	 *
	 * @param uuid the uuid of this translation entry
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the translation entry ID of this translation entry.
	 *
	 * @return the translation entry ID of this translation entry
	 */
	public long getTranslationEntryId();

	/**
	 * Sets the translation entry ID of this translation entry.
	 *
	 * @param translationEntryId the translation entry ID of this translation entry
	 */
	public void setTranslationEntryId(long translationEntryId);

	/**
	 * Returns the group ID of this translation entry.
	 *
	 * @return the group ID of this translation entry
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this translation entry.
	 *
	 * @param groupId the group ID of this translation entry
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this translation entry.
	 *
	 * @return the company ID of this translation entry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this translation entry.
	 *
	 * @param companyId the company ID of this translation entry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this translation entry.
	 *
	 * @return the user ID of this translation entry
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this translation entry.
	 *
	 * @param userId the user ID of this translation entry
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this translation entry.
	 *
	 * @return the user uuid of this translation entry
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this translation entry.
	 *
	 * @param userUuid the user uuid of this translation entry
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this translation entry.
	 *
	 * @return the user name of this translation entry
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this translation entry.
	 *
	 * @param userName the user name of this translation entry
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this translation entry.
	 *
	 * @return the create date of this translation entry
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this translation entry.
	 *
	 * @param createDate the create date of this translation entry
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this translation entry.
	 *
	 * @return the modified date of this translation entry
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this translation entry.
	 *
	 * @param modifiedDate the modified date of this translation entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the fully qualified class name of this translation entry.
	 *
	 * @return the fully qualified class name of this translation entry
	 */
	@Override
	public String getClassName();

	public void setClassName(String className);

	/**
	 * Returns the class name ID of this translation entry.
	 *
	 * @return the class name ID of this translation entry
	 */
	@Override
	public long getClassNameId();

	/**
	 * Sets the class name ID of this translation entry.
	 *
	 * @param classNameId the class name ID of this translation entry
	 */
	@Override
	public void setClassNameId(long classNameId);

	/**
	 * Returns the class pk of this translation entry.
	 *
	 * @return the class pk of this translation entry
	 */
	@Override
	public long getClassPK();

	/**
	 * Sets the class pk of this translation entry.
	 *
	 * @param classPK the class pk of this translation entry
	 */
	@Override
	public void setClassPK(long classPK);

	/**
	 * Returns the content of this translation entry.
	 *
	 * @return the content of this translation entry
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this translation entry.
	 *
	 * @param content the content of this translation entry
	 */
	public void setContent(String content);

	/**
	 * Returns the content type of this translation entry.
	 *
	 * @return the content type of this translation entry
	 */
	@AutoEscape
	public String getContentType();

	/**
	 * Sets the content type of this translation entry.
	 *
	 * @param contentType the content type of this translation entry
	 */
	public void setContentType(String contentType);

	/**
	 * Returns the language ID of this translation entry.
	 *
	 * @return the language ID of this translation entry
	 */
	@AutoEscape
	public String getLanguageId();

	/**
	 * Sets the language ID of this translation entry.
	 *
	 * @param languageId the language ID of this translation entry
	 */
	public void setLanguageId(String languageId);

	/**
	 * Returns the status of this translation entry.
	 *
	 * @return the status of this translation entry
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this translation entry.
	 *
	 * @param status the status of this translation entry
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this translation entry.
	 *
	 * @return the status by user ID of this translation entry
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this translation entry.
	 *
	 * @param statusByUserId the status by user ID of this translation entry
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this translation entry.
	 *
	 * @return the status by user uuid of this translation entry
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this translation entry.
	 *
	 * @param statusByUserUuid the status by user uuid of this translation entry
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this translation entry.
	 *
	 * @return the status by user name of this translation entry
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this translation entry.
	 *
	 * @param statusByUserName the status by user name of this translation entry
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this translation entry.
	 *
	 * @return the status date of this translation entry
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this translation entry.
	 *
	 * @param statusDate the status date of this translation entry
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns <code>true</code> if this translation entry is approved.
	 *
	 * @return <code>true</code> if this translation entry is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this translation entry is denied.
	 *
	 * @return <code>true</code> if this translation entry is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this translation entry is a draft.
	 *
	 * @return <code>true</code> if this translation entry is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this translation entry is expired.
	 *
	 * @return <code>true</code> if this translation entry is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this translation entry is inactive.
	 *
	 * @return <code>true</code> if this translation entry is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this translation entry is incomplete.
	 *
	 * @return <code>true</code> if this translation entry is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this translation entry is pending.
	 *
	 * @return <code>true</code> if this translation entry is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this translation entry is scheduled.
	 *
	 * @return <code>true</code> if this translation entry is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

}