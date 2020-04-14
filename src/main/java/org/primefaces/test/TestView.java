package org.primefaces.test;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestView implements Serializable {

	private String testString;
	private Long value = 50L;
	private Point point = new Point();

	@PostConstruct
	public void init() {
		testString = "MYFACES-4310";
	}

	public String getTestString() {
		return testString;
	}

	public void setTestString(String testString) {
		this.testString = testString;
	}

	public Long getNumberValue() {
		return value;
	}

	public void setNumberValue(Long value) {
		this.value = value;
	}

	public Point getPoint() {
		return point;
	}

	public static class Point {

		public boolean isNew() {
			return true;
		}
	}
}
