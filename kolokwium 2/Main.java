public class Main {
    public static <T extends Comparable<T>> boolean isEqualOrNull(T a, T b) {
        if((a==null && b==null) || a.equals(b)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        String a = "aa";
        String b = "bb";
        System.out.println(isEqualOrNull(a,b));
        b = "aa";
        System.out.println(isEqualOrNull(a,b));
        System.out.println(isEqualOrNull(null,null));
    }
}