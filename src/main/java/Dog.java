public class Dog
{
    private String name;
    private int age;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Dog()
    {

    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
