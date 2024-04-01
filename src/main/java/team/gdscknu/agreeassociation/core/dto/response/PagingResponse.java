package team.gdscknu.agreeassociation.core.dto.response;

import lombok.Builder;

import java.util.List;

@Builder
public record PagingResponse<T>(
        Integer page,
        Integer totalPage,
        List<T> data
) {
}
