/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fxcms.mt4.api;

public class TradeTransInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TradeTransInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TradeTransInfo obj) {
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
        mtmanapiJNI.delete_TradeTransInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(short value) {
    mtmanapiJNI.TradeTransInfo_type_set(swigCPtr, this, value);
  }

  public short getType() {
    return mtmanapiJNI.TradeTransInfo_type_get(swigCPtr, this);
  }

  public void setFlags(char value) {
    mtmanapiJNI.TradeTransInfo_flags_set(swigCPtr, this, value);
  }

  public char getFlags() {
    return mtmanapiJNI.TradeTransInfo_flags_get(swigCPtr, this);
  }

  public void setCmd(short value) {
    mtmanapiJNI.TradeTransInfo_cmd_set(swigCPtr, this, value);
  }

  public short getCmd() {
    return mtmanapiJNI.TradeTransInfo_cmd_get(swigCPtr, this);
  }

  public void setOrder(int value) {
    mtmanapiJNI.TradeTransInfo_order_set(swigCPtr, this, value);
  }

  public int getOrder() {
    return mtmanapiJNI.TradeTransInfo_order_get(swigCPtr, this);
  }

  public void setOrderby(int value) {
    mtmanapiJNI.TradeTransInfo_orderby_set(swigCPtr, this, value);
  }

  public int getOrderby() {
    return mtmanapiJNI.TradeTransInfo_orderby_get(swigCPtr, this);
  }

  public void setSymbol(String value) {
    mtmanapiJNI.TradeTransInfo_symbol_set(swigCPtr, this, value);
  }

  public String getSymbol() {
    return mtmanapiJNI.TradeTransInfo_symbol_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    mtmanapiJNI.TradeTransInfo_volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return mtmanapiJNI.TradeTransInfo_volume_get(swigCPtr, this);
  }

  public void setPrice(double value) {
    mtmanapiJNI.TradeTransInfo_price_set(swigCPtr, this, value);
  }

  public double getPrice() {
    return mtmanapiJNI.TradeTransInfo_price_get(swigCPtr, this);
  }

  public void setSl(double value) {
    mtmanapiJNI.TradeTransInfo_sl_set(swigCPtr, this, value);
  }

  public double getSl() {
    return mtmanapiJNI.TradeTransInfo_sl_get(swigCPtr, this);
  }

  public void setTp(double value) {
    mtmanapiJNI.TradeTransInfo_tp_set(swigCPtr, this, value);
  }

  public double getTp() {
    return mtmanapiJNI.TradeTransInfo_tp_get(swigCPtr, this);
  }

  public void setIe_deviation(int value) {
    mtmanapiJNI.TradeTransInfo_ie_deviation_set(swigCPtr, this, value);
  }

  public int getIe_deviation() {
    return mtmanapiJNI.TradeTransInfo_ie_deviation_get(swigCPtr, this);
  }

  public void setComment(String value) {
    mtmanapiJNI.TradeTransInfo_comment_set(swigCPtr, this, value);
  }

  public String getComment() {
    return mtmanapiJNI.TradeTransInfo_comment_get(swigCPtr, this);
  }

  public void setExpiration(int value) {
    mtmanapiJNI.TradeTransInfo_expiration_set(swigCPtr, this, value);
  }

  public int getExpiration() {
    return mtmanapiJNI.TradeTransInfo_expiration_get(swigCPtr, this);
  }

  public void setCrc(int value) {
    mtmanapiJNI.TradeTransInfo_crc_set(swigCPtr, this, value);
  }

  public int getCrc() {
    return mtmanapiJNI.TradeTransInfo_crc_get(swigCPtr, this);
  }

  public TradeTransInfo() {
    this(mtmanapiJNI.new_TradeTransInfo(), true);
  }

}
