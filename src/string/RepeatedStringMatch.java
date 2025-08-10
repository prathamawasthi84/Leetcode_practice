package string;

public class RepeatedStringMatch {
    public static int repeatedStringMatch(String a, String b){
        for(char ch : b.toCharArray()){
            if(a.indexOf(ch)==-1)
                return -1;
        }
        int count =0;
        StringBuilder s = new StringBuilder();
        while (s.length()<b.length()) {
                s.append(a);
                count++;
            }
        if(s.toString().length()>b.length()){return count;
        }
        if (s.toString().length()==b.length() && s.toString().contains(b)){return count;
        }
        s.append(a);
        count++;
        if(s.toString().contains(b))
            return count;
        s.append(a);
        count++;
        if(s.toString().contains(b))
            return count;
        return -1;
    }
    public static void main(String[] args) {
     String c ="abc";
     String d ="vxyz";
        System.out.println(repeatedStringMatch(c,d));
    }
}
