package ovningVecka3;

public class WeatherReportMain {

    public static void main(String[] args) {
        WeatherReport todayWeather = new WeatherReport(21,"soligt");


        System.out.println("Todays weather is: " + todayWeather.getDescription());

        todayWeather.setDescription("regnigt");
        System.out.println("Todays weather is: " + todayWeather.description);

    }
}
