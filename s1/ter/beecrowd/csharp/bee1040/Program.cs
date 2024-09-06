// See https://aka.ms/new-console-template for more information
string numbers = Console.ReadLine();
string[] numbersArr = numbers.Split(' ');

float n1 = float.Parse(numbersArr[0]);
float n2 = float.Parse(numbersArr[1]);
float n3 = float.Parse(numbersArr[2]);
float n4 = float.Parse(numbersArr[3]);

float averge = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
Console.WriteLine($"Media: {averge:F1}");

if (averge >= 7.0) Console.WriteLine("Aluno aprovado.");
else if (averge < 5.0) Console.WriteLine("Aluno reprovado.");
else
{
  Console.WriteLine("Aluno em exame.");
  float gradeRecoverExam = float.Parse(Console.ReadLine());
  Console.WriteLine($"Nota do exame: {gradeRecoverExam:F1}");

  float finalAverge = (averge + gradeRecoverExam) / 2;

  if (finalAverge >= 5.0) Console.WriteLine("Aluno aprovado.");
  else Console.WriteLine("Aluno reprovado.");

  Console.WriteLine($"Media final: {finalAverge:F1}");

}
