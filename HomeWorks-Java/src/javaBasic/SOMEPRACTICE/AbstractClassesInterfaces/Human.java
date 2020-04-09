package javaBasic.SOMEPRACTICE.AbstractClassesInterfaces;

interface Human {
    default void foo() {
        System.out.println("In Human");
    }

    FullName getFullName();

    int getAge();
}

abstract class AbstractHuman implements Human {
    private final FullName fullName;
    private final int age;

    public AbstractHuman(final FullName fullName, final int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public FullName getFullName() {
        return this.fullName;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format(
                "Name:[first: %s, last: %s], age: %d",
                getFullName().getFirstName(),
                getFullName().getLastName(),
                getAge()
        );
    }
}

class Man extends AbstractHuman {
    public Man(final FullName fullName, final int age) {
        super(fullName, age);
    }

    @Override
    public void foo() {
        System.out.println("In man");
    }
}

class Woman extends AbstractHuman {
    public Woman(final FullName fullName, final int age) {
        super(fullName, age);
    }

    @Override
    public int getAge() {
        return super.getAge() - 10;
    }
}