//    Код из лекции 2 задание 1:
//
//    public static void main(String[] args) {
//
//        int costTicket = 10_333;
//        int bonusRubForMile = 20;
//
//        int bonusMiles = costTicket / bonusRubForMile;
//
//        System.out.println("Начислено " + bonusMiles + " бонусных миль");
//    }
//}

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_333;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}