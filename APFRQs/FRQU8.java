public class FRQU8 {
public Plot getHighestYield(String c) {
    String temp = "";
    int max = 0;
    int a = 0;
    int b = 0;
    boolean isThere = false;
    for (int n = 0; n < farmPlots[0].length; n++) {
        for (int j = 0; j < farmPlots.length - 1; j++) {
            temp = farmPlots[n][j];
            if (c.compareTo(temp) == 0) 
            {
                if (farmPlots[n][j] < farmPlots[n][j + 1]) 
                {
                max = farmPlots[n][j + 1];
                a = n;
                b = j + 1;
                isThere = true;
                }
        }
    }
    if (isThere) {
       return "farmPlots[" + a + "][" + b + "]";
    }
    else {
       return null;
    }
}
}

public boolean sameCrop(int col) {
    boolean result = true;
    for (int k = 0; k < farmPlots[col].length - 1; k++) {
        if (farmPlots[k][col] != farm[Plots][k + 1][col]) {
            result = false;
        }
    }
    return result;
}

        
    