namespace feladat3;

public static class FileUtils
{
    public static List<string> ReadLines(string fileName)
    {
        var result = new List<string>();

        try
        {
            using (var reader = new StreamReader(fileName))
            {
                while (!reader.EndOfStream)
                {
                    var line = reader.ReadLine();
                    result.Add(line);
                }

            }
        }
        catch (FileNotFoundException)
        {
            Console.WriteLine("File not found: " + fileName);
        }
        catch (IOException)
        {
            Console.WriteLine("Error reading file: " + fileName);
        }

        return result;

    }

    public static void WriteLines(string fileName, List<string> data)
    {
        try
        {
            using (var writer = new StreamWriter(fileName))
            {
                foreach (var line in data)
                {
                    writer.WriteLine(line);
                }
            }
        }
        catch (IOException)
        {
            Console.WriteLine("Error writing file: " + fileName);
        }
    }

}