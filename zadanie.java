//Program sprawdzający pełnoletność użytkownika

import java.util.Scanner;

public class zadanie{                                      //publiczna klasa Main
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);          //utworzenie obiektu scan  

        System.out.println("Wprowadź wiek:");           //Zapytanie użytkownika o wiek
        int age = scan.nextInt();                       //Utworzenie zmiennej age czytającej strumien wejscia

        if(age <= 0){                                    //utworzenie funkcji warunkowej
            System.out.println("Nieprawidłowy wiek");   //wyświetlenie tekstu
        }
        else if(age > 0 && age < 18){                   
            System.out.println("Jesteś niepełnoletni"); //wyswietlenie tekstu
        }
        else if(age >=18){
            System.out.println("Jesteś pełnoletni");    //wyswietlenie tekstu
        }

    scan.close();                                       //zamkniecie skanera
    }
}