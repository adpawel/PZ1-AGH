package org.example.Dog;

public class Dog {
    protected String name;
    protected String says;
    public Dog() {}
    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }
    public String getName() {
        return name;
    }
    public String getSays(){
        return says;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog d1 = (Dog) o;

        if (!getName().equals(d1.getName())) return false;
        return getSays().equals(d1.getSays());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getSays().hashCode();
        return result;
    }
}
