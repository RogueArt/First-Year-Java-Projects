public class WeatherApp
{
    public static String getHikingAdvice(int temperature, int windchill, int humidity, String description) {
   if (temperature<-40 || windchill<-70 || humidity>100 && (description.indexOf("alien invasion")>=0))
   {
       return "You probably shouldn't hike today! On the bright side, if you're reading this, you're at least safe from any alien raids!";
    }
   if (temperature<-40 || windchill<-70 || humidity>100 || (description.indexOf("tornado")>=0))
   {
       return "You probably shouldn't hike today! On the bright side, if you're reading this, you're at least safe from any extreme conditions!";
   }
      if (temperature<-40 || windchill<-70 || humidity>100 || (description.indexOf("hurricane")>=0))
   {
       return "You probably shouldn't hike today! On the bright side, if you're reading this, you're at least safe from any extreme conditions!";
   }
         if (temperature>80 || windchill>70 || humidity>50 || (description.indexOf("sunny")>=0))
   {
       return "Make sure to drink lots of water, today's going to be a warm day for hiking!";
   }
         if (temperature<60 || windchill<40 || humidity>=0 && (description.indexOf("windy")>=0) || (description.indexOf("cloudy")>=0))
   {
       return "Make sure to wear a jacket! It'll be a chilly day for hiking!";
   }
         if ((temperature<=80 && 60<=(temperature)) && (windchill<=70 && 40<=(windchill)) && (humidity>=20 && 50>=(humidity)) && (description.indexOf("fair")>=0))
   {
       return "It's the perfect day for hiking! Not too hot, not too cold, not too humid, and the weather's just right!";
   }
   return "Today, it is " + temperature + " degrees without windchill, and with windchill it's " + windchill + ". The humidity right now is " + humidity + "%. Overall, today is" + description + ".";
   }
}