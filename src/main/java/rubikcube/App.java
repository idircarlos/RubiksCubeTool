package rubikcube;

public class App {
    public static void main (String [] args) {

        RubikCube cube = new RubikCube(6);
        cube.print();
        cube.performAlgorithm("B2 D U B2 L' U L' R B2 R' B' L R' B2 D2 U B U R2 F2 D B' D2 U2 B F2 L' F2 U2 L2");
        cube.print();
    }
    
}
