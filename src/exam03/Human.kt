package exam03

class Human(
    maxHp: Int,
    hp: Int,
    maxMp: Int,
    mp: Int,
    val strength: Int,
    val stamina: Int,
    val weapon: Int,
    val armor: Int
) : Character(maxHp, hp, maxMp, mp) {
    override val attack: Int
        get() = strength + weapon

    override val defense: Int
        get() = stamina + armor
}
