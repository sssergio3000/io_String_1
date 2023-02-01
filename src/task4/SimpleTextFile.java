package task4;

import java.io.*;

public class SimpleTextFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\downloads\\cbs\\projects\\io_String\\src\\task4\\test3.txt");
        String str = "Создайте в package текстовый файл и клас, внесите в файл некий текст.\n";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file));
        osw.append(str);
        osw.append(str);
        osw.append(str);
        osw.append(str);
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
        System.out.println(isr.getEncoding());
        while (isr.ready()) {
            System.out.print((char) isr.read());
        }
        isr.close();
        RandomAccessFile raf = new RandomAccessFile("D:\\downloads\\cbs\\projects\\io_String\\src\\task4\\test3.txt", "r");


        System.out.println(raf.readLine());
        System.out.println(raf.readLine());
        System.out.println(raf.readLine());


    }
}
