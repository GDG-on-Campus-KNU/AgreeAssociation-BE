package team.gdscknu.agreeassociation.core.dto.response;

import lombok.Builder;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Builder
public record PagingResponse<T>(
        Integer totalPage,
        List<T> data
) {
    public static <T> PagingResponse<T> of(List<T> data, Integer totalPage) {
        return PagingResponse.<T>builder()
                .totalPage(totalPage)
                .data(data)
                .build();
    }

    /**
     * [Entity]를 [Model]로 변환하여 [PagingResponse]를 생성합니다. <br>
     * 해당 메서드를 [Entity]와 [Model]이 1:1 매핑되는 경우에 사용하는 것을 권장합니다. <br>
     * [Convert Template Method Pattern]을 사용하여 변환 로직을 외부에서 주입받습니다.
     * <p>
     * [Function]은 자바 8의 함수형 인터페이스로, 변환 로직을 담고 있습니다.
     */
    public static <Entity, Model> PagingResponse<Model> from(Page<Entity> data, Function<Entity, Model> converter) {
        List<Model> convertedData = data.getContent().stream()
                .map(converter)
                .collect(Collectors.toList());

        return PagingResponse.<Model>builder()
                .totalPage(data.getTotalPages())
                .data(convertedData)
                .build();
    }
}
