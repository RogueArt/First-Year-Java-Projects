public class MinePrac
{
    private int x;
    private int y;
    private int z;
    private boolean shiny;
    
    public MinePrac(int x, int y, int z, boolean shiny) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.shiny = shiny;
    }
    public String Coordinates() {
        if ((x >= 1000) || (y >= 1000) || (z >= 1000))
            return "You are too far away from the home base!";
        else
            return "You're less than 1000 blocks from home base!";
    }
    public double totalDistance() {
        double pythApp = Math.pow((Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)),0.5);
        return pythApp;
    }
    public boolean Diamonds(boolean shiny, char color) {
        if ((shiny) && (color == 'b'))
            return true;
        else
            return false;
    }
    /* public void setX(int x) {
        if (!(x < 0))
            this.x = x;
        else
            this.x = -1*x;
    } */
}
