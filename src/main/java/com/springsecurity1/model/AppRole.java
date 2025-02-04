package com.springsecurity1.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;


@Entity
@Table(name = "app_role")
@Data
public class AppRole implements GrantedAuthority {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column
    private String name;

    @Override
    public String getAuthority() {
        return this.name;
    }
}