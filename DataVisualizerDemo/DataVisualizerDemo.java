import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

/**
 * Demonstration of how to implement the HindmanVisualizer interface 
 * @author Luke Hindman
 */
public class DataVisualizerDemo implements HindmanVisualizer {


    /* instance variables (and constants) */
    private final int DISPLAY_WIDTH = 600;
    private final int DISPLAY_HEIGHT = 600;
    private final int MAX_VALUE = 255;
    private int[][] simData;

    /* Constructor */
    public DataVisualizerDemo() {
        this.simData = new int[DISPLAY_HEIGHT][DISPLAY_WIDTH];

        generateHorizontalLines();

    }

    /* Private Helper Method */
    private void generateVerticalLines() {
        int numRows = DISPLAY_HEIGHT;
        int numCols = DISPLAY_WIDTH;

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (col % 8 == 1) {
                    simData[row][col - 1] = MAX_VALUE/2;
                    simData[row][col] = MAX_VALUE;
                    simData[row][col + 1] = MAX_VALUE/2;
                }
            }
        }
    }

    private void generateHorizontalLines() {
        int numRows = DISPLAY_HEIGHT;
        int numCols = DISPLAY_WIDTH;
    
        Random numberGenerator = new Random();
    
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (row % 8 == 1) {
                    simData[row - 1][col] = numberGenerator.nextInt(MAX_VALUE)/2;
                    simData[row][col] = numberGenerator.nextInt(MAX_VALUE);
                    simData[row + 1][col] = numberGenerator.nextInt(MAX_VALUE)/2;
                }
            }
        }
    }

    /* Interface methods */
    @Override
    public Color[] getColorPalette() {
        Color[] palette = new Color[MAX_VALUE];
        Random numberGenerator = new Random();
   
        for (int x = 0; x < palette.length; x++) {
            int red = numberGenerator.nextInt(256);
            int green = numberGenerator.nextInt(256);
            int blue = numberGenerator.nextInt(256);
            palette[x] = new Color(red,green,blue );
        }
   
        return palette;
    }

    @Override
    public int[][] getDataset() {
        
        return simData;
    }

    @Override
    public Dimension getDimensions() {
        
        return new Dimension(simData[0].length, simData.length);
    }


    /* Entry Point */
    public static void main(String[] args) {

        DataVisualizerDemo demo = new DataVisualizerDemo();
        Visualizer vis = new Visualizer(demo);
        vis.start();
    }
}
