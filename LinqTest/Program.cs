using System.Linq;

var nums = new List<int> { 1, 2, 5,8,9,1,3};

var even = nums.Where(n => n % 2 == 0).toList();

var doubl = nums.Select(n=>n*n).Where(x=>x<20).toList();

Console.WriteLine(string.Join(",", even));
Console.WriteLine(string.Join(",", doubl));