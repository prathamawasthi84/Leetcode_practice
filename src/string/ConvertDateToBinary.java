package string;

public class ConvertDateToBinary {
    public static String convertDateToBinary(String date) {
     String [] w = date.split("-");
     return Integer.toBinaryString(Integer.parseInt(w[0])) + "-" + Integer.toBinaryString(Integer.parseInt(w[1])) + "-" + Integer.toBinaryString(Integer.parseInt(w[2]));
    }

    public static void main(String[] args) {
     String f = "1900-01-01";
        System.out.println(convertDateToBinary(f));
    }
}
