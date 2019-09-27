package kata;

public enum RomanDigit {
    I(1),
    V(2),
    X(3),
    L(4),
    C(5),
    M(6);

    private int order;

    RomanDigit(int order) {
        this.order = order;
    }

    public int compareOrder(RomanDigit other) {
        return this.order - other.order;
    }
}
