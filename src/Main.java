public class Main {
    public static void main(String[] args) {
        Day current = Day.MONDAY;
        System.out.println(current);
        System.out.println();

        Book b1 = new Book("War and Peace", "L. Tolstoy", Type.BELLETRE);
        System.out.printf("Book '%s' has a type %s \n", b1.name, b1.getType());
        System.out.println();

        Type[] types = Type.values();
        for (Type s : types) { System.out.println(s); }
        System.out.println();

        System.out.println(Type.SCIENCE.hashCode());
        System.out.println(Type.BELLETRE.ordinal());
        System.out.println();

        System.out.println(Color.RED.getCode());
        System.out.println(Color.GREEN.getCode());
        System.out.println();

        Operation op = Operation.SUM;
        System.out.println(op.action(10, 4));
        op = Operation.MULTIPLY;
        System.out.println(op.action(6, 4));
    }
}