package generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Info2 <String, Integer> info2 = new Info2<>("Hello", 123);
        System.out.println(info2.getValueK()+" "+info2.getValueV());

        Info2 <Double, Boolean> info3 = new Info2<>(234.0, true);
        System.out.println(info3.getValueK()+" "+info3.getValueV());

    }
}

class Info2 <K, V>{
    private K valueK;
    private V valueV;

    public Info2(K valueK, V valueV) {
        this.valueK = valueK;
        this.valueV = valueV;
    }

    public K getValueK() {
        return valueK;
    }

    public V getValueV() {
        return valueV;
    }
}
