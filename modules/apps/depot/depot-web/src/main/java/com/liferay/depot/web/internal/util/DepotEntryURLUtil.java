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

package com.liferay.depot.web.internal.util;

import com.liferay.depot.web.internal.constants.DepotPortletKeys;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.util.PortalUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionURL;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

/**
 * @author Alejandro Tardín
 */
public class DepotEntryURLUtil {

	public static ActionURL getAddDepotEntryActionURL(
		String redirect, LiferayPortletResponse liferayPortletResponse) {

		ActionURL addDepotEntryURL = liferayPortletResponse.createActionURL();

		addDepotEntryURL.setParameter(
			ActionRequest.ACTION_NAME, "/depot_entry/add");
		addDepotEntryURL.setParameter("redirect", redirect);

		return addDepotEntryURL;
	}

	public static ActionURL getDeleteDepotEntryActionURL(
		long depotEntryId, String redirect,
		LiferayPortletResponse liferayPortletResponse) {

		ActionURL deleteDepotEntryActionURL =
			liferayPortletResponse.createActionURL();

		deleteDepotEntryActionURL.setParameter(
			ActionRequest.ACTION_NAME, "/depot_entry/delete");
		deleteDepotEntryActionURL.setParameter("redirect", redirect);
		deleteDepotEntryActionURL.setParameter(
			"depotEntryId", String.valueOf(depotEntryId));

		return deleteDepotEntryActionURL;
	}

	public static ActionURL getDisconnectSiteActionURL(
		long depotEntryGroupRelId, String redirect,
		LiferayPortletResponse liferayPortletResponse) {

		ActionURL disconnectSiteActionURL =
			liferayPortletResponse.createActionURL();

		disconnectSiteActionURL.setParameter(
			ActionRequest.ACTION_NAME, "/depot_entry/disconnect");
		disconnectSiteActionURL.setParameter("redirect", redirect);
		disconnectSiteActionURL.setParameter(
			"depotEntryGroupRelId", String.valueOf(depotEntryGroupRelId));

		return disconnectSiteActionURL;
	}

	public static ActionURL getEditDepotEntryGroupRelActionURL(
		long depotEntryGroupRelId, boolean searchable, String redirect,
		LiferayPortletResponse liferayPortletResponse) {

		ActionURL editDepotEntryGroupRelActionURL =
			liferayPortletResponse.createActionURL();

		editDepotEntryGroupRelActionURL.setParameter(
			ActionRequest.ACTION_NAME,
			"/depot_entry/edit_depot_entry_group_rel");
		editDepotEntryGroupRelActionURL.setParameter("redirect", redirect);
		editDepotEntryGroupRelActionURL.setParameter(
			"depotEntryGroupRelId", String.valueOf(depotEntryGroupRelId));
		editDepotEntryGroupRelActionURL.setParameter(
			"searchable", String.valueOf(searchable));

		return editDepotEntryGroupRelActionURL;
	}

	public static PortletURL getEditDepotEntryPortletURL(
		Group group, String redirect,
		LiferayPortletRequest httpServletRequest) {

		PortletURL editDepotEntryURL = PortalUtil.getControlPanelPortletURL(
			httpServletRequest, group, DepotPortletKeys.DEPOT_ADMIN, 0, 0,
			PortletRequest.RENDER_PHASE);

		editDepotEntryURL.setParameter(
			"mvcRenderCommandName", "/depot_entry/edit");
		editDepotEntryURL.setParameter("redirect", redirect);
		editDepotEntryURL.setParameter(
			"depotEntryId", String.valueOf(group.getClassPK()));

		return editDepotEntryURL;
	}

}