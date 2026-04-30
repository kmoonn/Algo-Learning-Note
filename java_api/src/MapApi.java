import java.util.HashMap;
import java.util.Map;

public class MapApi {

    public static void main(String[] args) {
        // 创建哈希表
        Map<String, String> map = new HashMap<>();
        // 添加元素
        map.put("key", "value");
        // 获取key
        map.get("key");
        // 查找是否包含key
        boolean res1 = map.containsKey("key");
        //
        boolean res2 = map.containsValue("value");

        map.getOrDefault("key","value");

        System.out.println(res1);
        System.out.println(res2);
    }
}
