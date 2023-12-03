package christmas.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EventBadgeTest {

    @DisplayName("배지가 별인지 검증")
    @Test
    public void testGetBadge_Star() {
        // Given
        int totalAfterBenefit = 6000;

        // When
        EventBadge badge = EventBadge.getBadge(totalAfterBenefit);

        // Then
        assertEquals(EventBadge.STAR, badge, "별 배지");
    }

    @DisplayName("배지가 트리인지 검증")
    @Test
    public void testGetBadge_Tree() {
        // Given
        int totalAfterBenefit = 10000;

        // When
        EventBadge badge = EventBadge.getBadge(totalAfterBenefit);

        // Then
        assertEquals(EventBadge.TREE, badge, "트리 배지");
    }

    @DisplayName("배지가 산타인지 검증")
    @Test
    public void testGetBadge_Santa() {
        // Given
        int totalAfterBenefit = 25000;
        // When
        EventBadge badge = EventBadge.getBadge(totalAfterBenefit);

        // Then
        assertEquals(EventBadge.SANTA, badge, "산타 배지");
    }
}