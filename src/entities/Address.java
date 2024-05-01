package entities;

public class Address {
    private Long number;
    private String zipCode;
    private String street;
    private String neighborhood;
    private String city;
    private String state;
    private String country;

    public Address(Long number, String zipCode, String street, String neighborhood, String city, String state, String country) {
        this.number = number;
        this.zipCode = zipCode;
        this.street = street;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public static final class AddressBuilder {
        private Long number;
        private String zipCode;
        private String street;
        private String neighborhood;
        private String city;
        private String state;
        private String country;

        public AddressBuilder() {
        }

        public AddressBuilder number(Long number) {
            this.number = number;
            return this;
        }

        public AddressBuilder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public AddressBuilder street(String street) {
            this.street = street;
            return this;
        }

        public AddressBuilder neighborhood(String neighborhood) {
            this.neighborhood = neighborhood;
            return this;
        }

        public AddressBuilder city(String city) {
            this.city = city;
            return this;
        }

        public AddressBuilder state(String state) {
            this.state = state;
            return this;
        }

        public AddressBuilder country(String country) {
            this.country = country;
            return this;
        }

        public Address build() {
            Address address = new Address(number, zipCode, street, neighborhood, city, state, country);
            return address;
        }
    }
}
