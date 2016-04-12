package home.work.lecture4;

import java.util.Scanner;

/**
 * Created by Volodymyr_Silitskyi on 4/12/2016.
 */
public class IdToToyNameConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter id: ");
        int id = scanner.nextInt();

        if (id == 0){
            System.out.print("Car");
        }else if (id == 1){
            System.out.print("Lego");
        }else if (id == 2){
            System.out.print("Doll");
        }else if (id == 3){
            System.out.print("Puzzle");
        }else{
            throw new IllegalArgumentException("Incorrect ID");
        }
    }
}
