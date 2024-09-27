string[] input = Console.ReadLine().Split(' ');

int firstN = int.Parse(input[0]);
int secondN = int.Parse(input[1]);

if (firstN < secondN)
{
  firstN = firstN + secondN;
  secondN = firstN - secondN;
  firstN = firstN - secondN;
}

if ((firstN % secondN) == 0) Console.WriteLine("Sao Multiplos");
else Console.WriteLine("Nao sao Multiplos");
