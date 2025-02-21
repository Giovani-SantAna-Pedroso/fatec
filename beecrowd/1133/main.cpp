#include <iostream>
int main() {
  int y{0};
  int x{0};
  int tmp{0};

  int result{0};

  std::cin >> x >> y;
  // std::cin >> y;

  if (x < y) {
    tmp = y;
    y = x;
    x = tmp;
  }

  for (int i = y + 1; i <= x - 1; i++) {

    tmp = i % 5;
    if (tmp == 2 || tmp == 3)
      std::cout << i << '\n';
  }

  ;
}
