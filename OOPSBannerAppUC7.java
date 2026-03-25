public class OOPSBannerAppUC7 {

    public static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() { return character; }
        public String[] getPattern() { return pattern; }
    }

    public static String[] getPatternForChar(CharacterPatternMap[] maps, char target) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == target) {
                return map.getPattern();
            }
        }
        return new String[]{"       ", "       ", "       ", "       ", "       ", "       ", "       "};
    }

    public static void main(String[] args) {
        String[] patternO = {
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
        };
        String[] patternP = {
            " ***** ",
            " *    *",
            " *    *",
            " ***** ",
            " *     ",
            " *     ",
            " *     "
        };
        String[] patternS = {
            "  **** ",
            " *     ",
            " *     ",
            "  ***  ",
            "     * ",
            "     * ",
            " ****  "
        };

        CharacterPatternMap[] charMaps = {
            new CharacterPatternMap('O', patternO),
            new CharacterPatternMap('P', patternP),
            new CharacterPatternMap('S', patternS)
        };

        String word = "OOPS";
        StringBuilder[] bannerLines = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        for (char c : word.toCharArray()) {
            String[] pattern = getPatternForChar(charMaps, c);
            for (int i = 0; i < 7; i++) {
                bannerLines[i].append(pattern[i]).append("  ");
            }
        }

        for (StringBuilder line : bannerLines) {
            System.out.println(line.toString());
        }
    }
}