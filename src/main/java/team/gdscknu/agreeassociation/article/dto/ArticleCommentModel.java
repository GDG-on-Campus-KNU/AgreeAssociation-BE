package team.gdscknu.agreeassociation.article.dto;

import lombok.Builder;
import team.gdscknu.agreeassociation.article.domain.AgreeState;

import java.time.LocalDateTime;

@Builder
public record ArticleCommentModel(
        Long id,
        String content,
        LocalDateTime createdAt,
        UserInfoModel author,
        Integer agreeCount,
        Integer disagreeCount,
        Integer depth,//0: 댓글, 1: 대댓글
        AgreeState agreeState
) {
}
