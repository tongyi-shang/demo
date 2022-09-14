package 集合.hasmap;





import java.util.HashMap;
import java.util.Map;

/**
 * 哈希map 底层原理
 */
public class Hasmap {
    // map 的初始容量为 16
    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
    // 加载因子
    static final float DEFAULT_LOAD_FACTOR = 0.75f;

    /**
     * map 在什么时候会扩容，当map元素的数量=16*0.75 = 12 时就会触发扩容机制
     * @param args
     */
    public static void main(String[] args) {
        Map map = new HashMap();
        /**
         * HashMap类中的元素是Node类，翻译过来就是节点，是定义在HashMap中的一个内部类，实现了Map.Entry接口。
         * HashMap.Node
         * hash：key的哈希值
         *
         * key：节点的key，类型和定义HashMap时的key相同
         *
         * value：节点的value，类型和定义HashMap时的value相同
         *
         * next：该节点的下一节点
         * 值得注意的是其中的next属性，记录的是下一个节点本身，也是一个Node节点，这个Node节点也有next属性，记录了下一个节点，于是，只要不断的调用Node.next.next.next……，就可以得到：
         *
         *  Node-->下个Node-->下下个Node……-->null
         *
         * 这样的一个链表结构，而对于一个HashMap来说，只要明确记录每个链表的第一个节点，就能顺序遍历链表上的所有节点
         * HashMap使用拉链法管理其中的每个节点。
         *
         * 由Node节点组成链表之后，HashMap定义了一个Node数组：
         * transient Node<K,V>[] table;
         * 关于Node数组 table
         * 对于table的理解，对后面关于扩容的理解很有帮助。
         *
         * table在第一次往HashMap中put元素的时候初始化。
         *
         * 如果HashMap初始化的时候没有指定容量，那么初始化table的时候会使用默认的DEFAULT_INITIAL_CAPACITY参数，也就是16，作为table初始化时的长度。
         *
         * 如果HashMap初始化的时候指定了容量，HashMap会把这个容量修改为2的倍数，然后创建对应长度的table。
         *
         * table在HashMap扩容的时候，长度会翻倍。
         *
         * 所以table的长度肯定是2的倍数。
         *
         * 修改容量的方法是这样的：
         * static final int tableSizeFor ( int cap){  实现把一个数变成最接近2 的n次方
         *  int n = cap - 1;
         *  n |= n >>> 1;
         *  n |= n >>> 2;
         *  n |= n >>> 4;
         *  n |= n >>> 8;
         *  n |= n >>> 16;
         *  return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
         * }
         */

    }
}
