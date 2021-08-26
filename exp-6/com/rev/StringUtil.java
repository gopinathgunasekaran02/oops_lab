package com.rev;

public class StringUtil {

  public StringUtil(String str) {
    this.str = str;
  }

  String str;

  public boolean isEmptyOrNull() {
    if (this.str == null || this.str.equals("")) {
      return true;
    }
    return false;
  }


  public boolean isNotEmptyAndNotNull() {
    if (this.str != null && !this.str.equals("")) {
      return true;
    }
    return false;
  }
}

