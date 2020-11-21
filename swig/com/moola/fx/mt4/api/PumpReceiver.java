/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.moola.fx.mt4.api;

public class PumpReceiver {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PumpReceiver(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PumpReceiver obj) {
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
        mtmanapiJNI.delete_PumpReceiver(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    mtmanapiJNI.PumpReceiver_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    mtmanapiJNI.PumpReceiver_change_ownership(this, swigCPtr, true);
  }

  public void OnPump(int code, int typ, SWIGTYPE_p_void data, SWIGTYPE_p_void param) {
    mtmanapiJNI.PumpReceiver_OnPump(swigCPtr, this, code, typ, SWIGTYPE_p_void.getCPtr(data), SWIGTYPE_p_void.getCPtr(param));
  }

  public PumpReceiver() {
    this(mtmanapiJNI.new_PumpReceiver(), true);
    mtmanapiJNI.PumpReceiver_director_connect(this, swigCPtr, true, true);
  }

}