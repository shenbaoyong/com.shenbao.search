package com.shenbao.search.util;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * <p>Description: 浏览器工具类</p>
 * @author <a href="mailto:liupeng@karrytech.com">Liu Peng</a>
 */
public class BrowseUtil {
	/**
	 * 使用默认浏览器打开一个页面
	 * @param url
	 */
	public static void open(String url){
		try {
			URI uri = new URI(url);  
			Desktop.getDesktop().browse(uri);  
		} catch (URISyntaxException e) {  
			e.printStackTrace();  
		} catch (IOException e) {  
			e.printStackTrace();  
		}  
	}
}
