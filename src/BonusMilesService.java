public class BonusMilesService {
    public int calculate(int cost) {
        int rFm = 20; // количество потраченных рублей за 1 бонусную миля
        int result = (cost / rFm);
        return result;

    }
}
