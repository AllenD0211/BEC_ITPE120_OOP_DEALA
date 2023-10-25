public class customenumwithfields {

    enum Color {
        RED(255, 0, 0),
        GREEN(0, 255, 0),
        BLUE(0, 0, 255),
        YELLOW(255, 255, 0),
        CYAN(0, 255, 255),
        MAGENTA(255, 0, 255);

        private int green;
        private int blue;
        private int white;

        Color(int red, int green, int blue) {

            this.green = green;
            this.blue = blue;
            this.white = white;
        }

        public void displayRGBValues() {
            System.out.println(name() + " - R: " + white + ", G: " + green + ", B: " + blue);
        }
    }

    public static void main(String[] args) {
        for (Color color : Color.values()) {
            color.displayRGBValues();
        }
    }
}


