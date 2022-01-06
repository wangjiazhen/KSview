package org.ks.sys.authmenu.util;

/**
 * @ClassName MenuCache
 * @Description TODO
 * @Author wangsong
 * @Date 2020/4/26 13:20
 * @Version 1.0
 **/
public class MenuCache {

    private Object key = "";
    private Object value;
    private int hitCount;
    private static MenuCache menuCache = null;

    public void setValue(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public static MenuCache getMenuCache() {
        if (null == menuCache) {
            synchronized (MenuCache.class) {
                if (null == menuCache) {
                    menuCache = new MenuCache();
                }
            }
        }
        return menuCache;
    }

    private MenuCache() {
    }

    public Object getKey() {
        return key;
    }

    public Object getValue(Object key) {
        if (this.key.equals(key)) {
            return value;
        }
        return null;
    }

    @Override
    public String toString() {
        return "MenuCache{" +
                "key=" + key +
                ", value=" + value +
                ", hitCount=" + hitCount +
                '}';
    }


//    public final int hashCode(){
//        if(null == key){
//            return "".hashCode();
//        }
//        return this.key.hashCode();
//    }

    @Override
    public int hashCode() {
        if (null == key) {
            return "".hashCode();
        }
        return this.key.hashCode();
    }


}
