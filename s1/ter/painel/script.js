const URL_MAIN = "https://api.openweathermap.org/data/2.5/weather";
const API_KEY = "8f57cb746c4c1d4b48b7f35eba6f6230";
const UNITS = "metric";

navigator.geolocation.getCurrentPosition(loadUrl);

window.onload = function () {
  const usuarioAutenticado = localStorage.getItem("usuarioAutenticado");

  if (usuarioAutenticado !== "true") {
    window.location.href = "geracao_senhas.html";
  }
};

function fazerLogin() {
  const login = document.getElementById("login").value;
  const senha = document.getElementById("senha").value;
  const erroLogin = document.getElementById("erroLogin");

  if (window.painel && !painel.closed) {
    return;
  }

  if (window.chamar_senhas && !chamar_senhas.closed) {
    return;
  }

  if (login === "garotosdeprograma" && senha === "algoamais") {
    localStorage.setItem("usuarioAutenticado", "true");
    window.painel = window.open("painel.html", "_blank");
    window.chamar_senhas = window.open("chamar_senhas.html", "_blank");
  } else {
    erroLogin.style.display = "block";
    setTimeout(() => {
      erroLogin.style.display = "none";
    }, 1500);
  }
}

// Função para atualizar o painel de chamadas
function atualizarChamadas() {
  const senhasGeradas = JSON.parse(localStorage.getItem("senhasGeradas")) || [];
  const senhasChamadas =
    JSON.parse(localStorage.getItem("senhasChamadas")) || [];

  // Exibe as senhas geradas
  const senhasGeradasElement = document.getElementById("senhas-geradas");
  senhasGeradasElement.innerHTML = "";

  // Exibe no máximo 5 senhas geradas
  const senhasVisiveis = senhasGeradas.slice(0, 5); // Exibe apenas as 5 mais antigas
  senhasVisiveis.forEach((s) => {
    const div = document.createElement("div");
    div.textContent = s;
    div.classList.add("senha-gerada");
    senhasGeradasElement.appendChild(div);
  });

  // Exibe a última senha chamada
  const senhaChamadaElement = document.getElementById("senha-chamada");
  if (senhasChamadas.length > 0) {
    senhaChamadaElement.textContent = senhasChamadas[senhasChamadas.length - 1];
  }

  // Exibe as últimas 4 senhas chamadas em botões vermelhos
  const ultimasSenhasElement = document.getElementById(
    "ultimas-senhas-chamadas"
  );
  const ultimas4Senhas = senhasChamadas.slice(-4);
  ultimasSenhasElement.innerHTML = "";
  ultimas4Senhas.forEach((s) => {
    const div = document.createElement("button");
    div.textContent = s;
    div.classList.add("senha-chamada-botao");
    ultimasSenhasElement.appendChild(div);
  });
}

// Função para atualizar a data e hora
function atualizarDataHora() {
  const dataHoraElement = document.getElementById("data-hora");
  const agora = new Date();
  const dataHoraFormatada = agora.toLocaleString("pt-BR", {
    weekday: "long",
    day: "2-digit",
    month: "long",
    year: "numeric",
    hour: "2-digit",
    minute: "2-digit",
    second: "2-digit",
  });
  dataHoraElement.textContent = dataHoraFormatada;
}

function loadUrl(pos) {
  let lat = pos.coords.latitude;
  let long = pos.coords.longitude;
  let url = `${URL_MAIN}?lat=${lat}&lon=${long}&units=${UNITS}&APPID=${API_KEY}`;
  fetchApi(url);
}

async function fetchApi(url) {
  let response = await fetch(url);
  let { main } = await response.json();
  let temperature = main.temp.toFixed(1);
  const temperaturaElement = document.getElementById("temperatura-info");
  const temperaturaClima = document.getElementById("temperatura-clima");
  atualizarDataHora();
  temperaturaElement.textContent = `${temperature} ºC`;

  if (temperature < 10) {
    temperaturaClima.textContent = "Clima frio ";
  } else if (temperature >= 10 && temperature < 25) {
    temperaturaClima.textContent = "Clima ameno ";
  } else {
    temperaturaClima.textContent = "Clima quente ";
  }
}

// Função para gerar senha
function gerarSenha(tipo) {
    let senhaGerada;
    let senhasGeradas = JSON.parse(localStorage.getItem("senhasGeradas")) || [];
  
    do {
      const numeros = Math.floor(100 + Math.random() * 900);
      const letras = tipo;
      senhaGerada = letras + numeros;
    } while (senhasGeradas.includes(senhaGerada));
  
    document.getElementById("senhaDisplay").textContent =
      "Senha gerada: " + senhaGerada;
  
    senhasGeradas.push(senhaGerada);
  
    localStorage.setItem("senhasGeradas", JSON.stringify(senhasGeradas));
  }
  

// Função para chamar a senha
function chamarSenha() {
  // Recupera as senhas geradas do localStorage
  let senhasGeradas = JSON.parse(localStorage.getItem("senhasGeradas")) || [];

  if (senhasGeradas.length === 0) {
    alert("Não há senhas para chamar!");
    return;
  }

  // Ordena as senhas pela prioridade (Preferencial primeiro)
  const senhaPreferencial = senhasGeradas.find((s) => s.includes("PCD")); // Encontra a senha PCD
  let senhasRestantes = senhasGeradas.filter((s) => !s.includes("PCD")); // Remove a PCD da lista
  senhasRestantes.sort(); // Ordena as senhas restantes por ordem alfabética (mais antiga para mais nova)

  // A senha chamada será a Preferencial (PCD), ou a mais antiga
  const senhaChamada = senhaPreferencial || senhasRestantes.shift();

  // Armazena a senha chamada no localStorage
  let senhasChamadas = JSON.parse(localStorage.getItem("senhasChamadas")) || [];
  senhasChamadas.push(senhaChamada);
  localStorage.setItem("senhasChamadas", JSON.stringify(senhasChamadas));

  // Remove a senha chamada da lista de senhas geradas
  senhasGeradas = senhasGeradas.filter((s) => s !== senhaChamada);
  localStorage.setItem("senhasGeradas", JSON.stringify(senhasGeradas));

  // Exibe a senha chamada
  document.getElementById("senhaDisplay").textContent =
    "Senha chamada: " + senhaChamada;
}

// Atualiza a data e hora a cada segundo
setInterval(atualizarDataHora, 1000);

// Atualiza o painel de chamadas a cada 2 segundos
setInterval(atualizarChamadas, 2000);

// Chama a função inicialmente para carregar os dados
atualizarChamadas();
atualizarTemperatura();
