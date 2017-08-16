
public class Main {
    public static void main(String[] args) {

        //PRZYKLADOWE DZIALANIE
        CacheClass bestCache = new CacheClass(3);        //tworzenie nowego cache o rozmiarze 3 i domyslnym separatorze
        bestCache.getView();

        bestCache.cacheItem("A", "KEY1");           //dodawanie elementow do cache i wyswietlanie
        bestCache.getView();

        bestCache.cacheItem("D", "KEY2");
        bestCache.getView();

        bestCache.cacheItem("B", "KEY3");
        bestCache.getView();

        bestCache.cacheItem("C", "KEY4");
        bestCache.getView();

        bestCache.cacheItem("D", "KEY5");
        bestCache.getView();

    }
}






