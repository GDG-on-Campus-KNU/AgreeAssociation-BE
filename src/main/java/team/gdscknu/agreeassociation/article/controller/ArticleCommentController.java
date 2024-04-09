package team.gdscknu.agreeassociation.article.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import team.gdscknu.agreeassociation.article.dto.ArticleCommentModel;
import team.gdscknu.agreeassociation.article.dto.request.ArticleCommentCreateRequest;
import team.gdscknu.agreeassociation.core.dto.request.PagingQuery;
import team.gdscknu.agreeassociation.core.dto.response.PagingResponse;

@Slf4j
@Tag(name = "게시글 댓글", description = "게시글 댓글 관련 API")
@RequiredArgsConstructor
@RestController
public class ArticleCommentController {

    @Operation(summary = "게시글 댓글 페이징 조회", description = "게시글 댓글 페이징 데이터 조회")
    @Parameter(in = ParameterIn.PATH, name = "articleId", description = "게시글 ID", required = true)
    @GetMapping("/api/articles/{articleId}/comments")
    public PagingResponse<ArticleCommentModel> pagingArticleComments(@PathVariable Long articleId,
                                                                     @RequestParam @Valid PagingQuery query){
        throw new UnsupportedOperationException();
    }

    @Operation(summary = "게시글 댓글 작성", description = "게시글 댓글 작성 성공시 댓글 ID 반환")
    @Parameter(in = ParameterIn.PATH, name = "articleId", description = "게시글 ID", required = true)
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/api/articles/{articleId}/comments")
    public Long createArticleComment(@PathVariable Long articleId,
                                     @RequestBody @Valid ArticleCommentCreateRequest request){
        throw new UnsupportedOperationException();
    }

    @Operation(summary ="댓글 인정", description = "인정버튼 클릭 후, 댓글 인정 갯수 반환")

    @Parameter(in = ParameterIn.PATH, name = "commentId", description = "댓글 ID", required = true)
    @PostMapping("/api/articles/comments/{commentId}/agree")
    public Long agreeArticleComment(@PathVariable Long commentId){
        throw new UnsupportedOperationException();
    }

    @Operation(summary = "댓글 노인정", description = "노인정버튼 클릭 후, 댓글 노인정 갯수 반환")
    @Parameter(in = ParameterIn.PATH, name = "commentId", description = "댓글 ID", required = true)
    @PostMapping("/api/articles/comments/{commentId}/disagree")
    public Long disagreeArticleComment(@PathVariable Long commentId){
        throw new UnsupportedOperationException();
    }

    @Operation(summary = "게시글 댓글 삭제", description = "게시글 댓글 삭제")
    @Parameter(in = ParameterIn.PATH, name = "commentId", description = "댓글 ID", required = true)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/api/articles/comments/{commentId}")
    public void deleteArticleComment(@PathVariable Long commentId){
        throw new UnsupportedOperationException();
    }
}
