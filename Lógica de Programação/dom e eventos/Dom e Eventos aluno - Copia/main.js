var entrada, texto;

// funcao que innicializa
function setup() {
  createCanvas(windowWidth, windowHeight);
  background("	#DC143C");

  entrada = createInput();
  entrada.position(windowWidth / 2 - 120, windowHeight / 2);

  texto = createElement("h3", "Informe letra vogal ");
  texto.position(windowWidth / 2 - 150, windowHeight / 2 - 50);
}

// funcao que executa
function draw() {
  // variavel local, so pode ser
  var num = entrada.value();
  switch (num) {
    case "a":
      // // faca alguma coisa
      // var textResp = createElement("h3", "é par");
      // textResp.position(windowWidth / 2 - 80, windowHeight / 2 - 20);
      recarregar();
      break;
    case "e":
      // var textResp = createElement("h3", "é par");
      // textResp.position(windowWidth / 2 - 80, windowHeight / 2 - 20);
       recarregar();
      break;
    case "i":
      // var textResp = createElement("h3", "é par");
      // textResp.position(windowWidth / 2 - 80, windowHeight / 2 - 20);
       recarregar();
      break;
    case "o":
      // var textResp = createElement("h3", "é par");
      // textResp.position(windowWidth / 2 - 80, windowHeight / 2 - 20);
       recarregar();
      break;
    case "u":
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
      title: `Acertou, é vogal, voce é inteligente em português kakaka`,
      imageUrl:
        "https://blog.explicae.com.br/wp-content/uploads/2018/08/ESTUDO-RESUMO-ENEM-VESTIBULAR.gif",
      imageSize: "100x100",
      confirmButtonText: "Clique para reiniciar",
    },

    function (isConfirm) {
      if (isConfirm) {
        location.reload(); // funcao que recarrega a pagina
      }
    }
  );
}
