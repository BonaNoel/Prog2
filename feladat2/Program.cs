namespace feladat2;
class Program
{
    static void Main(string[] args)
    {
        var lines = FileUtils.ReadLines("superhero.csv");
        int counter = 0;
        List<string> powers = new List<string>();


        foreach (var line in lines)
        {
            var data = line.Split(';');
            for (int i = 1; i < data.Length; i++)
            {
                if (powers.Contains(data[i]))
                {
                    continue;
                }
                else
                {
                    powers.Add(data[i]);
                    counter++;
                }

            }

        }

        Console.WriteLine(counter);


    }

}
