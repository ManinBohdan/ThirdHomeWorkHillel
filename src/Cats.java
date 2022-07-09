import java.util.Objects;

public class Cats {
    public String name;
    public Integer age;
    public boolean friendly;

    public Cats(String name, Integer age, boolean friendly) {
        this.name = name;
        this.age = age;
        this.friendly = friendly;
    }

    @Override
    public boolean equals (Object obj){
        if (this == obj) return true;
        if (this == null) return false;
        if (getClass() != obj.getClass()) return false;
        var c = (Cats) obj;
        return this.age == c.age && this.name.equals(c.name) && this.friendly == c.friendly;
    }

    @Override
    public int hashCode() {
       return Objects.hash(name, age, friendly);
    }
}
