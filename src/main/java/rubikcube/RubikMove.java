package rubikcube;

public class RubikMove {
    public static final String R = "R";
    public static final String R_PRIME = "R'";
    public static final String L = "L";
    public static final String L_PRIME = "L'";
    public static final String U = "U";
    public static final String U_PRIME = "U'";
    public static final String F = "F";
    public static final String F_PRIME = "F'";
    public static final String D = "D";
    public static final String D_PRIME = "D'";
    public static final String B = "B";
    public static final String B_PRIME = "B'";
    public static final String M = "M";
    public static final String M_PRIME = "M'";

    public static final String X = "x";
    public static final String X_PRIME = "x'";
    public static final String Y = "y";
    public static final String Y_PRIME = "y'";
    public static final String Z = "z";
    public static final String Z_PRIME = "z'";
    
    public static final String R_SMALL_1 = "r";
    public static final String R_SMALL_PRIME_1 = "r'";
    public static final String L_SMALL_1 = "l";
    public static final String L_SMALL_PRIME_1 = "l'";

    // returns true if the move is double. e.g: U2 -> true; F -> false
    public static boolean isTwoMove(String move) {
        return move.contains("2");
    }

    public static String cleanIfTwo(String move) {
        return move.replace("2", "");
    }
}
