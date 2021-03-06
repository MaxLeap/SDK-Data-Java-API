package com.maxleap.las.sdk.types;

/**
 * User: qinpeng
 * Date: 14-5-6
 * Time: 16:21
 */
public enum MLKeyType {

    STRING("String"),

    NUMBER("Number"),

    BOOLEAN("Boolean"),

    DATE("Date"),

    FILE("File"),

    ARRAY("Array"),

    OBJECT("Object"),

    GEOPOINT("GeoPoint"),

    POINTER("Pointer"),

    RELATION("Relation"),

    ACL("ACL"),

    BYTES("Bytes");

    public static final String KEY_OBJECT_TYPE = "__type";
    private String v;

    MLKeyType(String type) {
        this.v = type;
    }

    public String v() {
        return v;
    }
}
