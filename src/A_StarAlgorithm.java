import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class A_StarAlgorithm {


    public static void main(String[] args) throws InvalidLetterException, FileNotFoundException, IOException, HeapException {

        String name = "input_files/small.txt";
        if (name.length() >= 999) {
            System.out.println("Usage: java A_StarAlgorithm " + name);
        } else {
            String filename = name;

            InputHandler handler = new InputHandler();
            SquareGraph graph = handler.readMap(filename);

            ArrayList<Node> path = graph.executeAStar();

            if (path == null) {
                System.out.println("There is no path to target");
            } else {

                graph.printPath(path);
                System.out.println("The total number of moves from distance to the target are : " + path.size());
            }
        }
    }
}




