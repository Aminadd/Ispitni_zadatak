/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebra;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 *
 * @author Amina
 */
public class Matrica {

    public int elementi[][];
    public int row;

    public Matrica() {
        row = 2;
    }

    public Matrica(int row) throws Exception {
        if (row <= 0) {
            throw (new Exception("Red ne moze biti manji od 0"));
        } else {
            this.row = row;
            this.elementi = new int[row][row];
        }
    }

    public void setElement(int row, int column, int element) throws Exception {
        if (row > this.row - 1 || column > this.row - 1) {
            throw (new Exception("Pogresne dimenzije! Probajte druge."));
        }
        this.elementi[row][column] = element;
    }

    public int[][] Pomnozi(int matrica[][], int row) throws Exception {
        if (row != this.row) {
            throw (new Exception("Matrice moraju biti istog reda"));
        }
        int[][] novamtr = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                novamtr[i][j] = 0;
                for (int k = 0; k < row; k++) {
                    novamtr[i][j] += elementi[i][k] * matrica[k][j];
                }
                System.out.println(novamtr[i][j]);
            }
            System.out.println("\n");
        }
        return novamtr;
    }

    public void OMatrica(String tip, int okej[][]) throws Exception {
        if (tip != "binarna" && tip != "tekst") {
            throw (new Exception("Unesite validan tip, binaran ili tekst"));
        }
        File noviFajl = new File("rez.txt");
        if (tip == "tekst") {

            FileWriter writer = new FileWriter("rez.txt");
            for (int i = 0; i < this.row; i++) {
                for (int j = 0; j < this.row; j++) {
                    writer.write(String.valueOf(okej[i][j]));
                    writer.write("| ");
                }
                writer.write("\n");
            }
            writer.close();
            System.out.println("Upisano u text fajl.");
        } else {
            FileOutputStream FOS = new FileOutputStream(noviFajl);
            for (int i = 0; i < this.row; i++) {
                for (int j = 0; j < this.row; j++) {
                    byte b = (byte) okej[i][j];
                    FOS.write(b);
                    FOS.flush();
                }
            }
            FOS.close();
            System.out.println("Upisano u text fajl");
        }
    }
}
