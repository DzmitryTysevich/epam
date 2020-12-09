package com.epam.task.module5.basicsOfOOP.task1;

import com.epam.task.Utils.InputUtil;

import java.io.*;

import static com.epam.task.Utils.InputUtil.getInputValue;

public class TextFile {
    public void createFile(File file) {
        int num = getInputValue("Create file? Enter 1 if <yes> or 2 if <no>: ");
        try {
            switch (num) {
                case 1:
                    file.createNewFile();
                    break;
                case 2:
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void renameFile(File file) {
        int num = getInputValue("Rename file? Enter 1 if <yes> or 2 if <no>: ");
        switch (num) {
            case 1:
                String newName = InputUtil.getInputString("Enter new name: ") + ".txt";
                file.renameTo(new File(file.getParentFile() + "/" + newName));
                break;
            case 2:
                break;
        }
    }

    public void readContentFile(String path) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            assert bufferedReader != null;
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void addContentToFile(String path, String string) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            bufferedWriter.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void deleteFile(File file) {
        int num = getInputValue("Delete file? Enter 1 if <yes> or 2 if <no>: ");
        switch (num) {
            case 1:
                file.delete();
                break;
            case 2:
                break;
        }
    }
}