namespace feladat1;
using System;
class Program
{
    static void Main(string[] args)
    {

        var lines = FileUtils.ReadLines("superhero.csv");
        List<SzuperHero> heroes = new List<SzuperHero>();

        foreach (var hero in lines)
        {
            var heroData = hero.Split(';');
            var name = heroData[0];
            var powers = new List<string>();
            for (int i = 1; i < heroData.Length; i++)
            {
                powers.Add(heroData[i].ToLower());
            }
            int power_number = heroData.Length - 1;
            heroes.Add(new SzuperHero(name, powers, power_number));

        }

        Console.Write("Képesség:  ");

        string input = Console.ReadLine().ToLower();


        List<SzuperHero> tmp = new List<SzuperHero>();

        foreach (var hos in heroes)
        {

            if (hos.powers.Contains(input))
            {
                tmp.Add(hos);
            }

        }

        List<SzuperHero> result = tmp.OrderBy(x => x.name).ToList();
        foreach (var item in result)
        {
            Console.WriteLine(item.ToString());
        }


    }
}
