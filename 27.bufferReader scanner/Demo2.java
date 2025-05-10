//  finally block use ! 

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Demo2 {
    public static void main(String a[]) throws NumberFormatException, IOException {
        int num = 0;
    

        //  1 -------------------
            // BufferedReader br = null;
        // try {
        //     System.out.println("Enter number: "); // Prompt the user for input

        //     //concise
        //     br = new BufferedReader(new InputStreamReader(System.in));
        //     num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
        // } finally {
        //     br.close();
        // }


        // OR 2  --- concise -- no need to close ..as it is auto closable (see definition bufferReader extneds to->reader->closable->autoclosable)
        // any clss /interface which is autoclosable ..
        // is closed automatically by try...thus avoiding finally 
        
        try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter number: ");
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
         }
    }
}



//use of finally block :
// Closing files

// Releasing resources (Scanner, BufferedReader, DB connection, etc.)

// Cleaning up memory or states