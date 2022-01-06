package org.ks.sys.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MenuVo
 * @Description TODO
 * @Author wangsong
 * @Date 2020/4/23 15:31
 * @Version 1.0
 **/
public class MenuVo implements Serializable {
    private long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String label;
    private long pId;
    private boolean checked = false;
    private boolean open = true;
    private String url;
    private String icon;
    private List<MenuVo> children = new ArrayList<>();
    private int jsJump;


    @Override
    public String toString() {
        return "MenuVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", label='" + label + '\'' +
                ", pId=" + pId +
                ", checked=" + checked +
                ", open=" + open +
                ", url='" + url + '\'' +
                ", icon='" + icon + '\'' +
                ", children=" + children +
                ", jsJump=" + jsJump +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public long getpId() {
        return pId;
    }

    public void setpId(long pId) {
        this.pId = pId;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<MenuVo> getChildren() {
        return children;
    }

    public void setChildren(List<MenuVo> children) {
        this.children = children;
    }

    public int getJsJump() {
        return jsJump;
    }

    public void setJsJump(int jsJump) {
        this.jsJump = jsJump;
    }
}
