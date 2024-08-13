package org.example;

public class Target {

    public static class Builder {

        private final Target target;

        Builder() {
            this.target = new Target();
        }

        public Builder gender(String gender) {
            this.target.gender = gender;
            return this;
        }


        public Target build() {
            return target;
        }

    }

    private String gender;

    public static Target.Builder newBuilder() {
        return new Builder();
    }

    public String getGender() {
        return gender;
    }

}
