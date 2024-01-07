package rubikcube;

public final class RubikColor {
    public static final String ANSI_FG_RED = "\u001B[31m";
    public static final String ANSI_BG_RED = "\u001B[41m";
    public static final String ANSI_FG_GREEN = "\u001B[32m";
    public static final String ANSI_BG_GREEN = "\u001B[42m";
    public static final String ANSI_FG_YELLOW = "\u001B[33m";
    public static final String ANSI_BG_YELLOW = "\u001B[43m";
    public static final String ANSI_FG_BLUE = "\u001B[34m";
    public static final String ANSI_BG_BLUE = "\u001B[44m";
    public static final String ANSI_FG_WHITE = "\u001B[37m";
    public static final String ANSI_BG_WHITE = "\u001B[47m";
    public static final String ANSI_FG_ORANGE = "\u001b[38;2;219;96;35m";
    public static final String ANSI_BG_ORANGE = "\u001b[48;2;219;96;35m";
    public static final String ANSI_RESET = "\u001B[0m";

    private RubikColor() {}

    public static String drawCell(int[] colorIds) {
        int id = -1;
        String row = "";
        for (int i = 0; i < colorIds.length; i++) {
            id = colorIds[i];
            switch(id) {
                case 1: row += ANSI_BG_RED + " " + id + " " + ANSI_RESET; break;
                case 2: row += ANSI_BG_BLUE + " " + id + " " + ANSI_RESET; break;
                case 3: row += ANSI_BG_ORANGE + " " + id + " " + ANSI_RESET; break;
                case 4: row += ANSI_BG_GREEN + " " + id + " " + ANSI_RESET; break;
                case 5: row += ANSI_BG_WHITE + " " + id + " " + ANSI_RESET; break;
                case 6: row += ANSI_BG_YELLOW + " " + id + " " + ANSI_RESET; break;
                default: throw new RuntimeException("Color id: " + id + " not valid. Must be between 1-6");
            }
        }
        return row;
    }
}
