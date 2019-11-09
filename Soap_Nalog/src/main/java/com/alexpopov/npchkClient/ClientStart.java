package com.alexpopov.npchkClient;

import java.util.Scanner;

public class ClientStart {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.printf("Если нужно \n ввести данные юридического лица, введите %d,\n " +
                    "ввести данные ИП, введите %d,\n завершить программу, " +
                    "введите %d \n", 1, 2, 0);

            String comand = scanner.nextLine();
            if (comand.equals("1")) {
                client.checkUrL(scanner);
            } else if(comand.equals("2")) {
                client.checkIP(scanner);
            } else if(comand.equals("0")){
                break;
            }
        }
    }
}
