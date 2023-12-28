import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
        public static void main(String[] args) {
            System.out.println("Nhập đường dẫn file: ");
            Scanner scanner = new Scanner(System.in);
            String path = scanner.nextLine();

            ReadFileExample readfileEx = new ReadFileExample();
            readfileEx.readFileText(path);
        }

    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            int sum = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line) ;
            }
            reader.close();
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}

