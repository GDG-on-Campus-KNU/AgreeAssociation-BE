package team.gdscknu.agreeassociation.user.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import team.gdscknu.agreeassociation.article.dto.ArticleCommentModel;
import team.gdscknu.agreeassociation.article.dto.ArticleModel;
import team.gdscknu.agreeassociation.auth.dto.UserDetailModel;
import team.gdscknu.agreeassociation.core.dto.request.PagingQuery;
import team.gdscknu.agreeassociation.core.dto.response.PagingResponse;
import team.gdscknu.agreeassociation.user.dto.request.UserPatchRequest;

@Slf4j
@RequiredArgsConstructor
@Tag(name = "유저", description = "유저 관련 API")
@RestController
public class UserController {

    @Operation(summary = "회원 상세 정보 조회", description = "유저 상세 정보 조회")
    @GetMapping("/api/user")
    public UserDetailModel getUser() {
        throw new UnsupportedOperationException();
    }

    @Operation(summary = "회원 정보 수정", description = "유저 정보 수정")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping("/api/user")
    public void patchUser(@RequestBody UserPatchRequest request) {
        throw new UnsupportedOperationException();
    }


    @Operation(summary = "회원 탈퇴", description = "유저 삭제")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/api/user")
    public void deleteUser() {
        throw new UnsupportedOperationException();
    }


    @Operation(summary = "내가 쓴글 페이징", description = "내가 쓴 글 페이징 데이터 조회")
    @GetMapping("/api/user/articles")
    public PagingResponse<ArticleModel> pagingMyArticles(@RequestParam PagingQuery query) {
        throw new UnsupportedOperationException();
    }

    @Operation(summary = "내가 쓴 댓글 페이징", description = "내가 쓴 댓글 페이징 데이터 조회")
    @GetMapping("/api/user/comments")
    public PagingResponse<ArticleCommentModel> pagingMyComments(@RequestParam PagingQuery query) {
        throw new UnsupportedOperationException();
    }

    @Operation(summary = "내가 인정한 글 페이징", description = "내가 인정한 글 페이징 데이터 조회")
    @GetMapping("/api/user/articles-agree")
    public PagingResponse<ArticleModel> pagingMyAgrees(@RequestParam PagingQuery query) {
        throw new UnsupportedOperationException();
    }


    @Operation(summary = "내가 인정한 댓글 페이징", description = "내가 인정한 댓글 페이징 데이터 조회")
    @GetMapping("/api/user/comments-agree")
    public PagingResponse<ArticleCommentModel> pagingMyCommentAgrees(@RequestParam PagingQuery query) {
        throw new UnsupportedOperationException();
    }
}
