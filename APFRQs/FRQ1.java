public class FRQ1 {
    public static void main (String[] args) {
        String[] words = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};
       for (String usedString: words){
           String beingChecked = usedString.substring(3);
           if (beingChecked.indexOf("ing") >= 0){
               System.out.println(usedString);
        }
    }
}}