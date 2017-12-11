package design.patterns.examples.creational.builder.first.core;

public class Student {

    private String code;
    private String firstname;
    private String initials;
    private String surname;
    private String telephone;

    private Student(StudentBuilder studentBuilder) {
        this.code = studentBuilder.getCode();
        this.firstname = studentBuilder.getFirstname();
        this.initials = studentBuilder.getInitials();
        this.surname = studentBuilder.getSurname();
        this.telephone = studentBuilder.getTelephone();
    }

    public static class StudentBuilder {

        private String code;
        private String firstname;
        private String initials;
        private String surname;
        private String telephone;

        public StudentBuilder(String code) {
            this.code = code;
        }

        public StudentBuilder withFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public StudentBuilder withInitials(String initials) {
            this.initials = initials;
            return this;
        }

        public StudentBuilder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public StudentBuilder withTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

        String getCode() {
            return code;
        }

        String getFirstname() {
            return firstname;
        }

        String getInitials() {
            return initials;
        }

        String getSurname() {
            return surname;
        }

        String getTelephone() {
            return telephone;
        }
    }


    public String getCode() {
        return code;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getInitials() {
        return initials;
    }

    public String getSurname() {
        return surname;
    }

    public String getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code='" + code + '\'' +
                ", firstname='" + firstname + '\'' +
                ", initials='" + initials + '\'' +
                ", surname='" + surname + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
