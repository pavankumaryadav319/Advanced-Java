package org.example.TopBrains;


public class User {

    private String userId;
    private String fullName;
    private String email;
    private String role;

    public User(String userId, String fullName, String email, String role) {
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
        this.role = role;
    }
    public String getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }
    public String getDetails() {
        return "User ID: " + userId +
                ", Name: " + fullName +
                ", Email: " + email +
                ", Role: " + role;
    }
}