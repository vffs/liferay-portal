#!/bin/bash

function main {
	./build_bundle.sh releases.liferay.com/commerce/1.1.6/Liferay%20Commerce%201.1.6.lpkg releases.liferay.com/portal/7.1.3-ga4/liferay-ce-portal-tomcat-7.1.3-ga4-20190508171117552.7z
	./build_bundle.sh files.liferay.com/private/ee/commerce/1.1.6/Liferay%20Commerce%20Enterprise%201.1.6.lpkg files.liferay.com/private/ee/portal/7.1.10.1/liferay-dxp-tomcat-7.1.10.1-sp1-20190110085705206.zip files.liferay.com/private/ee/fix-packs/7.1.10/dxp/liferay-fix-pack-dxp-11-7110.zip
}

main