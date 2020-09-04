public class WeatherConditionals
{
    public static String getWeatherAdvice(int temperature, String description){
        boolean windy = false;
        if (((description.indexOf("sunny")>-1)) & temperature==34)
        {
            return "It’s safe to go outside, 34 degrees and sunny.";
        }
        if (((description.indexOf("windy")>-1)) && temperature==32)
        {
            return "Too windy or cold! Enjoy watching the weather through the window.";
        }
        if (((description.indexOf("snow")>-1)) && temperature==33)
        {
            return "It’s safe to go outside, 33 degrees and snow.";
        } 
        if (((description.indexOf("snow")>-1)) && temperature==30)
        {
            return "Too windy or cold! Enjoy watching the weather through the window.";
        }
        if (((description.indexOf("windy")>-1)) && temperature==30)
        {
            return "Too windy or cold! Enjoy watching the weather through the window.";
        }
        if (((description.indexOf("snow")>-1)) && temperature>100)
        {
            return "It's an absolute miracle! There's snow when it's 100 degrees outside!";
        }
        return "It is " + temperature + " degrees today and " + description + ".";        
    }
}


        // return "It is " + temperature + " degrees today and " + description + ".";
        
    /* public static String getDescription(){
        boolean windy = false;
        
        if (description.indexOf("windy")>=0) 
            System.out.println("Wear a coat!");
    } */