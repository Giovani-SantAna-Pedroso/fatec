// See https://aka.ms/new-console-template for more information
// String[] MNK = Console.ReadLine().Split(' ');
//
// int sizeX = int.Parse(MNK[0]);
// int sizeY = int.Parse(MNK[1]);


int sizeX = 10;
int sizeY = 22;
int amountOfScanners = 2;
int[,] scanner = new int[2, 3]{
  {4, 6, 5},
  {6, 16, 5}
};


// int sizeX = 10;
// int sizeY = 10;
// int amountOfScanners = 2;
// int[,] scanner = new int[2, 3]{
//   {3, 7, 4},
//   {5, 4, 4}
// };


// int sizeX = 100;
// int sizeY = 100;
// int amountOfScanners = 3;
// int[,] scanner = new int[3, 3]{
//   {40, 50, 30},
//   {5, 90, 50},
//   {90, 10, 5}
// };

int[,] map = new int[sizeX, sizeY];


void PrintMap()
{
  for (int i = 0; i < sizeY; i++)
  {
    for (int j = 0; j < sizeX; j++)
    {
      Console.Write($"{map[j, i]} ");
    }
    Console.Write($"\n");
  }
}
void PlaceScanner(int posX, int posY, int sen)
{
  sen -= 1;

  int posXInit = posX - sen < 0 ? 0 : posX - sen;
  int posYInit = posY - sen < 0 ? 0 : posY - sen;

  int posXEnd = posX + sen + 1 < sizeX ? posX + sen + 1 : sizeX;
  int posYEnd = posY + sen + 1 < sizeY ? posY + sen + 1 : sizeY;

  for (int i = posXInit; i < posXEnd; i++)
  {
    for (int j = posYInit; j < posYEnd; j++) map[i, j] = 4;
  }

  map[posX, posY] = 5;
}



// -1 is the theaf
// -2 is the paint
// 1 is a tile with a scanner
// 5 is a scanner

for (int i = 0; i < amountOfScanners; i++)
{
  PlaceScanner(scanner[i, 0], scanner[i, 1], scanner[i, 2]);
}

void GetPaint()
{
  int currentDirection = 0;
  int[] currentPossiton = [0, 0];
  int[] nextPossiton = [0, 0];
  int[,] directions = new int[4, 2]
  {
            { 1, 1 },
            { 1, -1 },
            { -1, 1 },
            { -1, -1 }
  };

  void ChangeDirection()
  {
    currentDirection += 1;
    if (currentDirection == 4)
    {
      currentDirection = 0; // Reinicia para 0 se atingir 4
    }
  }

  while (map[nextPossiton[0], nextPossiton[0]] != 1 && currentPossiton != { 0,0}){

  }



}

map[0, 0] = 1;
map[sizeX - 1, sizeY - 1] = 2;

PrintMap();

