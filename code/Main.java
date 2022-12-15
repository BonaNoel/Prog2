import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        if (args.length != 1 || !(Utils.isValid(args[0]))) {
            System.err.println("Error: give a path to an existing directory");
            System.exit(1);
        }

        Path startDirPath = Paths.get(args[0]);

        // debug mode
        // Path startDirPath = Paths.get("/home/noel/prog2/project/images/");

        //////////////////////// mappa elérési utak
        List<Path> directoryPaths = new ArrayList<>();

        try {
            directoryPaths = Findpath.listDirectoryPathsRecursive(startDirPath);
        } catch (IOException e) {
            System.err.println("Error while reading directories");
            System.exit(1);
        }

        for (Path tmPath : directoryPaths) {
            System.out.println("Feldolgozás alatth.getParent();: " + tmPath.toString());
        }


        ///////////////////////// Image.html megcsinálja

        for (Path path : directoryPaths) {
            try {
                HTMLcreator.createImageFile(path, startDirPath);
            } catch (IOException e) {
                System.err.println("Error while creating Image.html files");
                System.exit(1);
            }    
        }

        ///////////////////////// Index.html megcsinálja
        for (Path path : directoryPaths) {
            try {
                HTMLcreator.createIndexFile(path, startDirPath);
            } catch (IOException e) {
                System.err.println("Error while creating Index.html files");
                System.exit(1);
            }
        }
    


    }

}
