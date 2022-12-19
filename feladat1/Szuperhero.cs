
namespace feladat1;

public class SzuperHero
{
    public string name;
    public List<string> powers;
    public int power_number;

    public SzuperHero(string name, List<string> powers, int power_number)
    {
        this.name = name;
        this.powers = powers;
        this.power_number = power_number;
    }


    public override string ToString()
    {
        string result = string.Format("{0} ({1})", name, power_number);
        return result;
    }
}