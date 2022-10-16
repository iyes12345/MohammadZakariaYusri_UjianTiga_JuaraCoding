package MohammadZakariaYusri.UjianTiga.pageobject.drivers.strategies;
import MohammadZakariaYusri.UjianTiga.pageobject.util.Constants;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();

            default:
                return null;
        }
    }
}
