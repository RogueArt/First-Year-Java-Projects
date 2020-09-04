public class StringTester
{
    public static void main (String []Args)
    {
        String weatherCondition = "scattered showers (day)";
        // System.out.println(weatherCondition.substring(0,8));
        // System.out.println(weatherCondition.indexOf("thunder"));
        // System.out.println(WeatherConditionals.getWeatherAdvice(32, "windy"));
        System.out.println(WeatherApp.getHikingAdvice(40, 40, 40, "fair"));
    }

}
