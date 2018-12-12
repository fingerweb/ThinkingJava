package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 检查Java的Random类的随机性.
 * 理想状态下,Random将产生理想的数字分布.要测试它,需要生成大量的随机数,并对落入各种不同范围的数字进行统计.
 * Map可以轻易解决这个问题,在本例中,键是Random产生的数字,值是该数字出现的次数.
 * 注意当键值对不存在的时候,返回的值是null.
 * @author yuyz
 * @date 2018-11-14 21:00
 */
public class Statistics {
    public static void main(String[] args) {
        Random random1 = new Random(47);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int m = 0; m < 100; m++) {
            int key = random1.nextInt(20);
            Integer freq = map.get(key);
            freq = (freq == null) ? 1 : freq + 1;
            map.put(key, freq);
        }
        System.out.println(map);
    }
}
