package exam03

abstract class Character(
    var maxHp: Int,
    var hp: Int,
    var maxMp: Int,
    var mp: Int
) {
    abstract val attack: Int
    abstract val defense: Int

    open fun attackTo(target: Character): Int {
        val damage = target.attacked(attack)
        println("${this::class.simpleName} attacks ${target::class.simpleName} for $damage damage.")
        return damage
    }

    open fun attacked(power: Int): Int {
        val randomFactor = (28..36).random().toDouble() / 32
        val rawDamage = (power * 0.5 - defense * 0.25) * randomFactor
        val damage = rawDamage.toInt().coerceAtLeast(0)
        hp = (hp - damage).coerceAtLeast(0)
        return damage
    }
}
