package exam03

class Goblin : Enemy(
    maxHp = 50,
    hp = 50,
    maxMp = 0,
    mp = 0
) {
    override val attack: Int = 12
    override val defense: Int = 6
}
