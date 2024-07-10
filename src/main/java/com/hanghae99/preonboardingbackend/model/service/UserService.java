package com.hanghae99.preonboardingbackend.model.service;

import com.hanghae99.preonboardingbackend.model.dto.SignupRequestDto;
import com.hanghae99.preonboardingbackend.model.entity.User;
import com.hanghae99.preonboardingbackend.model.entity.UserRole;
import com.hanghae99.preonboardingbackend.model.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void signup(SignupRequestDto signupRequestDto) {
        if (!Objects.equals(signupRequestDto.getPassword(), signupRequestDto.getPasswordConfirm())) {
            throw new IllegalArgumentException("회원가입 실패: 비밀번호 불일치");
        }

        User user = User.builder()
                .username(signupRequestDto.getUsername())
                .password(signupRequestDto.getPassword())
                .nickname(signupRequestDto.getNickname())
                .activated(true)
                .role(UserRole.USER)
                .build();
        userRepository.save(user);
    }
}
