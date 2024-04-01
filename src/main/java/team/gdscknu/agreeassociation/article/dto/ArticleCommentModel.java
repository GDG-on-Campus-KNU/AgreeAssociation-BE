package team.gdscknu.agreeassociation.article.dto;

import lombok.Builder;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;
import java.util.List;

@Builder
public record ArticleCommentModel(
        Long id,
        String content,
        LocalDateTime createdAt,
        UserInfoModel author,
        Integer likeCount,
        Long parentCommentId
) {
}
