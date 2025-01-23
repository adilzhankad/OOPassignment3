package inter_face;

import java.io.File;
import java.io.IOException;

public class gg {
    public static void main(String[] args) {
        // Указываем путь к директории, где будут созданы файлы
        String directoryPath = "./inter_face";

        // Создаем директорию, если она не существует
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            if (directory.mkdirs()) {
                System.out.println("Директория создана: " + directoryPath);
            } else {
                System.out.println("Не удалось создать директорию: " + directoryPath);
                return;
            }
        }

        // Создаем файлы task1.txt, task2.txt ... task18.txt
        for (int i = 1; i <= 18; i++) {
            String fileName = "task" + i + ".java";
            File file = new File(directoryPath + File.separator + fileName);
            try {
                if (file.createNewFile()) {
                    System.out.println("Файл создан: " + file.getAbsolutePath());
                } else {
                    System.out.println("Файл уже существует: " + file.getAbsolutePath());
                }
            } catch (IOException e) {
                System.out.println("Ошибка при создании файла: " + fileName);
                e.printStackTrace();
            }
        }
    }
}
