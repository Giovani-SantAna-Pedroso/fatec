lines = ["2200", "1020", "2022", "2002"];

for (let i = 0; ; i++) {
  if (lines[i] != "2002") console.log("Senha Invalida");
  else {
    console.log("Acesso Permitido");
    break;
  }
}
