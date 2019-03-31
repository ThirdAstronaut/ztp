public enum MARK {
    NDST(1), DOP(2), DST(3), DB(4), BDB(5), CEL(6);

    private final int mark;

    MARK(final int value){
        mark = value;
    }

    public int getMark() {
        return mark;
    }
}
