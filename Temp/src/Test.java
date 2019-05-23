public class Test {

    public static void main(String[] args) {
        System.out.println("test class:"+Solution.StaticClass.getTime());
        System.out.println("test class:"+new Solution().new StaticClassTwo().getTime());
    }
}
