## Prérequis

- Java 8 ou supérieur
- Maven

## Fonctionnalités
 -  Conversion des nombres arabes (1-3000) en chiffres romains
 -  Gestion des entrées invalides (nombres < 1 ou > 3000)

## Utilisation

  int number = 1987;
  String roman = RomanNumerals.convertToRoman(number);
  System.out.println("1987 en chiffres romains est : " + roman);
