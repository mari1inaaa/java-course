package edu.hw2;

public class Task1 {
    private Task1() {

    }

    public sealed interface Expr {
        double evaluate();
    }

    public record Constant(double value) implements Expr {
        @Override
        public double evaluate() {
            return value;
        }
    }

    public record Negate(Expr expression) implements Expr {
        @Override
        public double evaluate() {
            return -expression.evaluate();
        }
    }

    public record Exponent(Expr base, double pow) implements Expr {
        @Override
        public double evaluate() {
            return Math.pow(base.evaluate(), pow);
        }
    }

    public record Addition(Expr expression1, Expr expression2) implements Expr {
        @Override
        public double evaluate() {
            return expression1.evaluate() + expression2.evaluate();
        }
    }

    public record Multiplication(Expr expression1, Expr expression2) implements Expr {
        @Override
        public double evaluate() {
            return expression1.evaluate() * expression2.evaluate();
        }
    }
}

