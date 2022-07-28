package com.syntax.class025;

public class Task1 {
/*
Create a class File that will have the following behaviors:
open, edit, close. Edit and close are implemented method while open is an abstract.
 Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
  Example: to open .java file we need notepad++ or sublime text, to open .doc file
  we need Microsoft Word to be installed etc
 */
public static void main(String[] args) {


    File[] files = {new JavaFile("Katarina"), new PdfFile("Nemanja"), new WordFile("Loki")}; // we cannot create new File() because it's abstract
         for (File file : files) { //File is datatype file is name of element
              file.open();
          }
    System.out.println("--------------------------------------------------------------------");
        for(int i=0; i< files.length; i++){
            files[i].open();
        }

        // new JavaFile().open()
    // JavaFile javaFile=new JavaFile()
        // new PdfFile().open()
        // new WordFile().open()
    // we would have to write the code this way if we didn't use for loop
}
}

// in abstract classes we can have everything the same as in regular class, the only thing different is we can't create objects of abstract classes
abstract class File{
    private String name;
    File(String name){
this.name=name;
    }
    abstract void open();
    void edit(){
        System.out.println("Editing the file");
    }
    void close(){
        System.out.println("Closing the file");
    }
}

class JavaFile extends File{

    JavaFile(String name) {
        super(name);
    }

    void open(){
        System.out.println("We need Intellij to open .java files");
    }

}

class WordFile extends File{

    WordFile(String name) {
        super(name);
    }

    @Override
    void open() {
        System.out.println("Use Microsoft word to open Word file");
    }
}

class PdfFile extends File{

    PdfFile(String name) {
        super(name);
    }

    @Override
    void open() {
        System.out.println("Use Adobe reader to open PDF file");
    }
}