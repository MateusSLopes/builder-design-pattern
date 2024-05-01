package application;

import entities.Address;
import entities.User;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Program {
    public static void main(String[] args) {
        Address address = new Address.AddressBuilder()
                .number(11L)
                .street("Praça da Sé")
                .city("São Paulo")
                .country("Brasil")
                .neighborhood("Sé")
                .state("SP")
                .zipCode("01001-000")
                .build();

        User user = new User.UserBuilder()
                .id(null)
                .name("Mateus")
                .username("mateus123")
                .address(address)
                .build();
    }
}