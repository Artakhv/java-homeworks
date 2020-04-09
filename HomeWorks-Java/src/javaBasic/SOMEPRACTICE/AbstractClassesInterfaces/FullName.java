package javaBasic.SOMEPRACTICE.AbstractClassesInterfaces;

final class FullName {
    private final String firstName;
    private final String lastName;
    public FullName(final String firstName, final String lastName) {
        validateFirstName(firstName);
        validateLastName(lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    private static void validateFirstName(final String firstName) {
        throwExceptionIfNull(firstName);
    }
    private static void validateLastName(final String lastName) {
        throwExceptionIfNull(lastName);
    }
    private static void throwExceptionIfNull(final String string) {
        if (string == null) {
            throw new IllegalArgumentException();
        }
    }
}
