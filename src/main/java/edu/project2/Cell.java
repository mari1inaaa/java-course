package edu.project2;

public record Cell(int row, int col, Type type) {
    public enum Type { WALL, NO_WALL, PASSAGE }
}
