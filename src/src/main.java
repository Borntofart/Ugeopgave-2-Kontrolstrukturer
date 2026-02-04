
//Opgave 1: Shopping discount
//Scenario: En butik giver 20% discount hvis totalPrice > 1000 kr.
//Opgave: Beregn final price efter discount.
//
//double price = 1100;
//
//void main () {
//if (price > 1000); {
//        System.out.println(price - (price * 0.20));
//    }
//}

//Opgave 2: BMI calculator
//Scenario: BMI = weight / (height * height). BMI >= 25 er overweight.
//
//Opgave: Beregn BMI og print status.
//
//double weight = 93;
//double height = 1.83;
//double BMI;
//
//void main () {
//    BMI = weight / (height * height);
//    if (BMI >= 25){
//        System.out.println("Din BMI er: " + BMI + " Du er overvægtig");
//    }else {
//        System.out.println("Du er normal vægt");
//    }
//}

//Betingelser med AND
//Opgave 3: Time of day greeting
//Scenario: Afhængig af hvad tid på dagen det er, skal der printes en passende besked.
//Hvis klokken er mellem 5-11 er det formiddag, eftermiddag (12-17), aften (18-21), nat (22-4).
//Opgave: Klokken er 14.

//int time = 14;
//
//void main () {
//    if (time > 5 && time < 11) {
//        System.out.println("Godformiddag");
//    }else if (time > 12 && time < 17) {
//        System.out.println("God eftermiddag");
//    } else if (time > 18 && time < 21) {
//        System.out.println("Godaften");
//    } else if (time > 22 && time > 4) {
//        System.out.println("Godnat");
//    }
//}

//Opgave 4: Complete student report
//Scenario: Lav en komplet student rapport med score, grade, status, og comment.
//Opgave:
//Score = 88
//Print grade (A/B/C/D/F)
//Print status (PASS/FAIL)
//Print comment baseret på grade: A="Excellent", B="Good", C="Satisfactory", D="Needs improvement", F="Failing"
//
//int score = 88;
//String status;
//String grade;
//String remark;
//
//void main () {
//    if (score >= 90){
//        System.out.println(score);
//        grade = "A";
//        status = "Pass";
//        remark = "Excellent!";
//    } else if (score >= 80){
//        System.out.println(score);
//        grade ="B";
//        status = "Pass";
//        remark = "Good";
//    } else if (score >= 70) {
//        System.out.println(score);
//        grade ="C";
//        status = "Pass";
//        remark = "OK";
//    } else if (score >= 60) {
//        System.out.println(score);
//        grade ="D";
//        status = "Pass";
//        remark = "Needs improvement";
//    } else if (score >= 50) {
//        System.out.println(score);
//        grade ="F";
//        status = "FAIL";
//        remark = "FAILED";
//    }
//    System.out.println(grade);
//    System.out.println(status);
//    System.out.println(remark);
//}

//Opgave 5: Shipping eligibility
//Scenario: Free shipping hvis: (totalPrice > 500) OR (isMember AND totalPrice > 200).
//Beregn shipping cost (0 hvis free, ellers 50 kr).
//Test med totalPrice = 350, isMember = true.
//
//boolean isMember = true;
//int totalPrice = 350;
//int shippingcost;
//
//void main () {
//if (totalPrice > 500 || isMember && totalPrice > 200); {
//    shippingcost = 0;
//    }
//    System.out.println("Pris: " + totalPrice);
//    System.out.println("Shippingcost: " + shippingcost);
//}

//Opgave 6: Movie rating system
//Scenario: En biograf tjekker om gæster må se en film. Filmen har en aldersgrænse.
//Gæsten må se filmen hvis de er gamle nok, ELLER hvis de er mindst 13 og har forældretilladelse.
//Opgave: Skriv kode der tjekker om gæsten må se filmen. Test med ageLimit = 15, guestAge = 14, hasParentalConsent = true.

//int ageLimit = 15;
//int guestAge = 14;
//boolean parentalConsent = true;
//
//void main () {
// if (guestAge > ageLimit) {
//     System.out.println("Nyd filmen");
// }else if (guestAge < ageLimit && parentalConsent){
//    System.out.println("Nyd filmen");
//} else System.out.println("Du må ikke se filmen");
//}

//Opgave 7: Restaurant seating
//Scenario: En restaurant tjekker om en gruppe kan få bord. De skal have plads nok,
// og enten have reservation eller kort ventetid. Restauranten må heller ikke være fyldt.
//Opgave: Skriv kode der tjekker om gruppen kan få bord.
// Test med partySize = 4, availableSeats = 6, hasReservation = false, waitTime = 20, restaurantFull = false.
//
//int partySize = 4;
//int availableSeats = 6;
//boolean hasReservation = false;
//int waitTime = 20;
//boolean restuarantFull = false;
//
//void main () {
//    if (partySize < availableSeats && !restuarantFull && waitTime < 30) {
//        System.out.println("Table avaliable, wait time is: " + waitTime);
//    } else if (partySize < availableSeats && !restuarantFull && hasReservation){
//        System.out.println("Your table is ready now");
//    }
//}

//Opgave 8: Insurance premium calculator
//Scenario: Et forsikringsselskab beregner præmie baseret på risiko.
// Højere præmie gives hvis kunden er ung (under 25) eller ældre (over 70), har haft mere end 2 ulykker, eller bor i en risikozone.
//Opgave: Skriv kode der beregner præmien. Basispræmie er 5000 kr,
//tillæg for høj risiko er 2000 kr. Test med age = 22, hasAccidents = false, accidents = 0, riskZone = false.
//
//int kasko = 5000;
//int age = 22;
//boolean hasAccident = false;
//int accidents = 0;
//boolean riskZone = false;
//
//void main () {
//    if (age < 25 || age > 70 || riskZone || accidents >= 2){
//        kasko= kasko+ 2000;
//        System.out.println("Du er høj risiko, din kasko er på: " + kasko);
//    } else {
//        System.out.println("Du er normal risiko, din kasko er på: " + kasko);
//    }
//}

//Opgave 9: Complete access control system
//Scenario: Et system har tre adgangsniveauer. Fuld adgang gives til aktive admins eller superbrugere.
//Begrænset adgang gives til aktive brugere der ikke er suspenderet, eller gæster med gyldig tid. Alle andre får adgang nægtet.
//Opgave: Skriv kode der bestemmer adgangsniveau. Test med isAdmin = true, accountActive = true, isSuperUser = false.
//
//boolean isAdmin = true;
//boolean accountActive = true;
//boolean isSuperUser = false;
//
//
//void main () {
//    if (isAdmin && accountActive) {
//        System.out.println("Acess granted");
//    } else if (accountActive && isSuperUser) {
//        System.out.println("Acess granted");
//    } else {
//        System.out.println("Acess denied");
//    }
//}

//Opgave 10: Restaurant menu pricing
//Scenario: En restaurant har følgende menu:
//
//Item	Pris
//burger	89 kr
//pizza	95 kr
//salad	65 kr
//pasta	79 kr
//steak	145 kr
//Opgave: Brug switch til at finde prisen og beregn total for en bestilling. Test med item = "pizza", quantity = 2.
//
//
//String menu = "steak";
//int price;
//int quantity = 2;
//
//void main () {
//    switch (menu) {
//        case "pizza":
//        price = 95 * quantity;
//            System.out.println("Pris for bestilling er: " + price + "Dkk");
//            break;
//        case "salad":
//            price = 65 * quantity;
//            System.out.println("Pris for bestilling er: " + price + "Dkk");
//            break;
//        case "pasta":
//            price = 79 * quantity;
//            System.out.println("Pris for bestilling er: " + price + "Dkk");
//            break;
//        case "steak":
//            price = 145 * quantity;
//            System.out.println("Pris for bestilling er: " + price + "Dkk");
//    }
//}

//Opgave 11: Shipping cost calculator
//Scenario: Et fragtfirma beregner pris baseret på zone og vægt:
//
//Zone	Pris
//Local	50 kr
//Regional	100 kr
//National	150 kr
//International	300 kr
//Tillæg: 20 kr per kg over 5 kg.
//
//Opgave: Brug switch til at finde zonepris og beregn total fragtomkostning. Test med zone = "National", weight = 7 kg.

//String zone = "National";
//int weight = 7;
//int zonepris;
//int fragtomkostninger;
//
//
//
//void main () {
//    switch (zone) {
//        case "Local":
//            zonepris = 50;
//            if (weight <5){
//                zonepris = zonepris + 20;
//            }
//
//            System.out.println("Totalfragt er: " + zonepris);
//            break;
//        case "Regional":
//            zonepris = 100;
//            if (weight <5){
//                zonepris = zonepris + 20;
//            }
//            System.out.println("Totalfragt er: " + zonepris);
//            break;
//        case "National":
//            zonepris = 100;
//            if (weight <5){
//                zonepris = zonepris + 20;
//            }
//            System.out.println("Totalfragt er: " + zonepris);
//    }
//}

//Opgave 12: ATM-transaktion
//Skriv et program der simulerer en simpel pengeautomat. Programmet skal håndtere fire forskellige operationer: "withdraw", "deposit", "balance" og "transfer".
//
//Brug følgende startværdier:
//
//balance = 5000 kr
//amount = 1000 kr
//operation = "withdraw"
//Programmet skal bruge en switch til at vælge den rigtige handling baseret på operation, og printe resultatet samt den nye saldo (hvis relevant).
//Test dit program så der skrives korrekt output for hver operation.

double balance = 5000.0;
double amount = 1000.0;
String operation = "withdraw";
boolean success = true;

void main () {

switch (operation) {
        case "withdraw":
        if (amount <= balance) {
balance -= amount;
            System.out.println("Withdrawn: " + amount + " kr");
        } else {
                System.out.println("Insufficient funds");
success = false;
        }
        break;
        case "deposit":
balance += amount;
        System.out.println("Deposited: " + amount + " kr");
        break;
                case "balance":
                System.out.println("Current balance: " + balance + " kr");
        break;
                case "transfer":
                if (amount <= balance) {
balance -= amount;
            System.out.println("Transferred: " + amount + " kr");
        } else {
                System.out.println("Insufficient funds");
success = false;
        }
        break;
default:
        System.out.println("Invalid operation");
success = false;
        }

        if (success && !operation.equals("balance")) {
        System.out.println("New balance: " + balance + " kr");
    }
}