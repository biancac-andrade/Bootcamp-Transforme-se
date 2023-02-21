// declarar nome variaveis para imagens e parametros
var tRex, tRexImg;

var cacto1, cacto2, cacto3;
var cactoImg1, cactoImg2, cactoImg3;

var gameOver, gameOverImg;

var ground, groundImg;

var nuvem1, nuvem2;
var nuvemImg1, nuvemImg2;

var groundInvisive;

//variáveis de grupos
var grupoCactos, grupoNuvens;

var estadoJogo = "play";

//responsável por carregar todos os arquivos
function preload() {
  tRexImg = loadAnimation("img/tRex1.png", "img/tRex2.png", "img/tRex3.png");

  //Carrega imagens Cactos
  cactoImg1 = loadImage("img/cacto1.png");
  cactoImg2 = loadImage("img/cacto2.png");
  cactoImg3 = loadImage("img/cacto3.png");

  //Carrega imagem fim do jogo
  gameOverImg = loadImage("img/game-over.png");

  //carrega imagem chão
  groundImg = loadImage("img/ground2.png");

  //Carrega imagens nuvens
  nuvemImg1 = loadImage("img/nuvem.png");
  nuvemImg2 = loadImage("img/nuvem2.png");
}

//função que inicializa o código
function setup() {
  //cria o tamanho da tela
  createCanvas(600, 200);

  //configuracao do dinossauro
  tRex = createSprite(100, 100, 20, 20);
  tRex.addAnimation("tRex", tRexImg);

  //mudar tamanho do tRex
  tRex.scale = 0.38;

  // alterar posicao especifica
  tRex.x = 50;

  // configuracao do chao
  ground = createSprite(100, 140, 160, 20); // ( x, y, largura, altura)
  ground.addImage("ground", groundImg);
  groundInvisive = createSprite(80, 150, 100, 20);
  groundInvisive.visible = false;

  // adiciona a imagem de fim de jogo
  gameOver = createSprite(300, 100, 20, 20);
  gameOver.addImage(gameOverImg);
  gameOver.scale = 0.2;
  gameOver.visible = false;  // para a imagemn game over nao apareecer inicio do jogo


  //estrutura de repeticao

  for (var i = 0; i < 4; i = i + 2){
    console.log(i)
  }
  // criando grupos

  grupoCactos = new Group();
  grupoNuvens = new Group();
}

// função de execução-desenho q executa enquanto o codigo estiver funcionando
function draw() {
  background("#8f8f8f");

  if (estadoJogo === "play") {
    // movimento pro chao
    ground.velocityX = -2;
    if (ground.x < 0) {
      ground.x = ground.width / 2;
    }

    //trex pulando
    if (keyDown("space")) {
      //o que acontece se a condicao  for verdadeira
      tRex.velocityY = -10;
    }

    //adicionar gravidade ao tRex
    tRex.velocityY = tRex.velocityY + 0.8;

    //trex colidindo no chao
    tRex.collide(groundInvisive);

    // chama funcao das nuvens
    criaNuvens();

    // chama funcao dos cactos
    criaCactos();

    if (grupoCactos.isTouching(tRex)) {
      estadoJogo = "end";
    }
  } else if (estadoJogo === "end") {
    //condição de fim de jogo
    // se o cacto toca no dinossauro

    // parar a velocidade
    ground.velocityX = 0;
    tRex.velocityY = 0;

    // parar o grupo
    grupoCactos.setVelocityXEach(0);
    grupoNuvens.setVelocityXEach(0);
// exibe novamente a imagem de fim de jogo
      gameOver.visible = true;


    // mensagem da tela
    fill("black"); // cor da letra
    text("Pressione espaço para reiniciar", 220, 170);

    if (keyDown("space")) {
      estadoJogo = "play";
      grupoCactos.destroyEach();
      grupoNuvens.destroyEach();
      
      // nao ebibe a imagem de fim do jogo
      gameOver.visible = false;

    }
  }

  //desenha os elementos na tela (sprites)
  drawSprites();
}

function criaNuvens() {
  if (frameCount % 50 === 0) {
    var nuvem = createSprite(700, 90, 40, 10);
    nuvem.velocityX = -2;

    // gera imagem aleatoria

    var num = Math.round(random(1, 2));

    switch (num) {
      case 1:
        nuvem.addImage(nuvemImg1);
        break;
      case 2:
        nuvem.addImage(nuvemImg2);
        break;
      default:
        break;
    }

    nuvem.scale = 0.05;

    // Math.round é uma funcao da biblioteca p5.js que arredonda um numero
    // random - funcao que gera numero aleatorio
    nuvem.y - Math.round(random(15, 70));
    nuvem.lifetime = 500;

    // adiciona a nuvem no grupo

    grupoNuvens.add(nuvem);
  }
}

function criaCactos() {
  if (frameCount % 70 === 0) {
    var cacto = createSprite(700, 120, 40, 10);
    cacto.velocityX = -2;

    var num = Math.round(random(1, 3));

    switch (num) {
      case 1:
        cacto.addImage(cactoImg1);
        break;
      case 2:
        cacto.addImage(cactoImg2);
        break;
      case 3:
        cacto.addImage(cactoImg3);
        break;
      default:
        break;
    }
    cacto.scale = 0.05;

    cacto.lifetime = 500;
    grupoCactos.add(cacto);
  }
}
