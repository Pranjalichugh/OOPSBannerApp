import java.util.HashMap;
import java.util.Map;
public class UC08 {
    public static void main(String[] args) {
        Map<Character, String[]> patternMap = getCharacterPatternMap();
        String message = "OOPS";
        displayBanner(message, patternMap);
    }
    public static Map<Character, String[]> getCharacterPatternMap() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
        });

        map.put('P', new String[]{
            " ***** ",
            " *    *",
            " ***** ",
            " *     ",
            " *     "
        });

        map.put('S', new String[]{
            "  **** ",
            " *     ",
            "  ***  ",
            "     * ",
            " ****  "
        });

        return map;
    }
    public static void displayBanner(String message, Map<Character, String[]> patternMap) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : message.toUpperCase().toCharArray()) {
                if (patternMap.containsKey(c)) {
                    line.append(patternMap.get(c)[i]).append("  ");
                }
            }
            System.out.println(line.toString());
        }
    }
}