package Module2.Encapsulation;

class Model {
    private String name;
    private int id;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name2;
    private int id2;
    private int age2;

    public Model(String name2, int id2, int age2) {
        this.name2 = name2;
        this.id2 = id2;
        this.age2 = age2;
    }

    public String getName2() {
        return name2;
    }

    public int getId2() {
        return id2;
    }

    public int getAge2() {
        return age2;
    }
}
