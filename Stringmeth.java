public class Stringmeth {
    public static void main(String [] args){
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String abc = "programming";
        StringBuilder def = new StringBuilder("JAVA");
        def.append(abc);
        System.out.println(def);
//        String abc = "abcdefghijklmnopqrstuvwxyz";
//        String def = "0123456789";
        String rev = " ";
        int length = txt.length();
        for (int i = length-1; i >= 0; i--){
            rev = rev + txt.charAt(i);
        }
        System.out.println(rev);
//        System.out.println("Length of String is: " + txt.length());
//        System.out.println(txt.toLowerCase());
//        System.out.println(abc.toUpperCase());
//        System.out.println(txt + " " + abc + " " + def);
//        System.out.println(txt.replace('A', 'B'));
//        System.out.println(txt.charAt(8));
    }
}
