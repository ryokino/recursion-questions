class Solution {
    public static String calculateLocation(double latitude, double longitude) {
        // 関数を完成させてください
        String result = "";

        if (latitude > 0) {
            result += "north/";
        } else if (latitude < 0) {
            result += "south/";
        } else {
            result += "equator/";
        }

        if (longitude > 0) {
            result += "east";
        } else if (longitude < 0) {
            result += "west";
        } else {
            result += "prime meridian";
        }

        return result;

    }
}
