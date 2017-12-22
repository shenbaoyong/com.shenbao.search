package com.shenbao.search.service;

public class BaiduWebSite extends AbstractWebSite{

	@Override
	protected String getUrlPrefix() {
		return "https://www.baidu.com/s?wd=";
	}

	@Override
	protected boolean isNeedEncode() {
		return true;
	}
}
