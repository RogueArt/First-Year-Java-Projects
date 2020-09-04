public class DisplayAndSolver
{
    public static void Printer(int[][]maze){
        int a = maze.length; // this is number of rows
        int b = maze[0].length; // this is number of columns
        for(int row = 0;row < a; row++){
            for(int col = 0; col < b; col++){
                if(col == 0){
                    System.out.println();
                }
                System.out.print(maze[row][col]);
            }
        }
    }
    // Using recursion to have it go back to print
    public static void main()
    {
        int c = 0;
        int d, e, f = 0;
        String temp1 = "";
        String temp2 = "";
        int[][] maze = new int[0][0];
        String readLine = Reader.read();
        for (int i = 1; i < 23; i++){
            if(i == 1) {
               // c = Integer.parseInt(X);
               c = 8;
            }
            if(i == 2){
               // d = Integer.parseInt(X);
               d = 9;
               maze = new int[c][d];
            }
            if(i > 2){
               // String[] ff = X.trim().split("\\s+");
               for (int n = 0; n < 10; n++) {
               String[] ff = {"0", "1", "1", "2", "2", "4", "2", "3", "3", "4","4", "6", "4", "5", "5", "7", "7", "0", "7", "7"};
               e = Integer.parseInt(ff[2*n]);
               f = Integer.parseInt(ff[(2*n)+1]);
               maze[e][f] = 1;  
           
            }}
            readLine = Reader.read();
        }
        
        Printer(maze);
    }
    
}