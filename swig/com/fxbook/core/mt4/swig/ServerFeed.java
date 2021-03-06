/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fxcms.mt4.api;

public class ServerFeed {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ServerFeed(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ServerFeed obj) {
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
        mtmanapiJNI.delete_ServerFeed(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFile(String value) {
    mtmanapiJNI.ServerFeed_file_set(swigCPtr, this, value);
  }

  public String getFile() {
    return mtmanapiJNI.ServerFeed_file_get(swigCPtr, this);
  }

  public void setFeed(FeedDescription value) {
    mtmanapiJNI.ServerFeed_feed_set(swigCPtr, this, FeedDescription.getCPtr(value), value);
  }

  public FeedDescription getFeed() {
    long cPtr = mtmanapiJNI.ServerFeed_feed_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FeedDescription(cPtr, false);
  }

  public ServerFeed() {
    this(mtmanapiJNI.new_ServerFeed(), true);
  }

}
