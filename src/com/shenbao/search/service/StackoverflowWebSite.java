package com.shenbao.search.service;

public class StackoverflowWebSite extends AbstractWebSite{

	@Override
	protected String getUrlPrefix() {
		return "https://stackoverflow.com/search?q=";
	}

	@Override
	protected boolean isNeedEncode() {
		return true;
	}
}
