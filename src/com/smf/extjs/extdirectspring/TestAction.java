package com.smf.extjs.extdirectspring;

import org.springframework.stereotype.Service;

import ch.ralscha.extdirectspring.annotation.ExtDirectMethod;

@Service
public class TestAction {

  @ExtDirectMethod
  public String doEcho(String message) {
    return message;
  }

  @ExtDirectMethod
  public int anotherAction() {
    return 1;
  }
}
