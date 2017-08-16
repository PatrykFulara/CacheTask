
public class CacheViewClass implements CacheView {
    private CacheClass pointedCache;
    private String delimiter;

    public CacheViewClass(CacheClass pC, String d){
        pointedCache = pC;
        delimiter = d;
    }

    @Override
    public int size() {                         //zwraca aktualny rozmiar cache
        return pointedCache.getSize();
    }

    @Override
    public CacheItem getItem(int index) {
        try{
            CacheItem cItem = pointedCache.getCacheList().get(index);
            return cItem;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Niepoprawny index listy!");
            return null;
        }
    }

    @Override
    public CacheItem getItem(String key) {
        for(CacheItem cI : pointedCache.getCacheList()){
            if(cI.getKey() == key) return cI;
        }
        return null;
    }

    public void showCache(){                                        //wyswietla zawartosc cache
        System.out.print("Cache = [");

        for(CacheItem o : pointedCache.getCacheList())
            System.out.print(o.getValue().toString() + delimiter);

        System.out.println("]");
    }
}
