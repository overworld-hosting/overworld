package com.turtleboxgames.overworld.entities

import org.jetbrains.exposed.dao.*
import java.util.*

/**
 * Information about a known game.
 */
class Game(id: EntityID<UUID>) : Entity<UUID>(id) {
    companion object : EntityClass<UUID, Game>(Games)

    /**
     * Display name of the game.
     * This must be unique.
     */
    var name by Games.name

    /**
     * Brief description of what the game is.
     */
    var description by Games.description

    /**
     * Feature flag.
     * Determines whether the game is visible to users.
     */
    var enabled by Games.enabled
}