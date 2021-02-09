package generics;

public class ParametrizedClass {
    public static void main(String[] args) {
        Info <String>info1 = new Info<>("Hello");
        System.out.println(info1);
        String s1 = info1.getValue();

        Info<Integer>info2 = new Info<>(111);
        System.out.println(info2);
        Integer i1 = info2.getValue();
    }

}

class Info<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Info{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
