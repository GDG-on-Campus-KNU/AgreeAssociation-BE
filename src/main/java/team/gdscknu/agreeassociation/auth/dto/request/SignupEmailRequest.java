package team.gdscknu.agreeassociation.auth.dto.request;

import jakarta.validation.constraints.NotBlank;

public record SignupEmailRequest(
        @NotBlank(message = "이메일을 입력해주세요.")
        String email,
        @NotBlank(message = "비밀번호를 입력해주세요.")
        String password,
        @NotBlank(message = "닉네임을 입력해주세요.")
        String nickname
) {
}
