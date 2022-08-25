package com.example.numbercomposition.domain.repository

import com.example.numbercomposition.domain.entities.GameSettings
import com.example.numbercomposition.domain.entities.Level
import com.example.numbercomposition.domain.entities.Question

interface GameRepository {
    fun generateQuestion(maxSumValue: Int, countOfOptions: Int): Question

    fun getGameSettings(level: Level): GameSettings
}