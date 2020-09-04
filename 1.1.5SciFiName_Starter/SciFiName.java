
/**
 * SciFiName gathers input from a user to generate a custom name that
 * sounds like it could be used in a science fiction book or movie.
 * 
 * @author ckinnard
 * @version 3/4/16
 */

public class SciFiName   
{
    /**
     * All input that you privide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     * 
     * For best results, user lowercase letters and do not use spaces in your input
     */
    public static void main()
    {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        // notice this methd (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();

        // generate a sciFi name
        int randRel1 = ((int)Math.random() * relativeName1.length());
        int randRel2 = ((int)Math.random() * relativeName2.length());
        String sciFirst = firstName.substring(0, 3) + lastName.substring(0, 2);
        String sciLast = city.substring(0, 2) + school.substring(0, 3);
        String orig = relativeName1.substring(randRel1, randRel1 + 1) + relativeName2.substring(randRel2, relativeName2.length());
        
        
        
        System.out.println("Hello " + sciFirst.substring(0, 1).toUpperCase() + sciFirst.substring(1).toLowerCase()
        + " " + sciLast.substring(0, 1).toUpperCase() + sciLast.substring(1).toLowerCase() + " of " + orig.substring(0, 1).toUpperCase() 
        + orig.substring(1).toLowerCase() + ". Welcome!");
        // generate a sciFi origin
    }
}
