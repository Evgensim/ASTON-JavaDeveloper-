


public class Main {

    private String name;
    private int age;
    private int weight;

    public static int first;
    public static int second;

    static void setFirst(int value1)
    {
        first = value1;
    }

    static void setSecond(int value1)
    {
        second = value1;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getClass().getClassLoader());
        System.out.println(main.getClass().getName());

        main.setFirst(2);
        main.setSecond(5);

        System.out.println(main.first + " " + main.second);
    }

}

