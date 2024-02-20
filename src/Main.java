import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args) {
        System.out.println("cat".matches("\\w+")); // 1 or more chars
        System.out.println("Cat".matches("\\w*")); // 0 or more chars

        System.out.println("cat".matches("[Cc]at"));
        System.out.println("Cat".matches("[Cc]at"));

        System.out.println("bat".matches("[cCbB]at"));
        System.out.println("fat".matches("[a-f]at"));
        System.out.println("gat".matches("[a-f]at")); //false

        System.out.println("Cat".matches("[^c]at")); // not a low case c - true
        System.out.println("cat".matches("[^c]at")); // not a low case c - false

        System.out.println("Lat".matches("\\wat"));
        System.out.println("Ladfadsat".matches("\\w+at"));

        System.out.println("G__T".matches("\\w+")); // words, letters, numbers, underscores
        System.out.println("G--T".matches("\\w+")); // no match for word character

        System.out.println("123".matches("\\d\\d\\d")); //numbers

        System.out.println("123.345.6754".matches("(\\d{3}[.\\-\\s]?){2}\\d{3,4}"));
        System.out.println("".matches("[1]?")); // ? optional operator


        String regex = "(1[-.,\\s]?)?(\\d{3}[-.,\\s]?){1,2}\\d{4}";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher("1.123.345.2343");
        if(mat.find()){
            System.out.println("Matches");
        }
    }
}