
trait Speaker:
    def firstChallege(): println("The yellow haired Rival wants to battle with you!")

trait FirstSinnohGym:
    def grunt1(): Unit = println("Geodude, Lvl: 8","Onix, Lvl: 8")
    def grunt2(): Unit = println("Geodude, Lvl: 10")
    def gymLeader(): Unit = println("Geodude, Lvl: 12","Onix, Lvl: 12","Cranidos, Lvl: 14")

class Regions(name: String) extends Kanto,Johto,Hoenn,Sinnoh,Unova,Kalos,Alola,Galar:
    def completionMessage: String = "Congrats on visiting each of the regions in the Pokemon Universe!"