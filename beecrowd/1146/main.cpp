#include <iostream>
int main() {
  int maxNum{1};

  while (true) {

    std::cin >> maxNum;
    if (maxNum == 0)
      break;

    for (int i = 1; i < maxNum; i++)
      std::cout << i << ' ';

    std::cout << maxNum << '\n';
  }
}
