package com.shenbao.search.service;

import java.net.URLEncoder;

import com.shenbao.search.util.BrowseUtil;

public abstract class AbstractWebSite{
	/**
	 * 网站搜索的前缀
	 * @return
	 */
	protected abstract String getUrlPrefix();
	
	/**
	 * 需不需要对搜索的内容进行转码
	 * @return
	 */
	protected abstract boolean isNeedEncode();
	
	/**
	 * 组装完整的url
	 * @param keywords
	 * @return
	 */
	private String getFullUrl(String keywords){
		return getUrlPrefix() +  (isNeedEncode() ? URLEncoder.encode(keywords) : keywords);
	}
	
	/**
	 * 打开浏览器搜索内容
	 * @param keyWords
	 */
	public void search(String keyWords){
		BrowseUtil.open(getFullUrl(keyWords));
	}
}
