package com.lifeCycle.usinXml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {

	private String subjact;

	public String getSubjact() {
		return subjact;
	}

	public void setSubjact(String subjact) {
		this.subjact = subjact;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subjact=" + subjact + "]";
	}
	@PostConstruct
	public void start()
	{
		System.out.println("starting method");
	}
	@PreDestroy
	public void ending()
	{
		System.out.println("Ending method ");
	}
}
