using System;

namespace CSHARP
{
    class Program
    {
        static void Main(string[] args)
        {


            //DATA TYPES
            string text = "here is a smaple text";
            char grade = 'A';
            int sampleNum = 30;
            //bool isMale = True;
            //float n = 2.0;
            //decimal currency = 30.05;



            //DRAWING A SHAPE
            Console.WriteLine("   /|");
            Console.WriteLine("  / |");
            Console.WriteLine(" /  | ");
            Console.WriteLine("/___| ");



            //WORKING WITH STRING
            Console.WriteLine("Enter your name: ");
            String name = Console.ReadLine();

            Console.WriteLine("Enter your Age: ");
            String age = Console.ReadLine();

            Console.WriteLine("Hello " + name + ". you are " + age + " years old.");
        }
    }
}
