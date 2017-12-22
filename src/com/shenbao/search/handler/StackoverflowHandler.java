package com.shenbao.search.handler;

import com.shenbao.search.service.AbstractWebSite;
import com.shenbao.search.service.StackoverflowWebSite;

public class StackoverflowHandler extends AbstractSearchHandler {

	@Override
	AbstractWebSite getWebSite() {
		return new StackoverflowWebSite();
	}
}
