#include <iostream>
int main() {
  int goalsInter{0};
  int goalsGremio{0};

  int timesInterWon{0};
  int timesGremioWon{0};
  int draws{0};
  int goalsDifference{0};
  int totalGrenais{0};

  // if 1 yes, if 2 not
  int isToContinue{0};

  while (true) {
    std::cin >> goalsInter >> goalsGremio;

    goalsDifference = goalsInter - goalsGremio;
    if (goalsDifference > 0)
      timesInterWon++;
    else if (goalsDifference < 0)
      timesGremioWon++;
    else
      draws++;

    totalGrenais++;

    std::cout << "Novo grenal (1-sim 2-nao)\n";
    std::cin >> isToContinue;
    if (isToContinue == 2)
      break;
  }

  std::cout << totalGrenais << " grenais" << '\n';
  std::cout << "Inter:" << timesInterWon << '\n';
  std::cout << "Gremio:" << timesGremioWon << '\n';
  std::cout << "Empates:" << draws << '\n';

  if (timesInterWon > timesGremioWon) {
    std::cout << "Inter venceu mais\n";
  } else if (timesInterWon < timesGremioWon) {
    std::cout << "Gremio venceu mais\n";
  } else {
    std::cout << "Não houve vencedor\n";
  }
}
