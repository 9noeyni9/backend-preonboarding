package com.hanghae99.preonboardingbackend.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    // primary key
    // 자동 증가 되는
    @Id
    @Column(name = "user_id")
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "username", length = 50, unique = true)
    private String username;

    @Column(name = "password", length = 100)
    @JsonIgnore
    private String password;

    @Column(name = "nickname", length = 50)
    private String nickname;

    @Column(name = "activated")
    @JsonIgnore
    private boolean activated;

    private UserRole role;

    @Builder
    public User(String username, String password, String nickname, boolean activated, UserRole role){
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.activated = activated;
        this.role = role;
    }
}
