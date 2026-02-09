public class Coordinates {
    public static void main(String[] args) {
        String coordinates = "(30.55, 40.1)";

        int comma = coordinates.indexOf(',');
        int space = coordinates.indexOf(' ');

        String x_coords_str = coordinates.substring(1, comma);
        String y_coords_str = coordinates.substring(space + 1, coordinates.length() - 1);

        System.out.println("X: " + x_coords_str + " | Y: " + y_coords_str + "\n");

        double x_coords = Double.parseDouble(x_coords_str);
        int y_coords = (int)Math.round(Double.parseDouble(y_coords_str));

        System.out.printf("X: %.1f | Y: %d", x_coords, y_coords);
    }
}
