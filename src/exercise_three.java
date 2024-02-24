import java.io.File;

public class exercise_three {
    public static void main(String[] args)  {
        showFiles();
    }

    private static void showFiles() {
        File directory = new File("/Users/jiebinzhou/Desktop/math");
        File[] files = directory.listFiles();
        for (File file : files){
            if(file.isDirectory()){
                System.out.println("Directory: "+ file.getName());
            }else {
                System.out.println("File: "+ file.getName());
            }
        }
    }
}
