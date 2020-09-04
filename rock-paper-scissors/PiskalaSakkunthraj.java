    import java.util.*;
/**
 * Each player or team will create their own Player, this is only an example....
 * 
 * Your code MUST INCLUDE a move method with the following signature. To insure that, you must implement
 * the Player interface
 * 
 * You can create additional methods but must have the move method
 * 
 */
public class PiskalaSakkunthraj implements Player
{
    private static String name = "Sakkunthraj (Raj) Piskala";
    private static String strategy = "1st half beats Mr. Sos, 2nd half to make pattern recognition trickier";
    private int total = 0;
    private int rocks = 1; 
    /* @return      the move you want to play against opponent
     *              "r" - rock
     *              "p" - paper
     *              "s" - scissors
     *              anything else - forfeit the turn
     */
    public String move(String [] myMoves, String [] opponentMoves, int myScore, int opponentScore, int round)
    {
        if (round <= 200) {
            if (total < rocks) {
                ++total; 
                return "p"; 
            }
            else if (total == rocks) {
                total = 0; 
                ++rocks; 
                return "s"; 
            }
            }
        if (round > 200) {
            if (round%2 == 0 && round%3 != 0 && round%4 != 0 && round%5 != 0)
                return "s";
            if (round%3 == 0 && round%2 != 0 && round%4 != 0 && round%5 != 0)
                return "r";
            if (round%5 == 0 && round%3 != 0 && round%2 != 0 && round%4 != 0)
                return "p";
            if (round%2 != 0 && round%3 != 0 && round%4 != 0 && round%5 != 0)
                return "p";
            }
        return "r"; 
    }
    public String getName()
    {
        return name;
    }
}

