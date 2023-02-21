var entrada, texto;

// funcao que innicializa
function setup() {
  createCanvas(windowWidth, windowHeight);
  background("#008F8C");

  entrada = createInput();
  entrada.position(windowWidth / 2 - 120, windowHeight / 2);

  texto = createElement("h3", "Informe um n² par entre 0 a 10");
  texto.position(windowWidth / 2 - 150, windowHeight / 2 - 50);
}

// funcao que executa
function draw() {
  // variavel local, so pode ser
  var num = entrada.value();
  switch (num) {
    case "0":
      // // faca alguma coisa
      // var textResp = createElement("h3", "é par");
      // textResp.position(windowWidth / 2 - 80, windowHeight / 2 - 20);
      recarregar();
      break;
    case "2":
      // var textResp = createElement("h3", "é par");
      // textResp.position(windowWidth / 2 - 80, windowHeight / 2 - 20);
       recarregar();
      break;
    case "4":
      // var textResp = createElement("h3", "é par");
      // textResp.position(windowWidth / 2 - 80, windowHeight / 2 - 20);
       recarregar();
      break;
    case "6":
      // var textResp = createElement("h3", "é par");
      // textResp.position(windowWidth / 2 - 80, windowHeight / 2 - 20);
       recarregar();
      break;
    case "8":
      // var textResp = createElement("h3", "é par");
      // textResp.position(windowWidth / 2 - 80, windowHeight / 2 - 20);
       recarregar();
      break;
    case "10":
      // var textResp = createElement("h3", "é par");
      // textResp.position(windowWidth / 2 - 80, windowHeight / 2 - 20);
       recarregar();
      break;
    default:
      break;
  }
}

function recarregar() {
  swal(
    {
    title: `é par, parabéns`,
    imageUrl: "https://media.tenor.com/9CSjgBMp2fIAAAAM/emoji-party.gif",
    imageSize: "50x50",
    confirmButtonText: "Clique para reiniciar"

    }, 
    
    function (isConfirm) {
      if (isConfirm) {
        location.reload();  // funcao que recarrega a pagina
      }
    }
  );
}
