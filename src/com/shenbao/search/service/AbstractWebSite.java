package com.shenbao.search.service;

import java.net.URLEncoder;

import com.shenbao.search.util.BrowseUtil;

public abstract class AbstractWebSite{
	/**
	 * ��վ������ǰ׺
	 * @return
	 */
	protected abstract String getUrlPrefix();
	
	/**
	 * �費��Ҫ�����������ݽ���ת��
	 * @return
	 */
	protected abstract boolean isNeedEncode();
	
	/**
	 * ��װ������url
	 * @param keywords
	 * @return
	 */
	private String getFullUrl(String keywords){
		return getUrlPrefix() +  (isNeedEncode() ? URLEncoder.encode(keywords) : keywords);
	}
	
	/**
	 * ���������������
	 * @param keyWords
	 */
	public void search(String keyWords){
		BrowseUtil.open(getFullUrl(keyWords));
	}
}
