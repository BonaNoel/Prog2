namespace feladat4;
class Program
{
    static void Main(string[] args)
    {
        var lines = FileUtils.ReadLines("primes.php");
        lines.RemoveAt(lines.Count - 1);
        lines.RemoveAt(0);

        var Palindrome_primes = new List<int>();

        foreach (var line in lines)
        {
            var data = line.Split(null);
            string tmp = data[4].Remove(data[4].Length - 1);
            int number = int.Parse(tmp);
            if (IsPalindrome(number))
            {
                Palindrome_primes.Add(number);
            }
        }

        foreach (var item in Palindrome_primes)
        {
            Console.WriteLine(item);
        }
    }

    static bool IsPalindrome(int number)
    {
        int reverse = 0;
        int tmp = number;
        while (tmp != 0)
        {
            reverse = reverse * 10 + tmp % 10;
            tmp /= 10;
        }
        return number == reverse;
    }

}
