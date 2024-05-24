package main.java.com.ohgiraffers.understand;

public enum Genre {
    FICTION("소설"),
    NONFICTION("논픽션"),
    SCIENCE("과학"),
    HISTORY("역사"),
    FANTASY("판타지"),
    MYSTERY("미스터리");

    private String explain;

    Genre(String explain) {
        this.explain = explain;
    }

    public String getExplain() {
        return explain;
    }
}
