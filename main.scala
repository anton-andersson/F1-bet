//För in nuvarande ställning i ordning som strängar
val dStanding = Vector("Verstappen","Leclerc","Perez","Russel","Sainz","Hamilton","Norris","Ocon","Alonso","Bottas","Gasly","Magnussen","Vettel","Ricciardo","Schumacher","Tsunoda","Zhou","Stroll","Albon","Latifi")
val cStanding = Vector("Red Bull","Ferrair","Mercedes","Alpine","Mclaren","Alfa Romeo","Haas","Alpha Tauri","Aston Martin","Williams")

//Lag med gp vinst respektive lag på podium
//Ferrari, Red Bull
val cgp: Int = 2
// Ferrari, Mercedes, Red Bull, Mclaren, 
val cp: Int = 4

//Förare med flest overtakes
val dover: String = "Magnussen"

//RÖR EJ NÅGOT UNDER DENNA TEXT!!!!!:

//Driver-bets på respektive person
val dBetAnton = Vector("Verstappen","Leclerc","Hamilton","Perez","Russel","Sainz","Norris","Ricciardo","Vettel","Gasly","Alonso","Stroll","Tsunoda","Bottas","Magnussen","Ocon","Albon","Schumacher","Zhou","Latifi")
val dBetOscar = Vector("Hamilton","Leclerc","Verstappen","Russel","Perez","Norris","Sainz","Vettel","Ricciardo","Gasly","Bottas","Stroll","Alonso","Ocon","Tsunoda","Albon","Magnussen","Zhou","Schumacher","Latifi")
val dBetJoel = Vector("Verstappen","Hamilton","Russel","Perez","Sainz","Leclerc","Norris","Gasly","Ricciardo","Alonso","Vettel","Magnussen","Tsunoda","Ocon","Stroll","Schumacher","Bottas","Albon","Latifi","Zhou")
val dBetEmanuel = Vector("Verstappen","Sainz","Hamilton","Perez","Leclerc","Russel","Norris","Gasly","Ricciardo","Tsunoda","Vettel","Magnussen","Alonso","Bottas","Stroll","Ocon","Schumacher","Albon","Latifi","Zhou")
val dBetPalmer = Vector("Hamilton","Verstappen","Russel","Leclerc","Perez","Sainz","Norris","Gasly","Ricciardo","Alonso","Vettel","Tsunoda","Ocon","Magnussen","Stroll","Bottas","Schumacher","Albon","Latifi","Zhou")
val dBetJesper = Vector("Verstappen","Hamilton","Russel","Perez","Leclerc","Sainz","Norris","Gasly","Ricciardo","Vettel","Alonso","Ocon","Tsunoda","Stroll","Bottas","Albon","Zhou","Schumacher","Latifi","Magnussen")
val dBetDavid = Vector("Hamilton","Sainz","Verstappen","Russel","Leclerc","Norris","Perez","Ricciardo","Gasly","Vettel","Alonso","Ocon","Stroll","Bottas","Magnussen","Tsunoda","Albon","Schumacher","Latifi","Zhou")
val dBetHelmer = Vector("Hamilton","Verstappen","Leclerc","Russel","Sainz","Norris","Ricciardo","Perez","Alonso","Ocon","Vettel","Gasly","Stroll","Magnussen","Bottas","Tsunoda","Schumacher","Albon","Latifi","Zhou")
val dBetJohan = Vector("Hamilton","Verstappen","Sainz","Russel","Leclerc","Norris","Perez","Gasly","Ricciardo","Bottas","Alonso","Tsunoda","Ocon","Albon","Vettel","Latifi","Magnussen","Stroll","Schumacher","Zhou")
val dBetJonis = Vector("Verstappen","Hamilton","Russel","Perez","Leclerc","Sainz","Norris","Ricciardo","Alonso","Ocon","Vettel","Gasly","Stroll","Albon","Magnussen","Bottas","Tsunoda","Schumacher","Zhou","Latifi")    
val dBetPhilip = Vector("Verstappen","Hamilton","Leclerc","Sainz","Perez","Russel","Norris","Gasly","Ricciardo","Tsunoda","Alonso","Ocon","Magnussen","Vettel","Bottas","Stroll","Albon","Latifi","Schumacher","Zhou")
val dBetPertoft = Vector("Verstappen","Hamilton","Perez","Russel","Norris","Leclerc","Sainz","Gasly","Ricciardo","Stroll","Vettel","Ocon","Alonso","Bottas","Schumacher","Albon","Tsunoda","Magnussen","Zhou","Latifi")
val dBetJohanP = Vector("Verstappen","Hamilton","Leclerc","Sainz","Russel","Perez","Norris","Ricciardo","Gasly","Ocon","Vettel","Alonso","Stroll","Schumacher","Tsunoda","Albon","Magnussen","Latifi","Bottas","Zhou")

//constructor bets på respekive person
val coBetAnton = Vector("Red Bull","Ferrari","Mercedes","McLaren","Aston Martin","Alpha Tauri","Alpine","Haas","Alfa Romeo","Williams")
val coBetOscar = Vector("Mercedes","Red Bull","Ferrari","McLaren","Aston Martin","Alpha Tauri","Alpine","Alfa Romeo","Williams","Haas")
val coBetJoel = Vector("Red Bull","Mercedes","Ferrari","McLaren","Alpha Tauri","Alpine","Aston Martin","Haas","Alfa Romeo","Williams")
val coBetEmanuel = Vector("Red Bull","Ferrari","Mercedes","McLaren","Alpha Tauri","Aston Martin","Haas","Alpine","Alfa Romeo","Williams")
val coBetPalmer = Vector("Mercedes","Red Bull","Ferrari","McLaren","Alpha Tauri","Alpine","Aston Martin","Haas","Alfa Romeo","Williams")
val coBetJesper = Vector("Red Bull","Mercedes","Ferrari","McLaren","Alpha Tauri","Aston Martin","Alpine","Alfa Romeo","Williams","Haas")
val coBetDavid = Vector("Mercedes","Ferrari","Red Bull","McLaren","Alpha Tauri","Aston Martin","Alpine","Haas","Williams","Alfa Romeo")
val coBetHelmer = Vector("Mercedes","Red Bull","Ferrari","McLaren","Alpine","Aston Martin","Alpha Tauri","Williams","Alfa Romeo","Haas")
val coBetJohan = Vector("Mercedes","Red Bull","Ferrari","McLaren","Alpha Tauri","Alpine","Alfa Romeo","Williams","Aston Martin","Haas")
val coBetJonis = Vector("Mercedes","Red Bull","Ferrari","McLaren","Alpine","Aston Martin","Haas","Williams","Alpha Tauri","Alfa Romeo")
val coBetPhilip = Vector("Red Bull","Ferrari","Mercedes","McLaren","Alpha Tauri","Alpine","Aston Martin","Haas","Williams","Alfa Romeo")
val coBetPertoft = Vector("Red Bull","Mercedes","McLaren","Ferrari","Alpha Tauri","Aston Martin","Alpine","Haas","Alfa Romeo","Williams")
val coBetJohanP = Vector("Mercedes","Red Bull","Ferrari","McLaren","Alpine","Aston Martin","Williams","Alpha Tauri","Alfa Romeo","Haas")

//GP och podiumbets på respektive person
val cpgBetAnton: Int = 5
val cpBetAnton: Int = 7
val cpgBetOscar: Int = 4
val cpBetOscar: Int = 6
val cpgBetJoel: Int = 4
val cpBetJoel: Int = 7
val cpgBetEmanuel: Int = 4
val cpBetEmanuel: Int = 6
val cpgBetPalmer: Int = 4
val cpBetPalmer: Int = 7
val cpgBetJesper: Int = 5
val cpBetJesper: Int = 6
val cpgBetDavid: Int = 5
val cpBetDavid: Int = 6
val cpgBetHelmer: Int = 5
val cpBetHelmer: Int = 8
val cpgBetJohan: Int = 5
val cpBetJohan: Int = 7
val cpgBetJonis: Int = 4
val cpBetJonis: Int = 7
val cpgBetPhilip: Int = 5
val cpBetPhilip: Int = 6
val cpgBetPertoft: Int = 4
val cpBetPertoft: Int = 6
val cpgBetJohanP: Int = 5
val cpBetJohanP: Int = 7

//Overtake bet
val oveAnton: String = "Vettel"
val oveOscar: String = "Bottas"
val oveJoel: String = "Alonso"
val oveEmanuel: String = "Alonso"
val ovePalmer: String = "Magnussen"
val oveJesper: String = "Vettel"
val oveDavid: String = "Alonso"
val oveHelmer: String = "Vettel"
val oveJohan: String = "Alonso"
val oveJonis: String = "Vettel"
val ovePhilip: String = "Magnussen"
val ovePertoft: String = "Vettel"
val oveJohanP: String = "Verstappen"

//Poäng för respektive individ
var Anton: Int = 0
var Oscar: Int = 0
var Joel: Int = 0
var Emanuel: Int = 0
var Palmer: Int = 0
var Jesper: Int = 0
var David: Int = 0
var Helmer: Int = 0
var Johan: Int = 0
var Jonis: Int = 0
var Philip: Int = 0
var Pertoft: Int = 0
var JohanP: Int = 0

@main
def run() = {
    //kallar på dScore och cScore, första argument(f) = (d/c)bet"namn"
    Anton = Anton + dScore(f = dBetAnton) + cScore(f = coBetAnton) + cgpScore(x = cpgBetAnton) + cpScore(x = cpBetAnton) + oveScore(x = oveAnton) + topFive(f = dBetAnton) + bottomFive(f = dBetAnton)
    Oscar = Oscar + dScore(f = dBetOscar) + cScore(f = coBetOscar) + cgpScore(x = cpgBetOscar) + cpScore(x = cpBetOscar) + oveScore(x = oveOscar) + topFive(f = dBetOscar) + bottomFive(f = dBetOscar)
    Joel = Joel + dScore(f = dBetJoel) + cScore(f = coBetJoel) + cgpScore(x = cpgBetJoel) + cpScore(x = cpBetJoel) + oveScore(x = oveJoel) + topFive(f = dBetJoel) + bottomFive(f = dBetJoel)
    Emanuel = Emanuel + dScore(f = dBetEmanuel) + cScore(f = coBetEmanuel) + cgpScore(x = cpgBetEmanuel) + cpScore(x = cpBetEmanuel) + oveScore(x = oveEmanuel) + topFive(f = dBetEmanuel) + bottomFive(f = dBetEmanuel)
    Palmer = Palmer + dScore(f = dBetPalmer) + cScore(f = coBetPalmer) + cgpScore(x = cpgBetPalmer) + cpScore(x = cpBetPalmer) + oveScore(x = ovePalmer) + topFive(f = dBetPalmer) + bottomFive(f = dBetPalmer)
    Jesper = Jesper + dScore(f = dBetJesper) + cScore(f = coBetJesper) + cgpScore(x = cpgBetJesper) + cpScore(x = cpBetJesper) + oveScore(x = oveJesper) + topFive(f = dBetJesper) + bottomFive(f = dBetJesper)
    David = David + dScore(f = dBetDavid) + cScore(f = coBetDavid) + cgpScore(x = cpgBetDavid) + cpScore(x = cpBetDavid) + oveScore(x = oveDavid) + topFive(f = dBetDavid) + bottomFive(f = dBetDavid)
    Helmer = Helmer + dScore(f = dBetHelmer) + cScore(f = coBetHelmer) + cgpScore(x = cpgBetHelmer) + cpScore(x = cpBetHelmer) + oveScore(x = oveHelmer) + topFive(f = dBetHelmer) + bottomFive(f = dBetHelmer)
    Johan = Johan + dScore(f = dBetJohan) + cScore(f = coBetJohan) + cgpScore(x = cpgBetJohan) + cpScore(x = cpBetJohan) + oveScore(x = oveJohan) + topFive(f = dBetJohan) + bottomFive(f = dBetJohan)
    Jonis = Jonis + dScore(f = dBetJonis) + cScore(f = coBetJonis) + cgpScore(x = cpgBetJonis) + cpScore(x = cpBetJonis) + oveScore(x = oveJonis) + topFive(f = dBetJonis) + bottomFive(f = dBetJonis)
    Philip = Philip + dScore(f = dBetPhilip) + cScore(f = coBetPhilip) + cgpScore(x = cpgBetPhilip) + cpScore(x = cpBetPhilip) + oveScore(x = ovePhilip) + topFive(f = dBetPhilip) + bottomFive(f = dBetPhilip)
    Pertoft = Pertoft + dScore(f = dBetPertoft) + cScore(f = coBetPertoft) + cgpScore(x = cpgBetPertoft) + cpScore(x = cpBetPertoft) + oveScore(x = ovePertoft) + topFive(f = dBetPertoft) + bottomFive(f = dBetPertoft)
    JohanP = JohanP + dScore(f = dBetJohanP) + cScore(f = coBetJohanP) + cgpScore(x = cpgBetJohanP) + cpScore(x = cpBetJohanP) + oveScore(x = oveJohanP) + topFive(f = dBetJohanP) + bottomFive(f = dBetJohanP)

    printScore("Anton", Anton)
    printScore("Oscar", Oscar)
    printScore("Joel", Joel)
    printScore("Emanuel", Emanuel)
    printScore("Palmer", Palmer)
    printScore("Jesper", Jesper)
    printScore("David", David)
    printScore("Helmer", Helmer)
    printScore("Johan", Johan)
    printScore("Jonis", Jonis)
    printScore("Philip", Philip)
    printScore("Pertoft", Pertoft)
    printScore("Johan P", JohanP)

    //debugging
    //println(dBetAnton)
    //println(dStanding)
}
//Points från drivers championship
def dScore(f: Vector[String]): Int = {
    var score: Int = 0
    def dwinner(f: Vector[String]) = {
        if f(0) == dStanding(0) then {
            score = score + 10
        }
        else {
            0
        }
    }
    def exactMatch(f: Vector[String], x: Int, z: Int = 0, p: Int = 5) = {
        if f(x) == dStanding(x + z) then {
            score = score + p
        }
        else {
            0
        }
    }
    for x <- 1 to 19 do {
        exactMatch(f: Vector[String], x, 0, 5)
    }
    for x <- 1 to 18 do {
        exactMatch(f: Vector[String], x, 1, 3)
        exactMatch(f: Vector[String], x, -1, 3)
    }
    for x <- 2 to 17 do {
        exactMatch(f: Vector[String], x, 2, 2)
        exactMatch(f: Vector[String], x, -2, 2)
    }
    for x <- 3 to 16 do {
        exactMatch(f: Vector[String], x, 3, 1)
        exactMatch(f: Vector[String], x, -3, 1)
    }
    dwinner(f: Vector[String])
    score
}
//Points från constructors championship
def cScore(f: Vector[String]) = {
    var score: Int = 0
    def cwinner(f: Vector[String]) = {
        if f(0) == cStanding(0) then {
            score = score + 10
        }
        else {
            0
        }
    }
    def exactMatch(f: Vector[String], x: Int, z: Int = 0, p: Int = 5) = {
        if f(x) == cStanding(x + z) then {
            score = score + p
        }
        else {
            0
        }
    }
    for x <- 1 to 9 do {
        exactMatch(f: Vector[String], x, 0, 5)
    }
    for x <- 1 to 8 do {
        exactMatch(f: Vector[String], x, 1, 3)
        exactMatch(f: Vector[String], x, -1, 3)
    }
    for x <- 2 to 7 do {
        exactMatch(f: Vector[String], x, 2, 2)
        exactMatch(f: Vector[String], x, -2, 2)
    }
    for x <- 3 to 6 do {
        exactMatch(f: Vector[String], x, 3, 1)
        exactMatch(f: Vector[String], x, -3, 1)
    }
    cwinner(f: Vector[String])
    score
}
//Points från lag med vunna gp
def cgpScore(x: Int) = {
    var score: Int = 0
    if x == cgp then {
        score = score + 5
    }
    score
}
//Points från lag med podium
def cpScore(x: Int) = {
    var score: Int = 0
    if x == cp then {
        score = score + 5
    }
    score
}
//Points från overtakes
def oveScore(x: String) = {
    var score: Int = 0
    if x == dover then {
        score = score + 5
    }
    score
}
//Points från top five 
def topFive(f: Vector[String]): Int = {
    var score = 0
    for x <- 0 to 4 do {
        if f(0) == dStanding(x) then {
            score = score + 5
        }
        else if f(1) == dStanding(x) then {
            score = score + 5
        }
        else if f(2) == dStanding(x) then {
            score = score + 5
        }
        else if f(3) == dStanding(x) then {
            score = score + 5
        }
        else if f(4) == dStanding(x) then {
            score = score + 5
        }
    }
    score 
}
//Points från bottom five
def bottomFive(f: Vector[String]): Int = {
    var score = 0
    for x <- 15 to 19 do {
       if f(15) == dStanding(x) then {
            score = score + 5
        }
        else if f(16) == dStanding(x) then {
            score = score + 5
        }
        else if f(17) == dStanding(x) then {
            score = score + 5
        }
        else if f(18) == dStanding(x) then {
            score = score + 5
        }
        else if f(19) == dStanding(x) then {
            score = score + 5
        } 
    }
    score
}

def printScore(name: String, x: Int) = {
    println(s"$name har $x poäng.")
}