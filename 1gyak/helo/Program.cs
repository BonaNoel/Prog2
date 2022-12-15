using System;
using static System.Console;
using System.Linq;
using System.Collections;
using System.Collections.Generic;

namespace Example
{
    public class Program
    {

        public static void Main(string[] args)
        {
            // WriteLine(Duplaz(4));
            // Write("Neved: ");
            // string nev = Input("Neved: ");
            // WriteLine("Hello " + nev + "!");

            // var x = "Batman";

            // WriteLine(x[0..3]);
            // WriteLine(x[..3]);
            // WriteLine(x[3..6]);
            // WriteLine(x[^3..6]);
            // WriteLine(x[1 ..^1]);



            var path = @"C:\Users\Public\Documents\Example.txt";
            WriteLine(path);

        }

        // public static string Input(string prompt)
        // {
        //     Write(prompt);
        //     return ReadLine();
        // }
        static int Duplaz(int a)
        {
            return a * 2;
        }

    }
}