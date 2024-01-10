/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book4_chap02;

/**
 *
 * @author Jada
 */
public class Teams {

    public static void main(String[] args) {
        String[][] teams = {
            //Team A
            {"Henry Blake", "Johnny Mulcahy"},
            //Team B
            {"Benjamin Pierce", "John McIntyre", "Jonathan Tuttle"},
            //Team C
            {"Margaret Houlihan", "Frank Burns"},
            //Team D
            {"Max Klinger", "Radar O'Reilly", "Igor Straminsky"}
        };

        for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams[i].length; j++) {
                System.out.println(teams[i][j]);
            }
            System.out.println();
        }
    }
}
