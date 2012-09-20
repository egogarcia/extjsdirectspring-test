package com.smf.extjs.extdirectspring;

import org.springframework.stereotype.Service;

import ch.ralscha.extdirectspring.annotation.ExtDirectMethod;

@Service
public class HelloDemoService {

	@ExtDirectMethod
	  public String doHello(String name) {
	    return "Hola " + name;
	  }
}
