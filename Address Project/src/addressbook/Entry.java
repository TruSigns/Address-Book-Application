package addressbook;

import java.util.Collection;
import java.util.Objects;

public class Entry {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    public Entry(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone() {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Entry entry = (Entry) o;
        return Objects.equals(getEmail(), entry.getEmail());
    }


    @Override
    public int hashCode() {
        return Objects.hash(getEmail());
    }

    @Override
    public String toString() {
        return "Entry{"
                + "firstName='"
                + firstName
                + '\''
                + ", lastName='"
                + lastName
                + '\''
                + ", phone='"
                + phone
                + '\''
                + ", email='"
                + email
                + '\''
                + '}';
    }

}


