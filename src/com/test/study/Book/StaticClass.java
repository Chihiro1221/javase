package com.test.study.Book;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class StaticClass {
    public static void main(String[] args) {
        double[] cs = new double[20];
        for (int i = 0; i < cs.length; ++i) {
            cs[i] = 20 * Math.random();
        }
        ArrayAlg.Pair minmax = ArrayAlg.minmax(cs);
        System.out.println(minmax.getFirst());
        System.out.println(minmax.getSecond());
        try {
            ArrayAlg.test();
        } catch (SQLException e) {
            Throwable cause = e.getCause();
            System.out.println(cause.getMessage() + "->" + cause.getClass());
        }
        System.out.println();
    }
}

class ArrayAlg {
    static class Pair {
        private double first;
        private double second;

        public Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
//            throw new IOException("error message");
//            throw new FileFormatException("error message");
            return second;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }


    }

    public static void test() throws SQLException {
        try {
            FileReader fileReader = new FileReader("");
        } catch (FileNotFoundException original) {
//                throw new SQLException("database error: " + e.getMessage());
            SQLException e = new SQLException("database error");
            e.initCause(original);
            throw e;
        }
    }

    public static void test2() {
//        FileInputStream inputStream = null;
//        try {
//            try {
//                inputStream = new FileInputStream("");
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            } finally {
//                inputStream.close();
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        try(FileInputStream inputStream = new FileInputStream("")){
            // ...
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Pair minmax(double[] values) {
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        for (double value : values) {
            if (value > max) max = value;
            if (value < min) min = value;
        }

        return new Pair(max, min);
    }

}
