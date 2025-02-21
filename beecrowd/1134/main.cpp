#include <iostream>
int main() {

  int alcohol{0};
  int disel{0};
  int gas{0};
  int tmp{0};

  for (;;) {
    std::cin >> tmp;
    if (tmp == 1)
      alcohol++;
    else if (2 == tmp)
      gas++;
    else if (3 == tmp)
      disel++;
    else if (tmp == 4)
      break;
    ;
  }

  std::cout << "MUITO OBRIGADO" << '\n';
  std::cout << "Alcool: " << alcohol << '\n';
  std::cout << "Gasolina: " << gas << '\n';
  std::cout << "Diesel: " << disel << '\n';
}
