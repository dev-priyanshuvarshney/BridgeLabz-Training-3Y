package Arrays;

public class MeanHeightOfPlayers {
    public static void main(String[] args) {
        double[] heights = {160,158,190,187,163,188,165,142,189,180,195};
        double sum = 0.0;
        for(int i=0;i<heights.length;i++){
            sum+=heights[i];
        }
        double mean = sum/heights.length;
        System.out.println(mean);
    }
}
