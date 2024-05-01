package entities;

public class User {
    private Long id;
    private String name;
    private String username;
    private Address address;

    public User(Long id, String name, String username, Address address) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.address = address;
    }

    public static final class UserBuilder {
        private Long id;
        private String name;
        private String username;
        private Address address;

        public UserBuilder() {
        }

        public UserBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder address(Address address) {
            this.address = address;
            return this;
        }

        public User build() {
            User user = new User(id, name, username, address);
            return user;
        }
    }
}
