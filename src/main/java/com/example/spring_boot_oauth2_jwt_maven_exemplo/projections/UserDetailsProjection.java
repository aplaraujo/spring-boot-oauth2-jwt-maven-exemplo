package com.example.spring_boot_oauth2_jwt_maven_exemplo.projections;

public interface UserDetailsProjection {
    String getUsername();

    String getPassword();

    Long getRoleId();

    String getAuthority();
}
