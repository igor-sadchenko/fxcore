/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fxcms.mt4.api;

public class BalanceDiff {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BalanceDiff(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BalanceDiff obj) {
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
        mtmanapiJNI.delete_BalanceDiff(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLogin(int value) {
    mtmanapiJNI.BalanceDiff_login_set(swigCPtr, this, value);
  }

  public int getLogin() {
    return mtmanapiJNI.BalanceDiff_login_get(swigCPtr, this);
  }

  public void setDiff(double value) {
    mtmanapiJNI.BalanceDiff_diff_set(swigCPtr, this, value);
  }

  public double getDiff() {
    return mtmanapiJNI.BalanceDiff_diff_get(swigCPtr, this);
  }

  public BalanceDiff() {
    this(mtmanapiJNI.new_BalanceDiff(), true);
  }

}
