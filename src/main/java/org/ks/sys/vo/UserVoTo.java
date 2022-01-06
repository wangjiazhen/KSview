package org.ks.sys.vo;

import java.io.Serializable;

/**
 * @ClassName AuthVoTo
 * @Description TODO
 * @Author wangbiao
 * @Date 2020/4/26 11:30
 * @Version 1.0
 **/
public class UserVoTo implements Serializable {
    private long id;
    private int pid = 0;
    private String name;
    private boolean open = true;

    @Override
    public String toString() {
        return "UserVoTo{" +
                "id=" + id +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", open=" + open +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
