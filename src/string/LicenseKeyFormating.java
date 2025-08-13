package string;

public class LicenseKeyFormating {
    public static String licenseKeyFormatting(String s, int k){
      String w= s.replace("-","").toUpperCase();
      StringBuilder sb = new StringBuilder();
      int count=0;
      int i;
        for (i = w.length()-1; i >=0 ; i--) {
            sb = sb.append(w.charAt(i));
            count++;
            if (count == k && i!=0) {
                sb.append("-");
                count = 0;
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
String p = "5F3Z-2e-9-w";
int n = 4;
        System.out.println(licenseKeyFormatting(p,n));
    }
}
