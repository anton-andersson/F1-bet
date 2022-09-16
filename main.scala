//Kvar att Göra:
//Overtakes
//Förare i topp 5
//GP-vinster lag
//Podium lag

import scala.runtime.stdLibPatches.language.experimental.namedTypeArguments
//För in nuvarande ställning i ordning som strängar
val dStanding = Vector("Verstappen","Leclerc","Perez","Russel","Sainz","Hamilton","Norris","Ocon","Alonso","Bottas","Gasly","Magnussen","Vettel","Ricciardo","Schumacher","Tsunoda","Zhou","Stroll","Albon","Latifi")
val cStanding = Vector("Red Bull","Ferrair","Mercedes","Alpine","Mclaren","Alfa Romeo","Haas","Alpha Tauri","Aston Martin","Williams")

//Lag med gp vinst respektive lag på podium
val cgp: Int = 2
// Ferrari, Mercedes, Red Bull, Mclaren, 
val cp: Int = 4

//Förare med flest overtakes
val dover: String = "Vettel"
  
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
    //kallar på dScore, första argument(f) = dbet"namn"
    Anton = Anton + dScore(f = dBetAnton) + cScore(f = coBetAnton)
    Oscar = Oscar + dScore(f = dBetOscar) + cScore(f = coBetOscar)
    Joel = Joel + dScore(f = dBetJoel) + cScore(f = coBetJoel)
    Emanuel = Emanuel + dScore(f = dBetEmanuel) + cScore(f = coBetEmanuel)
    Palmer = Palmer + dScore(f = dBetPalmer) + cScore(f = coBetPalmer)
    Jesper = Jesper + dScore(f = dBetJesper) + cScore(f = coBetJesper)
    David = David + dScore(f = dBetDavid) + cScore(f = coBetDavid)
    Helmer = Helmer + dScore(f = dBetHelmer) + cScore(f = coBetHelmer)
    Johan = Johan + dScore(f = dBetJohan) + cScore(f = coBetJohan)
    Jonis = Jonis + dScore(f = dBetJonis) + cScore(f = coBetJonis)
    Philip = Philip + dScore(f = dBetPhilip) + cScore(f = coBetPhilip)
    Pertoft = Pertoft + dScore(f = dBetPertoft) + cScore(f = coBetPertoft)
    JohanP = JohanP + dScore(f = dBetJohanP) + cScore(f = coBetJohanP)
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
//Poiunts från drivers championship
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

def cgpScore() = {

}

def cpScore() = {

}
def printScore(name: String, x: Int) = {
    println(s"$name har $x poäng.")
}