/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book8_chap02;

import java.io.*;
import java.text.NumberFormat;

/**
 *
 * @author Jada
 */
public class ReadBinaryFile {

    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        DataInputStream in = getStream("C:\\Users\\Jada\\OneDrive\\Documents\\Bootcamp\\Java\\7_Java_Beginner\\dummies\\src\\book8_chap02\\movies.dat");
        boolean eof = false;
        while (!eof) {
            Movie movie = readMovie(in);
            if (movie == null) {
                eof = true;
            } else {
                String msg = Integer.toString(movie.year);
                msg += ": " + movie.title;
                msg += " (" + cf.format(movie.price) + ")";
                System.out.println(msg);
            }
        }
        closeFile(in);
    }

    private static DataInputStream getStream(String name) {
        DataInputStream in = null;
        try {
            File file = new File(name);
            in = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream(file)));
        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exist.");
            System.exit(0);
        }
        return in;
    }

    private static Movie readMovie(DataInputStream in) {
        String title = "";
        int year = 0;;
        double price = 0.0;;
        try {
            title = in.readUTF();
            year = in.readInt();
            price = in.readDouble();
        } catch (EOFException e) {
            return null;
        } catch (IOException e) {
            System.out.println("I/O Error");
            System.exit(0);
        }
        return new Movie(title, year, price);
    }

    private static void closeFile(DataInputStream in) {
        try {
            in.close();
        } catch (IOException e) {
            System.out.println("I/O Error closing file.");
            System.out.println();
        }
    }

    private static class Movie {

        public String title;
        public int year;
        public double price;

        public Movie(String title, int year, double price) {
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }
}
