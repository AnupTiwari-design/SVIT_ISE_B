package DSA;

public class Main {
    public static void main(String[] args) {
        String name = "Subash chandra bosh";
        String[] parts = name.split(" ");
        String result = "";

        
        for (int i = 0; i < parts.length - 1; i++) {
            result += Character.toUpperCase(parts[i].charAt(0)) + ".";
        }

        
        result += parts[parts.length - 1];

        System.out.println(result);  
    }
}