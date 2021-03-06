package com.maxleap.las.sdk.types;

import com.maxleap.las.sdk.ObjectId;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * User: qinpeng
 * Date: 14-5-19
 * Time: 9:21
 */
public class MLPointer implements Serializable {

  private final String __type = MLKeyType.POINTER.v();
  private String className;
  private ObjectId objectId;

  public MLPointer() {
  }

  /**
   * @deprecated  Instead of MLPointer(ObjectId objectId, String className)
   * @param objectId The objectId
   * @param className The className
   */
  public MLPointer(String objectId, String className) {
    this.objectId = new ObjectId(objectId);
    this.className = className;
  }

  public MLPointer(ObjectId objectId, String className) {
    this.objectId = objectId;
    this.className = className;
  }

  public String get__type() {
    return __type;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public ObjectId getObjectId() {
    return objectId;
  }

  public void setObjectId(ObjectId objectId) {
    this.objectId = objectId;
  }

  public Map toMap() {
    Map map = new HashMap();
    map.put("__type", "Pointer");
    map.put("className", className);
    map.put("objectId", objectId.toHexString());
    return map;
  }

  @Override
  public boolean equals(Object obj) {
    MLPointer o = (MLPointer) obj;
    return ((o.getClassName() == null && className == null) || o.getClassName().equals(className))
        && ((o.getObjectId() == null && objectId == null) || o.getObjectId().equals(objectId));
  }
}
