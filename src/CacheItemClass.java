
public class CacheItemClass implements CacheItem {
    private Object obj;
    private String key;

    public CacheItemClass(Object o, String k){
        this.obj = o;
        this.key = k;
    }

    @Override
    public String getKey(){
        return key;
    }

    @Override
    public Object getValue(){
        return obj;
    }

}
