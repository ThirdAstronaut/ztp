public enum Mark {
    NDST(1), DOP(2), DST(3), DB(4), BDB(5), CEL(6);

    private final int mark;

    Mark(final int value) {
        mark = value;
    }

    public int getMark() {
        return mark;
    }
}
