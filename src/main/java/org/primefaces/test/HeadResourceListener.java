package org.primefaces.test;

import javax.faces.component.UIComponent;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.event.SystemEvent;
import javax.faces.event.SystemEventListener;

public class HeadResourceListener implements SystemEventListener {

	@Override
	public boolean isListenerForSource(Object source) {
		System.out.println(((UIComponent) source).getRendererType());
		return "javax.faces.Head".equals(((UIComponent) source).getRendererType());
	}

	@Override
	public void processEvent(SystemEvent event) {
		addInlineHeadScript(FacesContext.getCurrentInstance());
	}

	private void addInlineHeadScript(FacesContext context) {
		String script = "var decimalsep = '.';";

		UIComponent outputScript = new UIOutput();
		outputScript.setRendererType("javax.faces.resource.Script");
		UIOutput content = new UIOutput();
		content.setValue(script);
		outputScript.getChildren().add(content);
		context.getViewRoot().addComponentResource(context, outputScript, "head");
	}
}