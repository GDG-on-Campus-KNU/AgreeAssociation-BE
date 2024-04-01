package team.gdscknu.agreeassociation.auth.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import team.gdscknu.agreeassociation.auth.dto.request.LoginEmailRequest;
import team.gdscknu.agreeassociation.auth.dto.request.LoginSocialRequest;
import team.gdscknu.agreeassociation.auth.dto.request.SignupEmailRequest;
import team.gdscknu.agreeassociation.auth.dto.response.LoginResponse;

@Slf4j
@Tag(name = "인증", description = "인증 관련 API")
@RequiredArgsConstructor
@RestController
public class AuthController {

    @Operation(summary = "이메일 회원가입", description = "JWT와 회원정보 반환")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/api/auth/signup/email")
    public LoginResponse signup(@RequestBody @Valid SignupEmailRequest request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Operation(summary = "이메일 로그인", description = "JWT 반환와 회원정보 반환")
    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/api/auth/login/email")
    public LoginResponse signin(@RequestBody @Valid LoginEmailRequest request) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

//    @Operation(summary = "소셜 로그인", description = "JWT와 회원정보 반환")
//    @ResponseStatus(HttpStatus.OK)
//    @PostMapping("/api/auth/login/social")
//    public LoginResponse socialLogin(@RequestBody @Valid LoginSocialRequest request) {
//        throw new UnsupportedOperationException("Not implemented yet");
//    }

    @Operation(summary = "로그아웃", description = "로그아웃 처리")
    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/api/auth/logout")
    public void logout() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
