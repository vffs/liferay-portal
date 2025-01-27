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

import {openModal} from 'frontend-js-web';

const actionHandlers = {
	copyLayout: ({actionURL, namespace}) => {
		openModal({
			id: `${namespace}addLayoutDialog`,
			title: Liferay.Language.get('copy-page'),
			url: actionURL,
		});
	},

	delete: ({actionURL, hasChildren}) => {
		let deleteMessage = Liferay.Language.get(
			'are-you-sure-you-want-to-delete-this-page'
		);

		if (hasChildren) {
			deleteMessage = Liferay.Util.sub(
				Liferay.Language.get(
					'this-page-has-child-pages-that-will-also-be-removed-are-you-sure-you-want-to-delete-this-page'
				),
				hasChildren
			);
		}

		if (confirm(deleteMessage)) {
			Liferay.Util.navigate(actionURL);
		}
	},

	discardDraft: ({actionURL}) => {
		const discardDraftMessage = Liferay.Language.get(
			'are-you-sure-you-want-to-discard-current-draft-and-apply-latest-published-changes'
		);

		if (confirm(discardDraftMessage)) {
			Liferay.Util.navigate(actionURL);
		}
	},

	exportTranslation: ({itemData, namespace}) => {
		Liferay.componentReady(
			`${namespace}ExportForTranslationComponent`
		).then((exportTranslationComponent) => {
			exportTranslationComponent.open([itemData.plid]);
		});
	},

	permissions: ({actionURL}) => {
		openModal({
			title: Liferay.Language.get('permissions'),
			url: actionURL,
		});
	},

	viewCollectionItems: ({actionURL, namespace}) => {
		openModal({
			id: `${namespace}viewCollectionItemsDialog`,
			title: Liferay.Language.get('collection-items'),
			url: actionURL,
		});
	},
};

export default actionHandlers;
