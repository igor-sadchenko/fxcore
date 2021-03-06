/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fxcms.mt4.api;

public class NewsTopic {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected NewsTopic(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NewsTopic obj) {
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
        mtmanapiJNI.delete_NewsTopic(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setKey(long value) {
    mtmanapiJNI.NewsTopic_key_set(swigCPtr, this, value);
  }

  public long getKey() {
    return mtmanapiJNI.NewsTopic_key_get(swigCPtr, this);
  }

  public void setTime(int value) {
    mtmanapiJNI.NewsTopic_time_set(swigCPtr, this, value);
  }

  public int getTime() {
    return mtmanapiJNI.NewsTopic_time_get(swigCPtr, this);
  }

  public void setCtm(String value) {
    mtmanapiJNI.NewsTopic_ctm_set(swigCPtr, this, value);
  }

  public String getCtm() {
    return mtmanapiJNI.NewsTopic_ctm_get(swigCPtr, this);
  }

  public void setTopic(String value) {
    mtmanapiJNI.NewsTopic_topic_set(swigCPtr, this, value);
  }

  public String getTopic() {
    return mtmanapiJNI.NewsTopic_topic_get(swigCPtr, this);
  }

  public void setCategory(String value) {
    mtmanapiJNI.NewsTopic_category_set(swigCPtr, this, value);
  }

  public String getCategory() {
    return mtmanapiJNI.NewsTopic_category_get(swigCPtr, this);
  }

  public void setKeywords(String value) {
    mtmanapiJNI.NewsTopic_keywords_set(swigCPtr, this, value);
  }

  public String getKeywords() {
    return mtmanapiJNI.NewsTopic_keywords_get(swigCPtr, this);
  }

  public void setBody(String value) {
    mtmanapiJNI.NewsTopic_body_set(swigCPtr, this, value);
  }

  public String getBody() {
    return mtmanapiJNI.NewsTopic_body_get(swigCPtr, this);
  }

  public void setBodylen(int value) {
    mtmanapiJNI.NewsTopic_bodylen_set(swigCPtr, this, value);
  }

  public int getBodylen() {
    return mtmanapiJNI.NewsTopic_bodylen_get(swigCPtr, this);
  }

  public void setReaded(int value) {
    mtmanapiJNI.NewsTopic_readed_set(swigCPtr, this, value);
  }

  public int getReaded() {
    return mtmanapiJNI.NewsTopic_readed_get(swigCPtr, this);
  }

  public void setPriority(int value) {
    mtmanapiJNI.NewsTopic_priority_set(swigCPtr, this, value);
  }

  public int getPriority() {
    return mtmanapiJNI.NewsTopic_priority_get(swigCPtr, this);
  }

  public void setLangid(int value) {
    mtmanapiJNI.NewsTopic_langid_set(swigCPtr, this, value);
  }

  public int getLangid() {
    return mtmanapiJNI.NewsTopic_langid_get(swigCPtr, this);
  }

  public void setReserved(SWIGTYPE_p_int value) {
    mtmanapiJNI.NewsTopic_reserved_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  public SWIGTYPE_p_int getReserved() {
    long cPtr = mtmanapiJNI.NewsTopic_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public NewsTopic() {
    this(mtmanapiJNI.new_NewsTopic(), true);
  }

}
