import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Homework {


    public static void main(String[] args) throws IOException {
        System.out.println(buldString(10, 'a', 'b'));

        Path of = Path.of( "src", "main", "java", "sem2", "file.txt");
        try{
            Files.createFile(of);
        }catch (Exception e){
            System.out.println( "файл уже есть");
        }
        Files.writeString(of, str(100, "TEXT "));

    }

    // 1. Дано четное число N (>0) и символы c1 и c2.
    // Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
    static String buldString(int n, char c1, char c2){
        String res = "";
        for(int i = 0; i < n / 2; i++){
            res += c1;
            res += c2;
        }
        return res;

    }

    // 2. Создать файл с названием file.txt. Если файл уже есть, то создавать не надо Записать в него Слово "TEXT" 100 раз
    static String str(int n, String text){
        String res = "";
        for(int i = 0; i < n; i++){
            res += text;
        }
        return res;
    }

}
