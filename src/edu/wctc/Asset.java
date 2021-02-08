package edu.wctc;

public class Asset <T, String,  V> {
    private T code;
    private String identity;
    private V value;

    public Asset(T code, String identity, V value) {
        this.code = code;
        this.identity = identity;
        this.value = value;
    }

    public Asset() {

    }

    public T getCode() {
        return code;
    }

    public void setCode(T code) {
        this.code = code;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public java.lang.String toString() {
        return "Asset{" +
                "code=" + code +
                ", identity=" + identity +
                ", value=" + value +
                '}';
    }
}
