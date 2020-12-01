package com.epam.task.module5.basicsOfOOP.task1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import static com.epam.task.Utils.InputUtil.getInputString;

public class Main {
    public static final String PATH = "/home/dzmitry/IdeaProjects/epam/src/com/epam/task/module5/basicsOfOOP/task1/data/";

    public static void main(String[] args) throws IOException {
        File show = new File(PATH);
        System.out.println(Arrays.toString(show.list()));

        File file = new File(PATH + getInputString("Enter upper file or enter new: ") + ".txt");
        TextFile textFile = new TextFile();
        textFile.createFile(file);
        System.out.println(file.getCanonicalFile());

        textFile.readContentFile(file.getPath());
        textFile.addContentToFile(file.getPath(), getInputString("Add text: "));
        textFile.readContentFile(file.getPath());

        textFile.renameFile(file);
        System.out.println(Arrays.toString(show.list()));

        textFile.deleteFile(file);
        System.out.println(Arrays.toString(show.list()));
    }
}