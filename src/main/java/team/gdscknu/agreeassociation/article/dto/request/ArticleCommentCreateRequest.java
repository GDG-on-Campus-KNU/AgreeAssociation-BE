package team.gdscknu.agreeassociation.article.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(requiredProperties = {"content"})
public record ArticleCommentCreateRequest(
        Long parentCommentId,
        @NotBlank(message = "내용을 입력해주세요.")
        String content
) {
}
