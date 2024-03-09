package blackjack.domain.card;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("카드들")
public class CardsTest {
    @Test
    @DisplayName("뽑은 카드를 저장한다.")
    void cardsCreateTest() {
        // given & when
        Cards cards = new Cards();
        cards.addCard(Card.SPADE_NINE);
        cards.addCard(Card.CLUB_ACE);

        // then
        assertThat(cards.get().size()).isEqualTo(2);
    }

    @Test
    @DisplayName("뽑은 카드들의 합을 구한다.")
    void cardsSumTest() {
        // given
        int expectedScore = 9 + 5;

        // when
        Cards cards = new Cards();
        cards.addCard(Card.CLUB_FIVE);
        cards.addCard(Card.SPADE_NINE);

        // then
        assertThat(cards.totalScore()).isEqualTo(expectedScore);
    }

    @Test
    @DisplayName("카드 점수의 합 중 21과 가장 가까운 수를 반환한다.")
    void maxScoreTest() {
        // given
        Cards cards = new Cards();

        // when
        cards.addCard(Card.SPADE_NINE);
        cards.addCard(Card.CLUB_QUEEN);
        cards.addCard(Card.CLUB_ACE);
        cards.addCard(Card.HEART_ACE);

        // then
        assertThat(cards.totalScore()).isEqualTo(21);
    }

    @Test
    @DisplayName("카드들의 모든 점수 경우의 수를 구한다.")
    void calculateScoreCases() {
        // given
        Card card1 = Card.CLUB_ACE;
        Card card2 = Card.CLUB_FIVE;
        Card card3 = Card.DIAMOND_ACE;
        Cards cards = new Cards();
        Set<Integer> expected = Set.of(7, 17, 27);

        // when
        cards.addCard(card1);
        cards.addCard(card2);
        cards.addCard(card3);

        // then
        assertThat(cards.generateScoreCases()).isEqualTo(expected);
    }

}
