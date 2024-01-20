package lesson7_generics;

public class Pagination {
    private final int limit;
    private final int offset;
    private final int total;

    public Pagination(int limit, int offset, int total) {
        this.limit = limit;
        this.offset = offset;
        this.total = total;
    }

    @Override
    public String toString() {
        return "  \"pagination\": {" + "\n" +
                "    \"limit\": \"" + limit + "\",\n" +
                "    \"offset\": \"" + offset + "\",\n" +
                "    \"total\": \"" + total + "\"\n" +
                "  }";
    }
}
