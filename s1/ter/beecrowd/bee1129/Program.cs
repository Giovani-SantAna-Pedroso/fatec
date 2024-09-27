// See https://aka.ms/new-console-template for more information
using System.Linq;
int questionsToAns = int.Parse(Console.ReadLine());

while (questionsToAns != 0)
{
  const int sensibility = 128;
  string[] alternatives = { "A", "B", "C", "D", "E" };

  for (int i = 0; i < questionsToAns; i++)
  {
    string[] questions = Console.ReadLine().Split(' ');
    int[] valuesQuestions = new int[5];
    valuesQuestions[0] = int.Parse(questions[0]) / sensibility;
    valuesQuestions[1] = int.Parse(questions[1]) / sensibility;
    valuesQuestions[2] = int.Parse(questions[2]) / sensibility;
    valuesQuestions[3] = int.Parse(questions[3]) / sensibility;
    valuesQuestions[4] = int.Parse(questions[4]) / sensibility;

    int min = valuesQuestions.Min();
    int timesMinAppear = valuesQuestions.Count(x => x == min);
    if (timesMinAppear == 1) Console.WriteLine(alternatives[Array.IndexOf(valuesQuestions, min)]);
    else Console.WriteLine("*");
  }

  questionsToAns = int.Parse(Console.ReadLine());
}
