package com.shenbao.search.util;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * <p>Description: �����������</p>
 * @author <a href="mailto:liupeng@karrytech.com">Liu Peng</a>
 */
public class BrowseUtil {
	/**
	 * ʹ��Ĭ���������һ��ҳ��
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
