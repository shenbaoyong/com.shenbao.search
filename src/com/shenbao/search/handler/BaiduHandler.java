package com.shenbao.search.handler;

import com.shenbao.search.service.AbstractWebSite;
import com.shenbao.search.service.BaiduWebSite;

public class BaiduHandler extends AbstractSearchHandler{
	@Override
	AbstractWebSite getWebSite() {
		return new BaiduWebSite();
	}
}
