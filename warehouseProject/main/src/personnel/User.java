package personnel;

public class User {
    private String name;
    private boolean isEmployee;

    public User(String name, boolean isEmployee) {
        this.name = name;
        this.isEmployee = isEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean employee) {
        isEmployee = employee;
    }

    public void greet() {
        if (isEmployee) {
            System.out.println("Hello " + name + "! Welcome back!");
        } else {
            System.out.println("Hello Guest!");
        }
    }

    public void bye() {
        if (isEmployee) {
            System.out.println("Goodbye " + name + "! Have a great day!");
        } else {
            System.out.println("Goodbye!");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", isEmployee=" + isEmployee +
                '}';
    }
}