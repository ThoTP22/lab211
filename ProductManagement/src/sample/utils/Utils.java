
package sample.utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Utils {

    public static String getString(String welcome) {
        boolean check = true;
        String result = "";
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print(welcome);
            result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.println("Input text!!!");
            } else {
                check = false;
            }
        } while (check);
        return result;
    }
     public static String getStringPattern(String welcome, String pattern) {
        boolean isValidInput = false;
        String result = "";

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print(welcome);
            result = scanner.nextLine();

            if (result.isEmpty()) {
                System.out.println("Please enter a non-empty text!");
            } else {
                // Validate against the specified pattern
                Pattern regexPattern = Pattern.compile(pattern);
                Matcher matcher = regexPattern.matcher(result);
                if (matcher.matches()) {
                    isValidInput = true;
                } else {
                    System.out.println("Input does not match the specified pattern.");
                }
            }
        } while (!isValidInput);

        return result;
    }

    public static String getString(String welcome, String oldData) {
        String result = oldData;
        Scanner sc = new Scanner(System.in);
        System.out.print(welcome);
        String tmp = sc.nextLine();
        if (!tmp.isEmpty()) {
            result = tmp;
        }
        return result;
    }
     public static String getStringPatternUD(String welcome, String oldData, String pattern) {
        String result = oldData;
        Scanner sc = new Scanner(System.in);
        System.out.print(welcome);
        String tmp = sc.nextLine();
        if (!tmp.isEmpty()) {
            // Validate against the specified pattern
            Pattern regexPattern = Pattern.compile(pattern);
            Matcher matcher = regexPattern.matcher(tmp);
            if (matcher.matches()) {
                result = tmp;
            } else {
                System.out.println("Input does not match "+"("+welcome+")");
            }
        }
        return result;
    }

    public static int getInt(String welcome, int min, int max) {
        boolean check = true;
        int number = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                number = Integer.parseInt(sc.nextLine());
                check = false;
            } catch (Exception e) {
                System.out.println("Input number!!!");
            }
        } while (check || number > max || number < min);
        return number;
    }

    public static int getInt(String welcome, int min, int max, int oldData) {
        boolean check = true;
        int number = oldData;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                String tmp = sc.nextLine();
                if (tmp.isEmpty()) {
                    check = false;
                } else {
                    number = Integer.parseInt(tmp);
                    check = false;
                }
            } catch (Exception e) {
                System.out.println("Input number!!!");
            }
        } while (check || number > max || number < min);
        return number;
    }

    public static boolean confirmYesNo(String welcome) {
        boolean result = false;
        String confirm = Utils.getString(welcome);
        if ("Y".equalsIgnoreCase(confirm)) {
            result = true;
        }
        return result;
    }
}
