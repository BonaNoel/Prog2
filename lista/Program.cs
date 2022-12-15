using static System.Console;

namespace lista
{

    class Program
    {
        static void Main(string[] args)
        {


            List<string> words = new List<string>();
            words.Add("Hello");
            words.Add("World");
            words.Add("!");
            WriteLine(string.Join(", ", words));

            var nums = new List<int>() { 3,2,1 };

            WriteLine(string.Join(";", nums));


            // for (int i = 0; i < nums.Count; i++)
            // {
            //     WriteLine(nums[i]); 
            // }

            foreach (var i in nums)
            {
                WriteLine(i);
            }

        }
    }
}