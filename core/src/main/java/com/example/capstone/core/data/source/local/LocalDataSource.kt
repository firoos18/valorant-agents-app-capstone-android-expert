package com.example.capstone.core.data.source.local

import com.example.capstone.core.data.source.local.entity.AgentsEntity
import com.example.capstone.core.data.source.local.room.AgentsDao
import kotlinx.coroutines.flow.Flow

class LocalDataSource(private val agentsDao: AgentsDao) {

    fun getAllAgents() : Flow<List<AgentsEntity>> = agentsDao.getAllAgents()

    fun getFavoriteAgents() : Flow<List<AgentsEntity>> = agentsDao.getFavoriteAgents()

    suspend fun insertAgents(agentList : List<AgentsEntity>) = agentsDao.insertAgent(agentList)

    fun setFavoriteAgent(agents : AgentsEntity, newState : Boolean) {
        agents.isFavorite = newState
        agentsDao.updateFavoriteAgent(agents)
    }

    fun getAgentById(uuid : String) = agentsDao.getAgentById(uuid)
}