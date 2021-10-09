#include <Wire.h>
#include <LiquidCrystal_I2C.h>//BIBLIOTECA PARA HACER USO DE PANTALLA LCD 16x2 CON I2C

#include <Servo.h>


//cREAR UNA
//VARIABLE QUE GUARDE LA PSOSCION DE CADA LETRA DE LOS MOTORES
Servo muneca;
Servo pinza;
LiquidCrystal_I2C lcd(0x27, 16, 2);

//PULSADORES
short pul1 = A3;
short pul3 = A2;
short pul2 = A1;
//short led = A0;
int posMot0;
int posMot1;
int posMot2;
int posMot3;
int posMot4;
int posMot5;


short minimo = -30;
int maximo = 1000;
short minimo2 = -15;
short maximo2 = 1000;
int parametroLc = 1;
boolean bandIncre = true;
boolean bandMosLcd = true;
char varMotor0;
char varMotor1;
char varMotor2;
char varMotor3;
char varMotor4;
char varMotor5;
int cont;
//___________________
int tiempo = 8;
boolean bandA = false, bandD = false, bandG = false, bandL = false, bandO = false, bandR = false;
char cadA = 'C', cadD = 'F', cadG = 'K', cadL = 'N', cadO = 'Q', cadR = 'T';
short date3P = 4;
boolean bander = true;
void setup() {

  Serial.begin(9600);
  Serial.println("iniciando");
  iniciarFor();
  pinza.attach(2);
  muneca.attach(3);
  //******** MOTORREDUCTORES ***********
  boolean band1 = false;
  boolean band2 = false;
  boolean band3 = false;

  //Motor 1 Hombro
  pinMode(4, OUTPUT);
  pinMode(5, OUTPUT);

  //Motor 2 Brazo
  pinMode(6, OUTPUT);
  pinMode(7, OUTPUT);

  //Motor 3 antebrazo
  pinMode(8, OUTPUT);
  pinMode(9, OUTPUT);

  //Motor 4 Horugas
  pinMode(10, OUTPUT);
  pinMode(11, OUTPUT);

  pinMode(12, OUTPUT);
  pinMode(13, OUTPUT);

  //___________________
  String cadena;
  int dateS1;
  int dateS2;
  while (true) {
    dateS1=analogRead(A7);
    //dateS2=analogRead(A6);
      //Serial.print(dateS1);
      //Serial.println(dateS2);

    if (dateS1==0) {
      break;
    }
    lcd.setCursor(1, 0);
    lcd.print(" Posicionando   ");
    lcd.setCursor(0, 1);
    lcd.print(cadena);
    //Retornar a posicion 0
    if (bandA == false) {
      digitalWrite(4, HIGH);
      if (pulsadores(analogRead(pul2)) == true) {
        bandA = true;
        fin_carrera(4, 5, 400);
        cadena += "1 OK ";
      }
    }


    if (bandD == false) {
      digitalWrite(7, HIGH);
      if (analogRead(pul1) < 100) {
        bandD = true;
        fin_carrera(7, 6, 600);
        cadena += "2 OK ";
      }
    }


    if (bandL == false) {
      digitalWrite(9, HIGH);
      if (pulsadores(analogRead(pul3)) == true) {
        bandL = true;
        fin_carrera(8, 9, 50);
        cadena += "3 OK ";
      }
    }


    if (bandA == true && bandD == true && bandL == true) {

      //lcd.clear();
      break;
    }

    //Serial.println(analogRead(pul3));
  }
  //pinza.write(60);

}

void loop() {

  int date0 =  analogRead(pul2);
  int date1 =  analogRead(pul1);
  int date2 =  analogRead(pul3);

  int date3 = analogRead(A6);
  int date4 = analogRead(A7);


  if (date3 <= 10) {
    lcd.noBacklight();
    bandMosLcd = false;
  } else if (date4 <= 10) {
    bandMosLcd = true;
    date3P++;
    lcd.backlight();
  }


  if (bandMosLcd == true) {
    if (date3P > 0 && date3P <= 4) {
      mostrarTextoLcd(1);
    } else if (date3P > 4 && date3P <= 8) {
      mostrarTextoLcd(2);
    } else if (date3P > 8 && date3P < 12) {
      mostrarTextoLcd(3);
    } else if (date3P > 12) {
      date3P = 0;
    }
    //Serial.println(date3P);
  }

  char texto = validar();
  if (bandA == true) {
    cadA = texto;
    bandA = false;
  }
  if (bandD == true) {
    cadD = texto;
    bandD = false;
  }
  if (bandG == true) {
    cadG = texto;
    bandG = false;
  }
  if (bandL == true) {
    cadL = texto;
    bandL = false;
  }
  if (bandO == true) {
    cadO = texto;
    bandO = false;
  }

  if (bandR == true) {
    cadR = texto;
    bandR = false;
    //  Serial.println("");
  }

  if (texto == 'a') {
    bandA = true;
  } else if (texto == 'd') {
    bandD = true;
  } else if (texto == 'g') {
    bandG = true;
  } else if (texto == 'l') {
    bandL = true;
  } else if (texto == 'o') {
    bandO = true;
  } else if (texto == 'r') {
    bandR = true;
  }

  //Envio de parametros para control de motorreductor hombro

  if (pulsadores(date0) == true) {
    fin_carrera(4, 5, 400);
    cadA = 'C';
    posMot0 = 1;
  }
  if (posMot0 >= 270) {
    fin_carrera(5, 4, 600);
    cadA = 'C';
    posMot0 = posMot0 - 8;

  }

  posMot0 = posicionMotor(posMot0, varMotor0, 'A', 'B', 'C');
  varMotor0 = agregarCaracter(varMotor0, 4, 5, cadA, 'A', 'B', 'C', posMot0);

  // Control antebrazo

  if (date1 >= 20 && date1 < 100) {
    fin_carrera(7, 6, 600);
    cadD = 'F';
    posMot1 = 1;

  }

  if (posMot1 >= 300) {
    fin_carrera(6, 7, 600);
    cadD = 'F';
    posMot1 = posMot1 - 8;

  }
  //Serial.println(date1);


  posMot1 = posicionMotor(posMot1, varMotor1, 'E', 'D', 'F');
  varMotor1 = agregarCaracter(varMotor1, 6, 7, cadD, 'D', 'E', 'F', posMot1);

  //Control rodamientos
  posMot2 = posicionMotor(posMot2, varMotor2, 'G', 'I', 'K');
  varMotor2 = agregarCaracter2(varMotor2, 10, 11, 12, 13, cadG, 'G', 'H', 'I', 'J', 'K', posMot2);


  //control codo

  if (pulsadores(date2) == true) {
    fin_carrera(9, 8, 20);
    cadL = 'N';
    posMot3 = 1;
  }
  if (posMot3 >= 20) {
    fin_carrera(8, 9, 20);
    cadL = 'N';
    posMot3 = posMot3 - 5;
  }
  posMot3 = posicionMotor(posMot3, varMotor3, 'L', 'M', 'N');
  varMotor3 = agregarCaracter(varMotor3, 9, 8, cadL, 'L', 'M', 'N', posMot3);



  //Control muñeca
  posMot4 = posicionServo(posMot4, varMotor4, 'O', 'P', 'Q');
  varMotor4 = agregarCaracterServo(1, varMotor4, cadO, 'O', 'P', 'Q');

//Control pinza
  posMot5 = posicionServo(posMot5, varMotor5, 'R', 'S', 'T');
  varMotor5 = agregarCaracterServo(2, varMotor5, cadR, 'R', 'S', 'T');

  // mostrar(varMotor0, varMotor1, varMotor2, varMotor3,varMotor4, varMotor5);
  // mostrar(cadA, cadD, cadG, cadL, cadO, cadR);
  delayMicroseconds(1);

}


//*******************************
//Inicio de funciones y metodos
char agregarCaracterServo(short parametroS, char cadPrueba, char text0s, char text1s, char text2s, char text3s) {
  int posS;
  if (parametroS == 1) {
    if (text0s == text1s) {
      posS = 10;

    } else if (text0s == text2s) {
      posS = 80;

    } else if (text0s == text3s) {
      posS = 80;
    }
    muneca.write(posS);

  } else if (parametroS == 2) {
    if (text0s == text1s) {
      posS = 30;
      analogWrite(A0, 255);

    } else if (text0s == text2s) {
      posS = 90;
      analogWrite(A0, 0);
    } else if (text0s == text3s) {
      posS = 80;
    }
    pinza.write(posS);

  }

  return text0s;
}
int posicionServo(int posSe, char t0, char t1, char t2, char t3) {
  int posicionS;
  if (t0 == t1) {
    posicionS = 30;
  } else if (t0 == t2) {
    posicionS = 90;
  } else if (t0 == t3) {
    posicionS = 80;
  }
  return posicionS;
}

//***************************************
void mostrarTextoLcd(short parametroLcd) {
  /* if (cont > 0 && cont < 600) {
    limpiarLcd();
    mostrarLcd(0, 0, 0, 1, "|=   MiSION   =|", "Llegando a Marte", 1);

    } else*/
  if (parametroLcd == 1) {
    limpiarLcd();
    String txtx = " ";
    String txty = "Comandos:";
    txty  += "a";
    txty  += cadA;
    txty  += " d";
    txty  += cadD;
    txty  += "  ";
    txtx  += "g";
    txtx  += cadG;
    txtx  += " l";
    txtx  += cadL;
    txtx  += " o";
    txtx  += cadO;
    txtx  += " r";
    txtx  += cadR;
    txtx  += "    ";
    mostrarLcd(0, 0, 0, 1, txty , txtx, 1);
    //
  } else if (parametroLcd == 2) {
    limpiarLcd();
    String txtG = "|*  POSICION 1 *|";
    String txtG0;
    txtG0 += "A:";
    txtG0 += posMot0;
    txtG0 += " D:";
    txtG0 += posMot1;
    txtG0 += " E:";
    txtG0 += posMot3;
    txtG0 += "    ";
    mostrarLcd(0, 0, 0, 1, txtG , txtG0, 1);

  } else if (parametroLcd == 3) {

    limpiarLcd();
    String txtG = "|*  POSICION 2 *|";
    String txtG0;

    txtG0 += "G:";
    txtG0 += posMot2;
    txtG0 += " O:";
    txtG0 += posMot4;
    txtG0 += " R:";
    txtG0 += posMot5;
    txtG0 += "    ";
    mostrarLcd(0, 0, 0, 1, txtG , txtG0, 1);

    /*  limpiarLcd();
      mostrarLcd(0, 0, 0, 1, "Atmosfera:  93 % " ,"Escaneando:"+String(cont)+"%", 1);
    */
  }
}
void limpiarLcd() {
  if (bander == true) {
    lcd.clear();
    bander = false;
  }
}

void iniciarFor() {
  String textoL = "| Iniciado";
  lcd.init();
  lcd.backlight();
  for (int i = 0; i <= 5; i++) {
    textoL += ".";
    mostrarLcd(0, 0, 0, 1, "|--------------|", textoL, 300);
    delay(100);
  }
  lcd.clear();
}

void mostrarLcd(short ps0, short ps1, short ps2, short ps3, String cadena0, String cadena1, int tiempo) {
  //lcd.clear();
  lcd.setCursor(ps0, ps1);
  lcd.print(cadena0);
  lcd.setCursor(ps2, ps3);
  lcd.print(cadena1);
  delay(tiempo);
}

//**********************************************
//Comunicasion serial

char validar() {
  if (Serial.available()) {
    char t = Serial.read();
    Serial.print(t);
    //delay(10);
    return t;
  }


}


//LIMITES
//Pulsadores
boolean pulsadores(short numPulsa) {
  boolean banderP;
  if (numPulsa <= 10) {
    banderP = true;
  } else {
    banderP = false;
  }
  return banderP;
}

//***********************************************

char motorreductores(char varMotor, short pin1, short pin2, char text0, char text1, char text2, char text3, int contMotor) {
  //   contMotor

  if (text0 == text1) {
    varMotor = text1;
    desactivar(pin2);
    activar(pin1);

  } else if (text0 == text2) {
    varMotor = text2;
    desactivar(pin1);
    activar(pin2);

  } else if (text0 == text3) {
    varMotor = text3;
    desactivar(pin1);
    desactivar(pin2);
  }



  return varMotor;
}

//fin de carrera
void fin_carrera(int pin1, int pin2, int tiempo) {
  desactivar(pin1);
  activar(pin2);
  delay(tiempo);
  desactivar(pin1);
  desactivar(pin2);
  //  Serial.println("Hola putos");
}

//Incrementar y decrementar
int incrementar(boolean banderaInc, int minimoM) {
  if (banderaInc == true) {
    minimoM = minimoM * 2;
  } else if (banderaInc == false) {
    minimoM = minimoM - (minimo / 2);
  }
  return minimoM;
}

//Posicion
int posicionMotor(int contPos, char text, char t1, char t2, char t3) {
  if (text == t1) {
    contPos--;
  } else if (text == t2) {
    contPos++;
  } else if (text == t3) {
    contPos;
  }
  return contPos;
}

//Agregar letra motores
char agregarCaracter(char varMotor, int pin1, int pin2 , char textoT, char t1, char t2, char t3, int contM) {
  if (textoT == t1 || textoT == t2 || textoT == t3) {
    varMotor = motorreductores(varMotor, pin1, pin2, textoT, t1, t2, t3, contM);
  }
  return varMotor;
}

char agregarCaracter2(char varMotor, int pin0, int pin1, int pin2, int pin3 , char textoT, char t0, char t1, char t2, char t3, char t4, int contM) {
  if (textoT == t0 || textoT == t1 || textoT == t2 || textoT == t3 || textoT == t4) {
    varMotor = motorreductores(varMotor, pin0, pin1, textoT, t0, t1, t4, contM);
    varMotor = motorreductores(varMotor, pin2, pin3, textoT, t2, t3, t4, contM);

  }
  return varMotor;
}

//activar y desactivar motores
void activar(int pin) {
  digitalWrite(pin, HIGH);
}
void desactivar(int pin) {
  digitalWrite(pin, LOW);
}

//Mostrar

void mostrar(char tx0, char tx1, char tx2, char tx3, char tx4, char tx5) {
  String cadena;
  cadena += tx0;
  cadena += ", ";
  cadena += tx1;
  cadena += ", ";
  cadena += tx2;
  cadena += ", ";
  cadena += tx3;
  cadena += ", ";
  cadena += tx4;
  cadena += ", ";
  cadena += tx5;
  Serial.println(cadena);
}
//iniciar
void iniciar() {
  int i;

  /*while (true) {
    int date1 = analogRead(A3);
    int date2 = analogRead(A1);
    int date3 =  (analogRead(A2) / 2);
    int contM2;

    Serial.print(date1);
    Serial.print(" = ");
                   Serial.print(band1);
                   Serial.print(": ");
                   Serial.print(date2);
                   Serial.print(" = ");
                       Serial.print(band2);
                       Serial.print(": ");
                       Serial.print(date3);
                       Serial.print(" = ");
                           Serial.println(band3);


                           //MOTOR 1
                           if (date1 > 1) {
                           if (band1 == false) {
                           desactivar(5);
                           activar(4);
                           i--;
                         }

                         } else if (date1 == 0) {
                           i++;

                           if (band1 == false) {
                           fin_carrera(4, 5 , 400);
                           contM2 = 0;
                         }
                           band1 = true;

                         }


                           //MOTOR 2

                           if (date2 > 1) {
                           if (band2 == false) {
                           desactivar(7);
                           activar(6);
                         }
                           contM2 = 0;
                         } else if (date2 == 0) {
                           contM2++;
                           if (band2 == false) {
                           desactivar(6);
                           activar(7);
                           delay(500);
                           desactivar(7);
                           //desactivar(6);

                         }
                           band2 = true;
                         }

                           //        Motor 3
                           if (date3 > 1) {
                           if (band3 == false) {
                           desactivar(8);
                           activar(9);
                         }
                         } else if (date3 <= 1) {
                           if (band3 == false) {
                           fin_carrera(9, 8, 200);
                         }
                           band3 = true;

                         }

                           //if (band1 == true && band2 == true) {
                           break;
                           //}
                           delay(6);
                         }*/
}
