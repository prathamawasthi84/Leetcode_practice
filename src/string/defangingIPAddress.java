package string;

public class defangingIPAddress {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
    //time complexity of O(n)
}
