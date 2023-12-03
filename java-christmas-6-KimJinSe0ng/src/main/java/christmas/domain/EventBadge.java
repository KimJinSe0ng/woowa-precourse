package christmas.domain;

public enum EventBadge {
    SANTA(20000, "산타"),
    TREE(10000, "트리"),
    STAR(5000, "별"),
    NONE(0, "없음");

    private final int threshold;
    private final String description;

    EventBadge(int threshold, String description) {
        this.threshold = threshold;
        this.description = description;
    }

    public static EventBadge getBadge(int totalAfterBenefit) {
        for (EventBadge badge : values()) {
            if (totalAfterBenefit >= badge.threshold) {
                return badge;
            }
        }
        return EventBadge.NONE;
    }

    public String getDescription() {
        return description;
    }
}
