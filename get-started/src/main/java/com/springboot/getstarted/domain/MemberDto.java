package com.springboot.getstarted.domain;

public class MemberDto {

    private String name;
    private String email;
    private String organization;


    public MemberDto(String name, String email, String organization) {
        this.name = name;
        this.email = email;
        this.organization = organization;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getOrganization() {
        return organization;
    }

    @Override
    public String toString() {
        return "name: " + this.name + ", email: " + this.email + ", organization: " + this.organization;
    }
}
