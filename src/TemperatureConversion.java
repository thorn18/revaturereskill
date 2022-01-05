package src;

public class TemperatureConversion {

    public void CelciusToFarenheit(int celc) {
        System.out.println((celc*(9/5)) + 32);

    }

    public void FarenheitToCelcius(int far) {

        System.out.println((far-32) * (5/9));

    }
}
