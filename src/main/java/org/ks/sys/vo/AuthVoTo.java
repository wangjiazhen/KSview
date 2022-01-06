package org.ks.sys.vo;

import java.io.Serializable;

/**
 * @ClassName AuthVoTo
 * @Description TODO
 * @Author wangsong
 * @Date 2020/4/26 18:30
 * @Version 1.0
 **/
public class AuthVoTo implements Serializable {
    private long id;
    private int pId = 0;
    private String label;
    private boolean open = true;

    @Override
    public String toString() {
        return "AuthVoTo{" +
                "id=" + id +
                ", pId=" + pId +
                ", label='" + label + '\'' +
                ", open=" + open +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
