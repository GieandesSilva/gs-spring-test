package com.gieandessilva.api.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "roles")
public class Role implements GrantedAuthority {

	
    private @Id @GeneratedValue Long id;
    private String name;

    public Role(String name) {
        this.name = name;
    }
    
    public Role() {
    }

    @Override
    public String getAuthority() {
        return  this.name;
    }
}
