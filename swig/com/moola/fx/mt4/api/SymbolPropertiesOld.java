/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.moola.fx.mt4.api;

public class SymbolPropertiesOld {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SymbolPropertiesOld(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SymbolPropertiesOld obj) {
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
        mtmanapiJNI.delete_SymbolPropertiesOld(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSymbol(String value) {
    mtmanapiJNI.SymbolPropertiesOld_symbol_set(swigCPtr, this, value);
  }

  public String getSymbol() {
    return mtmanapiJNI.SymbolPropertiesOld_symbol_get(swigCPtr, this);
  }

  public void setColor(SWIGTYPE_p_COLORREF value) {
    mtmanapiJNI.SymbolPropertiesOld_color_set(swigCPtr, this, SWIGTYPE_p_COLORREF.getCPtr(value));
  }

  public SWIGTYPE_p_COLORREF getColor() {
    return new SWIGTYPE_p_COLORREF(mtmanapiJNI.SymbolPropertiesOld_color_get(swigCPtr, this), true);
  }

  public void setSpread(int value) {
    mtmanapiJNI.SymbolPropertiesOld_spread_set(swigCPtr, this, value);
  }

  public int getSpread() {
    return mtmanapiJNI.SymbolPropertiesOld_spread_get(swigCPtr, this);
  }

  public void setSpread_balance(int value) {
    mtmanapiJNI.SymbolPropertiesOld_spread_balance_set(swigCPtr, this, value);
  }

  public int getSpread_balance() {
    return mtmanapiJNI.SymbolPropertiesOld_spread_balance_get(swigCPtr, this);
  }

  public void setStops_level(int value) {
    mtmanapiJNI.SymbolPropertiesOld_stops_level_set(swigCPtr, this, value);
  }

  public int getStops_level() {
    return mtmanapiJNI.SymbolPropertiesOld_stops_level_get(swigCPtr, this);
  }

  public void setExemode(int value) {
    mtmanapiJNI.SymbolPropertiesOld_exemode_set(swigCPtr, this, value);
  }

  public int getExemode() {
    return mtmanapiJNI.SymbolPropertiesOld_exemode_get(swigCPtr, this);
  }

  public SymbolPropertiesOld() {
    this(mtmanapiJNI.new_SymbolPropertiesOld(), true);
  }

}