package uk.ac.westminster.products_api;

public class Customer {

    private String name;
    private String email;
    private Long id;
    private Address address;

    public Customer(String name, String email, Long id, Address address) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }
}
