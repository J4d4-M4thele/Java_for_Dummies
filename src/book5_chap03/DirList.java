/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book5_chap03;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Jada
 */
public class DirList {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Directory Lister");
        do {
            System.out.println("\nEnter a path: ");
            String path = sc.nextLine();
            File dir = new File(path);
            if (!dir.exists() || !dir.isDirectory()) {
                System.out.println("\nThat directory doesn't exist");
            } else {
                System.out.println("\"\\nListing directory tree of: ");
                System.out.println(dir.getPath());
                listDirectories(dir, " ");
            }
        } while (askAgain());
    }

    private static void listDirectories(File dir, String indent) {
        File[] dirs = dir.listFiles();
        for (File d : dirs) {
            if (d.isDirectory()) {
                System.out.println(indent + d.getName());
                listDirectories(d, indent + " ");
            }
        }
    }

    private static boolean askAgain() {
        System.out.println("Another? Y or N");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }
}
