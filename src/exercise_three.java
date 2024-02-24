import java.io.File;

public class exercise_three {
    public static void main(String[] args)  {
        showFiles();
    }

    private static void showFiles() {
        //define a new file directory and path
        File directory = new File("/Users/jiebinzhou/Desktop/math");
        //list all the files in that directory
        File[] files = directory.listFiles();
        //read all the file with that path provided
        for (File file : files){
            if(file.isDirectory()){
                System.out.println("Directory: "+ file.getName());
            }else {
                System.out.println("File: "+ file.getName());
            }
        }
    }
}
