package com.kunal.access;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IntroductionTwo {
    public static void main(String[]args) throws IOException {
        FileReader input1 = new FileReader("input.txt");

// Option 2: Use File object to pass file info to FileReader
// Save file path that has been passed in by the user into a string variable.
//        String fileName = args[0];
//// Pass path to File object
//        File inputFile = new File(fileName);
//// Pass File object to FileReader
//        FileReader input2 = new FileReader(inputFile);

        FileReader obj = new FileReader("input.txt");

        int countVar = 0;
        while((countVar=obj.read())!=-1){
            System.out.println((char)countVar);
        }

    }
}
