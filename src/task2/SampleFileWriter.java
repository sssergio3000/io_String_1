package task2;

import java.io.*;
import java.util.Scanner;

public class SampleFileWriter {
    public static void main(String[] args) throws IOException {
//option 1
        try {
            RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
            raf.writeUTF("This is my first \n string output to file");
            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            RandomAccessFile raf1 = new RandomAccessFile("test.txt", "r");
            String str = raf1.readLine();
            System.out.println(str);
            str = raf1.readLine();
            System.out.println(str);
            raf1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//option 2
        BufferedWriter bufWr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test1.txt")));
        BufferedReader bufRd = new BufferedReader(new InputStreamReader(new FileInputStream("test1.txt")));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scan.nextLine() + "\n";
        bufWr.write(str);
        System.out.println("Enter string: ");
        str = scan.nextLine();
        bufWr.write(str);
        bufWr.close();
        bufRd.close();
        System.out.println(bufRd.readLine());
        System.out.println(bufRd.readLine());
        System.out.println(bufRd.readLine());


    }


}
