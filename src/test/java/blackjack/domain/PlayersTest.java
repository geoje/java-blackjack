package blackjack.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class PlayersTest {
    @Test
    @DisplayName("플레이어는 여러명일 수 있다.")
    void playersCreateTest() {
        // given
        String names = "pobi,lemone,seyang";
        List<String> expectedNames = List.of("pobi", "lemone", "seyang");

        // when
        Players players = Players.from(names);

        // then
        assertThat(players.getNames())
                .usingRecursiveComparison()
                .isEqualTo(expectedNames);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "    "})
    @DisplayName("플레이어가 없을 경우 예외가 발생한다.")
    void validateNoPlayer(String names) {
        // given & when & then
        assertThatCode(() -> Players.from(names))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("공백이 아닌 플레이어를 입력해 주세요.");
    }
}