class Main {
    public static void main(String[] args) {
        System.out.println(expandString("hey!", 4));
    }

    public static String expandString(String str, int multiplier) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < multiplier; j++) {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }
}
