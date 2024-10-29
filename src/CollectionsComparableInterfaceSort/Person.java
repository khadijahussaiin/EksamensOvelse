package CollectionsComparableInterfaceSort;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override //Sorterer min liste efter alder (mindst til størst)
    public int compareTo(Person other) {
        if (this.age != other.age) {
            return this.age - other.age;
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age;
    }
}
