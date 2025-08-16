package string;

public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        String[] w = stones.split("");
        if (stones.contains(jewels)) {
            for (int i = 0; i < w.length; i++) {
             if(w[i].equals(jewels.charAt(i))){
                 count++;
             }
            }
        }
        return count;
    }

    public static void main(String[] args) {
     String j = "aA";
     String s = "aAAbbbb";
        System.out.println(numJewelsInStones(j,s));
    }
}
