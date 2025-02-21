const lines = ["11"];
const DDDs = {
  61: "Brasilia",
  71: "Salvador",
  11: "Sao Paulo",
  21: "Rio de Janeiro",
  32: "Juiz de Fora",
  19: "Campinas",
  27: "Vitoria",
  31: "Belo Horizonte",
};

if (DDDs[lines[0]]) console.log(DDDs[lines[0]]);
else console.log("DDD nao cadastrado");
