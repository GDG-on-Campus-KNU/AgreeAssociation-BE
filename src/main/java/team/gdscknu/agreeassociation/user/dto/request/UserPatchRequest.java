package team.gdscknu.agreeassociation.user.dto.request;

public record UserPatchRequest(

        String nickname,
        String profileImageUrl,
        String password
) {
}
