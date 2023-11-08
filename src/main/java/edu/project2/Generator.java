package edu.project2;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Arrays;

public class Generator {
    Random random = new Random();

    Maze generateEmptyMaze(int height, int width) {
        Cell[][] cells = new Cell[height * 2 - 1][width * 2 - 1];
        int currentY = 0;
        Cell.Type type = Cell.Type.PASSAGE;
        for (Cell[] row : cells) {
            int currentX = 0;
            for (Cell cell : row) {
                if (currentX % 2 != 0 || currentY % 2 != 0) {
                    type = Cell.Type.WALL;
                } else {
                    type = Cell.Type.PASSAGE;
                }
                cell = new Cell(currentY, currentX, type);
                cells[currentY][currentX] = cell;
                currentX++;
            }
            currentY++;
        }
        Maze maze = new Maze(height, width, cells);
        return maze;
    }

    Coordinate chooseNeighbour(List<Coordinate> coordinates, List<Coordinate> visited, Coordinate coordinate) {
        List<Coordinate> neighbours = new ArrayList<>();
        // left
        Coordinate left = new Coordinate(coordinate.row(), coordinate.col() - 1);
        if (coordinates.contains(left) & !visited.contains(left)) {
            neighbours.add(left);
        }
        // top
        Coordinate top = new Coordinate(coordinate.row() - 1, coordinate.col());
        if (coordinates.contains(top) & !visited.contains(top)) {
            neighbours.add(top);
        }
        // right
        Coordinate right = new Coordinate(coordinate.row(), coordinate.col() + 1);
        if (coordinates.contains(right) & !visited.contains(right)) {
            neighbours.add(right);
        }
        // bottom
        Coordinate bottom = new Coordinate(coordinate.row() + 1, coordinate.col());
        if (coordinates.contains(bottom) & !visited.contains(bottom)) {
            neighbours.add(bottom);
        }

        if (neighbours.isEmpty()) {
            return coordinate;
        } else {
            int randomIndex = random.nextInt(neighbours.size());
            return neighbours.get(randomIndex);
        }

    }

    Maze generate(int height, int width) {
        Maze emptyMaze = generateEmptyMaze(height, width);
//        int newHeight = height * 2 - 1;
//        int newWidth = width * 2 - 1;
        Stack<Coordinate> bypass = new Stack<>();
        List<Coordinate> visited = new ArrayList<>();
        Cell[][] cells = emptyMaze.grid;
        List<Coordinate> coordinates = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                coordinates.add(new Coordinate(i, j));
            }
        }

        int randomIndex = random.nextInt(coordinates.size());
        Coordinate start = coordinates.get(randomIndex);
        visited.add(start);
        bypass.add(start);
        Coordinate updateStart = start;
        while (visited.size() < height * width) {
            Coordinate next = chooseNeighbour(coordinates, visited, updateStart);
            if (next == updateStart) {
                // rotate back
                while (next == updateStart) {
                    updateStart = bypass.pop();
                    next = chooseNeighbour(coordinates, visited, updateStart);
                }
            }
            visited.add(next);
            bypass.add(next);
            updateStart = next;
        }

//        System.out.println(coordinates);
//        System.out.println("visited: " + visited);
//        System.out.println("bypass: " + bypass);
//        System.out.println("cells: " + Arrays.deepToString(cells));
        for (int i = 0; i < visited.size() - 1; i++) {
            Coordinate cell1 = new Coordinate(visited.get(i).row() * 2, visited.get(i).col() * 2);
            Coordinate cell2 = new Coordinate(visited.get(i + 1).row() * 2, visited.get(i + 1).col() * 2);
        }
        return emptyMaze;
    }
}
