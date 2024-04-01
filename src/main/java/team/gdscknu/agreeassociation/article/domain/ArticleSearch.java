package team.gdscknu.agreeassociation.article.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ArticleSearch {
    private String title;
    private String author;
    private ArticleSort sort;
}
