public class Main {
    public static void main(String[] args) {

        var cat = new Cats("Scott", 3, true);
        var cat1 = new Cats("Scott", 3, true);
        var cat2 = new Cats("Filip", 3, true);
        var dog = new Dogs("Scott", 3, true);

        System.out.println(cat.equals(cat1));
        System.out.println(cat.equals(dog));
        System.out.println(cat.equals(cat2));

        System.out.println(cat.hashCode() == cat1.hashCode());

        System.out.println(cat.equals(cat1) && cat.hashCode() == cat1.hashCode());

        if (cat.hashCode() == cat1.hashCode()) System.out.println(cat.equals(cat1));
        else System.out.println("HashCode is not the same in the objects");

        if (cat1.hashCode() == cat2.hashCode()) System.out.println(cat1.equals(cat2));
        else System.out.println("HashCode is not the same in the objects");
    }
}
