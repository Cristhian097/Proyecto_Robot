#include <MPU6050_tockn.h> //LIBRERIA DE ACELEROMETRO
#include <Wire.h>
#include <SoftwareSerial.h>//libreria para leer de puerto serial

MPU6050 mpu6050(Wire);
SoftwareSerial hc05(2, 3); //pines RX y TX de la placa arduino para la recepcion y transmision de datos

//SENSORES
short pulsador = 9;//Pulsador 1
short pulsador2 = 10;//pulsador 2

short pulsador3 = 6;//pulsador 3
short pulsador4 = 7;//pulsador 4
short pulsador5 = A7;//pulsador 5
short pulsador6 = A6;//pulsador 6
short pulsador7 = A3;//pulsador 7
//short myoware = 11;//
short potenciometro = A1; //8;
short led = 13;
short pinza = A2;
short muneca = A1;

//CLAVES PARA LA IDENTIFICACION DE CADA PARAMATERO A ENVIAR
String tx0 = "C" , tx1 = "F", tx2 = "K", tx3 = "N", tx4 = "Q", tx5 = "T";
int opcion = 0;

// BANDERAS
bool bandera = false;
//CONTADORES
short cont = 0;
short contB;
int parametro = 0;
int posX;
int posXA;
int posY;
int myoware = 11;
boolean bandAc1 = true;
boolean bandAc2 = true;
int tiempoE = 560;
short i = 0;
short j = 0;
void setup() {

  Serial.begin(9600);//inicializo el puerto serial
  hc05.begin(9600);//inicia hco5 en 38400 baudios hc05
  hc05.write("CONECTADO:Emisor....");
  pinMode(pulsador, INPUT);
  pinMode(pulsador2, INPUT);

  pinMode(pulsador3, INPUT);
  pinMode(pulsador4, INPUT);

  pinMode(pulsador5, INPUT);
  pinMode(pulsador6, INPUT);
  pinMode(pulsador7, INPUT);

  pinMode(myoware, INPUT);
  pinMode(led, OUTPUT);
  digitalWrite(led, HIGH);
  Wire.begin();
  mpu6050.begin();
  mpu6050.calcGyroOffsets(true);
  digitalWrite(led, LOW);

}

void loop() {
  //Serial.println(analogRead(myoware));
  //(Serial.println(dateSensor(5));
  //Extrae valor de los pulsadores
  short datPul = digitalRead(pulsador);
  short datPul2 = digitalRead(pulsador2);

  short datPul3 = digitalRead(pulsador3);
  short datPul4 = digitalRead(pulsador4);

  short datPul5 = analogRead(pulsador5);
  short datPul6 = analogRead(pulsador6);
  short datPul7 = analogRead(pulsador7);

  // Serial.print(datPul);
  //Serial.print(":");
  // Serial.print(datPul3);
  //Serial.print(":");
  //Serial.print(datPul5);
  //Serial.println(":");
  //Serial.println(datPul6);
  //  Serial.print(":");
  // Serial.print(datPul7);
  //  Serial.print(":");
  // Serial.println(signo);



  if (datPul <= 0 ) {
    bandera = true;
    opcion = 1;
    tx0 = "C";
    tx1 = "F";
    tx2 = "K";
    tx3 = "N";
    tx4 = "P";
    tx5 = "T";
    //enviar("a", tx0, "d", tx1 , "g", tx2, "l", tx3, "o", tx4, "r", tx5);

    cont++;
    //Serial.println(cont);
    digitalWrite(13, HIGH);
  } else if (cont >= 100) {
    bandera = false;
    cont = 0;
    parametro = 0;
    opcion = 0;
    digitalWrite(13, LOW);
  }

  if (datPul2 <= 0) {
    opcion++;
    Serial.println(opcion);
  }

  if (opcion > 0 && opcion <= 30) {
    if (bandAc1 == true) {
      tiempoE = 560;
      bandAc1 = false;
      bandAc2 = true;
    }
    //Serial.println(parametro);
    if (parametro > 0 && parametro <= 40) {
      tx0 = pulsadoresC(false, tx0, datPul3, datPul4, datPul5, datPul6, datPul7, "", "A", "", "B", "C");
      //Serial.print("1:");
    } else if (parametro > 40 && parametro <= 80) {
      tx1 = pulsadoresC(false, tx1, datPul3, datPul4, datPul5, datPul6, datPul7, "", "D", "", "E", "F");
      //Serial.print("2:");
    } else if (parametro > 80 && parametro <= 120) {
      tx3 = pulsadoresC(false, tx3, datPul3, datPul4, datPul5, datPul6, datPul7, "", "L", "", "M", "N");
      //Serial.print("3:");
    } else if (parametro > 120 && parametro <= 160) {
      tx4 = pulsadoresC(false, tx4, datPul3, datPul4, datPul5, datPul6, datPul7, "", "O", "", "P", "Q");
      //Serial.print("4:");
    } else if (parametro > 160 && parametro <= 200) {
      tx5 = pulsadoresC(false, tx5, datPul3, datPul4, datPul5, datPul6, datPul7, "", "R", "", "S", "T");
      //Serial.print("5:");
    } else if (parametro > 200) {
      parametro = 1;
    } else if (parametro <= 0) {
      parametro = 1;
    }

    if (datPul3 == 0) {
      parametro++;
    }
    if (datPul5 == 0) {
      parametro--;
    }

  } else if (opcion > 30 && opcion <= 60) {
    //control Hombro
    if (bandAc2 == true) {
      tiempoE = 30;
      bandAc2 = false;
      bandAc1 = true;
    }
    tx0 = ejeX0("A", "B", "C");
    //Control de sistema de rodamiento
    tx2 = pulsadoresC(true, tx2, datPul3, datPul4, datPul5, datPul6, datPul7, "G", "H", "I", "J", "K");

    //Control antebrazo
    tx1 = ejeX1("D", "E", "F");
    //Control codo
    tx3 = ejeY("L", "M", "N");

    tx4 = muneca0(tx4, "O", "P");
    tx5 = pinza0(tx5, "S", "R");

  } else if (opcion > 60 ) {
    opcion = 1;
  }
  //Serial.println(opcion);
  //CONDICIONAL PULSADOR 2

  if (bandera == true) {
    contB++;

    if (contB == 1) {
      enviar("a", tx0, "d", tx1 , "g", tx2, "l", tx3, "o", tx4, "r", tx5);
    } else if (contB >= tiempoE) {
      contB = 0;
    }
  }
  //Serial.println(tiempoE);

  delay(1);
}

//funcion pinza
String pinza0 (String txt, String l1, String l2) {
  int num = dateSensor(6);
  //Serial.println(num);
  if ( num >= 0 && num <=10) {
    i++;
    if (i > 5) {
      txt = l1;
      //Serial.println("entra pinza");
    }
  } else {
    i = 0;
    txt = l2;
  }
  return txt;
}

//funcion muneca
String muneca0 (String txt0, String l10, String l20) {
  int num0 = dateSensor(7);
  //Serial.println(num0);
  if ( num0 >= 0 && num0 <= 10) {
    j++;
    if (j > 5) {
      txt0 = l10;
    }
  } else {
    txt0 = l20;
    j = 0;
  }

  return txt0;
}
//**********************************

String ejeX0 (String date0, String date1, String date2) {
  String textoX;
  if (dateSensor(1) > posX) {
    textoX = date0;
    posX++;
    digitalWrite(13, HIGH);
  } else if (dateSensor(1) < posX) {
    textoX = date1;
    posX--;
    digitalWrite(13, HIGH);
  } else if (dateSensor(1) == posX) {
    textoX = date2;
    digitalWrite(13, LOW);
  }
  return textoX;
}

String ejeX1 (String date3, String date4, String date5) {
  String textoXA;
  if (dateSensor(1) > posXA) {
    textoXA = date3;
    posXA++;
    digitalWrite(13, HIGH);
  } else if (dateSensor(1) < posXA) {
    textoXA = date4;
    posXA--;
    digitalWrite(13, HIGH);
  } else if (dateSensor(1) == posXA) {
    textoXA = date5;
    digitalWrite(13, LOW);
  }
  return textoXA;
}

String ejeY (String date3y, String date4y, String date5y) {
  String textoY;
  if (dateSensor(2) > posY) {
    textoY = date3y;
    posY++;
    digitalWrite(13, HIGH);
  } else if (dateSensor(2) < posY) {
    textoY = date4y;
    posY--;
    digitalWrite(13, HIGH);
  } else if (dateSensor(2) == posY) {
    textoY = date5y;
    digitalWrite(13, LOW);
  }
  return textoY;
}
//*****************
String pulsadoresC(boolean bander, String tx, int dat0, int dat1, int dat2, int dat3, int dat4, String t0, String t1, String t2, String t3, String t4) {
  tx;

  if (bander == true) {
    if (dat0 == 0) {
      tx = t0;
    }
    if (dat2 >= 0 && dat2 <= 10) {
      tx = t2;
    }
    if (dat1 == 0) {
      tx = t1;

    }
    if (dat2 >= 0 && dat2 <= 10) {
      tx = t2;
    }
    if (dat3 >= 0 && dat3 <= 10) {
      tx = t3;
    }
    if (dat4 >= 0 && dat4 <= 10) {
      tx = t4;
    }
  } else {

    if (dat1 == 0) {
      tx = t1;

    }
    if (dat2 >= 0 && dat2 <= 10) {
      tx = t2;
    }
    if (dat3 >= 0 && dat3 <= 10) {
      tx = t3;
    }
    if (dat4 >= 0 && dat4 <= 10) {
      tx = t4;
    }
  }

  return tx;
}


//funcion enviar parametros
int dateSensor(int paramet) {
  mpu6050.update();
  int pos;
  if (paramet == 1) {
    pos = mpu6050.getAngleX();
  } else if (paramet == 2) {
    pos = mpu6050.getAngleY();
  } else if (paramet == 3) {
    pos  = (mpu6050.getAngleZ() / 2) + 60;
  } else if (paramet == 4) {
    pos  =  (analogRead(potenciometro) / 10);
  } else if (paramet == 5) {
    //pos  =  digitalRead(myoware);
    Serial.println(digitalRead(myoware));
  } else if (paramet == 6) {
    pos  =  analogRead(pinza);
    // Serial.printtt(pos);
  } else if (paramet == 7) {
    pos  =  analogRead(muneca);
  }
  return pos;

}

//************************
//Enviar 2
void enviar(String claA, String valA, String claD, String valD, String claG, String valG, String claL, String valL, String claO, String valO, String claR, String valR) {

  String texto2;
  texto2 = claA + valA + claD + valD + claG + valG + claL + valL + claO + valO + claR + valR;
  hc05.println(texto2);
  mostrar(texto2);
}


//MUESTRA MENDSAJE EN MONITOR SERIAL
void mostrar(String cadena) {
  Serial.println(cadena);
}

/*RECIBE DATOS DE EMISOR
  char recibir() {
  if (hc05.available()) {
    char texto = 0;
    texto = hc05.read();
    Serial.println(texto);
    return texto;

  }
  }*/
