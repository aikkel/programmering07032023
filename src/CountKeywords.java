import java.util.*;
import java.io.*;

public class CountKeywords {
public static void main(String[] args) throws Exception {
Scanner input = new Scanner(System.in);
System.out.print("Enter a Java source file: ");
String filename = input.nextLine();

File file = new File(filename);
if (file.exists()) {
System.out.println("The number of keywords in " + filename
                    13 + " is " + countKeywords(file));
}
else {
System.out.println("File " + filename + " does not exist");
}
}
 public static int countKeywords(File file) throws Exception {
        21 // Array of all Java keywords + true, false and null
        22 String[] keywordString = {"abstract", "assert", "boolean",
                23 "break", "byte", "case", "catch", "char", "class", "const",
                24 "continue", "default", "do", "double", "else", "enum",
                25 "extends", "for", "final", "finally", "float", "goto",
                26 "if", "implements", "import", "instanceof", "int",
                27 "interface", "long", "native", "new", "package", "private",
                28 "protected", "public", "return", "short", "static",
                29 "strictfp", "super", "switch", "synchronized", "this",
                30 "throw", "throws", "transient", "try", "void", "volatile",
                31 "while", "true", "false", "null"};
        32
        33 Set<String> keywordSet =
                34 new HashSet<>(Arrays.asList(keywordString));
        35 int count = 0;
        36
        37 Scanner input = new Scanner(file);
        38
        39 while (input.hasNext()) {
            40 String word = input.next();
            41 if (keywordSet.contains(word))
                42 count++;
            43 }
        44
        45 return count;
        46 }
47 }