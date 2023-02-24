package cn.ChengZhiYa.Hello2023;

public class HashMap {
    static java.util.HashMap<String,Integer> temp = new java.util.HashMap<>();
    public static void Set(String HashMapName,Integer Vaule) {
        temp.put(HashMapName,Vaule);
    }
    public static Integer Get(String HashMapName) {
        return temp.get(HashMapName);
    }
    public static void Clear() {
        temp.clear();
    }
}
