package com.hanghae99.preonboardingbackend.model.controller;

import com.hanghae99.preonboardingbackend.model.dto.ResponseDto;
import com.hanghae99.preonboardingbackend.model.dto.SignupRequestDto;
import com.hanghae99.preonboardingbackend.model.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<ResponseDto<String>> signup(@RequestBody @Validated SignupRequestDto signupRequestDto) {
        userService.signup(signupRequestDto);

        return ResponseEntity.status(HttpStatus.OK)
                .body(ResponseDto.<String>builder()
                        .data("회원가입 성공")
                        .statusCode(HttpStatus.OK.value())
                        .build());
    }
}
