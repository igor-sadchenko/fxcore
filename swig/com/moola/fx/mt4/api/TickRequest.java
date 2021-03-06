/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.moola.fx.mt4.api;

public class TickRequest {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TickRequest(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TickRequest obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mtmanapiJNI.delete_TickRequest(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSymbol(String value) {
    mtmanapiJNI.TickRequest_symbol_set(swigCPtr, this, value);
  }

  public String getSymbol() {
    return mtmanapiJNI.TickRequest_symbol_get(swigCPtr, this);
  }

  public void setFrom(int value) {
    mtmanapiJNI.TickRequest_from_set(swigCPtr, this, value);
  }

  public int getFrom() {
    return mtmanapiJNI.TickRequest_from_get(swigCPtr, this);
  }

  public void setTo(int value) {
    mtmanapiJNI.TickRequest_to_set(swigCPtr, this, value);
  }

  public int getTo() {
    return mtmanapiJNI.TickRequest_to_get(swigCPtr, this);
  }

  public void setFlags(char value) {
    mtmanapiJNI.TickRequest_flags_set(swigCPtr, this, value);
  }

  public char getFlags() {
    return mtmanapiJNI.TickRequest_flags_get(swigCPtr, this);
  }

  public TickRequest() {
    this(mtmanapiJNI.new_TickRequest(), true);
  }

}
