package edu.hw2;

public class Task2 {
    public static class Rectangle {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            setWidthHeight(width, height);
        }

        void setWidthHeight(int width, int height) {

            this.width = width;
            this.height = height;
        }

        void setWidth(int width) {
            setWidthHeight(width, this.height);
        }

        void setHeight(int height) {
            setWidthHeight(this.width, height);
        }

        double area() {
            return width * height;
        }
    }

    public static class Square extends Rectangle {
        public Square(int sideLength) {
            super(sideLength, sideLength);
        }

        @Override final void setWidth(int width) {
            super.setWidth(width);
        }

        @Override final void setHeight(int height) {
            super.setHeight(height);
        }
    }
}
