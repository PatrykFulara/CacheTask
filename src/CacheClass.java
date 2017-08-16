import java.util.ArrayList;
import java.util.List;

public class CacheClass implements Cache {
    private int maxCacheSize;
    private List<CacheItem> cacheList;
    private CacheViewClass cacheView;

    public CacheClass(){
        maxCacheSize = 1;
        cacheList = new ArrayList<CacheItem>(maxCacheSize);
        cacheView = new CacheViewClass(this,",");
    }

    public CacheClass(int size){
        maxCacheSize = size;
        cacheList = new ArrayList<CacheItem>(maxCacheSize);
        cacheView = new CacheViewClass(this,",");
    }

    public CacheClass(int size, String d){
        maxCacheSize = size;
        cacheList = new ArrayList<CacheItem>(maxCacheSize);
        cacheView = new CacheViewClass(this, d);
    }

    @Override
    public CacheItem cacheItem(Object item, String key) {                //zapisuje obiekt w Cache’u
       CacheItemClass cacheItem = new CacheItemClass(item, key);

       if(cacheList.size() == maxCacheSize) cacheList.remove(0);

       cacheList.add(cacheItem);

       return cacheItem;
    }

    @Override
    public void invalidateCache() {
        cacheList.clear();
    }

    @Override
    public CacheView getView() {
        cacheView.showCache();

        return cacheView;
    }

    public int getSize(){
        return cacheList.size();
    }

    public List<CacheItem> getCacheList() {
        return cacheList;
    }

}
