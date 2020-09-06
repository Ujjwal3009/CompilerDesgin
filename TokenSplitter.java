package LexicalAnalyzer;

import java.util.Scanner;

public class TokenSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Lines");
        String[] input = new String[sc.nextInt()];
        sc.nextLine();
        String con = " ";
        System.out.println("Enter your Program : ");
        for(int i = 0; i<input.length; i++){
            input[i] = sc.nextLine();
            con  = con.concat(input[i] + " ");

        }
        System.out.println("\n input lines are : ");
        String output[] = con.split(" ");

        for(String output1:output)
        {
            System.out.println(" " + output1);
        }
        System.out.println("");
        int id= 0;
        int token = 0;
        for(int i = 0; i<output.length; i++) {
            if (null != output[i]){
                switch (output[i]){
                    case "String":
                    case "int":
                    case "float":
                    case "double":
                    case "boolean":
                        token++;
                        System.out.println("< DataType, "+output[i] + ">");
                        break;
                    case "if":
                    case "ifelse":
                    case "else":
                        token++;
                        System.out.println("< CodintitonalStatement, "+ output[i] + ">");
                        break;
                    case ";":
                        token++;
                        System.out.println("< EndofLine ,"+ output[i] + ">");
                        break;
                }

            }
        }


    }
}
