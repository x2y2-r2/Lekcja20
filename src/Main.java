// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {

        ControlPanel panel = new ControlPanel();
        Container expressContainers = new Container();
        panel.startInterface();
                System.out.println(panel.getMenuOptions().values());
        while (true) {
                int menuOption = panel.chooseOptionFromMenu();
                if (menuOption <= Drink.values().length){
                        Drink drink;
                        drink = panel.drinkFromMenu(menuOption);
                        if (!expressContainers.isEmpty(expressContainers, drink)) {
                                OrderProcessor drinkOrderProcess = new OrderProcessor(new DrinkStrategy(drink));
                                drinkOrderProcess.executeOptionFromMenu(expressContainers);
                        } else {
                                System.out.println("Brak składników, wezwij serwis w celu uzupełnienia brakujących składników");
                                OrderProcessor ingredientLevelProcess = new OrderProcessor(new IngredientsLevelStrategy());
                                ingredientLevelProcess.executeOptionFromMenu(expressContainers);
                                break;
                                }
                } else if (panel.getMenuOptions().values().("")) {
                        OrderProcessor refillProcess = new OrderProcessor(new IsEmptyStrategy());
                        refillProcess.executeOptionFromMenu(expressContainers);

                }
        }






        //    Stwórz interfejs ekspresu do kawy.
//    1. Ekspres ma uruchamiać się w stanie domyślnym (składniki uzupełnione do maksimum),
//    gdzie ma w sobie:
//      - 10 jednostek kawy
//      - 5 jednostek mleka
//      - 10 jednostek wody

//    2. Mamy mieć możliwość wyboru 3 różnych kaw:
//      - espresso - zużywa 2 jednostki kawy, 1 jednostkę wody
//      - cappuccino - zużywa 1 jednostkę kawy, 2 jednoski mleka
//      - americano - zużywa 2 jednostki kawy, 2 jednostki wody



//    3. Jeżeli któregoś ze składników będzie brakować,
//    ekspres ma zablokować możliwość przygotowania kawy.


//    4. Interfejs ma pozwalać na uzupełnienie składników.
//      W momencie, gdy użytkownik wywoła uzupełnianie powinna zostać wyświetlona informacja,
//      jakiego składnika i jaka ilość została uzupełniona.

        //

//    Zadanie domowe:
//    1. Należy dodać kolejną opcję do menu pozwalającą na wyświetlenie aktualnego stanu składników
//    2. Należy dodać możliwość przygotowywania gorącego mleka, które zużywa 3 jednostki mleka
//    3. Należy dodać wyświetlanie jakiego składnika brakuje, gdy nie można przygotować napoju


//    Przykładowe wywołanie:
//
//
//    Jaką czynność chcesz wykonać?
//    [1] Przygotowanie espresso
//    [2] Przygotowanie cappuccino
//    [3] Przygotowanie americano
//    [4] Uzupełnienie składników

//    -> 1
//    Przygotowywanie espresso...

//    Jaką czynność chcesz wykonać?
//    [1] Przygotowanie espresso
//    [2] Przygotowanie cappuccino
//    [3] Przygotowanie americano
//    [4] Uzupełnienie składników

//    -> 2
//    Przygotowywanie cappuccino...

//    Jaką czynność chcesz wykonać?
//    [1] Przygotowanie espresso
//    [2] Przygotowanie cappuccino
//    [3] Przygotowanie americano
//    [4] Uzupełnienie składników

//    Jaką czynność chcesz wykonać?
//    [1] Przygotowanie espresso
//    [2] Przygotowanie cappuccino
//    [3] Przygotowanie americano
//    [4] Uzupełnienie składników

//    -> 2
//    Przygotowywanie cappuccino...

//    Jaką czynność chcesz wykonać?
//    [1] Przygotowanie espresso
//    [2] Przygotowanie cappuccino
//    [3] Przygotowanie americano
//    [4] Uzupełnienie składników

//    -> 2
//    Nie można przygotować cappuccino!
//    Brak składników!

//    Jaką czynność chcesz wykonać?
//    [1] Przygotowanie espresso
//    [2] Przygotowanie cappuccino
//    [3] Przygotowanie americano
//    [4] Uzupełnienie składników

//    -> 4
//    Uzupełnianie składników...
//    Uzupełniono 4 jednostki kawy
//    Uzupełniono 4 jednostki mleka
//    Uzupełniono 1 jednostki wody
    }
}