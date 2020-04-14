package org.primefaces.test;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("ws")
@SessionScoped
public class WebSession implements Serializable {
	private static final long serialVersionUID = 1L;

	public String getName() {
		return "WebSession";
	}
}
