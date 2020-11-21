/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fxcms.mt4.api;

public class NewsTopicNew {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected NewsTopicNew(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NewsTopicNew obj) {
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
        mtmanapiJNI.delete_NewsTopicNew(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setKey(long value) {
    mtmanapiJNI.NewsTopicNew_key_set(swigCPtr, this, value);
  }

  public long getKey() {
    return mtmanapiJNI.NewsTopicNew_key_get(swigCPtr, this);
  }

  public void setLanguage(long value) {
    mtmanapiJNI.NewsTopicNew_language_set(swigCPtr, this, value);
  }

  public long getLanguage() {
    return mtmanapiJNI.NewsTopicNew_language_get(swigCPtr, this);
  }

  public void setSubject(SWIGTYPE_p_wchar_t value) {
    mtmanapiJNI.NewsTopicNew_subject_set(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(value));
  }

  public SWIGTYPE_p_wchar_t getSubject() {
    long cPtr = mtmanapiJNI.NewsTopicNew_subject_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_wchar_t(cPtr, false);
  }

  public void setCategory(SWIGTYPE_p_wchar_t value) {
    mtmanapiJNI.NewsTopicNew_category_set(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(value));
  }

  public SWIGTYPE_p_wchar_t getCategory() {
    long cPtr = mtmanapiJNI.NewsTopicNew_category_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_wchar_t(cPtr, false);
  }

  public void setFlags(long value) {
    mtmanapiJNI.NewsTopicNew_flags_set(swigCPtr, this, value);
  }

  public long getFlags() {
    return mtmanapiJNI.NewsTopicNew_flags_get(swigCPtr, this);
  }

  public void setBody(SWIGTYPE_p_wchar_t value) {
    mtmanapiJNI.NewsTopicNew_body_set(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(value));
  }

  public SWIGTYPE_p_wchar_t getBody() {
    long cPtr = mtmanapiJNI.NewsTopicNew_body_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_wchar_t(cPtr, false);
  }

  public void setBody_len(long value) {
    mtmanapiJNI.NewsTopicNew_body_len_set(swigCPtr, this, value);
  }

  public long getBody_len() {
    return mtmanapiJNI.NewsTopicNew_body_len_get(swigCPtr, this);
  }

  public void setLanguages_list(SWIGTYPE_p_unsigned_int value) {
    mtmanapiJNI.NewsTopicNew_languages_list_set(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_int getLanguages_list() {
    long cPtr = mtmanapiJNI.NewsTopicNew_languages_list_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_int(cPtr, false);
  }

  public void setDatetime(SWIGTYPE_p_signed___int64 value) {
    mtmanapiJNI.NewsTopicNew_datetime_set(swigCPtr, this, SWIGTYPE_p_signed___int64.getCPtr(value));
  }

  public SWIGTYPE_p_signed___int64 getDatetime() {
    return new SWIGTYPE_p_signed___int64(mtmanapiJNI.NewsTopicNew_datetime_get(swigCPtr, this), true);
  }

  public void setReserved(SWIGTYPE_p_unsigned_int value) {
    mtmanapiJNI.NewsTopicNew_reserved_set(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_int getReserved() {
    long cPtr = mtmanapiJNI.NewsTopicNew_reserved_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_int(cPtr, false);
  }

  public NewsTopicNew() {
    this(mtmanapiJNI.new_NewsTopicNew(), true);
  }

  public final static class constants {
    public final static NewsTopicNew.constants MAX_NEWS_BODY_LEN = new NewsTopicNew.constants("MAX_NEWS_BODY_LEN", mtmanapiJNI.NewsTopicNew_MAX_NEWS_BODY_LEN_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static constants swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + constants.class + " with value " + swigValue);
    }

    private constants(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private constants(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private constants(String swigName, constants swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static constants[] swigValues = { MAX_NEWS_BODY_LEN };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class EnNewsFlags {
    public final static NewsTopicNew.EnNewsFlags FLAG_PRIORITY = new NewsTopicNew.EnNewsFlags("FLAG_PRIORITY", mtmanapiJNI.NewsTopicNew_FLAG_PRIORITY_get());
    public final static NewsTopicNew.EnNewsFlags FLAG_CALENDAR = new NewsTopicNew.EnNewsFlags("FLAG_CALENDAR", mtmanapiJNI.NewsTopicNew_FLAG_CALENDAR_get());
    public final static NewsTopicNew.EnNewsFlags FLAG_MIME = new NewsTopicNew.EnNewsFlags("FLAG_MIME", mtmanapiJNI.NewsTopicNew_FLAG_MIME_get());
    public final static NewsTopicNew.EnNewsFlags FLAG_ALLOW_DEMO = new NewsTopicNew.EnNewsFlags("FLAG_ALLOW_DEMO", mtmanapiJNI.NewsTopicNew_FLAG_ALLOW_DEMO_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static EnNewsFlags swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + EnNewsFlags.class + " with value " + swigValue);
    }

    private EnNewsFlags(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private EnNewsFlags(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private EnNewsFlags(String swigName, EnNewsFlags swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static EnNewsFlags[] swigValues = { FLAG_PRIORITY, FLAG_CALENDAR, FLAG_MIME, FLAG_ALLOW_DEMO };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}