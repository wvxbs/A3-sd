package a3;

import java.util.Scanner;
import a3.model.*;
import a3.game.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharacterModel character = new CharacterModel();
        Actions actions = new Actions();
        boolean Running = true;

        System.out.println("Insira o seu nome");
        String name = scanner.nextLine();
        ClientModel client = new ClientModel(name);

        actions.getStatus();
    }
}