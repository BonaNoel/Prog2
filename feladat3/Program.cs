namespace feladat3;
class Program
{
    static void Main(string[] args)
    {
        var lines = FileUtils.ReadLines("input.txt");
        int vizszintes = 0;
        int melyseg = 0;

        foreach (var line in lines)
        {
            var data = line.Split(null);
            if (data[0].Equals("forward"))
            {
                vizszintes += int.Parse(data[1]);
            }
            else if (data[0].Equals("down"))
            {
                melyseg += int.Parse(data[1]);
            }
            else if (data[0].Equals("up"))
            {
                melyseg -= int.Parse(data[1]);
            }
        }

        Console.WriteLine("vízszintes pozíció: " + vizszintes);
        Console.WriteLine("mélység: " + melyseg);
        Console.WriteLine("---");
        int result = vizszintes * melyseg;
        Console.WriteLine("végeredmény: " + result);
    }
}
