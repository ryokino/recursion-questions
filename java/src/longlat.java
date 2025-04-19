// class Solution {
//     public static String calculateLocation(double latitude, double longitude) {
//         // 関数を完成させてください
//         String result = "";

//         if (latitude > 0) {
//             result += "north/";
//         } else if (latitude < 0) {
//             result += "south/";
//         } else {
//             result += "equator/";
//         }

//         if (longitude > 0) {
//             result += "east";
//         } else if (longitude < 0) {
//             result += "west";
//         } else {
//             result += "prime meridian";
//         }

//         return result;

//     }
// }

// code in solution

class Main {

    public static String isNorthOrSouth(double latitude) {
        if (latitude > 0) {
            return "north";
        } else if (latitude < 0) {
            return "south";
        } else {
            return "equator";
        }
    }

    public static String isEastOrWest(double longitude) {
        if (longitude > 0) {
            return "east";
        } else if (longitude < 0) {
            return "west";
        } else {
            return "prime meridian";
        }
    }

    public static String calculateLocation(double latitude, double longitude) {
        String latPosition = isNorthOrSouth(latitude);
        String longPosition = isEastOrWest(longitude);
        return latPosition + "/" + longPosition;
    }

    public static void main(String[] args) {
        System.out.println(calculateLocation(77.147489, 0));
        System.out.println(calculateLocation(-55.78774, 0));
        System.out.println(calculateLocation(-36.615626, 68.130625));
        System.out.println(calculateLocation(9.236204, -25.806614));
        System.out.println(calculateLocation(-29.998979, -19.74947));
        System.out.println(calculateLocation(0, 0));
    }
}