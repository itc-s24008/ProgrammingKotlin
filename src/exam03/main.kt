package exam03

fun main() {
    val player = Human(
        maxHp = 100, hp = 100,
        maxMp = 20, mp = 20,
        strength = 15, stamina = 10,
        weapon = 5, armor = 3
    )

    val goblin = Goblin()

    println("== Battle Start ==")
    println("Player HP: ${player.hp}, Goblin HP: ${goblin.hp}")

    // プレイヤーがゴブリンを攻撃
    player.attackTo(goblin)
    println("Goblin HP: ${goblin.hp}")

    // ゴブリンがプレイヤーを攻撃
    goblin.attackTo(player)
    println("Player HP: ${player.hp}")
}
