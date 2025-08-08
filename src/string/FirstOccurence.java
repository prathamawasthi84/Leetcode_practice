package string;

public class FirstOccurence {
    public static int strStr(String haystack, String needle){
        if (haystack.equals(haystack.toLowerCase()) && needle.equals(needle.toLowerCase())){
        if(haystack.contains(needle)){
            int index = haystack.indexOf(needle);
            return index;
        }
        }
        return -1;
    }
    public static void main(String[] args) {
     String hay = "dad";
     String ned = "sad";
        System.out.println(strStr(hay,ned));
    }
}
