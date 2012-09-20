package com.smf.extjs.extdirectspring;

import org.springframework.stereotype.Service;

import ch.ralscha.extdirectspring.annotation.ExtDirectMethod;
import ch.ralscha.extdirectspring.annotation.ExtDirectMethodType;

@Service
public class HelloDemoService {

	@ExtDirectMethod
	  public String doHello(String message) {
	    return "Hola " + message;
	  }
}
