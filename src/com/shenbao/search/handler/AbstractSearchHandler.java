package com.shenbao.search.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import com.shenbao.search.service.AbstractWebSite;

public abstract class AbstractSearchHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent executionEvent) throws ExecutionException {
		getWebSite().search(getKeyWords());
		return null;
	}
	
	abstract AbstractWebSite getWebSite();
	
	public String getKeyWords(){
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		ISelection selection = page.getSelection();
		if(!(selection instanceof ITextSelection)){
			return null;
		}
		ITextSelection textSelection = (ITextSelection)selection;
		String text = textSelection.getText();
		if (text == null || text.length() == 0) {  
			return null;
		} 
		return text;
	}
}
